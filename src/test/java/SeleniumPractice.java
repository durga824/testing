import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class SeleniumPractice {

    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.location = 'https://dev-web.creditrepaircloud.com/login'");
        Thread.sleep(3000);
        WebElement emailInput = driver.findElement(By.xpath("//input[@name='email']"));
        js.executeScript("arguments[0].value = 'abcd.yopmail.com'", emailInput);


        TakesScreenshot screenshot = (TakesScreenshot) driver;
        File file = screenshot.getScreenshotAs(OutputType.FILE);

        File desFile = new File("desc/path");
        FileUtils.copyFile(file, desFile);

    }
}