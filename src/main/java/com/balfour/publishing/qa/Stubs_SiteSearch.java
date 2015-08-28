package com.balfour.publishing.qa;

import org.openqa.selenium.WebDriver;

import com.balfour.publishing.Test_Enviornment;
import com.balfour.publishing.Test_EnviornmentPOJO;
import com.balfour.publishing.qa.pages.sb4.Sb4HomePage;
import com.balfour.publishing.qa.pages.sb4.Sb4SearchResultsPage;
import com.balfour.publishing.qa.pages.sb4.Sb4ShopPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stubs_SiteSearch {

	WebDriver driver;

	String search = "Shop";
	String badSearch = "crap";
	Test_EnviornmentPOJO slugNAction = new Test_Enviornment().slugNAction();
	String shop = slugNAction.getShop();
	String results = new Test_Enviornment().envUrl(shop);

	public Stubs_SiteSearch(SharedDriver driver) {
		this.driver = driver;
	}

	@When("^perform search$")
	public void perform_search() throws Throwable {
		new Sb4HomePage(driver).SiteSearch(search);
	}

	@Then("^arrive at searcg results page$")
	public void arrive_at_searcg_results_page() throws Throwable {
		new Sb4SearchResultsPage(driver);
	}

	@Then("^links on results page take you to their respective page$")
	public void links_on_results_page_take_you_to_their_respective_page()
			throws Throwable {
		new Sb4SearchResultsPage(driver).searchResults(results);
		new Sb4ShopPage(driver);
	}

	@When("^perform bad search$")
	public void perform_bad_search() throws Throwable {
		new Sb4HomePage(driver).SiteSearch(badSearch);
	}

	@Then("^message appears indicating search not found$")
	public void message_appears_indicating_search_not_found() throws Throwable {
		new Sb4SearchResultsPage(driver).searchNotFound();
	}
}