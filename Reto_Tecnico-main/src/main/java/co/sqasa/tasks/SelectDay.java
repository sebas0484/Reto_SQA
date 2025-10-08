package co.sqasa.tasks;

import co.sqasa.userinterfaces.DatepickerPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SelectDay implements Task {

    private final String day;
    private final boolean nextMonth;

    public SelectDay(String day, boolean nextMonth) {
        this.day = day;
        this.nextMonth = nextMonth;
    }

    public static SelectDay currentMonth(String day) {
        return Tasks.instrumented(SelectDay.class, day, false);
    }

    public static SelectDay nextMonth(String day) {
        return Tasks.instrumented(SelectDay.class, day, true);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(DatepickerPage.INPUT_DATE));

        if (nextMonth) {
            actor.attemptsTo(Click.on(DatepickerPage.NEXT_MONTH));
        }

        actor.attemptsTo(Click.on(DatepickerPage.DAY.of(day)));
    }
}

