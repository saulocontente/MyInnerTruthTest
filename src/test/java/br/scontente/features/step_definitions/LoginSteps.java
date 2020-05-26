package br.scontente.features.step_definitions;

import br.scontente.page.LoginPage;
import br.scontente.page.SessionsPage;
import io.cucumber.java.en.*;

import static org.junit.Assert.assertEquals;

public class LoginSteps {

    private LoginPage login = new LoginPage();
    private SessionsPage sessions = new SessionsPage();

    @Given("a user goes into login with {string} and {string}")
    public void aUserGoesIntoLoginWithEmailAndPassword(String email, String passwd) {
        login.goToLoginPage();
        login.enterEmail(email);
        login.enterPasswd(passwd);
    }

    @When("clicks on Entrar button")
    public void clicksOnEntrarButton() {
        login.enterLogin();
    }

    @Given("after login should not have any session scheduled")
    public void shouldNotHaveAnySessionScheduled() {
        assertEquals("Você ainda não fez nenhuma sessão. Encontre o profissional perfeito para você ainda hoje", sessions.emptyListMsg());
    }

    @Then("must show an error {string}")
    public void mustShowAnErrorMessage(String msg) {
        assertEquals(msg, login.validateError());
    }
}
