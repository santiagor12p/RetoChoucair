package com.choucair.technicalchallenge.tasks;

import com.choucair.technicalchallenge.userinterfaces.FillFromPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import static com.choucair.technicalchallenge.userinterfaces.FillFromPage.*;
import static com.choucair.technicalchallenge.userinterfaces.FillFromPage.NEXT;

public class FillOutUserForm implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Daniel Santiago").into(NAMES),
                Enter.theValue("Romero Plaza").into(LAST_NAMES),
                Enter.theValue("pepp.perez@gmail.com").into(EMAIL_ADDRESS),
                SendKeys.of("August").into(BIRTH_MONTH),
                SendKeys.of("12").into(BIRTH_DAY),
                SendKeys.of("1998").into(BIRTH_YEAR),
                Enter.theValue("Spanish").into(LANGUAGES),
                Click.on(NEXT)
        );
    }

    public static FillOutUserForm whitDates(){
        return Tasks.instrumented(FillOutUserForm.class);
    }
}
