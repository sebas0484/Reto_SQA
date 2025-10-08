package co.sqasa.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.Tasks;

public class OpenThePage implements Task {
    public static OpenThePage inJqueryDatepicker() {
        return Tasks.instrumented(OpenThePage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url("https://jqueryui.com/datepicker/"));
    }
}

