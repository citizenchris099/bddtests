package com.scienergy.development.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.scienergy.development.TestPOJO;
import com.scienergy.development.Test_Environment;
import com.scienergy.development.Test_EnvironmentPOJO;
import com.scienergy.development.qa.pages.spec.SpecLoginPage;
import com.scienergy.development.qa.pages.spec.SpecMainPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stubs_Spec {

	WebDriver driver;
	protected String uNFerror = "User not found";
	protected String IPerror = "Incorrect password";
	protected TestPOJO tp0 = testInfo();

	public Stubs_Spec(SharedDriver driver) throws InterruptedException {
		this.driver = driver;
	}

	protected TestPOJO testInfo() {
		Test_EnvironmentPOJO slugNAction = new Test_Environment().slugNAction();
		TestPOJO tp0 = new TestPOJO();
		tp0.setSpecHomeURL(new Test_Environment().envUrl(slugNAction.getHome()));
		tp0.setMiscUname001("wr");
		tp0.setMiscPword001("wr");
		return tp0;
	}

	@Before
	public void testSetup() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get(tp0.getSpecHomeURL());
	}

	@After
	public void deleteTestUser() throws InterruptedException {
	}

	@Given("^on login page$")
	public void on_login_page() throws Throwable {
		new SpecLoginPage(driver);
	}

	@When("^enter valid credentials$")
	public void enter_valid_credentials() throws Throwable {
		new SpecLoginPage(driver).loginAs(tp0.getMiscPword001(), tp0.getMiscPword001());
	}

	@Then("^arrive at main spec page$")
	public void arrive_at_main_spec_page() throws Throwable {
		new SpecMainPage(driver);
	}

	@When("^enter invalid username$")
	public void enter_invalid_username() throws Throwable {
		new SpecLoginPage(driver).loginAs("rw", tp0.getMiscPword001(), uNFerror);
	}

	@Then("^user receives error msg and remains on log in page$")
	public void user_receives_error_msg_and_remains_on_log_in_page() throws Throwable {
		new SpecLoginPage(driver);
	}

	@When("^enter invalid password$")
	public void enter_invalid_password() throws Throwable {
		new SpecLoginPage(driver).loginAs(tp0.getMiscPword001(), "rw", IPerror);
	}

	@Then("^log out of spec$")
	public void log_out_of_spec() throws Throwable {
		new SpecMainPage(driver).LogOut();
	}

}