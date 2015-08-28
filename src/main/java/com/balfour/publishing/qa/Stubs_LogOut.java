package com.balfour.publishing.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.balfour.publishing.Test_Enviornment;
import com.balfour.publishing.Test_EnviornmentPOJO;
import com.balfour.publishing.qa.pages.sb4.Sb4HomePage;
import com.balfour.publishing.qa.pages.sb4.Sb4LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stubs_LogOut {

	WebDriver driver;

	String unameVal = "testuser001";
	String pwordVal = "password";
	String url = null;
	Test_EnviornmentPOJO slugNAction = null;
	String login = null;

	By userName = By.cssSelector("*[name^='usern']");
	By signIn = By.xpath("//button[.='Submit']");

	public Stubs_LogOut(SharedDriver driver) {
		this.driver = driver;
		slugNAction = new Test_Enviornment().slugNAction();
		login = slugNAction.getLogin();
		url = new Test_Enviornment().envUrl(login);
	}

	@Given("^logged into SBv(\\d+)$")
	public void logged_into_SBv(int arg1) throws Throwable {

		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		new Sb4LoginPage(driver).loginAs(unameVal, pwordVal);
	}

	@When("^click log out$")
	public void click_log_out() throws Throwable {
		new Sb4HomePage(driver).LogOut();
	}

	@Then("^arrive at the SBv(\\d+) log in screen$")
	public void arrive_at_the_SBv_log_in_screen(int arg1) throws Throwable {
		new Sb4LoginPage(driver);
	}
}