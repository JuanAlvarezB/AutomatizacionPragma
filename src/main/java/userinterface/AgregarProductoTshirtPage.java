package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.Dropdown;
import net.serenitybdd.screenplay.ui.PageElement;

public class AgregarProductoTshirtPage {


    public static final Target PRODUCT_TSHIRT = Dropdown.locatedBy("//a[@id='color_2']");

    public static final Target INPUT_UNIDADES = PageElement.locatedBy("//input[@class='cart_quantity_input form-control grey']");

    public static final Target LABEL_VALOR = PageElement.locatedBy("(//span[contains(text(),'$51.53')])[3]");





}
