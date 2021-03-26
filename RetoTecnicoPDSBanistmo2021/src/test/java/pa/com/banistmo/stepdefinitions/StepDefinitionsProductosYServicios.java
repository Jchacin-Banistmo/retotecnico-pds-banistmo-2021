package pa.com.banistmo.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pa.com.banistmo.tasks.*;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class StepDefinitionsProductosYServicios {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Dado("^que ingreso a la pagina de Banistmo$")
    public void queIngresoALaPagina() {
        theActorCalled("Jonathan").wasAbleTo(AbrirPaginaBanistmo.banistmo());

    }

    @Cuando("^ingreso a la seccion de productos y servicios$")
    public void ingresoALaSeccionDeProductosYServicios() {
        theActorInTheSpotlight().attemptsTo(
                IngresarAProductosYServicios.deBanistmo(),
                SeleccionarProductoPrestamo.deBanistmo(),
                SeleccionarPrestamoAutos.enPrestamos(),
                SeleccionarTasasYTarifas.dePrestamoAuto(),
                VerProhibicionesPrestamoAutos.enPdf()
        );
    }

    @Entonces("^verifico que se muestre el pdf de prestamos y servicios$")
    public void verificoQueSeMuestreElPdfDePrestamosYServicios() {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }



}
