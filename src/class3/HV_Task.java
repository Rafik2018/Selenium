package class3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

public class HV_Task {

    public static void main(String[] args) throws InterruptedException {

        /* enter the message in the text box
          click on show message
         Enter value of a (edited)
        Enter value of B
        click on the button get total
       also please print the value of the attribute type of the button GET TOTAL*/


//        tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

//        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();
//        goto amazon.com
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");


        driver.findElement(By.xpath("//input[@id='user-message']")).sendKeys(" first Selenium Test ");

        driver.findElement(By.xpath("//button[text()='Show Message']")).click();
        driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("5");
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("5");

        WebElement total = driver.findElement(By.xpath("//button[text()='Get Total']"));
        Thread.sleep(1000);
        total.click();
        WebElement sum = driver.findElement(By.xpath("//span[@id='displayvalue']"));
        System.out.println(total.getAttribute("type"));
        System.out.println(sum.getText());
    }
}


/*

        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");

        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.syntaxtechs.net/basic-first-form-demo.php");
        driver.findElement(By.xpath("//input[contains(@placeholder, 'Please enter')]")).sendKeys("Hello Selenium");
        driver.findElement(By.xpath("//button[contains(@onclick,'showInput')]")).click();

        driver.findElement(By.xpath("//input[@id='sum1']")).sendKeys("88");
        driver.findElement(By.xpath("//input[@id='sum2']")).sendKeys("92");
        WebElement total= driver.findElement(By.xpath("//button[text()='Get Total']"));
        total.click();
        WebElement display=driver.findElement(By.xpath("//span[@id='displayvalue']"));
        String value=display.getText();
        System.out.println("total a+b= "+value);

    }



}
*/
