package Selenium_practice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CSSLocators {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://qa.creditrepaircloud.com/");

//        Tag with Id
        driver.findElement(By.cssSelector("input#username")).sendKeys("debuglog");   // Tag + Id
        driver.findElement(By.cssSelector("input#password")).sendKeys("Test@123");

        Actions action = new Actions(driver);
        action.contextClick().build().perform();
//        driver.findElement(By.cssSelector("input.loginbtn")).click();    // Using Tag + Class
//
//        driver.findElement(By.cssSelector("input[placeholder='Password']")).click();    // Using Tag attribute
//
//        driver.findElement(By.cssSelector("input.logininput[placeholder='Password']")).click();   // Using Tag Class + Tag attribute






    }





}
