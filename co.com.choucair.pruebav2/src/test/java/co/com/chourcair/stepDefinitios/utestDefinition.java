package co.com.chourcair.stepDefinitios;

import co.com.chourcair.pruebav2.model.Datos;
import co.com.chourcair.pruebav2.tasks.AbrirPagina;
import co.com.chourcair.pruebav2.tasks.LlenarPaginaDispositivos;
import co.com.chourcair.pruebav2.tasks.LlenarPaginaLocalizacion;
import co.com.chourcair.pruebav2.tasks.LlenarPaginaPersona;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class utestDefinition {

    @Before
    public void iniUs(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^la pagina cargue$")
    public void laPaginaCargue(){
        theActorCalled("Jhon").wasAbleTo(AbrirPagina.pagina());

    }

    @When("^el usuario inicia el registro$")
    public void elUsuarioIniciaElRegistro(List<Datos> datos){
    theActorInTheSpotlight().attemptsTo(LlenarPaginaPersona.pagina(datos), LlenarPaginaLocalizacion.pagina(datos),
            LlenarPaginaDispositivos.pagina(datos));
    }

    @Then("^se completa con exito$")
    public void seCompletaConExito(){

    }
}
