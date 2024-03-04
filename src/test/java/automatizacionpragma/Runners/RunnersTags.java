package automatizacionpragma.Runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {"pretty"},
        features = "src/test/resources/Feature/prueba_pragma.feature",
        glue = {"automatizacionpragma/Definitions"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        monochrome = true,
        tags = "@pruebaTecnicaPragma",
        dryRun = false
)

public class RunnersTags {
}