package com.balfour.publishing.qa;

import org.openqa.selenium.WebDriver;

import com.balfour.publishing.Test_Enviornment;
import com.balfour.publishing.Test_EnviornmentPOJO;
import com.balfour.publishing.qa.pages.sb4.Sb4SchoolConfigPage;
import com.balfour.publishing.qa.pages.sb4.Sb4SchoolListPage;
import com.balfour.publishing.qa.pages.sb4.Sb4SchoolViewPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stubs_School_Config {

	WebDriver driver;

	Test_EnviornmentPOJO slugNAction = new Test_Enviornment().slugNAction();
	String config = slugNAction.getSchool_config();
	String list = slugNAction.getSchool_list();
	String url01 = new Test_Enviornment().envUrl(config);
	String url02 = new Test_Enviornment().envUrl(list);

	String unameVal = "adminuser001";
	String pwordVal = "password";
	String mSchoolN = "Pirate City Schools";
	String mBAdd1 = "323 Pirate Cove";
	String mCity = "Pirate City";
	String mState = "23";
	String mZip = "90210";
	String mRegion = "04 - Texas/Louisiana";
	String mSalesO = "Abby Jane Herberg";
	String mGrade1 = "5";
	String mGrade2 = "6";
	String mGrade3 = "7";
	String mGrade4 = "8";
	String mGrade5 = "9";
	String Country = "United States";
	String oCont00 = "Mike Cobb";
	String oCont01 = "Janey Garrison";
	String oSchoolN = "Sample High School";
	String oBAdd1 = "232 Pirate Cove";
	String oCity = "Nowhereville";
	String oState = "17";
	String oZip = "35594";
	String oRegion = "03 - South East";
	String oSalesO = "Jay Elmore";
	String oGrade1 = "Kindergarten";
	String oGrade2 = "1";
	String oGrade3 = "2";
	String oGrade4 = "3";
	String oGrade5 = "4";
	String schoolNum = "50061";
	String url = null;
	String url2 = null;
	SchoolViewPOJO sv0 = null;
	SchoolViewPOJO sv1 = null;
	SchoolListPOJO sl0 = new SchoolListPOJO();
	SchoolConfigPOJO sc0 = new SchoolConfigPOJO();
	SchoolConfigPOJO sc1 = new SchoolConfigPOJO();
	int modHash = -1260571265;
	int origHash = 1693516254;

	public Stubs_School_Config(SharedDriver driver) {
		this.driver = driver;

		sc0.setbAdd1(mBAdd1);
		sc0.setbAdd2("");
		sc0.setbCity(mCity);
		sc0.setbCountry(Country);
		sc0.setbState(mState);
		sc0.setbZip(mZip);
		sc0.setCont0(oCont01);
		sc0.setCont1(oCont00);
		sc0.setGrade01(mGrade1);
		sc0.setGrade02(mGrade2);
		sc0.setGrade03(mGrade3);
		sc0.setGrade04(mGrade4);
		sc0.setGrade05(mGrade5);
		sc0.setGrade06(oGrade1);
		sc0.setGrade07(oGrade2);
		sc0.setGrade08(oGrade3);
		sc0.setGrade09(oGrade4);
		sc0.setGrade10(oGrade5);
		sc0.setRegion(mRegion);
		sc0.setsOffice(mSalesO);
		sc0.setsName(mSchoolN);
		sc0.setsAB(true);

		sc1.setbAdd1(oBAdd1);
		sc1.setbAdd2("");
		sc1.setbCity(oCity);
		sc1.setbCountry(Country);
		sc1.setbState(oState);
		sc1.setbZip(oZip);
		sc1.setCont0(oCont00);
		sc1.setCont1(oCont01);
		sc1.setGrade01(oGrade1);
		sc1.setGrade02(oGrade2);
		sc1.setGrade03(oGrade3);
		sc1.setGrade04(oGrade4);
		sc1.setGrade05(oGrade5);
		sc1.setGrade06(mGrade1);
		sc1.setGrade07(mGrade2);
		sc1.setGrade08(mGrade3);
		sc1.setGrade09(mGrade4);
		sc1.setGrade10(mGrade5);
		sc1.setRegion(oRegion);
		sc1.setsOffice(oSalesO);
		sc1.setsName(oSchoolN);
		sc1.setsAB(true);

		sl0.setCity(oCity);
		sl0.setCountry(Country);
		sl0.setSalesO(oSalesO);
		sl0.setsName(oSchoolN);
		sl0.setsNum(schoolNum);
		sl0.setState("Kansas");
	}

	@Given("^School is found on School List page$")
	public void School_is_found_on_School_List_page() throws Throwable {

		driver.get(url02);
		new Sb4SchoolListPage(driver).goToConfigPage(sl0);
	}

	@When("^updates School Config Page$")
	public void updates_School_Config_Page() throws Throwable {

		new Sb4SchoolConfigPage(driver).successfulUpDate(sc0, false);
	}

	@Then("^School View Page displays correct info$")
	public void School_View_Page_displays_correct_info() throws Throwable {
		sv0 = new Sb4SchoolViewPage(driver).checkSchoolView(true);
//		if (sv0.hashCode() != modHash) {
//			throw new RuntimeException("Hash values didn't match");
//		}

		System.out.println(sv0.hashCode());
		
		driver.get(url01);

		new Sb4SchoolConfigPage(driver).successfulUpDate(sc1, false);
		sv1 = new Sb4SchoolViewPage(driver).checkSchoolView(true);
//		if (sv1.hashCode() != origHash) {
//			throw new RuntimeException("Hash values didn't match");
//		}
		System.out.println(sv1.hashCode());

	}
}