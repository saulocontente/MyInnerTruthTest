package br.scontente.features.step_definitions;

import static org.junit.Assert.assertEquals;

import br.scontente.page.BuscaPage;
import br.scontente.page.LoginPage;
import br.scontente.page.ProfessionalPage;
import br.scontente.page.SessionsPage;
import io.cucumber.java.en.*;


public class PrincipalFlowSteps {
    
    private LoginPage login = new LoginPage();
    private SessionsPage sessions = new SessionsPage();
    private BuscaPage busca = new BuscaPage();
    private ProfessionalPage professional = new ProfessionalPage();

    @Given("a user goes into login with {string} and {string}")
    public void aUserGoesIntoLoginWithEmailAndPassword(String email, String passwd) {
        login.goToLoginPage();
        login.enterEmail(email);
        login.enterPasswd(passwd);
        login.enterLogin();
    }
    
    @Given("after login should not have any session scheduled")
    public void shouldNotHaveAnySessionScheduled() {
        assertEquals("Você ainda não fez nenhuma sessão. Encontre o profissional perfeito para você ainda hoje", sessions.emptyListMsg());
    }

    @When("user clicks on “NOSSOS ESPECIALISTAS” to goes to Page busca")
    public void userClicksOnNOSSOSESPECIALISTASToGoesToPageBusca() {
        sessions.openEspecialistasMenu();
    }

    @When("user clicks on “Gostei quero saber mais” on the first professional that appear on the list to goes to that professional page")
    public void userClicksOnGosteiQueroSaberMaisOnTheFirstProfessionalThatAppearOnTheListToGoesToThatProfessionalPage() {
        busca.openProfessionalProfileByListPosition(1);
    }

    @Then("see more information about the professional choosed")
    public void seeMoreInformationAboutTheProfessionalChoosed() {
        assertEquals(busca.getName(), professional.getScreenName());
        assertEquals("Perfil", professional.getProfile());
    }
    
}