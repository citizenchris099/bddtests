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
import com.balfour.publishing.qa.pages.sb4.Sb4NewUserRegProf;
import com.balfour.publishing.qa.pages.sb4.Sb4ProfilePage;
import com.balfour.publishing.qa.pages.sb4.Sb4ProjectUserPage;
import com.balfour.publishing.qa.pages.sb4.Sb4UserAdminPage;

import cucumber.api.java.Before;

public class Stubs_Base {

	WebDriver driver;

	protected TestPOJO tp0 = null;

	public Stubs_Base(SharedDriver driver) throws InterruptedException {
		this.driver = driver;
	}

	@Before
	public void testSetup() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		tp0 = testInfo();
		driver.get(tp0.getSbLogOnUrl());
	}

	protected TestPOJO testInfo() {
		Test_EnviornmentPOJO slugNAction = new Test_Enviornment().slugNAction();
		TestPOJO tp0 = new TestPOJO();
		tp0.setSbLogOnUrl(new Test_Enviornment().envUrl(slugNAction.getLogin()));
		tp0.setSbRegUrl(new Test_Enviornment().envUrl(slugNAction.getRegister()));
		tp0.setSbPUUrl(new Test_Enviornment().envUrl(slugNAction.getProject_users()));
		tp0.setSbProjConf(new Test_Enviornment().envUrl(slugNAction.getProject_config()));
		tp0.setSbUAUrl(new Test_Enviornment().envUrl(slugNAction.getUser_admin()));
		tp0.setSbPUDyUrl(new Test_Enviornment().envUrl(slugNAction.getProject_view_dynamic()));
		tp0.setAdvUname("trevorbelmont001");
		tp0.setAdvPword("Welles113*");
		tp0.setMiscUname001("veggietester003");
		tp0.setMiscPword001("cOOKE1964");
		tp0.setMiscUname002("veggietester006@gmail.com");
		tp0.setAdminUName("veggieadministrator");
		tp0.setAdminPword("cOOKE1964");
		return tp0;
	}

	/**
	 * used to create an object of UserRegPOJO for user testing
	 * 
	 * @param role
	 *            : of the user
	 * @return : UserRegPOJO
	 */
	protected UserRegPOJO regUserInfo(String role) {
		Page pg = new Page(driver);
		UserRegPOJO obj = new UserRegPOJO();
		obj.setfName(pg.randomFName());
		obj.setlName(pg.randomLName());
		obj.setStatement("SELECT user_register_key FROM b4pub.user_register where user_register_email = ?");
		obj.setDb_url("jdbc:mysql://pub-constellation-qa-db-01.ckdfohchwkze.us-east-1.rds.amazonaws.com:3306/b4pub");
		obj.setDb_username("vpc_dbuser");
		obj.setDb_pword("prat0ri0n");
		obj.setDb_reg_key("user_register_key");
		obj.setEmail(pg.emailGen002());
		obj.setProject("Y50061");
		obj.setPhone(pg.randomPhone());
		obj.setfBook(pg.randomUName());
		obj.setGoogle(pg.randomUName());
		obj.setYahoo(pg.randomUName());
		obj.setTwitter(pg.randomUName());
		obj.setLinkedin(pg.randomUName());
		obj.setPinterest(pg.randomUName());
		obj.setInstagram(pg.randomUName());
		obj.setuName(obj.getEmail());
		obj.setPword(pg.randomPassword());
		obj.setMsg("Your profile information has been created");
		obj.setRole(role);
		obj.setEmailSearch(true);
		return obj;
	}

	protected UserRegPOJO regFakeUserInfo(String role) {
		Page pg = new Page(driver);
		UserRegPOJO obj = new UserRegPOJO();
		obj.setfName(pg.randomFName());
		obj.setlName(pg.randomLName());
		obj.setEmail("");
		obj.setuName(pg.randomUName());
		obj.setRole(role);
		obj.setPword(pg.randomPassword() + "1" + "a" + "A");
		obj.setProject("Y50061");
		return obj;
	}

	/**
	 * creates a variation of the UserRegPOJO passed based on the value passed
	 * 
	 * @param value
	 *            : accepted are fname, lname, email or role
	 * @param obj
	 *            : of UserRegPOJO
	 * @return
	 */
	protected UserRegPOJO editUserInfo(String value, UserRegPOJO obj) {
		Page pg = new Page(driver);
		UserRegPOJO obj1 = new UserRegPOJO();
		obj1.setfName(obj.getfName());
		obj1.setlName(obj.getlName());
		obj1.setEmail(obj.getEmail());
		obj1.setProject(obj.getProject());
		obj1.setRole(obj.getRole());
		obj1.setPhone(obj.getPhone());
		obj1.setfBook(obj.getfBook());
		obj1.setGoogle(obj.getGoogle());
		obj1.setYahoo(obj.getYahoo());
		obj1.setTwitter(obj.getTwitter());
		obj1.setLinkedin(obj.getLinkedin());
		obj1.setPinterest(obj.getPinterest());
		obj1.setInstagram(obj.getInstagram());
		obj1.setuName(obj.getuName());
		obj1.setPword(obj.getPword());
		obj1.setMsg(obj.getMsg());
		obj1.setEmailSearch(true);
		if (value.equals("fname")) {
			obj1.setfName(pg.randomFName());
		} else if (value.equals("lname")) {
			obj1.setlName(pg.randomLName());
		} else if (value.equals("email")) {
			obj1.setEmail(pg.emailGen002());
		} else if (value.equals("role")) {
			obj1.setRole("editor");
		} else
			throw new RuntimeException("value did not equal fname, lname, email or role");
		return obj1;
	}

	protected void userInfoCompare(UserRegPOJO obj, UserRegPOJO obj1) {
		if (obj.hashCode() != obj1.hashCode()) {
			throw new RuntimeException("User Info did not match");
		}
	}

	protected void loginAs(String role, TestPOJO obj1) throws InterruptedException {
		driver.get(obj1.getSbLogOnUrl());
		if (role.equals("adviser")) {
			new Sb4LoginPage(driver).loginAs(obj1.getAdvUname(), obj1.getAdvPword());
		} else if (role.equals("sales rep")) {
			new Sb4LoginPage(driver).loginAs(obj1.getMiscUname002(), obj1.getAdvPword());
		} else if (role.equals("customer support")) {
			new Sb4LoginPage(driver).loginAs(obj1.getMiscUname001(), obj1.getMiscPword001());
		}
	}

	protected void loginAs(UserRegPOJO obj, TestPOJO obj1) throws InterruptedException {
		driver.get(obj1.getSbLogOnUrl());
		new Sb4LoginPage(driver).loginAs(obj.getuName(), obj.getPword());

	}

	protected UserRegPOJO verifyTestUser(UserRegPOJO obj, TestPOJO obj1) throws InterruptedException {
		driver.get(obj1.getSbLogOnUrl());
		UserRegPOJO obj2 = new Sb4LoginPage(driver).loginAs(obj.getuName(), obj.getPword()).GoToMyProfile()
				.checkProfile();
		new Sb4ProfilePage(driver).LogOut();
		return obj2;
	}

	protected void loginAs2(String role, UserRegPOJO obj, TestPOJO obj1) throws InterruptedException {
		driver.get(obj1.getSbLogOnUrl());
		if (role.equals("administrator")) {
			new Sb4LoginPage(driver).loginAsAdmin(obj.getEmail(), obj.getPword()).adminLogOut();
		} else
			new Sb4LoginPage(driver).loginAs(obj.getEmail(), obj.getPword()).LogOut();
	}

	protected void userCleanUp(UserRegPOJO obj, TestPOJO obj1) throws InterruptedException {
		driver.get(obj1.getSbLogOnUrl());
		new Sb4LoginPage(driver).loginAsAdmin(obj1.getAdminUName(), obj1.getAdminPword()).GoToUserPage()

		.deleteUser(obj.getEmail()).finDeleteUser().adminLogOut();

	}


	/**
	 * 
	 * @param arg1
	 *            : role of user
	 * @param obj
	 *            : of UserRegPOJO
	 * @param obj1
	 *            : TestPOJO
	 * @throws InterruptedException
	 * @throws InstantiationException
	 * @throws IllegalAccessException
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	protected void registerProjectUser(UserRegPOJO obj, TestPOJO obj1) throws InterruptedException,
			InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		new Sb4LoginPage(driver).loginAs(obj1.getAdvUname(), obj1.getAdvPword());
		driver.get(obj1.getSbPUUrl());
		String key = new Sb4ProjectUserPage(driver).regNewUser(obj);
		new Sb4ProjectUserPage(driver).LogOut();
		driver.get(key);
		new Sb4NewUserRegProf(driver).doReg(obj, true);
	}

	protected void registerUserAdmin(UserRegPOJO obj, TestPOJO obj1) throws InterruptedException,
			InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		new Sb4LoginPage(driver).loginAs(obj1.getMiscUname001(), obj1.getMiscPword001());
		driver.get(obj1.getSbUAUrl());
		String key = new Sb4UserAdminPage(driver).regNewUser(obj);
		new Sb4UserAdminPage(driver).LogOut();
		driver.get(key);
		new Sb4NewUserRegProf(driver).doReg(obj, true);
	}
}