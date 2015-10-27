import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.balfour.publishing.Test_Enviornment;
import com.balfour.publishing.qa.SharedDriver;
import com.balfour.publishing.qa.annotations.AfterSuite;
import com.balfour.publishing.qa.annotations.BeforeSuite;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@Cucumber.Options(monochrome = true, features = { "classpath:fakeUser.feature", "classpath:UserAdmin.feature",
		"classpath:ProjUser.feature",
		"classpath:OCO.feature" }, glue = { "classpath:com.balfour.publishing.qa" }, tags = { "@test" }, format = {
				"pretty", "html:target/cucumber" }

)

// @RunWith(ExtendedCucumberRunner.class)
public class Cucumber_Runner {

	// WebDriver driver;
	//
	// public Cucumber_Runner(SharedDriver driver) {
	// this.driver = driver;
	// System.out.println(driver);
	// }
	//
	// @BeforeSuite
	// public static void suiteSetUp() {
	//
	// // System.out.println("booya");
	// }
	//
	// @AfterSuite
	// public static void suiteTearDown() {
	//
	// // System.out.println("sucka");
	// }

}
