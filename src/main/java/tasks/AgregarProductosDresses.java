package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


import java.time.Duration;

import static userinterface.AgregarProductoAlCarritoPage.*;
import static userinterface.AgregarProductosDressesPage.*;
import static util.Constantes.TIEMPO_MAXIMO_ESPERA;

public class AgregarProductosDresses implements Task {

    public static AgregarProductosDresses agregarProductosDresses() {
        return Tasks.instrumented(AgregarProductosDresses.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PRODUCT_DRESS_UNO),
                Click.on(BTN_ADD_TO_CART),
                Click.on(BTN_CONTINUAR_COMPRA.waitingForNoMoreThan(Duration.ofSeconds(TIEMPO_MAXIMO_ESPERA))),
                Click.on(PRODUCT_DRESS_DOS),
                Click.on(PRODUCT_DRESS_DOS),
                Click.on(BTN_ADD_TO_CART_DOS.waitingForNoMoreThan(Duration.ofSeconds(TIEMPO_MAXIMO_ESPERA))),
                Click.on(BTN_CHECKOUT.waitingForNoMoreThan(Duration.ofSeconds(TIEMPO_MAXIMO_ESPERA)))
        );
    }
}
