package us.opencart.abstracta.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions (features = "src/test/resources/features/compra.feature",
                  glue = "us.opencart.abstracta.stepdefinitions",
                  snippets =SnippetType.CAMELCASE
)
public class CompraRunner {



}
