package com.choucair.technicalchallenge.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static com.choucair.technicalchallenge.userinterfaces.FillPageDevices.*;

public class FillOutDevicesForm implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(COMPUTER_OS_CONTAINER),
                Enter.theValue("Windows").into(COMPUTER_OS).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(VERSION_CONTAINER),
                Enter.theValue("10").into(VERSION).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(LANGUAGE_CONTAINER),
                Enter.theValue("Spanish").into(LANGUAGE).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(MOBILE_DEVICE_CONTAINER),
                Enter.theValue("Motorola").into(MOBILE_DEVICE).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(MODEL_CONTAINER),
                Enter.theValue("Moto G60").into(MODEL).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(OS_MOBILE_CONTAINER),
                Enter.theValue("Android 11").into(OS_MOBILE).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(NEXT_FINAL)
        );
    }
    public static FillOutDevicesForm whitDevicesDates(){
        return Tasks.instrumented(FillOutDevicesForm.class);
    }
}
