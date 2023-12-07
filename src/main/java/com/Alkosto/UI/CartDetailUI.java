package com.Alkosto.UI;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartDetailUI {

    public static final Target BTN_CART = Target.the("ADD TO CART")
            .located(By.xpath("//button[@class='button-primary js-add-to-cart js-enable-btn text-default']"));
}
