package runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
//INICIAR QUE LA PRUEBA SE VA A EJECUTAR CON SERENITY

@RunWith(CucumberWithSerenity.class)

//RELACION DE DONDE ESTA UBICADO NUESTRA CONFIGURACION
@CucumberOptions(
        features = "src/test/resources/features/EjemploSemilleros.feature",//UBICACION DEL ARCHIVO DONDE SE ENCUENTRAN LOS FEATURES
        glue = "stepDefinitions",//UBICACION DE DONDE SE ENCUENTRA NUESTRO STEPS
        tags = "@EscenarioSinValor", //UBICACION DE DONDE SE ENCUENTRA NUE    STRAS TAREAS
        snippets = CucumberOptions.SnippetType.CAMELCASE //INTERPRETA LA LECTURA DE LOS PASOS EN JAVA

)

public class EjemploSemilleroRunner {
}
