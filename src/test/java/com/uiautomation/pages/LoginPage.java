package com.uiautomation.pages;

/**
 * @Author Priya Verma
 * @Date 20-August-2018
 */
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.WhenPageOpens;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://test-secure.reqtest.com/login")
public class LoginPage extends PageObject {
	PageObject page;
	@FindBy(xpath = "//*[@id='login-email']")
	private WebElementFacade enterUserName;
	@FindBy(id = "login-password")
	private WebElementFacade enterPassword;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElementFacade loginButton;
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-private[1]/ng-component[1]/div[1]/div[1]/div[2]/h2[1]")
	private WebElementFacade errorMessage;
	@FindBy(xpath="//div[contains(text(),'My Tasks')]")
	private WebElementFacade elementVisible;
	
	
	@FindBy(name = "search")
	private WebElementFacade searchTerms;
	@FindBy(name = "go")
	private WebElementFacade lookupButton;
	@FindBy(css = "button[value='Search']")
	WebElementFacade searchButton;

	public void enterUserName(String userName) {
		enterUserName.sendKeys(userName);
	}

	public void enterPassword(String password) {
		enterPassword.sendKeys(password);
	}

	public void loginButton() {
		loginButton.waitUntilVisible();
		loginButton.click();
	}

	public String getErrorMessage() {
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//element(errorMessage).waitUntilNotVisible();
		return errorMessage.getText();
	}
	
	public boolean checkVisibility(){
		elementVisible.waitUntilVisible();
		return true;
	}

	public void searchFor(String keywords) {
		$("#search-query").sendKeys(keywords);
		searchButton.click();
	}

	public void enter_keywords(String keyword) {
		searchTerms.type(keyword);
	}

	public void lookup_terms() {
		lookupButton.click();
	}

	public List<String> getDefinitions() {
		WebElementFacade definitionList = find(By.tagName("ol"));
		return definitionList.findElements(By.tagName("li")).stream().map(element -> element.getText())
				.collect(Collectors.toList());
	}
}