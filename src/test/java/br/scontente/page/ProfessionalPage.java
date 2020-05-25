package br.scontente.page;

import org.openqa.selenium.By;

import br.scontente.core.BasePage;

public class ProfessionalPage extends BasePage{

    public String getScreenName(){
        // return dsl.getElementText(By.xpath("//app-professional-screen//div[@class = 'user_info']/h2"));
        return dsl.waitVisibilityOfElement(By.xpath("//app-professional-screen//div[@class = 'user_info']/h2"), 10).getText();
    }
    public String getProfile(){
        return dsl.waitVisibilityOfElement(By.xpath("//app-professional-screen/section[3]//div/h3"), 10).getText();
    }

}