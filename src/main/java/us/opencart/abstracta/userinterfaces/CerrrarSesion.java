package us.opencart.abstracta.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CerrrarSesion {

    public static final Target LNK_MYACCOUNT = Target.the("Link de My Account").located(By.xpath("//span[contains(text(),'My Account')] "));
    public static final Target LNK_LOGOUT = Target.the("Link de Logout").located(By.xpath("//a[contains (., 'Logout')]"));



}
