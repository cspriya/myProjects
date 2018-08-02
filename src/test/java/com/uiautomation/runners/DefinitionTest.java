package com.uiautomation.runners;

/**
 * @Author Priya Verma
 * @Date 01-August-2018
 */
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = { "src/test/resources/features/consult_dictionary/LookupADefinition.feature" }, glue = {
		"com.uiautomation.steps" })
public class DefinitionTest {
}
