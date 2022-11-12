package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import java.time.Duration;

import static userinterface.AgregarProductoAlCarritoPage.*;
import static util.Constantes.TIEMPO_MAXIMO_ESPERA;

public class AgregarProductoAlCarritoTasks implements Task {


    public static AgregarProductoAlCarritoTasks agregarProductoAlCarritoTasks() {
        return Tasks.instrumented(AgregarProductoAlCarritoTasks.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Scroll.to(BTN_T_SHIRTS),
                Click.on(BTN_T_SHIRTS_DOS),
                Click.on(BTN_ADD_TO_CART),
                Click.on(BTN_CHECKOUT.waitingForNoMoreThan(Duration.ofSeconds(TIEMPO_MAXIMO_ESPERA)))
        );
    }
}
