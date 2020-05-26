package br.scontente.features.step_definitions;

import static org.junit.Assert.assertEquals;

import br.scontente.page.BuscaPage;
import br.scontente.page.LoginPage;
import br.scontente.page.ProfessionalPage;
import br.scontente.page.SessionsPage;
import io.cucumber.java.en.*;


public class PrincipalFlowSteps {

    private SessionsPage sessions = new SessionsPage();
    private BuscaPage busca = new BuscaPage();
    private ProfessionalPage professional = new ProfessionalPage();



    @When("user clicks on NOSSOS ESPECIALISTAS to goes to Page busca")
    public void userClicksOnNOSSOSESPECIALISTASToGoesToPageBusca() {
        sessions.waitReamazeWidget();
        sessions.openEspecialistasMenu();
    }

    @When("user clicks on Gostei quero saber mais on the first professional that appear on the list to goes to that professional page")
    public void userClicksOnGosteiQueroSaberMaisOnTheFirstProfessionalThatAppearOnTheListToGoesToThatProfessionalPage() {
        busca.openProfessionalProfileByListPosition(1);
    }

    @Then("see more information about the professional chosen")
    public void seeMoreInformationAboutTheProfessionalChosen() {
        assertEquals(busca.getName(), professional.getScreenName());
        assertEquals("Perfil", professional.getProfile());
    }
    
}