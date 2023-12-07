package com.Alkosto.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Random;

import static com.Alkosto.UI.ListProductsUI.LIST_PRODUCT;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RandomProductTwo implements Interaction {


    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listProducts = LIST_PRODUCT.resolveAllFor(actor);
        Random random = new Random();
        int indexRandom = random.nextInt(listProducts.size());
        actor.remember("product2",listProducts.get(indexRandom).getText());
        listProducts.get(indexRandom).click();
    }

    public static Performable click(){
        return instrumented(RandomProductTwo.class);
    }
}
