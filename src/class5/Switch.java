package class5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Set;

public class Switch {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        //        create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();


        driver.get("https://accounts.google.com/InteractiveLogin/signinchooser?continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&osid=1&passive=1209600&service=mail&ifkv=AWnogHctZNm6ACA5KfazAxLW5xTAcwRUwrhIzzNrqtnwqKj7cnAuom2O8VGo1hm2PPFFfsvfWTDkjA&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

        driver.findElement(By.xpath("//a[normalize-space()='Help']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Privacy']")).click();
        driver.findElement(By.xpath("//a[normalize-space()='Terms']")).click();


        String parentWindowHandle = driver.getWindowHandle();
        System.out.println(parentWindowHandle);

        Set<String> windowHanles = driver.getWindowHandles();
        for (String wn : windowHanles) {
            System.out.println(wn);

            driver.switchTo().window(wn);
            String title = driver.getTitle();
            if (title.equalsIgnoreCase("Google Account Help")){
                break;
            }
        }
        System.out.println(driver.getTitle());






    }

}
