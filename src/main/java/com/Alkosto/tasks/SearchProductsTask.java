package com.Alkosto.tasks;


import com.Alkosto.UI.HomeUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;


import static com.Alkosto.UI.HomeUI.INPUT_SEARCH;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SearchProductsTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        HomeUI.esperarHastaQueSeaVisible(actor);


        actor.attemptsTo(
            Click.on(INPUT_SEARCH),
            Enter.theValue("tv").into(INPUT_SEARCH).thenHit(Keys.ENTER));


    }


    public static SearchProductsTask search() {
        return instrumented(SearchProductsTask.class);
    }

}
