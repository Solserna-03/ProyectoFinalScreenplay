package us.opencart.abstracta.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static us.opencart.abstracta.userinterfaces.ConfirmarProducto.*;
import static us.opencart.abstracta.userinterfaces.DatosUsuario.TXT_NOMBRE;

public class ConfirmarProducto implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(MSJ_PRODUCTO, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds());
        actor.attemptsTo(
                WaitUntil.the(MSJ_PRODUCTO, WebElementStateMatchers.isEnabled()),
                Click.on(BTN_CONFIRMAR),
                Click.on(BTN_OPCIONES),
                Click.on(LNK_IRSITIO)


        );

    }

    public static ConfirmarProducto confirmarProducto(){
        return instrumented (ConfirmarProducto.class);
    }
}
