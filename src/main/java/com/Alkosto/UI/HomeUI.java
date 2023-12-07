package com.Alkosto.UI;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class HomeUI {



    public static final Target INPUT_SEARCH = Target.the("SEARCH BAR")
            .located(By.id("js-site-search-input"));


    public static final Target BTN_CART = Target.the("BTN CART")
            .located(By.id("js-mycart-header"));








    public static void esperarHastaQueSeaVisible(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(INPUT_SEARCH, isVisible()).forNoMoreThan(5).seconds()
        );
    }
}
