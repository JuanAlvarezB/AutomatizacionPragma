package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import java.time.Duration;

import static userinterface.SeleccionarRopaMujerPage.*;
import static util.Constantes.TIEMPO_MAXIMO_ESPERA;

public class SeleccionarRopaMujerTasks implements Task {

    public static SeleccionarRopaMujerTasks seleccionarRopaMujerTasks() {
        return Tasks.instrumented(SeleccionarRopaMujerTasks.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_WOMEN)
        );
    }
}
