import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(monochrome = true, features = {
		"classpath:supplyDesk.feature", "classpath:logout.feature",
		"classpath:failedLogIn.feature", "classpath:loginas.feature",
		"classpath:profileForm.feature", "classpath:pwordEmailReq.feature",
		"classpath:onCampusOrders.feature", "classpath:userAdmin.feature",
		"classpath:projectSwitch.feature", "classpath:schoolConfig.feature",
		"classpath:projectConfig.feature", "classpath:pageLoad.feature",
		"classpath:pwordChange.feature", "classpath:siteSearch.feature",
		"classpath:projectUser.feature", "classpath:userReg.feature" }, glue = { "classpath:com.balfour.publishing.qa" },
// tags = {"@smoke,@regression"},
// tags = { "@smoke" },
tags = { "@ua" }, format = { "pretty", "html:target/cucumber" }

)
public class Cucumber_Runner {

}
