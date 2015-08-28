package com.balfour.publishing.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.balfour.publishing.qa.pages.sb4.Sb4HomePage;
import com.balfour.publishing.qa.pages.sb4.Sb4ProfilePage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stubs_PwordChange {

	WebDriver driver;

	String unameVal = "veggie_smurf";
	String pwordVal = "meatisevil";
	String newPword = "password";
	String msg = "has been updated";

	ProfilePOJO pc0;

	By userName = By.cssSelector("*[name^='usern']");
	By signIn = By.xpath("//button[.='Submit']");

	public Stubs_PwordChange(SharedDriver driver) {
		this.driver = driver;

		pc0 = new ProfilePOJO();
		pc0.setMsg(msg);
	}

	@When("^on profile page$")
	public void on_profile_page() throws Throwable {

		new Sb4HomePage(driver).GoToMyProfile();
	}

	@When("^enter same password into both password fields$")
	public void enter_same_password_into_both_password_fields()
			throws Throwable {

		pc0.setPword(newPword);
		new Sb4ProfilePage(driver).updatePword(pc0);
	}

	@Then("^can only log into SBv(\\d+) with new password$")
	public void can_only_log_into_SBv_with_new_password(int arg1)
			throws Throwable {
		pc0.setPword(pwordVal);
		new Sb4ProfilePage(driver).LogOut().loginAs(unameVal, newPword)
				.GoToMyProfile().updatePword(pc0);
	}
}