package com.balfour.publishing.qa;

import java.sql.SQLException;

import org.openqa.selenium.WebDriver;

import com.balfour.publishing.TestPOJO;
import com.balfour.publishing.qa.pages.Page;
import com.balfour.publishing.qa.pages.sb4.Sb4EditUserPage;
import com.balfour.publishing.qa.pages.sb4.Sb4HomePage;
import com.balfour.publishing.qa.pages.sb4.Sb4LoginPage;
import com.balfour.publishing.qa.pages.sb4.Sb4NewUserRegProf;
import com.balfour.publishing.qa.pages.sb4.Sb4ProfilePage;
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
	String p211424Href = "526a31c85dd140398766c6f3ff1bba72";
	String p311424Href = "caad998a0e3541898241a70cb618bb5a";
	String p411424Href = "a618455681714dbc88b802e9238a8809";
	String p511424Href = "486117cbcb214203a7b78d4ad3485d0b";
	String p611424Href = "75c6ef1ddc9647cab823a8403c00eb91";
	String key = null;
	String[] fakeRoles = { "editor", "designer", "photographer" };

	public Stubs_SB(SharedDriver driver) throws InterruptedException {
		this.driver = driver;
		sb = new Stubs_Base(driver);
		tp0 = sb.testInfo();
	}

	@After
	public void deleteTestUser() throws InterruptedException {
		// sb.userCleanUp(ur0, tp0);
	}

	/**
	 * user admin stubs
	 */

	@Given("^registered user$")
	public void registered_user() throws Throwable {
		ur0 = sb.regUserInfo("photographer");
		sb.registerUserAdmin(ur0, tp0);
		ur3 = sb.verifyTestUser(ur0, tp0);
		sb.userInfoCompare(ur3, ur0);
	}

	@Given("^registered user with multiple projects$")
	public void registered_user_with_multiple_projects() throws Throwable {
		registered_user();
		sb.loginAs("customer support", tp0);
		driver.get(tp0.getSbPUUrl());
		new Sb4ProjectUserPage(driver).editUser(ur0).goToProjNRole().addProject("Y50062").addProject("611424").LogOut();
	}

	@Given("^roles on projects vary$")
	public void roles_on_projects_vary() throws Throwable {
		sb.loginAs("customer support", tp0);
		driver.get(tp0.getSbPUUrl());
		new Sb4ProjectUserPage(driver).editUser(ur0).goToProjNRole().projRole(p611424Href, "designer").LogOut();
		ur0.setRole("designer");
	}

	@When("^user change project$")
	public void user_change_project() throws Throwable {
		sb.loginAs(ur0, tp0);
		new Sb4HomePage(driver).ChangeProject("611424").LogOut();
		ur0.setProject("611424");
	}

	@Given("^registered adviser$")
	public void registered_adviser() throws Throwable {
		ur0 = sb.regUserInfo("adviser");
		sb.registerUserAdmin(ur0, tp0);
		ur3 = sb.verifyTestUser(ur0, tp0);
		sb.userInfoCompare(ur3, ur0);
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

	@When("^edit user first name direclty on PU grid$")
	public void edit_user_first_name_direclty_on_PU_grid() throws Throwable {
		ur1 = sb.editUserInfo("fname", ur0);
		ur1.setEmailSearch(false);
		ur0.setEmailSearch(false);
		new Sb4ProjectUserPage(driver).userFound(ur0).fNameEdit(ur1).LogOut();
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

	@When("^edit user last name direclty on PU grid$")
	public void edit_user_last_name_direclty_on_PU_grid() throws Throwable {
		ur1 = sb.editUserInfo("lname", ur0);
		ur1.setEmailSearch(false);
		ur0.setEmailSearch(false);
		new Sb4ProjectUserPage(driver).userFound(ur0).lNameEdit(ur1).LogOut();
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

	@When("^edit user role direclty on PU grid$")
	public void edit_user_role_direclty_on_PU_grid() throws Throwable {
		ur1 = sb.editUserInfo("role", ur0);
		ur1.setEmailSearch(false);
		ur0.setEmailSearch(false);
		new Sb4ProjectUserPage(driver).userFound(ur0).roleEdit(ur1).LogOut();
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
		sb.userInfoCompare(ur1, ur2);
	}

	@Then("^edits to user should persist on user profile$")
	public void edits_to_user_should_persist_on_user_profile() throws Throwable {
		ur2 = sb.verifyTestUser(ur1, tp0);
		sb.userInfoCompare(ur1, ur2);
	}

	@Then("^edits to user role should persist on Project and Role page$")
	public void edits_to_user_role_should_persist_on_Project_and_Role_page() throws Throwable {
		sb.loginAs("customer support", tp0);
		driver.get(tp0.getSbPUUrl());
		new Sb4ProjectUserPage(driver).editUser(ur1).goToProjNRole().projRoleCheck(y50061Href, ur1);
	}

	@Then("^edits to user role should persist on all projects on Project and Role page$")
	public void edits_to_user_role_should_persist_on_all_projects_on_Project_and_Role_page() throws Throwable {
		sb.loginAs("customer support", tp0);
		driver.get(tp0.getSbPUUrl());
		new Sb4ProjectUserPage(driver).editUser(ur1).goToProjNRole().projRoleCheck(y50061Href, ur1)
				.projRoleCheck(p611424Href, ur1).projRoleCheck(y50062Href, ur1).LogOut();
	}

	@When("^add new project to adviser$")
	public void add_new_project_to_adviser() throws Throwable {
		sb.loginAs("customer support", tp0);
		driver.get(tp0.getSbPUUrl());
		new Sb4ProjectUserPage(driver).editUser(ur0).goToProjNRole().addProject("611424").LogOut();
	}

	@Then("^button to add all projects should appear on edit user screen$")
	public void button_to_add_all_projects_should_appear_on_edit_user_screen() throws Throwable {
		sb.loginAs("customer support", tp0);
		driver.get(tp0.getSbUAUrl());
		new Sb4UserAdminPage(driver).editUser(ur0).addProjectsChk().LogOut();
	}

	@Then("^when clicked user inherits all projects of new school$")
	public void when_clicked_user_inherits_all_projects_of_new_school() throws Throwable {
		sb.loginAs("customer support", tp0);
		driver.get(tp0.getSbUAUrl());
		new Sb4UserAdminPage(driver).editUser(ur0).addAllProjtoUser().projRoleCheck(p211424Href, ur0)
				.projRoleCheck(p311424Href, ur0).projRoleCheck(p411424Href, ur0).projRoleCheck(p511424Href, ur0)
				.projRoleCheck(p611424Href, ur0).LogOut();
	}

	@When("^edit user role to adviser$")
	public void edit_user_role_to_adviser() throws Throwable {
		new Sb4UserAdminPage(driver).userFound(ur0);
		ur0.setRole("adviser");
		new Sb4UserAdminPage(driver).roleEdit(ur0).LogOut();
	}

	@When("^disable user$")
	public void disable_user() throws Throwable {
		new Sb4UserAdminPage(driver).userFound(ur0);
		ur1 = sb.editUserInfo("role", ur0);
		ur1.setRole("disabled");
		new Sb4UserAdminPage(driver).roleEdit(ur1).LogOut();
	}

	@Then("^default proj and role is reflected correctly on the User Admin Grid$")
	public void default_proj_and_role_is_reflected_correctly_on_the_User_Admin_Grid() throws Throwable {
		sb.loginAs("customer support", tp0);
		driver.get(tp0.getSbUAUrl());
		new Sb4UserAdminPage(driver).userFound(ur0).LogOut();
	}

	@Then("^default proj and role is reflected correctly on the PU Grid$")
	public void default_proj_and_role_is_reflected_correctly_on_the_PU_Grid() throws Throwable {
		sb.loginAs("customer support", tp0);
		new Sb4HomePage(driver).ChangeProject2("611424").goToProjInfo().goToProjUsers().userFound(ur0).LogOut();
	}

	@Then("^user cannot log into SB$")
	public void user_cannot_log_into_SB() throws Throwable {
		driver.get(tp0.getSbLogOnUrl());
		new Sb4LoginPage(driver).disabledloginAs(ur1.getuName(), ur1.getPword());
	}

	@When("^create user register$")
	public void create_user_register() throws Throwable {
		ur0 = sb.regUserInfo("photographer");
		key = new Sb4UserAdminPage(driver).regNewUser(ur0);
		new Sb4UserAdminPage(driver).LogOut();
	}

	@Then("^user can register to SB$")
	public void user_can_register_to_SB() throws Throwable {
		driver.get(key);
		new Sb4NewUserRegProf(driver).doReg(ur0, true);
	}

	@Given("^disabled user can't log in$")
	public void disabled_user_can_t_log_in() throws Throwable {
		registered_user();
		logged_into_SB_as_adviser();
		on_User_Admin_Grid();
		disable_user();
		user_cannot_log_into_SB();
	}

	@When("^user re-enabled$")
	public void user_re_enabled() throws Throwable {
		logged_into_SB_as_adviser();
		on_User_Admin_Grid();
		new Sb4UserAdminPage(driver).userFound(ur1).roleEdit(ur0).LogOut();
	}

	@Then("^user can log into SB$")
	public void user_can_log_into_SB() throws Throwable {
		ur3 = sb.verifyTestUser(ur0, tp0);
		sb.userInfoCompare(ur3, ur0);
	}

	@Given("^user register$")
	public void user_register() throws Throwable {
		logged_into_SB_as_adviser();
		on_User_Admin_Grid();
		create_user_register();
		logged_into_SB_as_adviser();
		on_User_Admin_Grid();
	}

	/**
	 * fake user stubs
	 */

	@Given("^logged into SB as an adviser$")
	public void logged_into_SB_as_an_adviser() throws Throwable {
		sb.loginAs("adviser", tp0);
	}

	@Then("^fake user role are limited$")
	public void fake_user_role_are_limited() throws Throwable {
		new Sb4ProjectUserPage(driver).checkFakeUserRoles(fakeRoles).LogOut();
	}

	@Given("^fake user$")
	public void fake_user() throws Throwable {
		ur0 = sb.regFakeUserInfo("photographer");
		ur0.setEmailSearch(false);
		logged_into_SB_as_an_adviser();
		on_PU_Grid();
		new Sb4ProjectUserPage(driver).createFakeUser(ur0, fakeRoles).LogOut();
	}

	@Given("^fake user created$")
	public void fake_user_created() throws Throwable {
		fake_user();
		fake_user_log_in();
		fake_user_information_is_correct();
	}

	@When("^fake user log in$")
	public void fake_user_log_in() throws Throwable {
		sb.loginAs(ur0, tp0);

	}

	@Then("^fake user information is correct$")
	public void fake_user_information_is_correct() throws Throwable {
		ur3 = new Sb4HomePage(driver).GoToMyProfile().checkProfile();
		new Sb4ProfilePage(driver).LogOut();
		sb.userInfoCompare(ur3, ur0);
	}

	@Then("^fake user role is restricted$")
	public void fake_user_role_is_restricted() throws Throwable {
		new Sb4HomePage(driver).projInfoChk().LogOut();
	}

	@Then("^edits to fake user should persist on UA grid$")
	public void edits_to_fake_user_should_persist_on_UA_grid() throws Throwable {
		ur1.setEmailSearch(false);
		edits_to_user_should_persist_on_UA_grid();
	}

	@Then("^edits to user should persist on PU edit fake user screen$")
	public void edits_to_user_should_persist_on_PU_edit_fake_user_screen() throws Throwable {
		logged_into_SB_as_an_adviser();
		on_PU_Grid();
		ur2 = new Sb4ProjectUserPage(driver).editFakeUser(ur1).checkEditFakeUser();
		ur2.setEmail("");
		sb.userInfoCompare(ur1, ur2);
	}

	@When("^edit user info on PU edit fake user screen$")
	public void edit_user_info_on_PU_edit_fake_user_screen() throws Throwable {
		ur1 = sb.regFakeUserInfo("photographer");
		ur1.setEmailSearch(false);
		ur1.setuName(ur0.getuName());
		ur1.setPword(ur0.getPword());
		ur1.setMsg("profile information has been updated");
		new Sb4ProjectUserPage(driver).editFakeUser(ur0).successfullUpdate(ur1).LogOut();
	}

	@Given("^PU disabled fake user can't log in$")
	public void PU_disabled_fake_user_can_t_log_in() throws Throwable {
		fake_user_created();
		logged_into_SB_as_an_adviser();
		on_PU_Grid();
		disable_user_from_PU();
		user_cannot_log_into_SB();
	}

	@Given("^UA disabled fake user can't log in$")
	public void UA_disabled_fake_user_can_t_log_in() throws Throwable {
		fake_user_created();
		logged_into_SB_as_adviser();
		on_User_Admin_Grid();
		disable_user();
		user_cannot_log_into_SB();
	}

	@When("^edit fake user info on UA edit fake user screen$")
	public void edit_fake_user_info_on_UA_edit_fake_user_screen() throws Throwable {
		ur1 = sb.regFakeUserInfo("photographer");
		ur1.setEmailSearch(false);
		ur1.setuName(ur0.getuName());
		ur1.setPword(ur0.getPword());
		ur1.setMsg("profile information has been updated");
		new Sb4UserAdminPage(driver).editFakeUser(ur0).successfullUpdate(ur1).LogOut();
	}

	/**
	 * project user
	 */

	@Then("^user is found on PU Grid$")
	public void user_is_found_on_PU_Grid() throws Throwable {
		new Sb4ProjectUserPage(driver).userFound(ur0);
	}

	@When("^disable user from PU$")
	public void disable_user_from_PU() throws Throwable {
		new Sb4ProjectUserPage(driver).userFound(ur0);
		ur1 = sb.editUserInfo("role", ur0);
		ur1.setRole("disabled");
		new Sb4ProjectUserPage(driver).roleEdit(ur1).LogOut();
	}

	@When("^on PU Grid$")
	public void on_PU_Grid() throws Throwable {
		driver.get(tp0.getSbPUUrl());
	}

	@When("^user re-enabled from PU$")
	public void user_re_enabled_from_PU() throws Throwable {
		logged_into_SB_as_an_adviser();
		on_PU_Grid();
		new Sb4ProjectUserPage(driver).userFound(ur1).roleEdit(ur0).LogOut();
	}

	@When("^create PU user register$")
	public void create_PU_user_register() throws Throwable {
		ur0 = sb.regUserInfo("photographer");
		key = new Sb4ProjectUserPage(driver).regNewUser(ur0);
		new Sb4ProjectUserPage(driver).LogOut();
	}

	@Given("^registered PU user$")
	public void registered_PU_user() throws Throwable {
		ur0 = sb.regUserInfo("photographer");
		sb.registerProjectUser(ur0, tp0);
		ur3 = sb.verifyTestUser(ur0, tp0);
		sb.userInfoCompare(ur3, ur0);
	}

	@Then("^edits to user should persist on PU edit user screen$")
	public void edits_to_user_should_persist_on_PU_edit_user_screen() throws Throwable {
		logged_into_SB_as_an_adviser();
		on_PU_Grid();
		ur2 = new Sb4ProjectUserPage(driver).editUser(ur1).checkEditUser();
		ur2.setEmail("");
		sb.userInfoCompare(ur1, ur2);
	}

	@When("^edit user info on PU edit user screen$")
	public void edit_user_info_on_PU_edit_user_screen() throws Throwable {
		ur1 = sb.regUserInfo("photographer");
		ur1.setEmailSearch(false);
		ur1.setuName(ur0.getuName());
		ur1.setPword(ur0.getPword());
		ur1.setMsg("profile information has been updated");
		new Sb4ProjectUserPage(driver).editUser(ur0).successfullUpdate(ur1).LogOut();
	}

	/**
	 * profile
	 */

	@When("^fake user update profile$")
	public void fake_user_update_profile() throws Throwable {
		ur1 = sb.regFakeUserInfo("photographer");
		ur1.setEmailSearch(false);
		ur1.setuName(ur0.getuName());
		ur1.setPword(ur0.getPword());
		ur1.setMsg("profile information has been updated");
		new Sb4HomePage(driver).GoToMyProfile().updateFakeUserProfile(ur1).LogOut();
	}

	@When("^user update password$")
	public void user_update_password() throws Throwable {
		Page pg = new Page(driver);
		ur1 = sb.regUserInfo("photographer");
		ur1.setEmailSearch(false);
		ur1.setuName(ur0.getuName());
		ur1.setPword(pg.randomPassword() + "2" + "b" + "B");
		ur1.setMsg("profile information has been updated");
		new Sb4HomePage(driver).GoToMyProfile().updatePword(ur1).LogOut();
	}

	@Then("^user can log in with updated password$")
	public void user_can_log_in_with_updated_password() throws Throwable {
		sb.verifyTestUser(ur1, tp0);
	}
}