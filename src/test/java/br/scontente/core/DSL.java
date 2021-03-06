package br.scontente.core;

import static br.scontente.core.DriverFactory.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DSL {

    public void openUrl(String url) {
        getDriver().get(url);
    }

    public WebElement waitPresenceOfElement(By by, int timeout) {
        return new WebDriverWait(getDriver(), timeout).until(ExpectedConditions.presenceOfElementLocated(by));
    }

    public WebElement waitClickableElement(By by, int timeout) {
        return new WebDriverWait(getDriver(), timeout).until(ExpectedConditions.elementToBeClickable(by));
    }

    public WebElement waitVisibilityOfElement(By by, int timeout){
        return new WebDriverWait(getDriver(), timeout).until(ExpectedConditions.visibilityOfElementLocated(by));
    }

    public void write(By by, String text) {
        WebElement input = waitPresenceOfElement(by, 15);
        input.clear();
        input.sendKeys(text);
    }

    public void write(String id, String text){
        write(By.id(id), text);
    }

    public String readValue(By by) {
        return waitPresenceOfElement(by, 10).getAttribute("value");
    }
    
    public String readValue(String id){
        return readValue(By.id(id));
    }

}