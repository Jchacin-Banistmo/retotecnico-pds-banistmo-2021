package pa.com.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static pa.com.banistmo.userinterface.ProductosYServiciosUserInterface.*;


public class SeleccionarProductoPrestamo implements Task {

    public static SeleccionarProductoPrestamo deBanistmo() {
        return Tasks.instrumented(SeleccionarProductoPrestamo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LINK_PRESTAMOS));
    }
}
