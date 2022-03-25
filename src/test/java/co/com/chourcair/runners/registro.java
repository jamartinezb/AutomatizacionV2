package co.com.chourcair.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/feature/registro.feature",
        tags="@stories",
        glue = "co.com.chaurcair.stepDefinitions",
        snippets = SnippetType.CAMELCASE)
public class registro {
}
