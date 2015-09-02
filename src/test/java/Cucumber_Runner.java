import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.balfour.publishing.Test_Enviornment;
import com.balfour.publishing.qa.SharedDriver;
import com.balfour.publishing.qa.annotations.AfterSuite;
import com.balfour.publishing.qa.annotations.BeforeSuite;

import cucumber.api.junit.Cucumber;

//@RunWith(Cucumber.class)

@Cucumber.Options(monochrome = true, features = { "classpath:supplyDesk.feature", "classpath:logout.feature",
		"classpath:failedLogIn.feature", "classpath:loginas.feature", "classpath:profileForm.feature",
		"classpath:pwordEmailReq.feature", "classpath:onCampusOrders.feature", "classpath:userAdmin.feature",
		"classpath:projectSwitch.feature", "classpath:schoolConfig.feature", "classpath:projectConfig.feature",
		"classpath:pageLoad.feature", "classpath:pwordChange.feature", "classpath:siteSearch.feature",
		"classpath:projectUser.feature", "classpath:userReg.feature",
		"classpath:test.feature" }, glue = { "classpath:com.balfour.publishing.qa" },
		// tags = {"@smoke,@regression"},
		// tags = { "@smoke" },
tags = { "@lo" }, format = { "pretty", "html:target/cucumber" }

)

@RunWith(ExtendedCucumberRunner.class)
public class Cucumber_Runner {
	
	WebDriver driver;
	
	public Cucumber_Runner(SharedDriver driver) {
		this.driver = driver;
		System.out.println(driver);
	}

	@BeforeSuite
	public static void suiteSetUp() {

		System.out.println("booya");
	}

	@AfterSuite
	public static void suiteTearDown() {

		System.out.println("sucka");
	}

}
