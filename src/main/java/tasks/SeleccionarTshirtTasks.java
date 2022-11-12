package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static userinterface.SeleccionarTShirtPage.*;

public class SeleccionarTshirtTasks implements Task {

    public static SeleccionarTshirtTasks seleccionarTshirtTasks() {
        return Tasks.instrumented(SeleccionarTshirtTasks.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_TSHIRT)
        );
    }
}
