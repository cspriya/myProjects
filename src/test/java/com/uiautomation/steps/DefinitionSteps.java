package com.uiautomation.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
/**
 * @Author Priya Verma
 * @Date 01-August-2018
 */
import net.thucydides.core.annotations.Steps;

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
