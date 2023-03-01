import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

    public static void main(String[] args) {

        System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.firefox.com/");
        driver.quit();


        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver1 = new ChromeDriver();
        driver1.get("https://www.google.com/");
        driver1.quit();


        System.setProperty("webdriver.edge.driver", "Drivers/msedgedriver.exe");
        WebDriver driver2 = new EdgeDriver();
        driver2.get("https://www.microsoft.com/");
        driver2.quit();
    }


}
