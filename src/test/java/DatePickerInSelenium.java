import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class DatePickerInSelenium {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.redbus.in/");

//        driver.findElement(By.id("src")).sendKeys("hydera");
//        List<WebElement> autoSugg = driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq dZhbJF\"]/li"));
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(30));
//        wait.until(ExpectedConditions.visibilityOfAllElements(autoSugg));
//
//        for (int i =0; i<autoSugg.size(); i++)
//        {
//            if (driver.findElement(By.xpath("//ul[@class=\"sc-dnqmqq dZhbJF\"]/li/div/text")).getText().equals("Miyapur"))
//            {
//                driver.findElement(By.xpath("//ul[@class=\"sc-dnqmqq dZhbJF\"]/li/div/text")).click();
//            }
//        }


        WebElement datePicker = driver.findElement(By.xpath("//div[@class='labelCalendarContainer']"));
        

    }
}
