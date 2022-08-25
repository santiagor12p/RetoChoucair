package com.choucair.technicalchallenge.tasks;

import com.choucair.technicalchallenge.userinterfaces.FillPageLocation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import static com.choucair.technicalchallenge.userinterfaces.FillPageLocation.*;

public class FillOutLocationForm implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Ibague").into(CITY),
                Hit.the(Keys.ARROW_DOWN).into(CITY),
                Hit.the(Keys.ENTER).into(CITY),
                Enter.theValue("730001").into(POSTAL_CODE),
                Click.on(COUNTRY_CONTAINER),
                Enter.theValue("Colombia").into(COUNTRY).thenHit(Keys.ARROW_DOWN, Keys.ENTER),
                Click.on(NEXT2)

        );
    }
    public static FillOutLocationForm withLocationDates(){
        return Tasks.instrumented(FillOutLocationForm.class);

    }
}
