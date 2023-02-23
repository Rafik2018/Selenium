package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;

public class Task2 {
    public static void main(String[] args) throws InterruptedException {

       /* HW2
        navigate to fb.com
        click on create new account
        fill up all the textboxes
        click on sign up button
        close the pop up
        close the browser

        TIP for HW2:
        just fill in text boxes or button, no need to deal with other webElements
        also u will need a Thread.sleep after clcikng on create new account
        we will discuss "WHY" in future
        */

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Create new account")).click();
        Thread.sleep(5000);
        driver.findElement(By.name("firstname")).sendKeys("Kurt");
        driver.findElement(By.name("lastname")).sendKeys("Boz");
        driver.findElement(By.name("reg_email__")).sendKeys("BozKurt@gmail.com");
        driver.findElement(By.name("reg_email_confirmation__")).sendKeys("BozKurt@gmail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("122333");
        driver.findElement(By.id("day")).sendKeys("1");
        driver.findElement(By.id("month")).sendKeys("Jan");
        driver.findElement(By.id("year")).sendKeys("1999");
        driver.findElement(By.cssSelector("input[type='radio'][value='2']")).click();

        driver.findElement(By.className("_6j")).click();
        Thread.sleep(5000);

        driver.close();


    }


}
