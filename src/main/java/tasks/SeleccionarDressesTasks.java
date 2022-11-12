package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userinterface.SeleccionarSeccionDressesPage.*;

public class SeleccionarDressesTasks implements Task {

    public static SeleccionarDressesTasks seleccionarDressesTasks() {
        return Tasks.instrumented(SeleccionarDressesTasks.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_DRESSES)
        );
    }
}
