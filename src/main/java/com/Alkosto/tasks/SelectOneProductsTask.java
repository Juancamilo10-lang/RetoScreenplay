package com.Alkosto.tasks;


import com.Alkosto.interactions.RandomProductOne;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectOneProductsTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

            actor.attemptsTo(
                    RandomProductOne.click()

            );


    }

    public static SelectOneProductsTask select() {
        return instrumented(SelectOneProductsTask.class);
    }
}
