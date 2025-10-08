package co.sqasa.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DatepickerPage {

    public static final Target INPUT_DATE = Target.the("campo de selección de fecha")
            .located(By.id("datepicker"));
    public static final Target CALENDAR_CONTAINER = Target.the("contenedor del calendario")
            .located(By.id("ui-datepicker-div"));
    public static final Target PREV_MONTH = Target.the("botón mes anterior")
            .located(By.cssSelector("a.ui-datepicker-prev"));
    public static final Target NEXT_MONTH = Target.the("botón mes siguiente")
            .located(By.cssSelector("a.ui-datepicker-next"));
    public static final Target MONTH_TITLE = Target.the("título del mes actual")
            .located(By.cssSelector("div.ui-datepicker-title"));
    public static final Target DAY = Target.the("día del calendario")
            .locatedBy("//table[contains(@class,'ui-datepicker-calendar')]//a[text()='{0}']");
}


