package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://www.mercadolibre.com.co/")

public class HomePAge extends PageObject {
//SELECCIONAR NUESTRO PRIMER OBJETIVO DENTRO DE LA PAGINA

    public static final Target INPUT_TXT_BUSQUEDA =
            Target.the("SELECCIONAR PRODUCTO DE LA BUSQUEDA")
                    .located(By.xpath("//input[@class = 'nav-search-input']"));

    public static final Target LINK_INGRESAR =
            Target.the("SELECCIONAR X DE INGRESAR")
                    .located(By.xpath("/html/body/div[3]/div/div/div[2]/div/button"));
    public static final Target LINK_COOKIES =
            Target.the("SELECCIONAR ACEPTAR COOKIES")
                    .located(By.xpath("/html/body/div[2]/div[1]/div[2]/button[1]"));
    public static final Target LINK_SELECCIONAR_PRODUCTO =Target.the("SELECCIONAR PRODUCTO DE LA BUSQUEDA").located(By.xpath("//h2[@class='ui-search-item__title']"));

    public static final Target LINK_SELECCIONAR_CARRITO =Target.the("SELECCIONAR PRODUCTO DE LA BUSQUEDA").locatedBy("p[@id='mlCategory']");

}