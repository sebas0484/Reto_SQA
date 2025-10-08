package co.sqasa.questions;

import co.sqasa.userinterfaces.DatepickerPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Attribute;

public class ValidateField implements Question<Boolean> {

    public static ValidateField isReadOnly() {
        return new ValidateField();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String readOnlyAttr = Attribute.of(DatepickerPage.INPUT_DATE)
                .named("readonly")
                .viewedBy(actor)
                .asString();

        return readOnlyAttr != null;
    }
}

