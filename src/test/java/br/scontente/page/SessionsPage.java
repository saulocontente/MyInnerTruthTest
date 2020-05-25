package br.scontente.page;

import org.openqa.selenium.By;

import br.scontente.core.BasePage;

public class SessionsPage extends BasePage{

    public String emptyListMsg() {
        return dsl.waitPresenceOfElement(By.xpath("//app-empty-state//span[@class = 'h5']/span"),20).getText();
    }
    public void openEspecialistasMenu() {
        dsl.waitClickableElement(By.xpath("//nav/ul/li/a[@href = '/busca']"),20).click();
    }

    public void waitReamazeWidget() {
        dsl.waitPresenceOfElement(By.id("reamaze-widget-icon"), 20);
    }

}