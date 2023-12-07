package com.Alkosto.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(
        features="src/test/resources/features/SelectProducts.feature",
        glue = "com.Alkosto.stepDefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class AlkostoRunner {

}
