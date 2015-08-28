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
import com.balfour.publishing.qa.pages.sb4.Sb4ProjectUserPage;
import com.balfour.publishing.qa.pages.sb4.Sb4UserAdminPage;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stubs_Project_User {

	WebDriver driver;
	String lUnameVal = "veggie_administrator";
	String lPwordVal = "cOOKE1964";
	String enfoldUrl = "http://10.90.31.54:8000/users?email=";
	String enfoldRole = "3c267146ed0b475e8e9b7b3c1a89e701";
	String enfoldKey = "users[0].role_id";
	Page pg;
	UserRegPOJO ur0 = null;
	TestPOJO tp0 = null;
	Test_EnviornmentPOJO slugNAction = new Test_Enviornment().slugNAction();
	String sbLogOnUrl = new Test_Enviornment().envUrl(slugNAction.getLogin());
	String sbUAUrl = new Test_Enviornment().envUrl(slugNAction.getUser_admin());
	String sbHomeUrl = new Test_Enviornment().envUrl(slugNAction.getHome());
	String sbPUUrl = new Test_Enviornment().envUrl(slugNAction
			.getProject_users());
	String key = null;
	String adv = "adviser";
	String sr = "sales rep";
	String cs = "customer support";
	String advUname = "veggietester007";
	String srUname = "veggietester006@gmail.com";
	String csUname = "veggietester003";
	String pWord = "Welles113*";
	private int display;

	public Stubs_Project_User(SharedDriver driver) throws InterruptedException {
		this.driver = driver;
		pg = new Page(driver);
		ur0 = new UserRegPOJO();
		ur0.setfName(pg.randomFName());
		ur0.setlName(pg.randomLName());
		ur0.setStatement("SELECT user_register_key FROM b4pub.user_register where user_register_email = ?");
		ur0.setDb_url("jdbc:mysql://pub-constellation-qa-db-01.ckdfohchwkze.us-east-1.rds.amazonaws.com:3306/b4pub");
		ur0.setDb_username("vpc_dbuser");
		ur0.setDb_pword("prat0ri0n");
		ur0.setDb_reg_key("user_register_key");
		ur0.setEmail(pg.emailGen002());
		ur0.setProject("Y50061");
		ur0.setPhone(pg.randomPhone());
		ur0.setfBook(pg.randomUName());
		ur0.setGoogle(pg.randomUName());
		ur0.setYahoo(pg.randomUName());
		ur0.setTwitter(pg.randomUName());
		ur0.setLinkedin(pg.randomUName());
		ur0.setPinterest(pg.randomUName());
		ur0.setInstagram(pg.randomUName());
		ur0.setuName(ur0.getEmail());
		ur0.setPword(pg.randomPass());
		ur0.setMsg("Your profile information has been created");

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
		tp0.setMiscUname002("veggietester006@gmail.com");
	}

	@Given("^registered \"([^\"]*)\"$")
	public void registered(String arg1) throws Throwable {
		registerUser(arg1, ur0, tp0);
	}

	@Given("^user registered as \"([^\"]*)\"$")
	public void user_registered_as(String arg1) throws Throwable {
		registerUser(arg1, ur0, tp0);
	}

	@Given("^on PU page as \"([^\"]*)\"$")
	public void on_PU_page_as(String arg1) throws Throwable {
		loginAs(arg1, tp0);
		driver.get(sbPUUrl);
		new Sb4ProjectUserPage(driver);
	}

	@When("^search \"([^\"]*)\"$")
	public void search(String arg1) throws Throwable {
		display = new Sb4ProjectUserPage(driver).userSearchCount(ur0);
		System.out.println("The User Was Displayed " + display + " times");

	}

	@Then("^\"([^\"]*)\" cant see \"([^\"]*)\"$")
	public void cant_see(String arg1, String arg2) throws Throwable {
		if (display > 0) {
			new Sb4ProjectUserPage(driver).LogOut();
			throw new RuntimeException("User Was Found");
		} else
			new Sb4ProjectUserPage(driver).LogOut();
		userCleanUp(ur0, tp0);
	}

	@Then("^\"([^\"]*)\" can see \"([^\"]*)\"$")
	public void can_see(String arg1, String arg2) throws Throwable {
		if (display < 1) {
			new Sb4ProjectUserPage(driver).LogOut();
			throw new RuntimeException("User Was Not Found");
		} else
			new Sb4ProjectUserPage(driver).LogOut();
		userCleanUp(ur0, tp0);
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
		registerUser("approved", ur0, tp0);
	}

	@When("^add project to user from Project User Page$")
	public void add_project_to_user_from_Project_User_Page() throws Throwable {
		new Sb4LoginPage(driver).loginAs(tp0.getAdvUname(), tp0.getAdvPword());
		driver.get(tp0.getSbPUUrl());
		new Sb4ProjectUserPage(driver).editUser(ur0).addProjectList("Y50063")
				.projRole("f796094653f249bca764c2b040aa7ceb", ur0.getRole())
				.LogOut();
	}

	@Then("^user can access to project$")
	public void user_can_access_to_project() throws Throwable {
		driver.get(tp0.getSbLogOnUrl());
		new Sb4LoginPage(driver).loginAs(ur0.getEmail(), ur0.getPword())
				.ChangeProject("Y50061", "Y50063").CheckProject("Y50063")
				.LogOut();
	}

	@Given("^default project changed from Project User Page$")
	public void default_project_changed_from_Project_User_Page()
			throws Throwable {
		new Sb4LoginPage(driver).loginAs(tp0.getAdvUname(), tp0.getAdvPword());
		driver.get(tp0.getSbPUUrl());
		new Sb4ProjectUserPage(driver).editUser(ur0).addProjectList("Y50063")
				.projRole("f796094653f249bca764c2b040aa7ceb", ur0.getRole())
				.projAction("#f796094653f249bca764c2b040aa7ceb").LogOut()
				.loginAs(ur0.getEmail(), ur0.getPword()).CheckProject("Y50063")
				.ChangeProject("Y50063", "Y50061").CheckProject("Y50061")
				.LogOut();
	}

	@When("^remove default project from Project User Page$")
	public void remove_default_project_from_Project_User_Page()
			throws Throwable {
		new Sb4LoginPage(driver).loginAs(tp0.getAdvUname(), tp0.getAdvPword());
		driver.get(tp0.getSbPUUrl());
		new Sb4ProjectUserPage(driver).editUser(ur0).projAction("#Y50063")
				.projAction("#ab0355977d024f63bf78351e9e78b80f").LogOut();
	}

	@Then("^user can no longer access project$")
	public void user_can_no_longer_access_project() throws Throwable {
		if (new Sb4LoginPage(driver).loginAs(ur0.getEmail(), ur0.getPword())
				.CheckProject("Y50061", "Y50063") > 0) {
			throw new RuntimeException("Project Not Found");
		}
	}

	@When("^change default project from Project User Page$")
	public void change_default_project_from_Project_User_Page()
			throws Throwable {
		new Sb4LoginPage(driver).loginAs(tp0.getAdvUname(), tp0.getAdvPword());
		driver.get(tp0.getSbPUUrl());
		new Sb4ProjectUserPage(driver).editUser(ur0).addProjectList("Y50063")
				.projRole("f796094653f249bca764c2b040aa7ceb", ur0.getRole())
				.projAction("#f796094653f249bca764c2b040aa7ceb").LogOut();
	}

	@Then("^user default project changed$")
	public void user_default_project_changed() throws Throwable {
		new Sb4LoginPage(driver).loginAs(ur0.getEmail(), ur0.getPword())
				.CheckProject("Y50063").LogOut();
	}

	@After("@pu1")
	public void afterScenario() throws InterruptedException {
		userCleanUp(ur0, tp0);
	}

	public void loginAs(String role, TestPOJO obj1) throws InterruptedException {
		driver.get(sbLogOnUrl);
		if (role.equals(adv)) {
			new Sb4LoginPage(driver).loginAs(obj1.getAdvUname(),
					obj1.getAdvPword());
		} else if (role.equals(sr)) {
			new Sb4LoginPage(driver).loginAs(obj1.getMiscUname002(),
					obj1.getAdvPword());
		} else if (role.equals(cs)) {
			new Sb4LoginPage(driver).loginAs(obj1.getMiscUname001(),
					obj1.getAdvPword());
		}
	}

	public void loginAs2(String role, UserRegPOJO obj)
			throws InterruptedException {
		driver.get(sbLogOnUrl);
		if (role.equals("administrator")) {
			new Sb4LoginPage(driver).loginAsAdmin(obj.getEmail(),
					obj.getPword()).adminLogOut();
		} else
			new Sb4LoginPage(driver).loginAs(obj.getEmail(), obj.getPword())
					.LogOut();
	}

	private void userCleanUp(UserRegPOJO obj, TestPOJO obj1)
			throws InterruptedException {
		driver.get(obj1.getSbLogOnUrl());
		new Sb4LoginPage(driver)
				.loginAsAdmin(obj1.getAdminUName(), obj1.getAdminPword())
				.GoToUserPage()

				.deleteUser(obj.getEmail()).finDeleteUser().adminLogOut();

	}

	/**
	 * @param arg1
	 * @throws InterruptedException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	private void registerUser(String arg1, UserRegPOJO obj, TestPOJO obj1)
			throws InterruptedException, InstantiationException,
			IllegalAccessException, ClassNotFoundException, SQLException {
		obj.setRole(arg1);
		driver.get(obj1.getSbLogOnUrl());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		new Sb4LoginPage(driver).loginAsAdmin(obj1.getAdminUName(),
				obj1.getAdminPword());
		driver.get(obj1.getSbUAUrl());
		key = new Sb4UserAdminPage(driver).regNewUser(obj);
		new Sb4UserAdminPage(driver).LogOut();
		driver.get(key);
		new Sb4NewUserRegProf(driver).doReg(obj, false, false);
	}
}