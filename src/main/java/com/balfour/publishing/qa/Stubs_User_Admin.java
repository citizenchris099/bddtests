package com.balfour.publishing.qa;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.balfour.publishing.TestPOJO;
import com.balfour.publishing.Test_Enviornment;
import com.balfour.publishing.Test_EnviornmentPOJO;
import com.balfour.publishing.qa.pages.Page;
import com.balfour.publishing.qa.pages.sb4.Sb4LoginPage;
import com.balfour.publishing.qa.pages.sb4.Sb4NewUserRegProf;
import com.balfour.publishing.qa.pages.sb4.Sb4ProfilePage;
import com.balfour.publishing.qa.pages.sb4.Sb4ProjNRolePage;
import com.balfour.publishing.qa.pages.sb4.Sb4UserAdminPage;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stubs_User_Admin {

	WebDriver driver;
	Page pg;
	UserRegPOJO ur0 = null;
	UserRegPOJO ur1 = null;
	ProfilePOJO pp0 = null;
	TestPOJO tp0 = null;
	Test_EnviornmentPOJO slugNAction = new Test_Enviornment().slugNAction();
	String key = null;
	ProfilePOJO pr1 = null;
	ProfilePOJO pr2 = null;
	int count;

	public Stubs_User_Admin(SharedDriver driver) {
		this.driver = driver;
		pg = new Page(driver);
		tp0 = new TestPOJO();
		tp0.setSbLogOnUrl(new Test_Enviornment().envUrl(slugNAction.getLogin()));
		tp0.setSbRegUrl(new Test_Enviornment().envUrl(slugNAction.getRegister()));
		tp0.setSbPUUrl(new Test_Enviornment().envUrl(slugNAction
				.getProject_users()));
		tp0.setSbProjConf(new Test_Enviornment().envUrl(slugNAction
				.getProject_config()));
		tp0.setSbUAUrl(new Test_Enviornment().envUrl(slugNAction
				.getUser_admin()));
		tp0.setAdminUName("veggieadministrator");
		tp0.setAdminPword("cOOKE1964");
		tp0.setAdvUname("veggietester007");
		tp0.setAdvPword("Welles113*");
		tp0.setMiscUname001("veggietester003");

		ur0 = new UserRegPOJO();
		ur0.setfName(pg.randomFName());
		ur0.setlName(pg.randomLName());
		ur0.setEmail(pg.emailGen002());
		ur0.setProject("Y50061");
		ur0.setMsg("Your profile information has been created");
		ur0.setoMsg("Please check your email");
		ur0.setPhone(pg.randomPhone());
		ur0.setuName(ur0.getEmail());
		ur0.setPword(pg.randomPass());
		ur0.setStatement("SELECT user_register_key FROM b4pub.user_register where user_register_email = ?");
		ur0.setDb_url("jdbc:mysql://pub-constellation-qa-db-01.ckdfohchwkze.us-east-1.rds.amazonaws.com:3306/b4pub");
		ur0.setDb_username("vpc_dbuser");
		ur0.setDb_pword("prat0ri0n");
		ur0.setDb_reg_key("user_register_key");
		ur0.setRole("approved");

		pr1 = new ProfilePOJO();
		pr1.setfName(pg.randomFName());
		pr1.setlName(pg.randomLName());
		pr1.setPhone(pg.randomPhone());
		pr1.setfBook(pg.randomLName());
		pr1.setGoogle(pg.randomLName());
		pr1.setYahoo(pg.randomLName());
		pr1.setTwitter(pg.randomLName());
		pr1.setLinkedin(pg.randomLName());
		pr1.setPinterest(pg.randomLName());
		pr1.setInstagram(pg.randomLName());
		pr1.setBio(pg.randomLName());
		pr1.setMsg("The profile information has been updated");

		ur1 = new UserRegPOJO();
		ur1.setfName(pr1.getfName());
		ur1.setlName(pr1.getlName());
		ur1.setEmail(ur0.getEmail());
		ur1.setProject(ur0.getProject());
		ur1.setRole(ur0.getRole());
	}

	@Given("^on user admin page$")
	public void on_user_admin_page() throws Throwable {
		driver.get(tp0.getSbLogOnUrl());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		new Sb4LoginPage(driver).loginAs(tp0.getMiscUname001(),
				tp0.getAdvPword());
		driver.get(tp0.getSbUAUrl());
	}

	@When("^comploetes user reg form$")
	public void comploetes_user_reg_form() throws Throwable {
		key = new Sb4UserAdminPage(driver).regNewUser(ur0);
	}

	@Then("^user appears on user admin page$")
	public void user_appears_on_user_admin_page() throws Throwable {

		if (new Sb4UserAdminPage(driver).userRegSearchCount(ur0) < 1) {
			throw new RuntimeException("User Was Not Found");
		}
		new Sb4UserAdminPage(driver).deleteRegUser(ur0);

		if (new Sb4UserAdminPage(driver).userRegSearchCount(ur0) > 0) {
			throw new RuntimeException("User Was Found");
		}

		new Sb4UserAdminPage(driver).LogOut();
	}

	@Given("^on new user profile page$")
	public void on_new_user_profile_page() throws Throwable {
		driver.get(tp0.getSbLogOnUrl());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		new Sb4LoginPage(driver).loginAs(tp0.getMiscUname001(),
				tp0.getAdvPword());
		driver.get(tp0.getSbUAUrl());
		key = new Sb4UserAdminPage(driver).regNewUser(ur0);
		new Sb4UserAdminPage(driver).LogOut();
		driver.get(key);
	}

	@When("^complete form$")
	public void complete_form() throws Throwable {
		ur1 = new Sb4NewUserRegProf(driver).chkValues();
		if (!ur0.equals(ur1)) {
			throw new RuntimeException("initial values didn't match");
		}
		new Sb4NewUserRegProf(driver).doReg(ur0, false, true);
	}

	@Then("^user can log into SB$")
	public void user_can_log_into_SB() throws Throwable {
		driver.get(tp0.getSbLogOnUrl());
		new Sb4LoginPage(driver).loginAs(ur0.getEmail(), ur0.getPword())
				.GoToMyProfile();
	}

	@Then("^users profile information is correct$")
	public void users_profile_information_is_correct() throws Throwable {
		pp0 = new Sb4ProfilePage(driver).checkProfile();
		if (ur0.hashCode() != pp0.hashCode()) {
			throw new RuntimeException("profile values didn't match");
		}

		new Sb4ProfilePage(driver).LogOut();
	}

	@When("^complete form including changing the default username$")
	public void complete_form_including_changing_the_default_username()
			throws Throwable {
		ur1 = new Sb4NewUserRegProf(driver).chkValues();
		if (!ur0.equals(ur1)) {
			throw new RuntimeException("initial values didn't match");
		}
		new Sb4NewUserRegProf(driver).doReg(ur0, true, true);
	}

	@Then("^user can log into SB with unique username$")
	public void user_can_log_into_SB_with_unique_username() throws Throwable {
		new Sb4LoginPage(driver).loginAs(ur0.getfName(), ur0.getPword())
				.GoToMyProfile();
	}

	@Given("^newly registered user$")
	public void newly_registered_user() throws Throwable {
		createNewUser(ur0, tp0);
	}

	@When("^search for User$")
	public void search_for_User() throws Throwable {
		count = userSearch(ur0, tp0);
	}

	@Then("^the user appears on user admin grid$")
	public void the_user_appears_on_user_admin_grid() throws Throwable {
		if (count < 0) {
			new Sb4UserAdminPage(driver).LogOut();
			throw new RuntimeException("User Was Not Found");
		} else
			new Sb4UserAdminPage(driver).LogOut();
	}

	@When("^edit user info$")
	public void edit_user_info() throws Throwable {
		if (count < 0) {
			new Sb4UserAdminPage(driver).LogOut();
			throw new RuntimeException("User Was Not Found");
		}
		new Sb4UserAdminPage(driver).editUser(ur0).successfullUpdate(pr1)
				.LogOut();
	}

	@Then("^user info persists on grid$")
	public void user_info_persists_on_grid() throws Throwable {
		if (userSearch(ur1, tp0) < 0) {
			throw new RuntimeException("Edited User Was Not Found");
		}
	}

	@Then("^user info persists on edit screen$")
	public void user_info_persists_on_edit_screen() throws Throwable {
		pr2 = new Sb4UserAdminPage(driver).editUser(ur1).checkEditUser();
		if (!pr1.equals(pr2)) {
			throw new RuntimeException("User Info didn't match");
		}
	}

	@When("^add a new project to user$")
	public void add_a_new_project_to_user() throws Throwable {
		new Sb4LoginPage(driver).loginAs(tp0.getMiscUname001(),
				tp0.getAdvPword());
		driver.get(tp0.getSbUAUrl());
		new Sb4UserAdminPage(driver).editUser(ur0).goToProjNRole()
				.addProject("Y50063")
				.projRole("f796094653f249bca764c2b040aa7ceb", ur0.getRole())
				.LogOut();
	}

	@Then("^user has access to Project$")
	public void user_has_access_to_Project() throws Throwable {
		driver.get(tp0.getSbLogOnUrl());
		new Sb4LoginPage(driver).loginAs(ur0.getEmail(), ur0.getPword())
				.ChangeProject("Y50061", "Y50063").CheckProject("Y50063")
				.LogOut();
	}

	@Given("^user has access to multiple projects$")
	public void user_has_access_to_multiple_projects() throws Throwable {
		new Sb4LoginPage(driver).loginAs(tp0.getMiscUname001(),
				tp0.getAdvPword());
		driver.get(tp0.getSbUAUrl());
		new Sb4UserAdminPage(driver).editUser(ur0).goToProjNRole()
				.addProject("Y50063")
				.projRole("f796094653f249bca764c2b040aa7ceb", ur0.getRole());
	}

	@When("^change default project$")
	public void change_default_project() throws Throwable {
		new Sb4ProjNRolePage(driver).projAction(
				"#f796094653f249bca764c2b040aa7ceb").LogOut();
	}

	@Then("^user default project has changed$")
	public void user_default_project_has_changed() throws Throwable {
		new Sb4LoginPage(driver).loginAs(ur0.getEmail(), ur0.getPword())
				.CheckProject("Y50063").LogOut();
	}

	@Given("^default project changed$")
	public void default_project_changed() throws Throwable {
		new Sb4LoginPage(driver).loginAs(tp0.getMiscUname001(),
				tp0.getAdvPword());
		driver.get(tp0.getSbUAUrl());
		new Sb4UserAdminPage(driver).editUser(ur0).goToProjNRole()
				.addProject("Y50063")
				.projRole("f796094653f249bca764c2b040aa7ceb", ur0.getRole())
				.projAction("#f796094653f249bca764c2b040aa7ceb").LogOut()
				.loginAs(ur0.getEmail(), ur0.getPword()).CheckProject("Y50063")
				.ChangeProject("Y50063", "Y50061").LogOut();

	}

	@When("^remove default project from user$")
	public void remove_default_project_from_user() throws Throwable {
		ur0.setProject("Y50063");
		new Sb4LoginPage(driver).loginAs(tp0.getMiscUname001(),
				tp0.getAdvPword());
		driver.get(tp0.getSbUAUrl());
		new Sb4UserAdminPage(driver).editUser(ur0).goToProjNRole()
				.projAction("#Y50063")
				.projAction("#ab0355977d024f63bf78351e9e78b80f").LogOut();
	}

	@Then("^user no longer has access to project$")
	public void user_no_longer_has_access_to_project() throws Throwable {
		if (new Sb4LoginPage(driver).loginAs(ur0.getEmail(), ur0.getPword())
				.CheckProject("Y50061", "Y50063") > 0) {
			throw new RuntimeException("Project Not Found");
		}
	}

	@After("@ua1")
	public void afterScenario() throws InterruptedException {
		userCleanUp(ur0, tp0);
	}

	private void userCleanUp(UserRegPOJO obj, TestPOJO obj1)
			throws InterruptedException {
		driver.get(obj1.getSbLogOnUrl());
		new Sb4LoginPage(driver)
				.loginAsAdmin(obj1.getAdminUName(), obj1.getAdminPword())
				.GoToUserPage()

				.deleteUser(obj.getEmail()).finDeleteUser().adminLogOut();

	}

	private void createNewUser(UserRegPOJO obj, TestPOJO obj1)
			throws InterruptedException, InstantiationException,
			IllegalAccessException, ClassNotFoundException, SQLException {

		driver.get(obj1.getSbLogOnUrl());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		new Sb4LoginPage(driver).loginAs(obj1.getMiscUname001(),
				obj1.getAdvPword());
		driver.get(obj1.getSbUAUrl());
		key = new Sb4UserAdminPage(driver).regNewUser(obj);
		new Sb4UserAdminPage(driver).LogOut();
		driver.get(key);
		new Sb4NewUserRegProf(driver).doReg(obj, false, false);
		driver.get(obj1.getSbLogOnUrl());
		new Sb4LoginPage(driver).loginAs(obj.getEmail(), obj.getPword())
				.LogOut();
	}

	private int userSearch(UserRegPOJO obj, TestPOJO obj1)
			throws InterruptedException {
		driver.get(obj1.getSbLogOnUrl());
		new Sb4LoginPage(driver).loginAs(obj1.getMiscUname001(),
				obj1.getAdvPword());
		driver.get(obj1.getSbUAUrl());
		return new Sb4UserAdminPage(driver).userSearchCount(obj);
	}
}