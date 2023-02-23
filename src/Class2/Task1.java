package Class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
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
        driver.findElement(By.id("customer.firstName")).sendKeys("Rafik");
        driver.findElement(By.id("customer.lastName")).sendKeys("Ismayilov");
        driver.findElement(By.id("customer.address.street")).sendKeys("10 Main st");
        driver.findElement(By.id("customer.address.city")).sendKeys("Toronto");
        driver.findElement(By.id("customer.address.state")).sendKeys("Ontario");
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("A1B-C2D");
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("415-515-615");
        driver.findElement(By.id("customer.ssn")).sendKeys("122333");
        driver.findElement(By.id("customer.username")).sendKeys("IRafik");
        driver.findElement(By.id("customer.password")).sendKeys("11@22");
        driver.findElement(By.id("repeatedPassword")).sendKeys("11@22");

        driver.findElement(By.className("button")).click();

        Thread.sleep(4000);
        driver.close();


    }


}
