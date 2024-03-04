package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import java.time.Duration;

import static userinterface.AgregarProductoAlCarritoPage.*;
import static userinterface.AgregarProductoTshirtPage.*;
import static util.Constantes.TIEMPO_MAXIMO_ESPERA;

public class AgregarProductoTshirtTasks implements Task {

    public static AgregarProductoTshirtTasks agregarProductoTshirtTasks() {
        return Tasks.instrumented(AgregarProductoTshirtTasks.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PRODUCT_TSHIRT),
                Click.on(BTN_ADD_TO_CART.waitingForNoMoreThan(Duration.ofSeconds(TIEMPO_MAXIMO_ESPERA))),
                Click.on(BTN_CHECKOUT.waitingForNoMoreThan(Duration.ofSeconds(TIEMPO_MAXIMO_ESPERA))),
                Click.on(INPUT_UNIDADES),
                Enter.theValue("3").into(INPUT_UNIDADES),
                Click.on(LABEL_VALOR.waitingForNoMoreThan(Duration.ofSeconds(TIEMPO_MAXIMO_ESPERA)))
        );
    }
}
