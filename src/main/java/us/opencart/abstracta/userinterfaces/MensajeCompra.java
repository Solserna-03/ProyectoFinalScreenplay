package us.opencart.abstracta.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MensajeCompra {

    public static final Target MSJ_VALIDACION = Target.the("Validar mensaje").located(By.xpath("//h1[contains(.,'Your order has been placed!')]"));

}
