package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class RadioButtons2 {


    public static void main(String[] args) {


//        tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

//        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();
//        goto syntaxprojects.com
        driver.get("http://practice.syntaxtechs.net/basic-radiobutton-demo.php");

        List<WebElement> radiobtns = driver.findElements(By.xpath("//input[@name='ageGroup']"));
        for (WebElement radiobnt : radiobtns) {
            String age = radiobnt.getAttribute("value");
            if (age.equalsIgnoreCase("0 - 5")) {
                radiobnt.click();
            }

        }

    }

}
