package us.opencart.abstracta.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Visibility;
import net.serenitybdd.screenplay.waits.WaitUntil;
import us.opencart.abstracta.exceptions.ExceptionProduct;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static us.opencart.abstracta.userinterfaces.Computadora.*;
import static us.opencart.abstracta.userinterfaces.DatosUsuario.TXT_NOMBRE;

public class SeleccionarComputadora implements Task {




    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(WaitUntil.the(CLICK_SELECCIONAR, WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds());
        actor.attemptsTo(
                Click.on(CLICK_SELECCIONAR),
                Click.on(CLICK_CARRO)
        );

    }

    public static SeleccionarComputadora seleccionarComputadora (){
        return instrumented (SeleccionarComputadora.class);

    }
}
