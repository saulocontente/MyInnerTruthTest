package br.scontente.page;

import org.openqa.selenium.By;

import br.scontente.core.BasePage;

public class SessionsPage extends BasePage{

    public String emptyListMsg() {
        return dsl.waitPresenceOfElement(By.xpath("//app-empty-state//span[@class = 'h5']/span"),10).getText();
    }
    public void openMenuEspecialista() {
        dsl.waitPresenceOfElement(By.xpath("//*[@routerlink = '/busca/']/span"),20).click();
    }

}