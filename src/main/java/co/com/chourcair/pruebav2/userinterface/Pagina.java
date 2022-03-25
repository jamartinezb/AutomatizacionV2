package co.com.chourcair.pruebav2.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://utest.com/")
public class Pagina extends PageObject {
    public static final Target JOIN_TODAY = Target.the("Inicio registro")
            .located(By.className("unauthenticated-nav-bar__sign-up"));
}
