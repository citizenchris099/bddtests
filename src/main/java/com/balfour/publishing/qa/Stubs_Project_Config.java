package com.balfour.publishing.qa;

import org.openqa.selenium.WebDriver;

import com.balfour.publishing.Test_Enviornment;
import com.balfour.publishing.Test_EnviornmentPOJO;
import com.balfour.publishing.qa.pages.sb4.Sb4ProjectConfigPage;
import com.balfour.publishing.qa.pages.sb4.Sb4ProjectListPage;
import com.balfour.publishing.qa.pages.sb4.Sb4ProjectViewPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stubs_Project_Config {

	WebDriver driver;
	ProjectListPOJO pl0 = null;
	ProjConfigPOJO pc0 = null;
	ProjConfigPOJO pc1 = null;
	ProjectViewPOJO pv0 = null;
	ProjectViewPOJO pv1 = null;
	ProjectViewPOJO pv2 = null;
	ProjectViewPOJO pv3 = null;

	String projectNum = "509660";

	String oPName = "2015 Winfield City Schools";
	String oStatus = "Active";
	String oEnrollment = "8000";
	String oDSeason = "Summer";
	String oAdv = "Dawn Guin";
	String oRep = "Jay Elmore";
	String oAe = "Tracy Noren";
	String mYear = "2015";
	String mPName = "2015 Pirate City School";
	String mStatus = "Free";
	String mEnrollment = "9000";
	String mDSeason = "Fall";
	String mAdv = "Ana Rookstool";
	String mRep = "Amanda Reynolds";
	String mAe = "Alissa Konecny";
	String unameVal = "adminuser001";
	String pwordVal = "password";
	Boolean homeroom = true;
	Boolean teacher = false;
	String url = null;
	String url2 = null;
	Test_EnviornmentPOJO slugNAction = null;
	int oHash = 2076320910;
	int mHash = -451412961;

	public Stubs_Project_Config(SharedDriver driver) {
		this.driver = driver;

		pl0 = new ProjectListPOJO();
		pl0.setpNumber(projectNum);
		pl0.setpAdv(oAdv);
		pl0.setpAe(oAe);
		pl0.setpName(oPName);
		pl0.setpSR(oRep);
		pl0.setpStatus(oStatus);
		pl0.setpYear(mYear);

		pc0 = new ProjConfigPOJO();
		pc1 = new ProjConfigPOJO();
		pc0.setYear(mYear);
		pc0.setProjName(mPName);
		pc0.setStatus(mStatus);
		pc0.setEnrollment(mEnrollment);
		pc0.setdSeason(mDSeason);
		pc0.setAdviser(mAdv);
		pc0.setAe(mAe);
		pc0.setRep(mRep);
		pc0.setTeacher(teacher);
		pc0.setHomeroom(homeroom);
		pc1.setYear(mYear);
		pc1.setProjName(oPName);
		pc1.setStatus(oStatus);
		pc1.setEnrollment(oEnrollment);
		pc1.setdSeason(oDSeason);
		pc1.setAdviser(oAdv);
		pc1.setAe(oAe);
		pc1.setRep(oRep);
		pc1.setTeacher(teacher);
		pc1.setHomeroom(homeroom);

		slugNAction = new Test_Enviornment().slugNAction();

		String pConfig = slugNAction.getProject_config();
		url = new Test_Enviornment().envUrl(pConfig);

		String pList = slugNAction.getProject_list();
		url2 = new Test_Enviornment().envUrl(pList);
	}

	@Given("^Project is found on Project List page$")
	public void Project_is_found_on_Project_List_page() throws Throwable {

		driver.get(url2);
		new Sb4ProjectListPage(driver).goToConfigPage(pl0);

	}

	@When("^updates Project Config Page$")
	public void updates_Project_Config_Page() throws Throwable {
		new Sb4ProjectConfigPage(driver).successfulUpDate(pc0);
	}

	@Then("^Project View Page displays correct info$")
	public void Project_View_Page_displays_correct_info() throws Throwable {

		pv2 = new Sb4ProjectViewPage(driver).checkProjView(false);

		System.out.println("actual mod hash = " + pv2.hashCode());

		if (pv2.hashCode() != mHash) {
			throw new RuntimeException("Mod Hash values didn't match");
		}

		driver.get(url);
		new Sb4ProjectConfigPage(driver).successfulUpDate(pc1);
		pv3 = new Sb4ProjectViewPage(driver).checkProjView(false);

		System.out.println("actual o hash = " + pv3.hashCode());

		if (pv3.hashCode() != oHash) {
			throw new RuntimeException("O Hash values didn't match");
		}
	}

}