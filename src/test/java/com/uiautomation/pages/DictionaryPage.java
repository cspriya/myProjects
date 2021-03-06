package com.uiautomation.pages;

/**
 * @Author Priya Verma
 * @Date 01-August-2018
 */
import java.util.List;
import java.util.stream.Collectors;
import org.openqa.selenium.By;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary")
public class DictionaryPage extends PageObject {

	@FindBy(name = "search")
	private WebElementFacade searchTerms;

	@FindBy(name = "go")
	private WebElementFacade lookupButton;
	@FindBy(css = "button[value='Search']")
	WebElementFacade searchButton;

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