package com.balfour.publishing.qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.balfour.publishing.qa.pages.sb4.Sb4HomePage;
import com.balfour.publishing.qa.pages.sb4.Sb4LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stubs_Project_Switch {

	WebDriver driver;

	String unameVal = "veggie_smurf";
	String unameVal2 = "adminuser001";
	String pwordVal = "password";
	String pwordVal2 = "meatisevil";
	String mainProj = "2014 Baker Elementary";
	String nextProj = "2015 Elbert Palmer Elementary";
	String mainProj2 = "2014 Abbott High School";
	String nextProj2 = "2014 Baker Elementary School";

	public Stubs_Project_Switch(SharedDriver driver) {
		this.driver = driver;
	}

	@Given("^logged into SBv(\\d+) with user than has less than eight projects$")
	public void logged_into_SBv_with_user_than_has_less_than_eight_projects(
			int arg1) throws Throwable {
		driver.get("https://sb3-qa.balfour.com/login/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		new Sb4LoginPage(driver).loginAs(unameVal, pwordVal);

	}

	@When("^choose project from project menu$")
	public void choose_project_from_project_menu() throws Throwable {
		new Sb4HomePage(driver).ChangeProject(mainProj, pwordVal2);
	}

	@Then("^project has changed$")
	public void project_has_changed() throws Throwable {
		new Sb4HomePage(driver).CheckProject(nextProj).ChangeProject(nextProj,
				mainProj);
	}

	@Given("^logged into SBv(\\d+) with user than has more than seven projects$")
	public void logged_into_SBv_with_user_than_has_more_than_seven_projects(
			int arg1) throws Throwable {
		driver.get("https://sb3-qa.balfour.com/login/");
		new Sb4LoginPage(driver).loginAsAdmin(unameVal2, pwordVal);
	}

	@When("^search project$")
	public void search_project() throws Throwable {
		new Sb4HomePage(driver).ChangeProject2(mainProj2, nextProj2);
	}

	@Then("^the project has changed$")
	public void the_project_has_changed() throws Throwable {
		new Sb4HomePage(driver).CheckProject(nextProj2).ChangeProject2(
				nextProj2, mainProj2);
	}

}