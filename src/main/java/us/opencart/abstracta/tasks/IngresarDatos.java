package us.opencart.abstracta.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.actions.selectactions.SelectByValueFromBy;
import net.serenitybdd.screenplay.actions.selectactions.SelectByValueFromElement;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static us.opencart.abstracta.userinterfaces.DatosUsuario.*;

public class IngresarDatos implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(TXT_NOMBRE, WebElementStateMatchers.isVisible()).forNoMoreThan(10).seconds());
        actor.attemptsTo(
                Enter.theValue("Karla").into(TXT_NOMBRE),
                Enter.theValue("Lopez").into(TXT_APELLIDO),
                Enter.theValue("cll 67b").into(TXT_DIRECCION),
                Enter.theValue("Florida").into(TXT_CIUDAD),
                Click.on(TXT_PAIS),
                Click.on(TXT_PAISSELECCIONAR),
                Click.on(TXT_ESTADO),
                SelectFromOptions.byVisibleText("Florida").from(TXT_ESTADO),
                Click.on(BTN_CONTINUE)


        );


    }

    public static IngresarDatos ingresarDatos() {
        return instrumented(IngresarDatos.class);
    }
}