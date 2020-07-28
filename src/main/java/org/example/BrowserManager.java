package org.example;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager extends Util {
    LoadProp loadProp = new LoadProp();

    public void setBrowserName() {

    String browserName =loadProp.getProperty("browserName");
        //Check if parameter passed from TestNG is 'firefox'

   if(browserName.equalsIgnoreCase("firefox")) {
            //create firefox instance
            System.setProperty("webdriver.gecko.driver", "src\\test\\Resources\\BrowserDriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        else if (browserName.equalsIgnoreCase("chrome")) {
            //set path to chromedriver.exe

            System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
            ChromeOptions options = new ChromeOptions();
            options.setExperimentalOption("useAutomationExtension", false);
            options.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
            driver = new ChromeDriver(options);
        }
        else {
            //If no browser passed throw exception
            System.out.println("Browser is not correct");
        }
        driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
    }

    public void CloseBrowser() {
        driver.close();

    }
}




