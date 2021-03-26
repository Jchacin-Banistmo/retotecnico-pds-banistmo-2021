package pa.com.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static pa.com.banistmo.userinterface.PrestamosDeAutosUserInterface.*;

public class SeleccionarTasasYTarifas implements Task {

    public static SeleccionarTasasYTarifas dePrestamoAuto() {
        return Tasks.instrumented(SeleccionarTasasYTarifas.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LINK_TASAS_Y_TARIFAS));
    }
}
