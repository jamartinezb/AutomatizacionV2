package co.com.chourcair.pruebav2.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaPersona {

    public static final Target Nombres = Target.the("nombres")
            .located(By.id("firstName"));
    public static final Target Apellidos = Target.the("apellidos")
            .located(By.id("lastName"));
    public static final Target Email = Target.the("correo")
            .located(By.id("email"));
    public static final Target Mes = Target.the("mes de nacimiento")
            .located(By.id("birthMonth"));
    public static final Target Dia = Target.the("dia de nacimiento")
            .located(By.id("birthDay"));
    public static final Target Anno = Target.the("año nacimiento")
            .located(By.id("birthYear"));
    public static final Target Siguiente = Target.the("boton siguiente")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a"));
}
