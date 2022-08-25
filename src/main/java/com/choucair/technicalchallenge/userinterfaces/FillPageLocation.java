package com.choucair.technicalchallenge.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FillPageLocation {

    public static final Target CITY = Target.the("City").locatedBy("//input[@id='city']");
    public static final Target POSTAL_CODE = Target.the("Postal Code").locatedBy("//input[@id='zip']");
    public static final Target COUNTRY_CONTAINER = Target.the("Country Container").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/div[1]"));
    public static final Target COUNTRY = Target.the("Country").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target NEXT2 = Target.the("Next").locatedBy("//a[@aria-label='Next step - select your devices']");
}
