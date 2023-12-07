package com.Alkosto.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import static com.Alkosto.UI.HomeUI.BTN_CART;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenCart implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_CART));
    }

    public static OpenCart open() {
        return instrumented(OpenCart.class);
    }
}

