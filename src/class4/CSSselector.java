package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSselector {


    public static void main(String[] args) throws InterruptedException {



//        tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

//        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();


driver.get("https://www.facebook.com/");
driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        WebElement createNewBtn = driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']"));
        // click on the button
        createNewBtn.click();
        // fill in the first name
   Thread.sleep(2000);


   WebElement firstname = driver.findElement(By.cssSelector("input[name='firstname']"));
   firstname.sendKeys("abracatabra");






    }


}
