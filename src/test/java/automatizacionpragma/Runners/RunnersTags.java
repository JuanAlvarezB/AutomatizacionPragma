package automatizacionpragma.Runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/Feature",
        glue = {"automatizacionpragma/Definitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@pruebaTecnicaPragma",
        dryRun = false
)

public class RunnersTags {
}