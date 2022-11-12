package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.Dropdown;
import net.serenitybdd.screenplay.ui.PageElement;

public class AgregarProductosWomenPage {
    public static final Target PRODUCT_WOMEN_UNO = Dropdown.locatedBy("//a[@id='color_7']");
    public static final Target INPUT_CANTIDAD = PageElement.locatedBy("//input[@id='quantity_wanted']");



}
