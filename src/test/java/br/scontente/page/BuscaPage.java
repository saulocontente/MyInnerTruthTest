package br.scontente.page;

import org.openqa.selenium.By;

import br.scontente.core.BasePage;

public class BuscaPage extends BasePage {

    protected String name;

    public void openProfessionalProfileByListPosition(int pos) {
        setName(dsl.waitPresenceOfElement(By.xpath("//app-search-screen//div["+pos+"]/app-professional-search//div[@class = 'user_info']/h2"),10).getText());
        dsl.waitPresenceOfElement(By.xpath("//app-search-screen//div["+pos+"]/app-professional-search//a[@class = 'btn btn-outline btn-primary btn-round mt-3']"), 10).click();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}