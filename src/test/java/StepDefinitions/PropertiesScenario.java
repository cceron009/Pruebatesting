package StepDefinitions;

import Functions.SeleniumFunctions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.And;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;

import java.io.IOException;

public class PropertiesScenario {

    SeleniumFunctions functions = new SeleniumFunctions();

    @Given("los datos del ambiente y usuarios del sistema")
    public void losDatosAmbienteYusuariosDelSistema() throws Exception {
        functions.RetriveTestDatas();
    }

    @And("Tengo la variable {string} con el valor {string}")
    public void asignoUnaVariable(String key, String text) throws Exception {
        functions.iSaveTextInScenario(key,text);
    }

    @And("Limpiar la variable {string}")
    public void limpioUnaVariable(String key) throws Exception {
        functions.removeKey(key);
    }

    @Entonces("el sistema genera una alerta que contiene el texto {string}")
    public void elSistemaGeneraUnaAlertaQueContieneElTexto(String texto) throws Exception {
        functions.scrollPage("top");
        functions.checkPartialTextElementPresent("Alerta", texto);
    }
    @Dado("inicio sesion en saucedemo")
    public void inicioSesionEnSaucedemo() throws IOException {
        functions.switchToNewTab("https://www.saucedemo.com/", "Navegaoor" );
        functions.attachScreenShot();
    }
    @Cuando("ingreso las credenciales correctas del usuario {string}")
    public void InicioSesionInformacionCorrecta(String usuario) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        //functions.iClicInElement("");
        functions.iSetElementWithText("user", "standard_user");
        functions.attachScreenShot();
    }
    @Cuando("ingreso correctamente contraseña {string}")
    public void ingresoCorrectamenteContraseña(String arg0) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iSetElementWithText("pass", "secret_sauce");
        functions.attachScreenShot();
    }

    @Entonces("puedo ingresar al aplicativo")
    public void puedoIngresarAlAplicativo() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("login");
    }


    @Dado("Que tengo productos para agregar al carro")
    public void queTengoProductosParaAgregarAlCarro() {
    }

    @Cuando("Agrego un producto al carrito de compras")
    public void agregoUnProductoAlCarritoDeCompras() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("Product");
        functions.attachScreenShot();
    }

    @Y("Selecciono carrito de compras")
    public void seleccionoCarritoDeCompras() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("Carrito");
        functions.attachScreenShot();
    }

    @Entonces("Puedo ver productos seleccionados en el carrito")
    public void puedoVerProductosSeleccionadosEnElCarrito() throws Exception {
        functions.checkPartialTextElementPresent("//div[@class=\"cart_quantity\"]", "1");
        functions.attachScreenShot();
    }

    @Dado("Los productos para realizar Checkout")
    public void losProductosParaRealizarCheckout() {

    }

    @Cuando("Realizo Checkout")
    public void realizadoElCheckout() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("Checkout");
        functions.attachScreenShot();
    }

    @Y("ingreso primer nombre {string} y apellido {string}")
    public void ingresoPrimerNombreYApellido(String nombre, String apellido) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iSetElementWithText("FirstnameCheck", "Cristian");
        functions.iSetElementWithText("LastnameCheck", "Ceron");
        functions.attachScreenShot();
    }

    @Y("codigo postal {string}")
    public void CodigoPostal(String arg0) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iSetElementWithText("PosCode", "11111100");
        functions.attachScreenShot();
    }

    @Entonces("Puedo Ver el Checkout")
    public void PuedoVerElCheckout() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("ContiCheck");
        functions.attachScreenShot();
    }

    @Dado("Que puedo ver descripcion del producto a comprar")
    public void quePuedoVerLaDescripcionDelProductoPorComprar() {

    }

    @Cuando("Finalizamos la compra")
    public void finalizamosLaCompra() {
    }

    @Entonces("puedo ver la confirmacion de la compra")
    public void puedoVerLaConfirmacionDeLaCompra() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("FinishCheck");
        functions.attachScreenShot();

    }

    @Entonces("Retorno al Home page del portal")
    public void retornoAlHomePageDelPortal() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("BackHome");
        functions.attachScreenShot();

    }
}