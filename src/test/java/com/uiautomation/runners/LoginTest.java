package com.uiautomation.runners;

/**
 * @Author Priya Verma
 * @Date 01-August-2018
 */
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = {
		"src/main/resources/features/reqtest-Login/Login.feature" }, monochrome = true, plugin = {
				"html:target/cucumber-html-report", "json:target/cucumber-json-report.json"

}, glue = { "com.uiautomation.steps" })
public class LoginTest {

}
