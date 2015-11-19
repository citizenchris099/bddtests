import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.scienergy.development.Test_Environment;
import com.scienergy.development.qa.SharedDriver;
import com.scienergy.development.qa.annotations.AfterSuite;
import com.scienergy.development.qa.annotations.BeforeSuite;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@Cucumber.Options(monochrome = true, features = { "src/main/resources" }, tags = { "@login" }, format = {
		"pretty", "html:target/cucumber", "json:target/cucumber.json" }
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
