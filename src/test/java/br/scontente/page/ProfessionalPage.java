package br.scontente.page;

import org.openqa.selenium.By;

import br.scontente.core.BasePage;

public class ProfessionalPage extends BasePage{

    public String getScreenName(){
        return dsl.waitPresenceOfElement(By.xpath("//app-professional-screen//div[@class = 'user_info']/h2"), 20).getText();
    }

    public String getProfile(){
        return dsl.waitPresenceOfElement(By.xpath("//app-professional-screen/section[3]//div/h3"), 15).getText();
    }

}