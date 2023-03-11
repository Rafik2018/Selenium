package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.print.attribute.Attribute;
import java.util.List;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {

   /* 1. u need to write down the code that can select  1 check box out of 4 mentioned,
    e.g option1 , option2 , option 3, option 4
 Note write down the logic in dynamic way i.e one change in if else condition can change ur selection*/

//      tell your project where the webdriver is located.
//      for mac user please do not use .exe with chromedriver

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
//      create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//      max the window
        driver.manage().window().maximize();
//      goto syntaxprojects.com
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        Thread.sleep(2000);
        List<WebElement> checkBoxes = driver.findElements(By.cssSelector("input[value^=Option]"));

        String optionToSelect = "Option-4"; // change this value to select a different option dynamically
        for (WebElement checkBox : checkBoxes) {
            String boxValue = checkBox.getAttribute("value");
            switch (boxValue) {
                case "Option-1":
                case "Option-2":
                case "Option-3":
                case "Option-4":

                    if (boxValue.equalsIgnoreCase(optionToSelect)) {
                        checkBox.click();
                        System.out.println("Selected checkbox with value: " + boxValue);
                    }
                    break;
            }
        }

    }
}