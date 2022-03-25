package co.com.chourcair.pruebav2.tasks;


import co.com.chourcair.pruebav2.model.Datos;
import co.com.chourcair.pruebav2.userinterface.PaginaPersona;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

public class LlenarPaginaPersona implements Task {
    private List<Datos> datos;

    public LlenarPaginaPersona(List<Datos> datos) {
        this.datos = datos;
    }

    public static LlenarPaginaPersona pagina(List<Datos> datos) {
        return Tasks.instrumented(LlenarPaginaPersona.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datos.get(0).getsNombres()).into(PaginaPersona.Nombres),
                Enter.theValue(datos.get(0).getsApellidos()).into(PaginaPersona.Apellidos),
                Enter.theValue(datos.get(0).getsEmail()).into(PaginaPersona.Email),
                SelectFromOptions.byVisibleText(datos.get(0).getsMes()).from(PaginaPersona.Mes),
                SelectFromOptions.byVisibleText(datos.get(0).getsDia()).from(PaginaPersona.Dia),
                SelectFromOptions.byVisibleText(datos.get(0).getsAnno()).from(PaginaPersona.Anno),
                Click.on(PaginaPersona.Siguiente)
        );

    }
}
