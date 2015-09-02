package com.balfour.publishing.qa;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;

import com.balfour.publishing.TestPOJO;
import com.balfour.publishing.qa.pages.sb4.Sb4LoginPage;
import com.balfour.publishing.qa.pages.sb4.Sb4ProjectUserPage;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import com.balfour.publishing.qa.annotations.*;

public class Stubs_Project_User {

	WebDriver driver;
	static UserRegPOJO ur0 = null;
	// static UserRegPOJO srep = null;
	// UserRegPOJO csup = null;
	// UserRegPOJO adm = null;
	// UserRegPOJO apr = null;
	// UserRegPOJO dsr = null;
	// UserRegPOJO edt = null;
	// UserRegPOJO pho = null;
	Stubs_Base sb = null;
	boolean setupFlag = false;

	private int display;

	public Stubs_Project_User(SharedDriver driver) throws InterruptedException {

		this.driver = driver;
		sb = new Stubs_Base(driver);
	}

	@Given("^on PU page as \"([^\"]*)\"$")
	public void on_PU_page_as(String arg1) throws Throwable {
		sb.loginAs(arg1, tp0);
		driver.get(tp0.getSbPUUrl());
		new Sb4ProjectUserPage(driver);
	}

	@When("^search \"([^\"]*)\"$")
	public void search(String arg1) throws Throwable {
		searchPU(arg1);
	}

	@Then("^\"([^\"]*)\" cant see \"([^\"]*)\"$")
	public void cant_see(String arg1, String arg2) throws Throwable {
		if (display > 0) {
			new Sb4ProjectUserPage(driver).LogOut();
			throw new RuntimeException("User Was Found");
		} else
			new Sb4ProjectUserPage(driver).LogOut();
	}

	@Then("^\"([^\"]*)\" can see \"([^\"]*)\"$")
	public void can_see(String arg1, String arg2) throws Throwable {
		if (display < 1) {
			new Sb4ProjectUserPage(driver).LogOut();
			throw new RuntimeException("User Was Not Found");
		} else
			new Sb4ProjectUserPage(driver).LogOut();
	}

	@Given("^on Project User page$")
	public void on_Project_User_page() throws Throwable {
		driver.get(tp0.getSbLogOnUrl());
		new Sb4LoginPage(driver).loginAs(tp0.getAdvUname(), tp0.getAdvPword());
		driver.get(tp0.getSbPUUrl());
	}

	@When("^comploetes Project user reg form$")
	public void comploetes_Project_user_reg_form() throws Throwable {
		ur0.setRole("approved");
		new Sb4ProjectUserPage(driver).regNewUser(ur0);
	}

	@Then("^user reg appears on Project User page$")
	public void user_reg_appears_on_Project_User_page() throws Throwable {
		if (new Sb4ProjectUserPage(driver).userRegSearchCount(ur0) < 1) {
			new Sb4ProjectUserPage(driver).LogOut();
			throw new RuntimeException("User Was Not Found");
		} else
			new Sb4ProjectUserPage(driver).LogOut();
	}

	@Given("^user register present on grid$")
	public void user_register_present_on_grid() throws Throwable {
		ur0.setRole("approved");
		driver.get(tp0.getSbLogOnUrl());
		new Sb4LoginPage(driver).loginAs(tp0.getAdvUname(), tp0.getAdvPword());
		driver.get(tp0.getSbPUUrl());
		new Sb4ProjectUserPage(driver).regNewUser(ur0);
		if (new Sb4ProjectUserPage(driver).userRegSearchCount(ur0) < 1) {
			new Sb4ProjectUserPage(driver).LogOut();
			throw new RuntimeException("User Was Not Found");
		}
	}

	@When("^click delete register$")
	public void click_delete_register() throws Throwable {
		new Sb4ProjectUserPage(driver).deleteRegUser(ur0);
	}

	@Then("^user register no longer present on grid$")
	public void user_register_no_longer_present_on_grid() throws Throwable {
		if (new Sb4ProjectUserPage(driver).userRegSearchCount(ur0) > 0) {
			new Sb4ProjectUserPage(driver).LogOut();
			throw new RuntimeException("User Was Not Found");
		} else
			new Sb4ProjectUserPage(driver).LogOut();
	}

	@Given("^newly registered user from Project User Page$")
	public void newly_registered_user_from_Project_User_Page() throws Throwable {
		// sb.registerUser("approved", ur0, tp0);
	}

	@When("^add project to user from Project User Page$")
	public void add_project_to_user_from_Project_User_Page() throws Throwable {
		new Sb4LoginPage(driver).loginAs(tp0.getAdvUname(), tp0.getAdvPword());
		driver.get(tp0.getSbPUUrl());
		new Sb4ProjectUserPage(driver).editUser(ur0).addProjectList("Y50063")
				.projRole("f796094653f249bca764c2b040aa7ceb", ur0.getRole()).LogOut();
	}

	@Then("^user can access to project$")
	public void user_can_access_to_project() throws Throwable {
		driver.get(tp0.getSbLogOnUrl());
		new Sb4LoginPage(driver).loginAs(ur0.getEmail(), ur0.getPword()).ChangeProject("Y50061", "Y50063")
				.CheckProject("Y50063").LogOut();
	}

	@Given("^default project changed from Project User Page$")
	public void default_project_changed_from_Project_User_Page() throws Throwable {
		new Sb4LoginPage(driver).loginAs(tp0.getAdvUname(), tp0.getAdvPword());
		driver.get(tp0.getSbPUUrl());
		new Sb4ProjectUserPage(driver).editUser(ur0).addProjectList("Y50063")
				.projRole("f796094653f249bca764c2b040aa7ceb", ur0.getRole())
				.projAction("#f796094653f249bca764c2b040aa7ceb").LogOut().loginAs(ur0.getEmail(), ur0.getPword())
				.CheckProject("Y50063").ChangeProject("Y50063", "Y50061").CheckProject("Y50061").LogOut();
	}

	@When("^remove default project from Project User Page$")
	public void remove_default_project_from_Project_User_Page() throws Throwable {
		new Sb4LoginPage(driver).loginAs(tp0.getAdvUname(), tp0.getAdvPword());
		driver.get(tp0.getSbPUUrl());
		new Sb4ProjectUserPage(driver).editUser(ur0).projAction("#Y50063")
				.projAction("#ab0355977d024f63bf78351e9e78b80f").LogOut();
	}

	@Then("^user can no longer access project$")
	public void user_can_no_longer_access_project() throws Throwable {
		if (new Sb4LoginPage(driver).loginAs(ur0.getEmail(), ur0.getPword()).CheckProject("Y50061", "Y50063") > 0) {
			throw new RuntimeException("Project Not Found");
		}
	}

	@When("^change default project from Project User Page$")
	public void change_default_project_from_Project_User_Page() throws Throwable {
		new Sb4LoginPage(driver).loginAs(tp0.getAdvUname(), tp0.getAdvPword());
		driver.get(tp0.getSbPUUrl());
		new Sb4ProjectUserPage(driver).editUser(ur0).addProjectList("Y50063")
				.projRole("f796094653f249bca764c2b040aa7ceb", ur0.getRole())
				.projAction("#f796094653f249bca764c2b040aa7ceb").LogOut();
	}

	@Then("^user default project changed$")
	public void user_default_project_changed() throws Throwable {
		new Sb4LoginPage(driver).loginAs(ur0.getEmail(), ur0.getPword()).CheckProject("Y50063").LogOut();
	}

	/**
	 * @param arg1
	 * @throws InterruptedException
	 */
	private void searchPU(String arg1) throws InterruptedException {
		if (arg1.equals("sales rep")) {
			display = new Sb4ProjectUserPage(driver).userSearchCount(Stubs_Base.srep);
		} else if (arg1.equals("customer support")) {
			display = new Sb4ProjectUserPage(driver).userSearchCount(Stubs_Base.csup);
		} else if (arg1.equals("administrator")) {
			display = new Sb4ProjectUserPage(driver).userSearchCount(Stubs_Base.adm);
		} else if (arg1.equals("approved")) {
			display = new Sb4ProjectUserPage(driver).userSearchCount(Stubs_Base.apr);
		} else if (arg1.equals("designer")) {
			display = new Sb4ProjectUserPage(driver).userSearchCount(Stubs_Base.dsr);
		} else if (arg1.equals("editor")) {
			display = new Sb4ProjectUserPage(driver).userSearchCount(Stubs_Base.edt);
		} else if (arg1.equals("photographer")) {
			display = new Sb4ProjectUserPage(driver).userSearchCount(Stubs_Base.pho);
		}
	}

}