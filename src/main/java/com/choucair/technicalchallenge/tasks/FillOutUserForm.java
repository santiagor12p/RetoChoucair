package com.choucair.technicalchallenge.tasks;

import com.choucair.technicalchallenge.userinterfaces.FillFromPage;
import cucumber.api.java.af.En;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.actions.SendKeysIntoBy;

import static com.choucair.technicalchallenge.userinterfaces.FillFromPage.NEXT;

public class FillOutUserForm implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Daniel Santiago").into(FillFromPage.NAMES),
                Enter.theValue("Romero Plaza").into(FillFromPage.LAST_NAMES),
                Enter.theValue("dsromerop12@gmail.com").into(FillFromPage.EMAIL_ADDRESS),
                SendKeys.of("August").into(FillFromPage.BIRTH_MONTH),
                SendKeys.of("12").into(FillFromPage.BIRTH_DAY),
                SendKeys.of("1998").into(FillFromPage.BIRTH_YEAR),
                Enter.theValue("Spanish").into(FillFromPage.LANGUAGES),
                Click.on(NEXT)
        );
    }

    public static FillOutUserForm whitDates(){
        return Tasks.instrumented(FillOutUserForm.class);
    }
}
