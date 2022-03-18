package stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import task.AgregarProducto;
import task.BuscarProducto;
import userinterfaces.HomePAge;

import java.util.List;

public class EjemploSemilleroSteps
{
    @Managed()
    //CREAR VARIABLES DE NAVEGADOR Y ACTOR
    private WebDriver driver;
    private Actor actor=Actor.named("Global");
    private HomePAge homePage=new HomePAge();


    public EjemploSemilleroSteps() {
    }


    @Dado("que un cliente accede a la web de compras")
    public void queUnClienteAccederAlaWebDeComprar(){
        //INDICANDO AL ACTOR QUE PUEDE ACCEDER A UN NAVEGADOR
        actor.can(BrowseTheWeb.with(driver));
        driver.manage().window().maximize();

        //EL ACTOR FUE CAPAZ DE ABRIR
        actor.wasAbleTo(Open.browserOn((PageObject) homePage));



    }

    @Cuando("^el agrega x unidades  de (.*) al carrito$")
    public void elAgregaUnProductoAlCarrito( String descripcion) {

        //EL ACTOR ES CAPAZ DE HACER WASABLETO Y ENVIAMOS LOS PARAMETROS AL METODO
        actor.wasAbleTo(
                BuscarProducto.conDescripcion(descripcion),
        AgregarProducto.cantidad());




    }

    @Entonces("el ve los productos en el carrito de compras")
    public  void elVeLosProductosEnElCarritoDeCompras() {


    }









    @Cuando("^el agrega un producto al carrito audifono$")
    public void elAgregaUnProductoAlCarrito(List<String> datos) {

        //EL ACTOR ES CAPAZ DE HACER WASABLETO Y ENVIAMOS LOS PARAMETROS AL METODO
        actor.wasAbleTo(
                BuscarProducto.conDescripcion(datos.get(0)),
                AgregarProducto.cantidad());




    }

    @Entonces("el ve los productos en el carrito de compras List")
    public  void elVeLosProductosEnElCarritoDeComprasList() {


    }






    @Cuando("el agrega un producto al carrito")
    public void elAgregaUnProductoAlCarrito(io.cucumber.datatable.DataTable dataTable){


    }

}