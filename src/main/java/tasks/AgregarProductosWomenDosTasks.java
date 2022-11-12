package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.time.Duration;

import static userinterface.AgregarProductoAlCarritoPage.*;
import static userinterface.AgregarProductosDressesPage.BTN_CONTINUAR_COMPRA;
import static userinterface.AgregarProductosWomenPage.*;
import static util.Constantes.TIEMPO_MAXIMO_ESPERA;

public class AgregarProductosWomenDosTasks implements Task {

    public static AgregarProductosWomenDosTasks agregarProductosWomenDosTasks() {
        return Tasks.instrumented(AgregarProductosWomenDosTasks.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PRODUCT_WOMEN_UNO),
                Click.on(PRODUCT_WOMEN_UNO),
                Click.on(INPUT_CANTIDAD.waitingForNoMoreThan(Duration.ofSeconds(TIEMPO_MAXIMO_ESPERA))),
                Enter.theValue("2").into(INPUT_CANTIDAD),
                Click.on(BTN_ADD_TO_CART),
                Click.on(BTN_CONTINUAR_COMPRA.waitingForNoMoreThan(Duration.ofSeconds(TIEMPO_MAXIMO_ESPERA)))
        );
    }
}
