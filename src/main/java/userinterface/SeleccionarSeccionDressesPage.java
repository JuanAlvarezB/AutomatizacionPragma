package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.PageElement;

public class SeleccionarSeccionDressesPage {

    public static Target BTN_DRESSES = PageElement.locatedBy("(//a[@title='Dresses' and @class='sf-with-ul'])[2]");
}
