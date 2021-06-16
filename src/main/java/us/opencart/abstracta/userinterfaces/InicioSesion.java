package us.opencart.abstracta.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InicioSesion {

    public static final Target TXT_USUARIO = Target.the("ingresar usuario").located(By.id("input-email"));
    public static final Target TXT_CLAVE = Target.the("ingresar clave").located(By.id("input-password"));
    public static final Target BTN_LOGIN = Target.the("login").located(By.id("button-login"));
}
