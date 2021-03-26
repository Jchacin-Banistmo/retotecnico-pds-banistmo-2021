package pa.com.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;
import pa.com.banistmo.userinterface.AbrirPaginaUserInterface;

public class AbrirPaginaBanistmo implements Task {


    private AbrirPaginaUserInterface abrirPaginaUserInterface;

    public static AbrirPaginaBanistmo banistmo() {
        return Tasks.instrumented(AbrirPaginaBanistmo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(abrirPaginaUserInterface));

    }
}
