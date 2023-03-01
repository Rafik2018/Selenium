package ownProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.util.List;
import java.util.Set;

public class WebBrowsersTest {

    public static void main(String[] args) {


        long startTime = System.currentTimeMillis();
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        // for windows add extension .exe
        //  you can use \
        WebDriver driver = new ChromeDriver(); //launch the browser
        driver.get("https://www.google.com/"); // navigate to the specified url
        driver.manage().window().maximize();
        driver.quit();
        long endTime = System.currentTimeMillis();


        long startTime1 = System.currentTimeMillis();
        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
        WebDriver driver1 = new EdgeDriver();
        driver1.get("https://www.google.com/");
        driver1.manage().window().maximize();
        driver1.quit();
        long endTime1 = System.currentTimeMillis();


        long startTime2 = System.currentTimeMillis();
        System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
        WebDriver driver2 = new FirefoxDriver();
        driver2.get("https://www.google.com/");
        driver2.manage().window().maximize();
        driver2.quit();
        long endTime2 = System.currentTimeMillis();


        long startTime3 = System.currentTimeMillis();
        System.setProperty("webdriver.opera.driver", "Drivers/operadriver.exe");
        WebDriver driver3 = new OperaDriver();
        driver3.get("https://www.facebook.com/");
        driver3.manage().window().maximize();
        driver3.quit();
        long endTime3 = System.currentTimeMillis();


        System.out.println(endTime - startTime);
        System.out.println(endTime1 - startTime1);
        System.out.println(endTime2 - startTime2);
        System.out.println(endTime3 - startTime3);


    }
}

