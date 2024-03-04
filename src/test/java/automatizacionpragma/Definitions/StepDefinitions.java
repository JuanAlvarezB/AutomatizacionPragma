package automatizacionpragma.Definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.ValidarPrecioTotal;
import tasks.*;

public class StepDefinitions {

    @Given("{actor} ingresa al sitio automationpractice")
    public void juanCamiloIngresaAlSitioAutomationpractice(Actor actor) {
        actor.attemptsTo(UrlPruebaTecnica.urlPruebaAutomation());
    }


    @Given("{actor} Selecciona ropa para mujer")
    public void juanCamiloSeleccionaRopaParaMujer(Actor actor) {
        actor.attemptsTo(SeleccionarRopaMujerTasks.seleccionarRopaMujerTasks());
    }

    @When("Agrega el producto al carrito")
    public void agregaElProductoAlCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarProductoAlCarritoTasks.agregarProductoAlCarritoTasks());
    }

    @Then("el visualiza el total de {string}")
    public void elVisualizaElTotalDe$(String s) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarPrecioTotal.validarPrecioTotal(s)));
    }

    @Given("{actor} ingresa a la seccion Dresses")
    public void juanCamiloIngresaALaSeccionDresses(Actor actor) {
        actor.attemptsTo(SeleccionarDressesTasks.seleccionarDressesTasks());
    }

    @When("selecciona y agrega todos los pructos al carrito")
    public void seleccionaYAgregaTodosLosPructosAlCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarProductosDresses.agregarProductosDresses());
    }

    @Then("{actor} observa un total de {string}")
    public void juanCamiloObservaUnTotalDe(Actor actor, String string) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarPrecioTotal.validarPrecioTotal(string)));
    }

    @Given("{actor} ingresa a la seccion de TShirt")
    public void juanCamiloIngresaALaSeccionDeTshirt(Actor actor) {
        actor.attemptsTo(SeleccionarTshirtTasks.seleccionarTshirtTasks());
    }

    @When("En la seccion Women selecciona un producto y agrega dos unidades")
    public void enLaSeccionWomenSeleccionaUnProductoYAgregaDosUnidades() {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarProductoTshirtTasks.agregarProductoTshirtTasks());
    }

    @Then("{actor} visualiza un precio total de {string}")
    public void juanCamiloVisualizaUnPrecioTotalDe(Actor actor, String string) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarPrecioTotal.validarPrecioTotal(string)));
    }

    @Given("{actor} Ingresa a la seccion Women")
    public void juanCamiloIngresaALaSeccionWomen(Actor actor) {
        actor.attemptsTo(SeleccionarRopaMujerTasks.seleccionarRopaMujerTasks());
    }

    @When("Agrega un producto con dos unidades")
    public void agregaUnProductoConDosUnidades() {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarProductosWomenDosTasks.agregarProductosWomenDosTasks());
    }

    @Given("{actor} da clic en la opcion Dress")
    public void juanCamiloDaClicEnLaOpcionDress(Actor actor) {
        actor.attemptsTo(SeleccionarDressesTasks.seleccionarDressesTasks());
    }

    @When("Selecciona un producto y agrega dos unidades")
    public void seleccionaUnProductoYAgregaDosUnidades() {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarProductosDressesTasks.agregarProductosDressesTasks());
    }

    @Then("{actor} puede ver un precio total de {string}")
    public void juanCamiloPuedeVerUnPrecioTotalDe(Actor actor, String string) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarPrecioTotal.validarPrecioTotal(string)));
    }

    @Given("{actor} da clic en Women")
    public void juanCamiloDaClicEnWomen(Actor actor) {
        actor.attemptsTo(SeleccionarRopaMujerTasks.seleccionarRopaMujerTasks());
    }

    @When("selecciona un producto agregandole cinco unidades")
    public void seleccionaUnProductoAgregandoleCincoUnidades() {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarWomenCincoTasks.agregarWomenCincoTasks());
    }

    @Then("Visualiza el valor total compra {string}")
    public void visualizaElValorTotalCompra(String string) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarPrecioTotal.validarPrecioTotal(string)));
    }

    @Given("{actor} ingresa clic en la opcion Dresses")
    public void juanCamiloIngresaClicEnLaOpcionDresses(Actor actor) {
        actor.attemptsTo(SeleccionarDressesTasks.seleccionarDressesTasks());
    }

    @When("ingresa un producto con seis unidades al carrito")
    public void ingresaUnProductoConSeisUnidadesAlCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(AgregarDressesSeisTasks.agregarDressesSeisTasks());
    }
}
