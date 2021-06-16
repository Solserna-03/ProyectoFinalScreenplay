package us.opencart.abstracta.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("http://opencart.abstracta.us/index.php?")
public class HomePage extends PageObject {

    public static final Target TXT_BUSCAR = Target.the("buscar computadora").located(By.name("search"));






}
