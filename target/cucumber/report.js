$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("fakeUser.feature");
formatter.feature({
  "line": 1,
  "name": "Log out of Studio Balfour v3",
  "description": "",
  "id": "log-out-of-studio-balfour-v3",
  "keyword": "Feature"
});
formatter.before({
  "duration": 20428326691,
  "status": "passed"
});
formatter.before({
  "duration": 120893859,
  "status": "passed"
});
formatter.scenario({
  "line": 109,
  "name": "Edit fake user First Name persist on PU grid",
  "description": "",
  "id": "log-out-of-studio-balfour-v3;edit-fake-user-first-name-persist-on-pu-grid",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 108,
      "name": "@regression"
    },
    {
      "line": 108,
      "name": "@fu"
    },
    {
      "line": 108,
      "name": "@pu"
    },
    {
      "line": 108,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 110,
  "name": "fake user created",
  "keyword": "Given "
});
formatter.step({
  "line": 111,
  "name": "logged into SB as an adviser",
  "keyword": "And "
});
formatter.step({
  "line": 112,
  "name": "on PU Grid",
  "keyword": "When "
});
formatter.step({
  "line": 113,
  "name": "edit user last name direclty on PU grid",
  "keyword": "And "
});
formatter.step({
  "line": 114,
  "name": "edits to user should persist on PU edit fake user screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Stubs_SB.fake_user_created()"
});
formatter.result({
  "duration": 31568030584,
  "error_message": "org.openqa.selenium.UnhandledAlertException: unexpected alert open\n  (Session info: chrome\u003d44.0.2403.125)\n  (Driver info: chromedriver\u003d2.15.322448 (52179c1b310fec1797c81ea9a20326839860b7d3),platform\u003dWindows NT 10.0 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 121 milliseconds: null\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027d-cmanning-mbp.local\u0027, ip: \u002710.33.10.117\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.10.5\u0027, java.version: \u00271.8.0_60\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, chrome\u003d{userDataDir\u003dC:\\Users\\ADMINI~1\\AppData\\Local\\Temp\\scoped_dir2860_22882}, takesHeapSnapshot\u003dtrue, hasMetadata\u003dtrue, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d44.0.2403.125, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, webdriver.remote.sessionid\u003d44980297f1884be6bb40b2b08a0e4da0, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, takesScreenshot\u003dtrue, browserName\u003dchrome, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 44980297f1884be6bb40b2b08a0e4da0\n*** Element info: {Using\u003dxpath, value\u003d//div[contains(text(), \u0027User Added\u0027)]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:162)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:449)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:357)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\n\tat sun.reflect.GeneratedMethodAccessor10.invoke(Unknown Source)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:497)\n\tat org.openqa.selenium.support.events.EventFiringWebDriver$2.invoke(EventFiringWebDriver.java:101)\n\tat com.sun.proxy.$Proxy16.findElement(Unknown Source)\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.findElement(EventFiringWebDriver.java:184)\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:730)\n\tat org.openqa.selenium.support.ui.ExpectedConditions.access$000(ExpectedConditions.java:39)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$3.apply(ExpectedConditions.java:106)\n\tat org.openqa.selenium.support.ui.ExpectedConditions$3.apply(ExpectedConditions.java:103)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:208)\n\tat com.balfour.publishing.qa.pages.Page.waitForElementPresence(Page.java:82)\n\tat com.balfour.publishing.qa.pages.sb4.Sb4ProjectUserPage.createFakeUser(Sb4ProjectUserPage.java:241)\n\tat com.balfour.publishing.qa.Stubs_SB.fake_user(Stubs_SB.java:338)\n\tat com.balfour.publishing.qa.Stubs_SB.fake_user_created(Stubs_SB.java:343)\n\tat ✽.Given fake user created(fakeUser.feature:110)\n",
  "status": "failed"
});
formatter.match({
  "location": "Stubs_SB.logged_into_SB_as_an_adviser()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stubs_SB.on_PU_Grid()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stubs_SB.edit_user_last_name_direclty_on_PU_grid()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stubs_SB.edits_to_user_should_persist_on_PU_edit_fake_user_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 17382,
  "status": "passed"
});
formatter.after({
  "duration": 188861435,
  "status": "passed"
});
formatter.before({
  "duration": 678641569,
  "error_message": "org.openqa.selenium.UnhandledAlertException: unexpected alert open\n  (Session info: chrome\u003d44.0.2403.125)\n  (Driver info: chromedriver\u003d2.15.322448 (52179c1b310fec1797c81ea9a20326839860b7d3),platform\u003dWindows NT 10.0 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 221 milliseconds: null\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027d-cmanning-mbp.local\u0027, ip: \u002710.33.10.117\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.10.5\u0027, java.version: \u00271.8.0_60\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, chrome\u003d{userDataDir\u003dC:\\Users\\ADMINI~1\\AppData\\Local\\Temp\\scoped_dir2860_22882}, takesHeapSnapshot\u003dtrue, hasMetadata\u003dtrue, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d44.0.2403.125, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, webdriver.remote.sessionid\u003d44980297f1884be6bb40b2b08a0e4da0, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, takesScreenshot\u003dtrue, browserName\u003dchrome, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 44980297f1884be6bb40b2b08a0e4da0\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:162)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\n\tat org.openqa.selenium.remote.RemoteWebDriver.get(RemoteWebDriver.java:304)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:497)\n\tat org.openqa.selenium.support.events.EventFiringWebDriver$2.invoke(EventFiringWebDriver.java:101)\n\tat com.sun.proxy.$Proxy16.get(Unknown Source)\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.get(EventFiringWebDriver.java:159)\n\tat com.balfour.publishing.qa.Stubs_Base.testSetup(Stubs_Base.java:37)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:497)\n\tat cucumber.runtime.Utils$1.call(Utils.java:44)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:12)\n\tat cucumber.runtime.Utils.invoke(Utils.java:40)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:59)\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:195)\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:183)\n\tat cucumber.runtime.Runtime.runBeforeHooks(Runtime.java:173)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:36)\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:83)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:77)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:82)\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:675)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)\n",
  "status": "failed"
});
formatter.before({
  "duration": 64261527,
  "error_message": "org.openqa.selenium.UnhandledAlertException: unexpected alert open\n  (Session info: chrome\u003d44.0.2403.125)\n  (Driver info: chromedriver\u003d2.15.322448 (52179c1b310fec1797c81ea9a20326839860b7d3),platform\u003dWindows NT 10.0 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 64 milliseconds: null\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027d-cmanning-mbp.local\u0027, ip: \u002710.33.10.117\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.10.5\u0027, java.version: \u00271.8.0_60\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, chrome\u003d{userDataDir\u003dC:\\Users\\ADMINI~1\\AppData\\Local\\Temp\\scoped_dir2860_22882}, takesHeapSnapshot\u003dtrue, hasMetadata\u003dtrue, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d44.0.2403.125, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, webdriver.remote.sessionid\u003d44980297f1884be6bb40b2b08a0e4da0, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, takesScreenshot\u003dtrue, browserName\u003dchrome, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 44980297f1884be6bb40b2b08a0e4da0\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:162)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:622)\n\tat org.openqa.selenium.remote.RemoteWebDriver$RemoteWebDriverOptions.deleteAllCookies(RemoteWebDriver.java:693)\n\tat org.openqa.selenium.support.events.EventFiringWebDriver$EventFiringOptions.deleteAllCookies(EventFiringWebDriver.java:515)\n\tat com.balfour.publishing.qa.SharedDriver.deleteAllCookies(SharedDriver.java:88)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:497)\n\tat cucumber.runtime.Utils$1.call(Utils.java:44)\n\tat cucumber.runtime.Timeout.timeout(Timeout.java:12)\n\tat cucumber.runtime.Utils.invoke(Utils.java:40)\n\tat cucumber.runtime.java.JavaHookDefinition.execute(JavaHookDefinition.java:59)\n\tat cucumber.runtime.Runtime.runHookIfTagsMatch(Runtime.java:195)\n\tat cucumber.runtime.Runtime.runHooks(Runtime.java:183)\n\tat cucumber.runtime.Runtime.runBeforeHooks(Runtime.java:173)\n\tat cucumber.runtime.model.CucumberScenario.run(CucumberScenario.java:36)\n\tat cucumber.runtime.junit.ExecutionUnitRunner.run(ExecutionUnitRunner.java:83)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:63)\n\tat cucumber.runtime.junit.FeatureRunner.runChild(FeatureRunner.java:18)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\n\tat cucumber.runtime.junit.FeatureRunner.run(FeatureRunner.java:70)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:77)\n\tat cucumber.api.junit.Cucumber.runChild(Cucumber.java:37)\n\tat org.junit.runners.ParentRunner$3.run(ParentRunner.java:238)\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:63)\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:236)\n\tat org.junit.runners.ParentRunner.access$000(ParentRunner.java:53)\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:229)\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:309)\n\tat cucumber.api.junit.Cucumber.run(Cucumber.java:82)\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:86)\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:38)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:459)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:675)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:382)\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:192)\n",
  "status": "failed"
});
formatter.scenario({
  "line": 117,
  "name": "Edit fake user First Name persist on PU grid",
  "description": "",
  "id": "log-out-of-studio-balfour-v3;edit-fake-user-first-name-persist-on-pu-grid",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 116,
      "name": "@regression"
    },
    {
      "line": 116,
      "name": "@fu"
    },
    {
      "line": 116,
      "name": "@pu"
    },
    {
      "line": 116,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 118,
  "name": "fake user created",
  "keyword": "Given "
});
formatter.step({
  "line": 119,
  "name": "logged into SB as an adviser",
  "keyword": "And "
});
formatter.step({
  "line": 120,
  "name": "on PU Grid",
  "keyword": "When "
});
formatter.step({
  "line": 121,
  "name": "edit user role direclty on PU grid",
  "keyword": "And "
});
formatter.step({
  "line": 122,
  "name": "edits to user should persist on PU edit fake user screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Stubs_SB.fake_user_created()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stubs_SB.logged_into_SB_as_an_adviser()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stubs_SB.on_PU_Grid()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stubs_SB.edit_user_role_direclty_on_PU_grid()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "Stubs_SB.edits_to_user_should_persist_on_PU_edit_fake_user_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 253823,
  "status": "passed"
});
formatter.after({
  "duration": 150703077,
  "status": "passed"
});
});