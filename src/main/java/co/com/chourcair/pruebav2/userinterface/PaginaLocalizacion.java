package co.com.chourcair.pruebav2.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaLocalizacion {

    public static final Target Ciudad = Target.the("ciudad")
            .located(By.id("city"));
    public static final Target Postal = Target.the("codigo postal")
            .located(By.id("zip"));
    public static final Target CajaPais = Target.the("click contenedor pais")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]"));
    public static final Target Pais = Target.the("pais")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target Siguiente = Target.the("siguiente")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

}
