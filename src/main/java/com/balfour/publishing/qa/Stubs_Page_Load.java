package com.balfour.publishing.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.balfour.publishing.Test_Enviornment;
import com.balfour.publishing.Test_EnviornmentPOJO;
import com.balfour.publishing.qa.pages.sb4.Sb4OCOListPage;
import com.balfour.publishing.qa.pages.sb4.Sb4ProfilePage;
import com.balfour.publishing.qa.pages.sb4.Sb4ProjectConfigPage;
import com.balfour.publishing.qa.pages.sb4.Sb4ProjectListPage;
import com.balfour.publishing.qa.pages.sb4.Sb4SchoolConfigPage;
import com.balfour.publishing.qa.pages.sb4.Sb4SchoolListPage;
import com.balfour.publishing.qa.pages.sb4.Sb4ShopPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stubs_Page_Load {

	WebDriver driver;

	By shopTile = By.xpath("//*[.='Shop']");
	By myCart = By.xpath("//*[.='My Cart']");
	By thankYou = By.xpath("//*[.='Thank you. Your order has been received.']");
	By oDetails = By.xpath("//*[.='Order Details']");
	String project = "625047";
	String school = "09660";
	String url = null;
	Test_EnviornmentPOJO slugNAction = null;
	String login = null;
	String profile = null;
	String oco = null;
	String sl0 = null;
	String sh0 = null;
	String pr0 = null;

	public Stubs_Page_Load(SharedDriver driver) {
		this.driver = driver;
		slugNAction = new Test_Enviornment().slugNAction();
	}

	@When("^navigate to Profile Form$")
	public void navigate_to_Profile_Form() throws Throwable {

		profile = slugNAction.getProfile();
		url = new Test_Enviornment().envUrl(profile);
		driver.get(url);
	}

	@Then("^Profile Form page loads$")
	public void Profile_Form_page_loads() throws Throwable {
		new Sb4ProfilePage(driver);
	}

	@When("^navigate to OCO$")
	public void navigate_to_OCO() throws Throwable {

		oco = slugNAction.getOco();
		url = new Test_Enviornment().envUrl(oco);
		driver.get(url);
	}

	@Then("^OCO page loads$")
	public void OCO_page_loads() throws Throwable {
		new Sb4OCOListPage(driver).createNewOrder();
	}

	@Then("^Project Config page loads$")
	public void Project_Config_page_loads() throws Throwable {
		new Sb4ProjectConfigPage(driver);
	}

	@Then("^School Config page loads$")
	public void School_Config_page_loads() throws Throwable {
		new Sb4SchoolConfigPage(driver);
	}

	@When("^navigate to School List Page$")
	public void navigate_to_School_List_Page() throws Throwable {

		sl0 = slugNAction.getSchool_list();
		url = new Test_Enviornment().envUrl(sl0);
		driver.get(url);
	}

	@Then("^School List Page loads$")
	public void School_List_Page_loads() throws Throwable {
		new Sb4SchoolListPage(driver);
	}

	@When("^navigate to Supplies Page Page$")
	public void navigate_to_Supplies_Page_Page() throws Throwable {

		sh0 = slugNAction.getShop();
		url = new Test_Enviornment().envUrl(sh0);
		driver.get(url);
	}

	@Then("^Supplies Page loads$")
	public void Supplies_Page_loads() throws Throwable {
		new Sb4ShopPage(driver);
	}

	@When("^navigate to Project List Page$")
	public void navigate_to_Project_List_Page() throws Throwable {

		pr0 = slugNAction.getProject_list();
		url = new Test_Enviornment().envUrl(pr0);
		driver.get(url);
	}

	@When("^choose project$")
	public void choose_project() throws Throwable {
		ProjectListPOJO pl0 = new ProjectListPOJO();
		pl0.setpNumber(project);
		new Sb4ProjectListPage(driver).goToConfigPage(pl0);

	}

	@When("^choose school$")
	public void choose_school() throws Throwable {
		SchoolListPOJO sl0 = new SchoolListPOJO();
		sl0.setsNum(school);
		new Sb4SchoolListPage(driver).goToConfigPage(sl0);

	}

}