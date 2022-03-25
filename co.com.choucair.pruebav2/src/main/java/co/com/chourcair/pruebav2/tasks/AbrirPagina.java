package co.com.chourcair.pruebav2.tasks;

import co.com.chourcair.pruebav2.userinterface.Pagina;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

public class AbrirPagina implements Task {

    private Pagina paginaUtest;

    public static AbrirPagina pagina() {
        return Tasks.instrumented(AbrirPagina.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(paginaUtest),
        Click.on(paginaUtest.JOIN_TODAY));
    }
}
