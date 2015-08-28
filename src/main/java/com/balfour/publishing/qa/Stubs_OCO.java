package com.balfour.publishing.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.balfour.publishing.Test_Enviornment;
import com.balfour.publishing.Test_EnviornmentPOJO;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stubs_OCO {

	WebDriver driver;

	String unameVal = "veggie_smurf";
	String pwordVal = "meatisevil";
	String url = null;
	Test_EnviornmentPOJO slugNAction = null;
	String oco = null;

	By oCOTitle = By.xpath("//h1[.='On Campus Order']");
	By oDetails = By.xpath("//*[@name='purchaserFirstName']");

	public Stubs_OCO(SharedDriver driver) throws InterruptedException {
		this.driver = driver;
		slugNAction = new Test_Enviornment().slugNAction();
		oco = slugNAction.getOco();
		url = new Test_Enviornment().envUrl(oco);
	}

	@Given("^logged into SBv(\\d+) as an adviser$")
	public void logged_into_SBv_as_an_adviser(int arg1) throws Throwable {
	}

	@Given("^on OCO list page$")
	public void on_OCO_list_page() throws Throwable {
	}

	@Given("^new OCO form$")
	public void new_OCO_form() throws Throwable {
	}

	@When("^fill out form$")
	public void fill_out_form() throws Throwable {
	}

	@Then("^order is found on OCO list page$")
	public void order_is_found_on_OCO_list_page() throws Throwable {
	}

	@Given("^order is found$")
	public void order_is_found() throws Throwable {
	}

	@When("^edit order$")
	public void edit_order() throws Throwable {
	}

	@Then("^changes to order persist$")
	public void changes_to_order_persist() throws Throwable {
	}

	@Then("^order info is correct$")
	public void order_info_is_correct() throws Throwable {
	}
}