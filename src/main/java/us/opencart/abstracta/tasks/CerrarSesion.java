package us.opencart.abstracta.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static us.opencart.abstracta.userinterfaces.CerrrarSesion.LNK_LOGOUT;
import static us.opencart.abstracta.userinterfaces.CerrrarSesion.LNK_MYACCOUNT;
import static us.opencart.abstracta.userinterfaces.DatosUsuario.TXT_NOMBRE;

public class CerrarSesion implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(LNK_MYACCOUNT, WebElementStateMatchers.isClickable()).forNoMoreThan(10).seconds());
        actor.attemptsTo(
                Click.on(LNK_MYACCOUNT),
                Click.on(LNK_LOGOUT)

        );

    }

    public static CerrarSesion cerrarSesion(){

        return instrumented (CerrarSesion.class);
    }
}
