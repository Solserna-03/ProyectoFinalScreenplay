package us.opencart.abstracta.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmarProducto {

    public static final Target MSJ_PRODUCTO = Target.the("confirmar producto").located(By.xpath("//td[contains (.,'Product 14')]"));
    public static final Target BTN_CONFIRMAR = Target.the("comprar").located(By.xpath("//a[contains(text(),'Checkout')]"));
    public static final Target BTN_OPCIONES = Target.the("opciones avanzadas").located(By.id("details-button"));
    public static final Target LNK_IRSITIO = Target.the("ir a sitio no seguro").located(By.xpath("//a[contains(.,'Continuar a opencart.abstracta.us (no seguro)')]"));
}
