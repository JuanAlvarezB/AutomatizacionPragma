package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.time.Duration;

import static userinterface.AgregarProductoAlCarritoPage.BTN_ADD_TO_CART;
import static userinterface.AgregarProductoAlCarritoPage.BTN_CHECKOUT;
import static userinterface.AgregarProductosDressesPage.PRODUCT_DRESS_DOS;
import static userinterface.AgregarProductosWomenPage.INPUT_CANTIDAD;
import static util.Constantes.TIEMPO_MAXIMO_ESPERA;

public class AgregarProductosDressesTasks implements Task {

    public static AgregarProductosDressesTasks agregarProductosDressesTasks() {
        return Tasks.instrumented(AgregarProductosDressesTasks.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PRODUCT_DRESS_DOS),
                Click.on(PRODUCT_DRESS_DOS),
                Click.on(INPUT_CANTIDAD.waitingForNoMoreThan(Duration.ofSeconds(TIEMPO_MAXIMO_ESPERA))),
                Enter.theValue("2").into(INPUT_CANTIDAD),
                Click.on(BTN_ADD_TO_CART),
                Click.on(BTN_CHECKOUT.waitingForNoMoreThan(Duration.ofSeconds(TIEMPO_MAXIMO_ESPERA)))
        );
    }
}
