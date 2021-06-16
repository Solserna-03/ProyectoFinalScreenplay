package us.opencart.abstracta.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Computadora {
    public static final Target CLICK_SELECCIONAR = Target.the("seleccionar computadora").located(By.xpath("//span[contains (.,'Add to Cart')]"));
    public static final Target CLICK_CARRO = Target.the("ingresar al carrito de compras").located(By.xpath("//a[contains (.,'Shopping Cart')]"));
    public static final Target MSJ_PRODUCTOERROR = Target.the("Error al buscar producto").located(By.xpath("//*[@id='content']/p[2]"));

}
