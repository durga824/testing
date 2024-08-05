import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CRC_Automation {

    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-blink-features=AutomationControlled");
        options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
        options.setExperimentalOption("useAutomationExtension", false);
        WebDriver driver = new ChromeDriver(options);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://qa.creditrepaircloud.com/login");

        driver.findElement(By.id("username")).sendKeys("floaratest11@yopmail.com");
        driver.findElement(By.id("password")).sendKeys("Test@1234");
        driver.findElement(By.id("signin")).click();
        Thread.sleep(10000);

        List<By> locators = Arrays.asList(
                By.xpath("//a[normalize-space()='Home']"),
                By.xpath("//a[normalize-space()='Clients']"),
                By.xpath("//a[normalize-space()='Schedule']"),
                By.xpath("//span[normalize-space()='My Company']"),
                By.xpath("//a[normalize-space()='Billing & Payments']"),
                By.xpath("//a[normalize-space()='Letter Library']"),
                By.xpath("//a[normalize-space()='Affiliates']"),
                By.xpath("//span[normalize-space()='Creditors / Furnishers']"),
                By.xpath("//span[normalize-space()='Everything']"),
                By.xpath("//a[normalize-space()='Dashboard']")
        );

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

        // Scanner to read manual input to stop the loop
        Scanner scanner = new Scanner(System.in);
        Thread stopThread = new Thread(() -> {
            System.out.println("Press ENTER to stop the execution.");
            scanner.nextLine();
            System.exit(0);
        });
        stopThread.start();

        while (true) {
            for (By locator : locators) {
                try {
                    WebElement link = wait.until(ExpectedConditions.elementToBeClickable(locator));
                    Thread.sleep(6000);
                    Actions actions = new Actions(driver);
                    actions.moveToElement(link).build().perform();
                    Thread.sleep(2000);
                    link.click();
                } catch (Exception e) {
                    System.out.println("An error occurred: " + e.getMessage());
                }
            }
        }
    }
}
