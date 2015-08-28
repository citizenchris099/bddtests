package com.balfour.publishing.qa;

import org.openqa.selenium.WebDriver;

import com.balfour.publishing.qa.pages.sb4.Sb4LoginPage;
import com.balfour.publishing.qa.pages.sb4.Sb4PwrdUpdatePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stubs_PwordEmail {

	WebDriver driver;

	Sb4LoginPage sb4login;
	String emailVal = "veggie_smurf@smurf.com";
	String badEmailVal = "madeup@mail.com";
	String ip = "10.90.31.223";
	String authusr = "ec2-user";
	String cmd = "rm /var/www/html/wp-content/plugins/b4helper/logs/email.log";
	String cmd1 = "ls /var/www/html/wp-content/plugins/b4helper/logs/email.log";
	String msg1 = "Password Reset Sent";
	String msg2 = "Email Not Found";
	String msg3 = "Password Updated";
	String msg4 = "has been updated";
	String unameVal = "veggie_smurf";
	String pwordVal = "meatisevil";
	String newPword = "password";

	String stmt = "select meta_value from four_rftb.four_usermeta where meta_key = 'b4enfold_password_reset_key' and user_id = ?";
	String url = "jdbc:mysql://10.90.31.223:3306/four_rftb";
	String userName = "wordpress_usr";
	String password = "Bal4Pass";
	String val2 = "meta_value";
	String user_id = "4";
	LogInPOJO lc0;
	PwrdUpdatePOJO pu0;
	ProfilePOJO pc0;

	public Stubs_PwordEmail(SharedDriver driver) {
		this.driver = driver;
		lc0 = new LogInPOJO();
		lc0.setUserId(user_id);
		lc0.setDb_url(url);
		lc0.setStatement(stmt);
		lc0.setDb_username(userName);
		lc0.setDb_pword(password);
		lc0.setDb_reg_key(val2);

		pu0 = new PwrdUpdatePOJO();
		pu0.setPword(newPword);
		pu0.setMsg(msg3);

		pc0 = new ProfilePOJO();
		pc0.setPword(pwordVal);
		pc0.setMsg(msg4);
	}

	@Then("^go to password request page$")
	public void go_to_password_request_page() throws Throwable {
		new Sb4LoginPage(driver).go2ResetPword();
	}

	@Given("^valid email$")
	public void valid_email() throws Throwable {
		new Sb4LoginPage(driver).delEmailLogFile(ip, authusr, cmd).setEmail(
				emailVal);
	}

	@When("^request password reset email$")
	public void request_password_reset_email() throws Throwable {
		new Sb4LoginPage(driver).requestPwordEmail(msg1);
	}

	@Then("^receive password rest email$")
	public void receive_password_rest_email() throws Throwable {

		new Sb4LoginPage(driver).chkEmailLogFile(ip, authusr, cmd1)
				.delEmailLogFile(ip, authusr, cmd);
	}

	@Given("^Bad email$")
	public void Bad_email() throws Throwable {
		new Sb4LoginPage(driver).delEmailLogFile(ip, authusr, cmd1).setEmail(
				badEmailVal);
	}

	@When("^request password reset with bademail$")
	public void request_password_reset_with_bademail() throws Throwable {
		new Sb4LoginPage(driver).requestPwordEmail(msg2);
	}

	@Then("^email not sent$")
	public void email_not_sent() throws Throwable {
		new Sb4LoginPage(driver).delEmailLogFile(ip, authusr, cmd1);
	}

	@Given("^Received Password Reset Email$")
	public void Received_Password_Reset_Email() throws Throwable {

		

		new Sb4LoginPage(driver).delEmailLogFile(ip, authusr, cmd)
				.setEmail(emailVal).requestPwordEmail(msg1).GetPwrdKey(lc0);
		 
		 
	}

	@When("^enter new password$")
	public void enter_new_password() throws Throwable {
		new Sb4PwrdUpdatePage(driver).updatePword(pu0);
	}

	@Then("^password updated$")
	public void password_updated() throws Throwable {
		new Sb4LoginPage(driver).loginAs(unameVal, newPword).GoToMyProfile()
				.updatePword(pc0).LogOut().loginAs(unameVal, pwordVal);
	}

}