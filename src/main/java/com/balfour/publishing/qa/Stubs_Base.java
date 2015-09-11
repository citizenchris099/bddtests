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

public class Stubs_Base {

	WebDriver driver;

	static UserRegPOJO ur0 = null;
	static UserRegPOJO srep = null;
	static UserRegPOJO csup = null;
	static UserRegPOJO adm = null;
	static UserRegPOJO apr = null;
	static UserRegPOJO dsr = null;
	static UserRegPOJO edt = null;
	static UserRegPOJO pho = null;

	public Stubs_Base(SharedDriver driver) throws InterruptedException {
		this.driver = driver;
	}

	/**
	 * 
	 */
	protected TestPOJO testInfo() {
		Test_EnviornmentPOJO slugNAction = new Test_Enviornment().slugNAction();
		TestPOJO tp0 = new TestPOJO();
		tp0.setSbLogOnUrl(new Test_Enviornment().envUrl(slugNAction.getLogin()));
		tp0.setSbRegUrl(new Test_Enviornment().envUrl(slugNAction.getRegister()));
		tp0.setSbPUUrl(new Test_Enviornment().envUrl(slugNAction.getProject_users()));
		tp0.setSbProjConf(new Test_Enviornment().envUrl(slugNAction.getProject_config()));
		tp0.setSbUAUrl(new Test_Enviornment().envUrl(slugNAction.getUser_admin()));
		tp0.setAdminUName("veggieadministrator");
		tp0.setAdminPword("cOOKE1964");
		tp0.setAdvUname("trevorbelmont001");
		tp0.setAdvPword("Welles113*");
		tp0.setMiscUname001("veggietester003");
		tp0.setMiscPword001("cOOKE1964");
		tp0.setMiscUname002("veggietester006@gmail.com");
		return tp0;
	}

	/**
	 * @param driver
	 */
	protected UserRegPOJO regUserInfo(String role) {
		Page pg = new Page(driver);
		UserRegPOJO ur0 = new UserRegPOJO();
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
		ur0.setPword(pg.randomPassword());
		ur0.setMsg("Your profile information has been created");
		ur0.setRole(role);
		return ur0;
	}

	protected void loginAs(String role, TestPOJO obj1) throws InterruptedException {
		driver.get(obj1.getSbLogOnUrl());
		if (role.equals("adviser")) {
			new Sb4LoginPage(driver).loginAs(obj1.getAdvUname(), obj1.getAdvPword());
		} else if (role.equals("sales rep")) {
			new Sb4LoginPage(driver).loginAs(obj1.getMiscUname002(), obj1.getAdvPword());
		} else if (role.equals("customer support")) {
			new Sb4LoginPage(driver).loginAs(obj1.getMiscUname001(), obj1.getAdvPword());
		}
	}

	protected void verifyTestUser(UserRegPOJO obj, TestPOJO obj1) throws InterruptedException {
		driver.get(obj1.getSbLogOnUrl());
		new Sb4LoginPage(driver).loginAs(obj.getuName(), obj.getPword()).LogOut();
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
		driver.get(obj1.getSbLogOnUrl());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		new Sb4LoginPage(driver).loginAsAdmin(obj1.getAdvUname(), obj1.getAdvPword());
		driver.get(obj1.getSbPUUrl());
		String key = new Sb4ProjectUserPage(driver).regNewUser(obj);
		new Sb4ProjectUserPage(driver).LogOut();
		driver.get(key);
		new Sb4NewUserRegProf(driver).doReg(obj, false);
	}

	protected void registerUserAdmin(UserRegPOJO obj, TestPOJO obj1) throws InterruptedException,
			InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		driver.get(obj1.getSbLogOnUrl());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		new Sb4LoginPage(driver).loginAsAdmin(obj1.getMiscUname001(), obj1.getMiscPword001());
		driver.get(obj1.getSbUAUrl());
		String key = new Sb4UserAdminPage(driver).regNewUser(obj);
		new Sb4UserAdminPage(driver).LogOut();
		driver.get(key);
		new Sb4NewUserRegProf(driver).doReg(obj, false);
	}

	public void testUsers() throws InstantiationException, IllegalAccessException, ClassNotFoundException,
			InterruptedException, SQLException {
		srep = regUserInfo("sales rep");
		registerProjectUser(srep, testInfo());
		csup = regUserInfo("customer support");
		registerProjectUser(csup, testInfo());
		adm = regUserInfo("administrator");
		registerProjectUser(adm, testInfo());
		apr = regUserInfo("approved");
		registerProjectUser(apr, testInfo());
		dsr = regUserInfo("approved");
		registerProjectUser(dsr, testInfo());
		edt = regUserInfo("approved");
		registerProjectUser(edt, testInfo());
		pho = regUserInfo("approved");
		registerProjectUser(pho, testInfo());
	}

	public void afterScenario() throws InterruptedException {
		userCleanUp(srep, testInfo());
		userCleanUp(csup, testInfo());
		userCleanUp(adm, testInfo());
		userCleanUp(apr, testInfo());
		userCleanUp(dsr, testInfo());
		userCleanUp(edt, testInfo());
		userCleanUp(pho, testInfo());
	}

	public static void beforeSuite() {

	}
}