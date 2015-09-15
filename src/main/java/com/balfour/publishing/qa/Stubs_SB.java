package com.balfour.publishing.qa;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;

import com.balfour.publishing.TestPOJO;
import com.balfour.publishing.qa.pages.sb4.Sb4ProjectUserPage;
import com.balfour.publishing.qa.pages.sb4.Sb4UserAdminPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stubs_SB {

	WebDriver driver;

	Stubs_Base sb = null;
	TestPOJO tp0 = null;
	UserRegPOJO ur0 = null;
	UserRegPOJO ur1 = null;
	UserRegPOJO ur2 = null;
	UserRegPOJO ur3 = null;
	String y50061Href = "ab0355977d024f63bf78351e9e78b80f";
	String y50062Href = "ae786d01240d445289eeb0beaa851427";
	String AcademyHref = "75c6ef1ddc9647cab823a8403c00eb91";

	public Stubs_SB(SharedDriver driver) throws InterruptedException {
		this.driver = driver;
		sb = new Stubs_Base(driver);
		tp0 = sb.testInfo();
		ur0 = sb.regUserInfo("photographer");
		ur0.setEmailSearch(true);

	}

	@Before("@ua")
	public void createTestUser() throws InstantiationException, IllegalAccessException, ClassNotFoundException,
			InterruptedException, SQLException {
		driver.get(tp0.getSbLogOnUrl());
		sb.registerUserAdmin(ur0, tp0);
	}

	@After("@ua")
	public void deleteTestUser() throws InterruptedException {
		sb.userCleanUp(ur0, tp0);
	}

	@Given("^registered user$")
	public void registered_user() throws Throwable {
		sb.verifyTestUser(ur0, tp0);
	}

	@Given("^registered user with multiple projects$")
	public void registered_user_with_multiple_projects() throws Throwable {
		sb.verifyTestUser(ur0, tp0);
		sb.loginAs("customer support", tp0);
		driver.get(tp0.getSbPUUrl());
		new Sb4ProjectUserPage(driver).editUser(ur0).addProject("Y50062").addProject("611424").LogOut();
	}

	@Given("^logged into SB as >adviser$")
	public void logged_into_SB_as_adviser() throws Throwable {
		sb.loginAs("customer support", tp0);
	}

	@When("^on User Admin Grid$")
	public void on_User_Admin_Grid() throws Throwable {
		driver.get(tp0.getSbUAUrl());
	}

	@Then("^user is found User Admin Grid$")
	public void user_is_found_User_Admin_Grid() throws Throwable {
		new Sb4UserAdminPage(driver).userFound(ur0);
	}

	@When("^edit user first name direclty on grid$")
	public void edit_user_first_name_direclty_on_grid() throws Throwable {
		ur1 = sb.editUserInfo("fname", ur0);
		new Sb4UserAdminPage(driver).userFound(ur0).fNameEdit(ur1).LogOut();
	}

	@When("^edit user info$")
	public void edit_user_info() throws Throwable {
		ur1 = sb.regUserInfo("photographer");
		ur1.setEmailSearch(false);
		ur1.setuName(ur0.getuName());
		ur1.setPword(ur0.getPword());
		ur1.setMsg("The profile information has been updated");
		new Sb4UserAdminPage(driver).editUser(ur0).successfullUpdate(ur1).LogOut();
	}

	@When("^edit user last name direclty on grid$")
	public void edit_user_last_name_direclty_on_grid() throws Throwable {
		ur1 = sb.editUserInfo("lname", ur0);
		new Sb4UserAdminPage(driver).userFound(ur0).lNameEdit(ur1).LogOut();
	}

	@When("^edit user email direclty on grid$")
	public void edit_user_email_direclty_on_grid() throws Throwable {
		ur1 = sb.editUserInfo("email", ur0);
		new Sb4UserAdminPage(driver).userFound(ur0).emailEdit(ur1).LogOut();
	}

	@When("^edit user role direclty on grid$")
	public void edit_user_role_direclty_on_grid() throws Throwable {
		ur1 = sb.editUserInfo("role", ur0);
		new Sb4UserAdminPage(driver).userFound(ur0).roleEdit(ur1).LogOut();
	}

	@Then("^edits to user should persist on UA grid$")
	public void edits_to_user_should_persist_on_UA_grid() throws Throwable {
		sb.loginAs("customer support", tp0);
		driver.get(tp0.getSbUAUrl());
		new Sb4UserAdminPage(driver).userFound(ur1).LogOut();
	}

	@Then("^edits to user should persist on PU grid$")
	public void edits_to_user_should_persist_on_PU_grid() throws Throwable {
		sb.loginAs("customer support", tp0);
		driver.get(tp0.getSbPUUrl());
		new Sb4ProjectUserPage(driver).userFound(ur1).LogOut();
	}

	@Then("^edits to user should persist on edit user screen$")
	public void edits_to_user_should_persist_on_edit_user_screen() throws Throwable {
		sb.loginAs("customer support", tp0);
		driver.get(tp0.getSbUAUrl());
		ur2 = new Sb4UserAdminPage(driver).editUser(ur1).checkEditUser();
		System.out.println(ur1.hashCode());
		System.out.println(ur2.hashCode());
		System.out.println("ur1 first name = " + ur1.getfName());
		System.out.println("ur2 first name = " + ur2.getfName());
		System.out.println("ur1 last name = " + ur1.getlName());
		System.out.println("ur2 last name = " + ur2.getlName());
		System.out.println("ur1 email = " + ur1.getEmail());
		System.out.println("ur2 email = " + ur2.getEmail());
		System.out.println("ur1 phone = " + ur1.getPhone());
		System.out.println("ur2 phone = " + ur2.getPhone());
		sb.userInfoCompare(ur1, ur2);
	}

	@Then("^edits to user should persist on user profile$")
	public void edits_to_user_should_persist_on_user_profile() throws Throwable {
		ur2 = sb.verifyTestUser(ur1, tp0);
		System.out.println(ur1.hashCode());
		System.out.println(ur2.hashCode());
		System.out.println("ur1 first name = " + ur1.getfName());
		System.out.println("ur2 first name = " + ur2.getfName());
		System.out.println("ur1 last name = " + ur1.getlName());
		System.out.println("ur2 last name = " + ur2.getlName());
		System.out.println("ur1 email = " + ur1.getEmail());
		System.out.println("ur2 email = " + ur2.getEmail());
		System.out.println("ur1 phone = " + ur1.getPhone());
		System.out.println("ur2 phone = " + ur2.getPhone());
		sb.userInfoCompare(ur1, ur2);
	}

	@Then("^edits to user role should persist on Project and Role page$")
	public void edits_to_user_role_should_persist_on_Project_and_Role_page() throws Throwable {
		sb.loginAs("customer support", tp0);
		driver.get(tp0.getSbPUUrl());
		new Sb4ProjectUserPage(driver).editUser(ur1).projRoleCheck(y50061Href, ur1);
	}

	@Then("^edits to user role should persist on all projects on Project and Role page$")
	public void edits_to_user_role_should_persist_on_all_projects_on_Project_and_Role_page() throws Throwable {
		sb.loginAs("customer support", tp0);
		driver.get(tp0.getSbPUUrl());
		new Sb4ProjectUserPage(driver).editUser(ur1).projRoleCheck(y50061Href, ur1).projRoleCheck(AcademyHref, ur1)
				.projRoleCheck(y50062Href, ur1).LogOut();
	}
}