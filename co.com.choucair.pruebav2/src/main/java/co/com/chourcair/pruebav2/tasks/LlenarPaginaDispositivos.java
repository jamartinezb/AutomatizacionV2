package co.com.chourcair.pruebav2.tasks;

import co.com.chourcair.pruebav2.model.Datos;
import co.com.chourcair.pruebav2.userinterface.PaginaDispositivos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

public class LlenarPaginaDispositivos implements Task {

    private List<Datos>datos;

    public LlenarPaginaDispositivos(List<Datos> datos) {
        this.datos = datos;
    }

    public static LlenarPaginaDispositivos pagina(List<Datos> datos) {
        return Tasks.instrumented(LlenarPaginaDispositivos.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PaginaDispositivos.CajaSO),
                Enter.theValue(datos.get(0).getsSO()).into(PaginaDispositivos.SO),
                Hit.the(Keys.ENTER).into(PaginaDispositivos.SO),

                Click.on(PaginaDispositivos.CajaVersion),
                Enter.theValue(datos.get(0).getSVersion()).into(PaginaDispositivos.Version),
                Hit.the(Keys.ENTER).into(PaginaDispositivos.Version),

                Click.on(PaginaDispositivos.CajaIdioma),
                Enter.theValue(datos.get(0).getsIdioma()).into(PaginaDispositivos.Idioma),
                Hit.the(Keys.ENTER).into(PaginaDispositivos.Idioma),

                Click.on(PaginaDispositivos.CajaCelular),
                Enter.theValue(datos.get(0).getsCelular()).into(PaginaDispositivos.Celular),
                Hit.the(Keys.ENTER).into(PaginaDispositivos.Celular),

                Click.on(PaginaDispositivos.CajaModeloCel),
                Enter.theValue(datos.get(0).getsModeloCel()).into(PaginaDispositivos.ModeloCel),
                Hit.the(Keys.ENTER).into(PaginaDispositivos.ModeloCel),

                Click.on(PaginaDispositivos.CajaSOCelular),
                Enter.theValue(datos.get(0).getsSOCelular()).into(PaginaDispositivos.SOCelular),
                Hit.the(Keys.ENTER).into(PaginaDispositivos.SOCelular)

        );
    }
}
