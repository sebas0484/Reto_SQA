package co.sqasa.StepDef;

import co.sqasa.questions.ValidateField;
import co.sqasa.questions.SelectedDate;
import co.sqasa.tasks.OpenThePage;
import co.sqasa.tasks.SelectDay;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.*;

public class DatepickerStepDefinitions {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("que el usuario abre la página del datepicker")
    public void queElUsuarioAbreLaPaginaDelDatepicker() {
        OnStage.theActorCalled("Usuario").wasAbleTo(OpenThePage.inJqueryDatepicker());
    }

    @When("selecciona el día 15 del mes actual")
    public void seleccionaElDia15DelMesActual() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectDay.currentMonth("15"));
    }

    @Then("la fecha seleccionada debe mostrarse en el campo")
    public void laFechaSeleccionadaDebeMostrarseEnElCampo() {
        OnStage.theActorInTheSpotlight().should(
                seeThat("La fecha seleccionada no debe estar vacía",
                        SelectedDate.value(), not(isEmptyString()))
        );
    }

    @When("selecciona el día 10 del próximo mes")
    public void seleccionaElDia10DelProximoMes() {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectDay.nextMonth("10"));
    }

    @When("intenta escribir manualmente una fecha")
    public void intentaEscribirManualmenteUnaFecha() {
    }

    @Then("no debe poder editar el campo de texto")
    public void noDebePoderEditarElCampoDeTexto() {
        OnStage.theActorInTheSpotlight().should(
                seeThat("El campo debe ser de solo lectura",
                        ValidateField.isReadOnly(), is(true))
        );
    }
}
