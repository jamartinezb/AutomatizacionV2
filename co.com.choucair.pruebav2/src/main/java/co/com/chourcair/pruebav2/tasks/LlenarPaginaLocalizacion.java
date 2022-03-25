package co.com.chourcair.pruebav2.tasks;

import co.com.chourcair.pruebav2.model.Datos;
import co.com.chourcair.pruebav2.userinterface.PaginaLocalizacion;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

public class LlenarPaginaLocalizacion implements Task {

    private List<Datos> datos;

    public LlenarPaginaLocalizacion(List<Datos> datos) {
        this.datos = datos;
    }

    public static LlenarPaginaLocalizacion pagina(List<Datos> datos) {
        return Tasks.instrumented(LlenarPaginaLocalizacion.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
                Enter.theValue(datos.get(0).getsCiudad()).into(PaginaLocalizacion.Ciudad),
                Hit.the(Keys.ENTER).into(PaginaLocalizacion.Ciudad),
                Enter.theValue(datos.get(0).getsPosta()).into(PaginaLocalizacion.Postal),
                Click.on(PaginaLocalizacion.CajaPais),
                Enter.theValue(datos.get(0).getsPais()).into(PaginaLocalizacion.Pais),
                Hit.the(Keys.ENTER).into(PaginaLocalizacion.Pais),
                Click.on(PaginaLocalizacion.Siguiente)
        );
    }
}
