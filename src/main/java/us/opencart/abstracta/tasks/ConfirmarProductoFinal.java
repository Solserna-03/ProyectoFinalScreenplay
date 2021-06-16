package us.opencart.abstracta.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static us.opencart.abstracta.userinterfaces.ConfirmarCompra.*;
import static us.opencart.abstracta.userinterfaces.DatosUsuario.TXT_NOMBRE;

public class ConfirmarProductoFinal implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(BTN_CONFIRMARDIRECCION, WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds());
        actor.attemptsTo(
                Click.on(BTN_CONFIRMARDIRECCION),
                Click.on(BTN_CONFIRMARMETODO),
                Click.on(CHECK_TERMINOS),
                Click.on(BTN_CONFIRMARTERMINOS),
                Click.on(BTN_CONFIRMAR)
        );
    }

    public static ConfirmarProductoFinal confirmarProductoFinal () {
        return instrumented (ConfirmarProductoFinal.class);
    }
}
