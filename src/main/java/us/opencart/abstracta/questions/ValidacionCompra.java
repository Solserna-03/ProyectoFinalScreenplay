package us.opencart.abstracta.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import us.opencart.abstracta.userinterfaces.MensajeCompra;

public class ValidacionCompra implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {

        return MensajeCompra.MSJ_VALIDACION.resolveFor(actor).getText();
    }

    public static Question obtenerMensaje(){
        return new ValidacionCompra();
    }
}
