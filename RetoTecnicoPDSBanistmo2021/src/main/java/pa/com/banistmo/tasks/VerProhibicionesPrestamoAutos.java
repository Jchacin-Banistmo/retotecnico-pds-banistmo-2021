package pa.com.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


import static pa.com.banistmo.userinterface.PrestamosDeAutosUserInterface.*;

public class VerProhibicionesPrestamoAutos implements Task {


    public static VerProhibicionesPrestamoAutos enPdf() {
        return Tasks.instrumented(VerProhibicionesPrestamoAutos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
      actor.attemptsTo(Click.on(LINK_DESCARGA_PDF_PROHIBICIONES_PRESTAMO_AUTO));
    }
}
