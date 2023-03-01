package class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1_Task1 {
    public static void main(String[] args) throws InterruptedException {

         /* HW1:
    navigate to https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0%22
    fill out the form
    click on register
    close the browser */

        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://parabank.parasoft.com/parabank/register.htm;jsessionid=B8DD31FF0AFEDBDF4454B27BBC5C05B0");
        driver.manage().window().maximize();

        driver.findElement(By.id("customer.firstName")).sendKeys("Robert");
        Thread.sleep(900);
        driver.findElement(By.id("customer.lastName")).sendKeys("Grey");
        Thread.sleep(900);
        driver.findElement(By.id("customer.address.street")).sendKeys("111 Main st");
        Thread.sleep(900);
        driver.findElement(By.id("customer.address.city")).sendKeys("Orlando");
        Thread.sleep(900);
        driver.findElement(By.id("customer.address.state")).sendKeys("Florida");
        Thread.sleep(900);
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("A1B-B2A");
        Thread.sleep(900);
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("411-555-616");
        Thread.sleep(900);
        driver.findElement(By.id("customer.ssn")).sendKeys("12233");
        Thread.sleep(900);
        driver.findElement(By.id("customer.username")).sendKeys("RobertG");
        Thread.sleep(900);
        driver.findElement(By.id("customer.password")).sendKeys("33@44");
        Thread.sleep(900);
        driver.findElement(By.id("repeatedPassword")).sendKeys("33@44");


    //    driver.findElement(By.xpath("//input[@type='submit' and @value='Register']")).click();

        Thread.sleep(3000);
        driver.close();


    }


}
