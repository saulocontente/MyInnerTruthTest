package br.scontente.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DriverFactory {

    private static WebDriver driver;
    
    public static WebDriver startDriver() {
        if(driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static WebDriver getDriver() {
         if(driver == null) {
             return startDriver();
         }
         return driver;
    }

    public static void killDriver() {
        if( driver != null) {
            driver.quit();
        }
    }

}