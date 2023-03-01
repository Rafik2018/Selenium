package ownProjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Opera {

    public static void main(String[] args) {




        System.setProperty("webdriver.opera.driver", "Drivers/operadriver.exe");
        WebDriver driver3 = new OperaDriver();
        driver3.get("https://www.opera.com/");

    }


}
