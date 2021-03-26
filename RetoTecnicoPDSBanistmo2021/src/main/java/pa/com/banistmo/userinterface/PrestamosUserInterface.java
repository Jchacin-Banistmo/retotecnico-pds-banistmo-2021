package pa.com.banistmo.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PrestamosUserInterface {

    public static final Target LINK_PRESTAMO_AUTO = Target.the("link para ingresar a seccion de prestamos de auto")
            .located(By.xpath("//a[contains(text(),'Préstamos de Auto')]"));

}
