package com.Alkosto.tasks;

import com.Alkosto.interactions.NavigateBack;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static com.Alkosto.UI.CartDetailUI.BTN_CART;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddCartTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        // Hacer clic en el botón del carrito
        actor.attemptsTo(
                Click.on(BTN_CART),
                NavigateBack.toPreviousPage()
        );





    }

    public static AddCartTask add() {
        return instrumented(AddCartTask.class);
    }


}
