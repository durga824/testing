import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class SeleniumPractice {

    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriver driver = new ChromeDriver();
//        String Reverse
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter text : ");
//        String input = scanner.nextLine();
//
//        StringBuilder stringBuilder = new StringBuilder(input);
//        System.out.println(stringBuilder.reverse());

//        Remove duplicates from Array
        String name = "Durgarao";

        Set<Character> inp = new HashSet<>();
        StringBuilder result = new StringBuilder();

        for (char c: name.toCharArray()){
            if (inp.add(c)){
                result.append(c);
            }
        }
        System.out.println(result);


        int [] num = {2, 4, 5, 4, 2, 8, 3, 7};

        Set<Integer> removed = new HashSet<>();

        for (int num2: num){
            removed.add(num2);
        }

        System.out.println(removed);


        File screenShote = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenShote, new File("path"));

    }
}