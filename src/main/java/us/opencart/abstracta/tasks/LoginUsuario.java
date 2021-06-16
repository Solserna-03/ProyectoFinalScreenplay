package us.opencart.abstracta.tasks;

import io.cucumber.java.es.E;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static us.opencart.abstracta.userinterfaces.DatosUsuario.TXT_NOMBRE;
import static us.opencart.abstracta.userinterfaces.InicioSesion.*;


public class LoginUsuario implements Task {


    private String usuario;
    private String clave;

    public LoginUsuario(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(TXT_USUARIO, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds());
        actor.attemptsTo(
                Enter.theValue(usuario).into(TXT_USUARIO),
                Enter.theValue(clave).into(TXT_CLAVE),
                Click.on(BTN_LOGIN)



        );

    }
    public static LoginUsuario loginUsuario (String usuario, String clave){
        return instrumented (LoginUsuario.class, usuario, clave);
    }
}
