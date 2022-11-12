package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.PageElement;

public class AgregarProductoAlCarritoPage {
    public static Target BTN_T_SHIRTS = PageElement.locatedBy("//a[@title='Faded Short Sleeve T-shirts' and @class!='product-name']");
    public static Target BTN_T_SHIRTS_DOS = PageElement.locatedBy("(//div[@class='product-container' and @itemtype='http://schema.org/Product'])[1]");
    public static Target BTN_ADD_TO_CART = PageElement.locatedBy("//span[contains(text(),'Add to cart')]");
    public static Target BTN_CHECKOUT = PageElement.locatedBy("//a[@title='Proceed to checkout']");
}
