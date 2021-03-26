package pa.com.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import pa.com.banistmo.userinterface.PrestamosDeAutosUserInterface;
import pa.com.banistmo.userinterface.PrestamosUserInterface;

import static pa.com.banistmo.userinterface.PrestamosUserInterface.*;

public class SeleccionarPrestamoAutos implements Task {

    public static SeleccionarPrestamoAutos enPrestamos() {
        return Tasks.instrumented(SeleccionarPrestamoAutos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LINK_PRESTAMO_AUTO));
    }
}
