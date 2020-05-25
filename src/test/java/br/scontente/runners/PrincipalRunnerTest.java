package br.scontente.runners;

import br.scontente.utils.OS;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import br.scontente.core.DriverFactory;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = {"src\\test\\java\\br\\scontente\\features\\principal_flow.feature"},
    glue = "br.scontente.features.step_definitions",
    tags = "@Flow",
    snippets = SnippetType.CAMELCASE,
    plugin = {"pretty", "html:target/report-html"},
    strict = true
)
public class PrincipalRunnerTest {
    @BeforeClass
    public static void startDriver() {
        String path = OS.getDriverPathByOS();
        System.setProperty("webdriver.chrome.driver", path);
        DriverFactory.startDriver().manage().window().maximize();
    }
    @AfterClass
    public static void closeDriver() {
        DriverFactory.killDriver();
    }
}