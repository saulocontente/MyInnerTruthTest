package br.scontente.page;

import org.openqa.selenium.By;

import br.scontente.core.BasePage;

public class LoginPage extends BasePage {

    public void goToLoginPage() {
        dsl.openUrl("https://zenklub.com.br/auth/login");
    }
    
    public void enterEmail(String email) {
        dsl.write("login-form-email", email);
    }

    public void enterPasswd(String passwd) {
        dsl.write("login-form-password", passwd);
    }

    public void enterLogin() {
        dsl.waitClickableElement(By.xpath("//button/span[contains(., 'ENTRAR')]"),5).click();
    }

    public String validateError() {
        return dsl.waitVisibilityOfElement(By.className("input-error"), 10).getText();
    }

}