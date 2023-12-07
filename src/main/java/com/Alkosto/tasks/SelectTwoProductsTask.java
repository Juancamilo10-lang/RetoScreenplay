package com.Alkosto.tasks;



import com.Alkosto.interactions.RandomProductTwo;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectTwoProductsTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                RandomProductTwo.click()

        );


    }

    public static SelectTwoProductsTask select2() {
        return instrumented(SelectTwoProductsTask.class);
    }
}
