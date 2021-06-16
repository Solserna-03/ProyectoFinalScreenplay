package us.opencart.abstracta.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatosUsuario {
    public static final Target TXT_NOMBRE = Target.the("Ingresar nombres").located(By.id("input-payment-firstname"));
    public static final Target TXT_APELLIDO = Target.the("Ingresar apellidos").located(By.id("input-payment-lastname"));
    public static final Target TXT_DIRECCION = Target.the("Ingresar direccion").located(By.id("input-payment-address-1"));
    public static final Target TXT_CIUDAD = Target.the("Ingresar ciudad").located(By.id("input-payment-city"));
    public static final Target TXT_PAIS = Target.the("Ingresar pais").located(By.id("input-payment-country"));
    public static final Target TXT_PAISSELECCIONAR = Target.the("Ingresar pais").located(By.xpath("//option[@value=223]"));

    public static final Target TXT_ESTADO = Target.the("Ingresar estado").located(By.id("input-payment-zone"));
    public static final Target TXT_ESTADOSELECCIONAR = Target.the("Ingresar estado").located(By.id("//option[@value=3630]"));


    public static final Target BTN_CONTINUE = Target.the("Clic en boton Continue").located(By.id("button-payment-address"));




}
