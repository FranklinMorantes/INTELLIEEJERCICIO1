package task;


import iteracciones.TiempoEspera;
import net.bytebuddy.asm.Advice;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.DetallesArticulo.CLICK_AGREGAR_CARRITO;
import static userinterfaces.HomePAge.*;

public class BuscarProducto implements Task {
    private String descripcion;

    public BuscarProducto(String descripcion)
    {


        this.descripcion = descripcion;


    }


    public static  BuscarProducto conDescripcion(String descripcion){


        return instrumented(BuscarProducto.class,descripcion);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        //EL ACTOR VA A EJECUTAR UNA TAREA ATTEMPTSTO
        actor.attemptsTo(

                Enter.theValue(descripcion).into(INPUT_TXT_BUSQUEDA),//RECIBIR UN VALOR, DILIGENCIA CAMPO DE BUSQUEDA
                Hit.the(Keys.ENTER).into(INPUT_TXT_BUSQUEDA), //REALIZA UN ENTER SOBRE EL CAMPO DE BUSQUEDA
                iteracciones.TiempoEspera.unMomento(2),
                Click.on(LINK_INGRESAR),
                Click.on(LINK_COOKIES),
                Click.on(LINK_SELECCIONAR_PRODUCTO),// SELECCIONA EL PRODUCTO A AGREGAR
                iteracciones.TiempoEspera.unMomento(4));






    }
}
