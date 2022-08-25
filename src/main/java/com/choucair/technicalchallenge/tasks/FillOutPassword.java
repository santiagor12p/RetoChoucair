package com.choucair.technicalchallenge.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.choucair.technicalchallenge.userinterfaces.FillFromPassword.*;
public class FillOutPassword implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Soylomejor123").into(PASSWORD),
                Enter.theValue("Soylomejor123").into(CONFIRM_PASSWORD),
                Click.on(STAY_INFORMED),
                Click.on(ACCEPT_TERMS),
                Click.on(ACCEPT_PRIVACY),
                Click.on(COMPLETE_SETUP)

        );
    }
    public static FillOutPassword whitPassword() { return Tasks.instrumented(FillOutPassword.class); }

}
