package com.balfour.publishing.qa;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;

import com.balfour.publishing.TestPOJO;
import com.balfour.publishing.qa.pages.sb4.Sb4UserAdminPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stubs_User_Admin {

	WebDriver driver;

	Stubs_Base sb = null;
	TestPOJO tp0 = null;
	UserRegPOJO ur0 = null;
	UserRegPOJO ur1 = null;

	public Stubs_User_Admin(SharedDriver driver) throws InterruptedException {
		this.driver = driver;
		sb = new Stubs_Base(driver);

	}

	@Before("@ua")
	public void createTestUser() throws InstantiationException, IllegalAccessException, ClassNotFoundException,
			InterruptedException, SQLException {
		System.out.println("here we are");
		tp0 = sb.testInfo();
		ur0 = sb.regUserInfo("photographer");
		ur1 = sb.regUserInfo("adviser");
		sb.registerUserAdmin(ur0, tp0);
	}
	
	@After("@ua")
	public void deleteTestUser() throws InterruptedException{
		sb.userCleanUp(ur0, tp0);
	}

	@Given("^registered user$")
	public void registered_user() throws Throwable {
		sb.verifyTestUser(ur0, tp0);
	}

	@Given("^logged into SB as >adviser$")
	public void logged_into_SB_as_adviser() throws Throwable {
		sb.loginAs("adviser", tp0);
	}

	@When("^on User Admin Grid$")
	public void on_User_Admin_Grid() throws Throwable {
		driver.get(tp0.getSbUAUrl());
	}

	@Then("^user is found User Admin Grid$")
	public void user_is_found_User_Admin_Grid() throws Throwable {
		new Sb4UserAdminPage(driver).userFound(ur0);
	}
}