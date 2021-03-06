package com.uiautomation.steps;

import java.awt.TextField;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginSteps {
	@Steps
	EndUserSteps login;

	@Given("^User is on Login Page$")
	public void user_is_on_Login_Page() throws Exception {
		login.is_the_login_page();
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String userName, String password) throws Exception {
		login.enterUserName(userName);
		TextField maskedPassword = new TextField(password);
		maskedPassword.setEchoChar('*');
		login.enterPassword(password);
		login.loginButton();
	}

	@Then("^User Navigate to app dashboard and get \"([^\"]*)\"$")
	public void user_Navigate_to_app_dashboard_and_get(String expectedString) throws Exception {
		//login.checkVisibility();
		login.getErrorMessage(expectedString);
	}

	@Then("^User Navigate to app dashboard$")
	public void user_Navigate_to_app_dashboard() throws Exception {
		System.out.println("Test3");
	}
}
