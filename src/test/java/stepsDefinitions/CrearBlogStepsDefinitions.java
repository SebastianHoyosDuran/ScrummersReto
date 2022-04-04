package stepsDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import drivers.GoogleChromeDriver;
import steps.*;

public class CrearBlogStepsDefinitions {



    @Given("^que me encuentro en la pagina$")
    public void queMeEncuentroEnLaPaginaWebLogueado() {
        AbrirNavegador.abrirNavegador();
    }

    @When("^logue con la informacion correcta$")
    public void logueConLaInformacionCorrecta() throws InterruptedException {
        LoginSteps.loguearse();
    }

    @When("^ingrese a gestion de blogs$")
    public void ingreseAGestionDeBlogs() throws InterruptedException {
        DashboardSteps.irCrearBlog();
    }

    @When("^rellene la informacion necesaria$")
    public void relleneLaInformacionNecesaria() throws InterruptedException {
        CrearBlogSteps.crearBlog();
    }

    @Then("^podre ver el mensaje que el blog que no se guardo se manera exitosa$")
    public void podreVerElMensajeQueElBlogSeGuardoSeAmneraExitosa() {
        ValidarMensaje.validarMensaje();
    }



}
