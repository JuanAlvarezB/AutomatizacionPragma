package userinterface;


import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.Dropdown;
import net.serenitybdd.screenplay.ui.PageElement;

public class AgregarProductosDressesPage {

    public static final Target PRODUCT_DRESS_UNO = Dropdown.locatedBy("(//div[@class='product-container' and @itemtype='http://schema.org/Product'])[1]");
    public static Target BTN_CONTINUAR_COMPRA = PageElement.locatedBy("//span[@title='Continue shopping']");
    public static final Target PRODUCT_DRESS_DOS = PageElement.withNameOrId("color_16");
   public static Target BTN_ADD_TO_CART_DOS = Dropdown.locatedBy("//button[@type='submit' and @name='Submit']");

}
