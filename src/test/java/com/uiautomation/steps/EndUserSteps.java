package com.uiautomation.steps;

/**
 * @Author Priya Verma
 * @Date 01-August-2018
 */
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

import com.uiautomation.pages.DictionaryPage;
import com.uiautomation.pages.LoginPage;

import net.thucydides.core.annotations.Step;

public class EndUserSteps {

	LoginPage loginPage;
	DictionaryPage dictionaryPage;

	@Step
	public void is_the_login_page() {
		loginPage.open();
	}

	@Step
	public void enterUserName(String userName) {
		loginPage.enterUserName(userName);
	}

	@Step
	public void enterPassword(String password) {
		loginPage.enterPassword(password);
	}

	@Step
	public void loginButton() throws InterruptedException {
		loginPage.loginButton();
	}

	@Step
	public void enters(String keyword) {
		dictionaryPage.enter_keywords(keyword);
	}

	@Step
	public void starts_search() {
		dictionaryPage.lookup_terms();
	}

	@Step
	public void should_see_definition(String definition) {
		assertThat(dictionaryPage.getDefinitions(), hasItem(containsString(definition)));
	}

	@Step
	public void is_the_home_page() {
		dictionaryPage.open();
	}

	@Step
	public void looks_for(String term) {
		enters(term);
		starts_search();
	}
}