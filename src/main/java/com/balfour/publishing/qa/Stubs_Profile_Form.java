package com.balfour.publishing.qa;

import org.openqa.selenium.WebDriver;

import com.balfour.publishing.Test_Enviornment;
import com.balfour.publishing.qa.pages.sb4.RestUtil;
import com.balfour.publishing.qa.pages.sb4.Sb4AdminUserProfPage;
import com.balfour.publishing.qa.pages.sb4.Sb4HomePage;
import com.balfour.publishing.qa.pages.sb4.Sb4LoginPage;
import com.balfour.publishing.qa.pages.sb4.Sb4ProfilePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stubs_Profile_Form {

	WebDriver driver;

	Sb4AdminUserProfPage adminpro;
	RestUtil ru;
	String goodmsg = "has been updated";
	String badmsg = "Email already taken";
	String unameVal = "veggie_smurf";
	String pwordVal = "meatisevil";
	String email = "veggie_smurf@smurf.com";
	String admUname = "mobileuser";
	String admPwrd = "mobile";
	String user = "veggie_smurf";
	String nEmailVal = "veggiesmurf@smurf.com";
	String bEmailVal = "citizenchris099@gmail.com";
	String nFNameVal = "Vegtastic";
	String nLNameVal = "Smurfins";
	String nPhoneVal = "7170023";
	String nDNameVal = "Smurf";
	String nFBookVal = "VegtasticFBook";
	String nGoogleVal = "VeggieGoogle2";
	String nYahooVal = "VeggieYahoo2";
	String nTwitterVal = "VeggieTwitter2";
	String nLinkedinVal = "VeggieLinked2";
	String nPinVal = "VeggiePin2";
	String nInstaVal = "VeggieInsta2";
	String error = "is already taken. Please try again.";
	String successmsg = "Your profile information has been updated";
	String userUuid = "f0fd9d994dfe40dd871da403638f98a3";
	String enfoldUrl = "http://10.90.31.54:8000/users/";
	ProfilePOJO pr0 = null;
	ProfilePOJO pr1 = null;
	ProfilePOJO pr2 = null;
	ProfilePOJO pr3 = null;
	AdminProfilePOJO ap0 = null;
	AdminProfilePOJO ap1 = null;
	AdminProfilePOJO ap2 = null;
	AdminProfilePOJO ap3 = null;

	public Stubs_Profile_Form(SharedDriver driver) {
		this.driver = driver;
	}

	@Given("^On SBv(\\d+) Profile Form Page$")
	public void On_SBv_Profile_Form_Page(int arg1) throws Throwable {
		ru = new RestUtil();
		pr0 = new Sb4HomePage(driver).GoToMyProfile().checkProfile();
		ap0 = new Sb4ProfilePage(driver).LogOut()
				.loginAsAdmin(admUname, admPwrd).GoToUserPage()
				.Go2UserProf(unameVal).checkAdminUProfile();

		new Sb4AdminUserProfPage(driver).adminLogOut()
				.loginAs(unameVal, pwordVal).GoToMyProfile();
	}

	@Given("^valid profile email$")
	public void valid_profile_email() throws Throwable {
		pr1 = new ProfilePOJO();
		pr1.setuName(unameVal);
		pr1.setEmail(nEmailVal);
		pr1.setfName(nFNameVal);
		pr1.setlName(nLNameVal);
		pr1.setPhone(nPhoneVal);
		pr1.setdName(nDNameVal);
		pr1.setfBook(nFBookVal);
		pr1.setGoogle(nGoogleVal);
		pr1.setYahoo(nYahooVal);
		pr1.setTwitter(nTwitterVal);
		pr1.setLinkedin(nLinkedinVal);
		pr1.setPinterest(nPinVal);
		pr1.setInstagram(nInstaVal);
		pr1.setMsg(goodmsg);

		ap1 = new AdminProfilePOJO();
		ap1.setuName(unameVal);
		ap1.setEmail(nEmailVal);
		ap1.setfName(nFNameVal);
		ap1.setlName(nLNameVal);
		ap1.setdName(nDNameVal);
		ap1.setfBook(nFBookVal);
		ap1.setGoogle(nGoogleVal);
		ap1.setYahoo(nYahooVal);
		ap1.setTwitter(nTwitterVal);
		ap1.setLinkedin(nLinkedinVal);
		ap1.setPinterest(nPinVal);
		ap1.setInstagram(nInstaVal);
	}

	@When("^update profile$")
	public void update_profile() throws Throwable {

		new Sb4ProfilePage(driver).successfullUpdate(pr1).LogOut();
	}

	@Then("^updates to Profile Page persist upon return$")
	public void updates_to_Profile_Page_persist_upon_return() throws Throwable {

		pr2 = new Sb4LoginPage(driver).loginAs(unameVal, pwordVal)
				.GoToMyProfile().checkProfile();

		System.out.println(pr1.hashCode());
		System.out.println(pr2.hashCode());

		if (pr1.hashCode() != pr2.hashCode()) {
			throw new RuntimeException("FE Hash values didn't match");
		}
	}

	@Then("^email updated in enfold and sbv(\\d+) font and back end$")
	public void email_updated_in_enfold_and_sbv_font_and_back_end(int arg1)
			throws Throwable {

		ru.enfoldCheck(enfoldUrl, userUuid, "user.email", nEmailVal);

		ap2 = new Sb4ProfilePage(driver).LogOut()
				.loginAsAdmin(admUname, admPwrd).GoToUserPage()
				.Go2UserProf(unameVal).checkAdminUProfile();

		System.out.println(ap1.hashCode());
		System.out.println(ap2.hashCode());

		if (ap1.hashCode() != ap2.hashCode()) {
			throw new RuntimeException("BE Hash values didn't match");
		}

		new Sb4AdminUserProfPage(driver).adminLogOut()
				.loginAs(unameVal, pwordVal).GoToMyProfile()
				.successfullUpdate(pr0).GoHome().GoToMyProfile();

		pr3 = new Sb4ProfilePage(driver).checkProfile();

		System.out.println(pr0.hashCode());
		System.out.println(pr3.hashCode());

		if (pr0.hashCode() != pr3.hashCode()) {
			throw new RuntimeException("FE Hash values didn't match");
		}

		ru.enfoldCheck(enfoldUrl, userUuid, "user.email", email);

		ap3 = new Sb4ProfilePage(driver).LogOut()
				.loginAsAdmin(admUname, admPwrd).GoToUserPage()
				.Go2UserProf(unameVal).checkAdminUProfile();

		System.out.println(ap0.hashCode());
		System.out.println(ap3.hashCode());

		if (ap0.hashCode() != ap3.hashCode()) {
			throw new RuntimeException("BE Hash values didn't match");
		}
	}

	@Given("^invalid profile email$")
	public void invalid_profile_email() throws Throwable {
		pr1 = new ProfilePOJO();
		pr1.setuName(unameVal);
		pr1.setEmail(bEmailVal);
		pr1.setfName(nFNameVal);
		pr1.setlName(nLNameVal);
		pr1.setPhone(nPhoneVal);
		pr1.setdName(nDNameVal);
		pr1.setfBook(nFBookVal);
		pr1.setGoogle(nGoogleVal);
		pr1.setYahoo(nYahooVal);
		pr1.setTwitter(nTwitterVal);
		pr1.setLinkedin(nLinkedinVal);
		pr1.setPinterest(nPinVal);
		pr1.setInstagram(nInstaVal);
		pr1.setMsg(badmsg);
	}

	@When("^attempt to update profile$")
	public void attempt_to_update_profile() throws Throwable {
		new Sb4ProfilePage(driver).successfullUpdate(pr1);
	}

	@When("^cancel update$")
	public void cancel_update() throws Throwable {
		new Sb4ProfilePage(driver).cancelUpdate(pr1);
	}

	@Then("^user returned to dashboard page$")
	public void user_returned_to_dashboard_page() throws Throwable {
		new Sb4HomePage(driver).GoToMyProfile();
	}

	@Then("^updates do not persist for profile upon return to Profile page$")
	public void updates_do_not_persist_for_profile_upon_return_to_Profile_page()
			throws Throwable {
		String url = new Test_Enviornment().envUrl("");
		driver.get(url);
		new Sb4HomePage(driver).GoToMyProfile();
		pr3 = new Sb4ProfilePage(driver).checkProfile();

		System.out.println(pr0.hashCode());
		System.out.println(pr3.hashCode());

		if (pr0.hashCode() != pr3.hashCode()) {
			throw new RuntimeException("FE Hash values didn't match");
		}

		ru.enfoldCheck(enfoldUrl, userUuid, "user.email", email);

		ap3 = new Sb4ProfilePage(driver).LogOut()
				.loginAsAdmin(admUname, admPwrd).GoToUserPage()
				.Go2UserProf(unameVal).checkAdminUProfile();

		System.out.println(ap0.hashCode());
		System.out.println(ap3.hashCode());

		if (ap0.hashCode() != ap3.hashCode()) {
			throw new RuntimeException("BE Hash values didn't match");
		}
	}

}