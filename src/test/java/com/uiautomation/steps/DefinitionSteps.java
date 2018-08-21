package com.uiautomation.steps;

/**
 * @Author Priya Verma
 * @Date 01-August-2018
 */
import net.thucydides.core.annotations.Steps;

import java.util.List;

import com.uiautomation.transform.ExcelDataToDataTable;

import cucumber.api.DataTable;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DefinitionSteps {

	@Steps
	EndUserSteps anna;

	@Given("the user is on the Wikionary home page")
	public void givenTheUserIsOnTheWikionaryHomePage() {
		anna.is_the_home_page();
	}

	@When("the user looks up the definition of the word '(.*)'")
	public void whenTheUserLooksUpTheDefinitionOf(String word) {
		anna.looks_for(word);
	}

	@When("^User login with the following username and password with data in excel ats \"([^\"]*)\"$")
	public void user_login_with_the_following_username_and_password_with_data_in_excel_at(
			@Transform(ExcelDataToDataTable.class) DataTable table) throws Throwable {
		System.out.println(table.toString());

		List<String> dataList = table.asList(String.class);

		for (String str : dataList) {
			System.out.println(str);
		}

	}

	@Given("^User is at the login page of the applications$")
	public void user_is_at_the_login_page_of_the_application() throws Throwable {
	}

	@Then("they should see the definition '(.*)'")
	public void thenTheyShouldSeeADefinitionContainingTheWords(String definition) {
		anna.should_see_definition(definition);
	}

	@When("^the user looks up the definition of the word \"([^\"]*)\"$")
	public void the_user_looks_up_the_definition_of_the_word(String word) throws Exception {
		anna.looks_for(word);
	}

	@Then("^they should see the definition \"([^\"]*)\"$")
	public void they_should_see_the_definition(String definition) throws Exception {
		anna.should_see_definition(definition);
	}

}
