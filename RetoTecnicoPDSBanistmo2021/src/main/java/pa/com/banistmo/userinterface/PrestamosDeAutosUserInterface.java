package pa.com.banistmo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PrestamosDeAutosUserInterface {

    public static final Target LINK_TASAS_Y_TARIFAS = Target.the("link para abrir la seccion de tasas y tarifas en prestamos de autos")
            .located(By.xpath("//a[contains(text(),'Tasa')]"));

    public static final Target LINK_DESCARGA_PDF_PROHIBICIONES_PRESTAMO_AUTO = Target.the("link para descargar el pdf de prestamo de auto")
            .located(By.xpath("//div[@id='tab4']//child::table[@dir='ltr']//child::tbody//child::tr[2]//child::td[2]//child::a[@title='Guía para afiliación a compra']"));

}
