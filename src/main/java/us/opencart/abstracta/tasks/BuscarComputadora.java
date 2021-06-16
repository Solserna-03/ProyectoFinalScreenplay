package us.opencart.abstracta.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static us.opencart.abstracta.userinterfaces.DatosUsuario.TXT_NOMBRE;
import static us.opencart.abstracta.userinterfaces.HomePage.*;

public class BuscarComputadora implements Task {

    private String computadora;

    public BuscarComputadora(String computadora) {

        this.computadora = computadora;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.wasAbleTo(WaitUntil.the(TXT_BUSCAR, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds());
        actor.attemptsTo(
                Enter.theValue(computadora).into(TXT_BUSCAR),
                Hit.the(Keys.ENTER).into(TXT_BUSCAR)
        );




    }
     public static BuscarComputadora buscarComputadora (String computadora){
        return instrumented (BuscarComputadora.class,computadora);

     }
}
