package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.ScrollToBy;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.mercadolibre.com.co/")
public class DetallesArticulo extends PageObject {

    public static final Target CLICK_AGREGAR_CARRITO =
            Target.the("SELECCIONAR PRODUCTO DE LA BUSQUEDA")
                    .located(By.xpath("//button[@class = 'andes-button andes-button--quiet']"));

}
