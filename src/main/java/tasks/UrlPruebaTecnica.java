package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import util.Constantes;

public class UrlPruebaTecnica implements Task {

    public static UrlPruebaTecnica urlPruebaAutomation() {
        return Tasks.instrumented(UrlPruebaTecnica.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(Constantes.URL_PRUEBA)
        );
    }
}
