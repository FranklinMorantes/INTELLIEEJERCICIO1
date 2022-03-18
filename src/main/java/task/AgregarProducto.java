package task;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.ScrollToBy;
import net.serenitybdd.screenplay.actions.ScrollToWebElement;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;

import javax.print.DocFlavor;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.DetallesArticulo.CLICK_AGREGAR_CARRITO;

public class AgregarProducto implements Task {

    private Actor actor;

    //CREAR NUESTRO CONSTRUCTOR
    public AgregarProducto(){
        //CREAR VARIABLE

    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
        Click.on(CLICK_AGREGAR_CARRITO));//SELECCIONAR COLOR
               // Enter.theValue(cantidad).into(),    //INGRESA EL VALOR A BUSCAR
               // Click.on(),//SELECCIONAR IR A LA CESTA
                //Click.on());//SELECCIONAR VER LA CESTA

    }


    public static AgregarProducto cantidad(){
        return instrumented(AgregarProducto.class);

    }
}
