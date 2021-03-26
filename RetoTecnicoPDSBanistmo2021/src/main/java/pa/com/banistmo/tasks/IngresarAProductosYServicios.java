package pa.com.banistmo.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import pa.com.banistmo.userinterface.ProductosYServiciosUserInterface;

import static pa.com.banistmo.userinterface.ProductosYServiciosUserInterface.*;

public class IngresarAProductosYServicios implements Task {


    public static IngresarAProductosYServicios deBanistmo() {
        return Tasks.instrumented(IngresarAProductosYServicios.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LINK_PRODUCTOS_SERVICIOS));
    }
}
