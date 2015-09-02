package com.balfour.publishing.qa;

import java.sql.SQLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.balfour.publishing.TestPOJO;
import com.balfour.publishing.Test_Enviornment;
import com.balfour.publishing.Test_EnviornmentPOJO;
import com.balfour.publishing.qa.pages.Page;
import com.balfour.publishing.qa.pages.sb4.Sb4HomePage;
import com.balfour.publishing.qa.pages.sb4.Sb4LoginPage;
import com.balfour.publishing.qa.pages.sb4.Sb4NewUserReg;
import com.balfour.publishing.qa.pages.sb4.Sb4NewUserRegProf;
import com.balfour.publishing.qa.pages.sb4.Sb4ProjectConfigPage;
import com.balfour.publishing.qa.pages.sb4.Sb4ProjectUserPage;
import com.balfour.publishing.qa.pages.sb4.Sb4ProjectViewPage;
import com.balfour.publishing.qa.pages.sb4.Sb4RegisterPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stubs_User_Reg {

	WebDriver driver;
	Sb4HomePage sb4dashboard;
	Sb4LoginPage sb4login;
	Sb4NewUserReg sb4NewUserReg;
	Sb4NewUserRegProf sb4NewUserRegProf;
	Page pg;
	UserRegPOJO ur0 = null;
	ProjConfigPOJO pc0 = null;
	TestPOJO tp0 = null;
	Test_EnviornmentPOJO slugNAction = new Test_Enviornment().slugNAction();

	public Stubs_User_Reg(SharedDriver driver) {
		this.driver = driver;
		pg = new Page(driver);
		pc0 = new ProjConfigPOJO();
		pc0.setEnrollment(new Page(driver).randomPhone());
		pc0.setYear("2016");
		pc0.setProjName("2016 IT MyYear Test Account");
		pc0.setStatus("Free");
		pc0.setdSeason("Fall");
		pc0.setAdviser("veggie tester007");
		pc0.setAe("veggie tester004");
		pc0.setRep("veggie tester006");
		pc0.setTeacher(true);
		pc0.setHomeroom(false);
		pc0.setrPWord("password");
		pc0.setProject("Y50061");

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

		tp0 = new TestPOJO();
		tp0.setSbLogOnUrl(new Test_Enviornment().envUrl(slugNAction.getLogin()));
		tp0.setSbRegUrl(new Test_Enviornment().envUrl(slugNAction.getRegister()));
		tp0.setSbPUUrl(new Test_Enviornment().envUrl(slugNAction
				.getProject_users()));
		tp0.setSbProjConf(new Test_Enviornment().envUrl(slugNAction
				.getProject_config()));
		tp0.setAdminUName("veggie_administrator");
		tp0.setAdminPword("cOOKE1964");
		tp0.setAdvUname("veggietester007");
		tp0.setAdvPword("Welles113*");
		tp0.setMiscUname001("veggietester003");
		driver.get(tp0.getSbLogOnUrl());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Given("^project set to \"([^\"]*)\"$")
	public void project_set_to(String arg1) throws Throwable {
		new Sb4LoginPage(driver).loginAs(tp0.getMiscUname001(),
				tp0.getAdvPword());

		driver.get(tp0.getSbProjConf());
		driver.get(setRegType(arg1, pc0, tp0));
	}

	@When("^user registers to project set to \"([^\"]*)\"$")
	public void user_registers_to_project_set_to(String arg1) throws Throwable {
		driver.get(openReg(arg1, ur0, pc0));
		new Sb4NewUserRegProf(driver).doReg(ur0, false);
	}

	@Then("^user can log into project$")
	public void user_can_log_into_project() throws Throwable {
		userLogin(ur0);
	}

	@Then("^user is set to the approved role$")
	public void user_is_set_to_the_approved_role() throws Throwable {
		userSearch(ur0, tp0);
		userCleanUp(ur0, tp0);
	}

	@Given("^on project config page$")
	public void on_project_config_page() throws Throwable {
		new Sb4LoginPage(driver).loginAs(tp0.getMiscUname001(),
				tp0.getAdvPword());

		driver.get(tp0.getSbProjConf());
	}

	@When("^the project is set to \"([^\"]*)\"$")
	public void the_project_is_set_to(String arg1) throws Throwable {
		driver.get(setRegType(arg1, pc0, tp0));
	}
	
	@Then("^when user attempts to register against project set to \"([^\"]*)\" they receive \"([^\"]*)\"$")
	public void when_user_attempts_to_register_against_project_set_to_they_receive(String arg1, String arg2) throws Throwable {

		negativeReg(arg1, arg2, ur0, pc0);
	}


	private String setRegType(String type, ProjConfigPOJO obj, TestPOJO obj1)
			throws InterruptedException {
		String reg = null;
		String regUrl = obj1.getSbRegUrl() + obj.getProject();
		obj.setrType(type);
		if (obj.getrType().equals("Password Only")) {
			reg = new Sb4ProjectConfigPage(driver).successfulUpDate(obj)
					.getRegType();
		} else if (type.equals("Invite Only")) {
			reg = new Sb4ProjectConfigPage(driver).successfulUpDate(obj)
					.getRegType();
			regUrl = new Sb4ProjectViewPage(driver).getInviteUrl();
		} else
			reg = new Sb4ProjectConfigPage(driver).successfulUpDate(obj)
					.getRegType();

		String[] array = obj.getrType().trim().split(" ");
		String typeSplit = array[0].trim();


		if (!reg.equals(typeSplit)) {
			throw new RuntimeException(
					"Registration Type is not dispalying correctly");
		}
		new Sb4ProjectViewPage(driver).LogOut();

		return regUrl;
	}

	private String openReg(String type, UserRegPOJO obj, ProjConfigPOJO obj2)
			throws InterruptedException, InstantiationException,
			IllegalAccessException, ClassNotFoundException, SQLException {
		obj2.setrType(type);
		return new Sb4RegisterPage(driver).registerUser(obj, obj2);
	}

	private void userLogin(UserRegPOJO obj) throws InterruptedException {
		driver.get(tp0.getSbLogOnUrl());
		new Sb4LoginPage(driver).loginAs(obj.getEmail(), obj.getPword())
				.LogOut();
	}

	private void userSearch(UserRegPOJO obj, TestPOJO obj1)
			throws InterruptedException {
		driver.get(obj1.getSbLogOnUrl());
		new Sb4LoginPage(driver)
				.loginAs(obj1.getAdvUname(), obj1.getAdvPword());
		driver.get(obj1.getSbPUUrl());
		if (new Sb4ProjectUserPage(driver).userSearchCount(obj) < 1) {
			throw new RuntimeException("User Was Not Found");
		}
		new Sb4ProjectUserPage(driver).LogOut();

	}

	private void userCleanUp(UserRegPOJO obj, TestPOJO obj1)
			throws InterruptedException {
		driver.get(obj1.getSbLogOnUrl());
		new Sb4LoginPage(driver)
				.loginAsAdmin(obj1.getAdminUName(), obj1.getAdminPword())
				.GoToUserPage()

				.deleteUser(obj.getEmail()).finDeleteUser().adminLogOut();

	}

	private void negativeReg(String type, String msg, UserRegPOJO obj,
			ProjConfigPOJO obj1) throws InstantiationException,
			IllegalAccessException, ClassNotFoundException,
			InterruptedException, SQLException {

		obj.setoMsg(msg);
		obj1.setrType(type);
		if (obj1.getrType().equals("Closed")) {
			new Sb4LoginPage(driver, obj.getoMsg());
		} else if (obj1.getrType().equals("Password Only")) {
			obj1.setrPWord("wrong");
			if (!openReg(obj1.getrType(), ur0, pc0).equals("Cannot Register")) {
				throw new RuntimeException(
						"Registration was not set to Password Only");
			}
		}
	}

}