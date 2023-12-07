package com.Alkosto.stepDefinitions;

import com.Alkosto.questions.ValidateTitleProducts;
import com.Alkosto.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.bytebuddy.matcher.ElementMatchers.is;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class AlkostoStepDef {


    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();


        setTheStage(new OnlineCast());


    }

    @Given("the user opens the browser.")
    public void theUserOpensTheBrowser() {
        theActorCalled("user").wasAbleTo(
                OpenBrowserTask.open()
        );
    }
    @When("the user clicks on the search bar and enters the product names")
    public void theUserClicksOnTheSearchBarAndEntersTheProductNames() {

        theActorInTheSpotlight().attemptsTo(
                SearchProductsTask.search()

        );


    }
    @When("the user selects two products at random and adds them to the shopping cart.")
    public void theUserSelectsTwoProductsAtRandomAndAddsThemToTheShoppingCart() {

        theActorInTheSpotlight().attemptsTo(
                SelectOneProductsTask.select(),
                AddCartTask.add(),
                SelectTwoProductsTask.select2(),
                AddCartTask.add()

        );


    }

    @When("click on the shopping cart.")
    public void clickOnTheShoppingCart() {
        theActorInTheSpotlight().attemptsTo(
                OpenCart.open()

        );



    }
    @Then("the user will be able to validate the products added to the cart with the title.")
    public void theUserWillBeAbleToValidateTheProductsAddedToTheCartWithTheTitle() {

        theActorInTheSpotlight().should(
                seeThat(
                        ValidateTitleProducts.validate(),
                        Matchers.equalTo(true)
                )
        );


    }



}
