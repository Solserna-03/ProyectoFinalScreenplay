package us.opencart.abstracta.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;
import us.opencart.abstracta.exceptions.ExceptionProduct;
import us.opencart.abstracta.questions.ValidacionCompra;
import us.opencart.abstracta.tasks.*;
import us.opencart.abstracta.userinterfaces.HomePage;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class compraStepdefinitions {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor carla = Actor.named("carla");
    private HomePage homePage = new HomePage ();


    @Before
    public void setUp() {
        carla.can(BrowseTheWeb.with(navegador));
        carla.wasAbleTo(Open.browserOn(homePage));
    }
    @Dado("que Juan busque una computadora {string} en la pagina web")
    public void queJuanBusqueUnaComputadoraEnLaPaginaWeb(String computadora) {

        carla.wasAbleTo(BuscarComputadora.buscarComputadora(computadora));


    }


    @Dado("la ingrese al carro de compras")
    public void laIngreseAlCarroDeCompras() {
        carla.attemptsTo(SeleccionarComputadora.seleccionarComputadora());


    }
    @Cuando("verifique que es la computadora que quiere prodece a realizar el pago")
    public void verifiqueQueEsLaComputadoraQueQuiereProdeceARealizarElPago() {
        carla.attemptsTo(ConfirmarProducto.confirmarProducto());


    }
    @Cuando("Juan ingrese usuario {string} y clave {string}")
    public void juanIngreseUsuarioYClave(String usuario, String clave) {
        carla.attemptsTo(LoginUsuario.loginUsuario(usuario, clave));


    }
    @Cuando("ingresa datos solictados")
    public void ingresaDatosSolictados()  {
        carla.attemptsTo(IngresarDatos.ingresarDatos());



    }
    @Entonces("confirma la orden de compra con el siguiente mensaje {string}")
    public void confirmaLaOrdenDeCompraConElSiguienteMensaje(String mensaje) {
        carla.attemptsTo(ConfirmarProductoFinal.confirmarProductoFinal());
        carla.should(seeThat("El actor debe ver", ValidacionCompra.obtenerMensaje(), Matchers.equalTo(mensaje)));

    }

    @After
    public void logout() {
        carla.attemptsTo(CerrarSesion.cerrarSesion());


    }






}
