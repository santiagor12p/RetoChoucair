package com.choucair.technicalchallenge.tasks;

import com.choucair.technicalchallenge.userinterfaces.GoToRegisterModulePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class GoToRegisterModule implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(GoToRegisterModulePage.GO_TO_REGISTER)
        );
    }
    public static GoToRegisterModule usRegister(){
        return Tasks.instrumented(GoToRegisterModule.class);
    }
}
