package com.balfour.publishing.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.balfour.publishing.Test_Enviornment;
import com.balfour.publishing.Test_EnviornmentPOJO;
import com.balfour.publishing.qa.pages.sb4.Sb4LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stubs_Failed_LogIn {

	WebDriver driver;

	Sb4LoginPage sb4login;
	String url = null;
	Test_EnviornmentPOJO slugNAction = null;
	String login = null;

	String error = "Invalid Username/Password";

	public Stubs_Failed_LogIn(SharedDriver driver) {
		this.driver = driver;
		slugNAction = new Test_Enviornment().slugNAction();
		login = slugNAction.getLogin();
		url = new Test_Enviornment().envUrl(login);
	}

	@Given("^on SBv(\\d+) log in page$")
	public void on_SBv_log_in_page(int arg1) throws Throwable {

		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		sb4login = new Sb4LoginPage(driver);

	}

	@When("^enters wrong username and or password$")
	public void enters_wrong_username_and_or_password() throws Throwable {
		new Sb4LoginPage(driver).badloginAs("wrong", "credentials");
	}

	@Then("^receives message indicating wrong username or password was entered$")
	public void receives_message_indicating_wrong_username_or_password_was_entered()
			throws Throwable {
		new Sb4LoginPage(driver, error);
	}
}