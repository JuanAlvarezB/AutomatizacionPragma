package questions;



import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static userinterface.PrecioTotalPage.TEXT_VALIDAR;

public class ValidarPrecioTotal implements Question<Boolean> {

private String textoRespuesta;

    public ValidarPrecioTotal(String texString) {
        textoRespuesta = texString;
    }

    public static ValidarPrecioTotal validarPrecioTotal(String textoRespuesta) {

        return new ValidarPrecioTotal(textoRespuesta);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String ObtenerTexto = BrowseTheWeb.as(actor).find(TEXT_VALIDAR).getText().trim();
        if (textoRespuesta.equals(ObtenerTexto)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
    }

