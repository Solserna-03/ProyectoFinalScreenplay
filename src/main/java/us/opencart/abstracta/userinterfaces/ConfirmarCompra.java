package us.opencart.abstracta.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmarCompra {


    public static final Target BTN_CONFIRMARDIRECCION = Target.the("confirmar direccion").located(By.id("button-shipping-address"));
    public static final Target BTN_CONFIRMARMETODO = Target.the("confirmar metodo").located(By.id("button-shipping-method"));
    public static final Target CHECK_TERMINOS = Target.the("confirmar terminos").located(By.name("agree"));
    public static final Target BTN_CONFIRMARTERMINOS = Target.the("confirmar terminos y condiciones").located(By.id("button-payment-method"));
    public static final Target BTN_CONFIRMAR = Target.the("confirmacion final").located(By.id("button-confirm"));


}
