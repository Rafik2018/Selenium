package Class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {

    public static void main(String[] args) throws InterruptedException {


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        String URL= driver.getCurrentUrl();
        System.out.println(URL);
        String title = driver.getTitle();
        System.out.println("The title of the page is "+title); //   The title of the page is Facebook – log in or sign up

        Thread.sleep(3000);// slow down for 3 seconds

        driver.quit();      // or  driver.close();  will close the one browser
                            //  driver.quit();      will close  whole tab



    }
}
