package class4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {
    public static void main(String[] args) {
        /* check if the check box    "click on this check box" is Selected
        if no  Select the check box
        check gain if the checkbox is Selected or not*/

//        tell your project where the webdriver is located.
//        for mac user please do not use .exe with chromedriver
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
//       create an instance of WebDriver
        WebDriver driver = new ChromeDriver();
//        max the window
        driver.manage().window().maximize();
//        goto syntaxprojects.com
        driver.get("http://practice.syntaxtechs.net/basic-checkbox-demo.php");
        WebElement checkBtn = driver.findElement(By.cssSelector("input[id='isAgeSelected']"));
        boolean isSelectedBtn = checkBtn.isSelected();
        System.out.println("Is checkbox selected? " + isSelectedBtn);
        if (!isSelectedBtn) {
          checkBtn.click();
        }
        isSelectedBtn = checkBtn.isSelected();
        System.out.println("Check box selected  " + isSelectedBtn);

    }


}
