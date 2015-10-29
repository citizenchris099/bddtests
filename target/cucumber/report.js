$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ProjUser.feature");
formatter.feature({
  "line": 1,
  "name": "Studio Balfour User Admin Screen",
  "description": "",
  "id": "studio-balfour-user-admin-screen",
  "keyword": "Feature"
});
formatter.before({
  "duration": 10038765154,
  "status": "passed"
});
formatter.before({
  "duration": 79226084,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "PU Register User completes profile",
  "description": "",
  "id": "studio-balfour-user-admin-screen;pu-register-user-completes-profile",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@pu"
    },
    {
      "line": 3,
      "name": "@regression"
    },
    {
      "line": 3,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "logged into SB as an adviser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "on PU Grid",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "create PU user register",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user can register to SB",
  "keyword": "Then "
});
formatter.match({
  "location": "Stubs_SB.logged_into_SB_as_an_adviser()"
});
formatter.result({
  "duration": 31753132724,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_SB.on_PU_Grid()"
});
formatter.result({
  "duration": 2931808870,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_SB.create_PU_user_register()"
});
formatter.result({
  "duration": 20075637304,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_SB.user_can_register_to_SB()"
});
formatter.result({
  "duration": 13922250233,
  "status": "passed"
});
formatter.after({
  "duration": 26718,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 440647579,
  "status": "passed"
});
formatter.before({
  "duration": 1920110955,
  "status": "passed"
});
formatter.before({
  "duration": 96620740,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "PU Register User can log in",
  "description": "",
  "id": "studio-balfour-user-admin-screen;pu-register-user-can-log-in",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@pu"
    },
    {
      "line": 10,
      "name": "@regression"
    },
    {
      "line": 10,
      "name": "@user"
    },
    {
      "line": 10,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "logged into SB as an adviser",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "on PU Grid",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "create PU user register",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "user can register to SB",
  "keyword": "Then "
});
formatter.step({
  "line": 16,
  "name": "user can log into SB",
  "keyword": "And "
});
formatter.match({
  "location": "Stubs_SB.logged_into_SB_as_an_adviser()"
});
formatter.result({
  "duration": 30678111517,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_SB.on_PU_Grid()"
});
formatter.result({
  "duration": 2661509193,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_SB.create_PU_user_register()"
});
formatter.result({
  "duration": 18094933997,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_SB.user_can_register_to_SB()"
});
formatter.result({
  "duration": 12494275309,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_SB.user_can_log_into_SB()"
});
formatter.result({
  "duration": 48842679256,
  "error_message": "org.openqa.selenium.TimeoutException: Timed out after 15 seconds waiting for presence of element located by: By.xpath: //a[.\u003d\u0027Book Status\u0027]\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027d-cmanning-mbp.local\u0027, ip: \u002710.33.8.173\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.10.5\u0027, java.version: \u00271.8.0_60\u0027\nDriver info: com.balfour.publishing.qa.SharedDriver\n\tat org.openqa.selenium.support.ui.WebDriverWait.timeoutException(WebDriverWait.java:79)\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:228)\n\tat com.balfour.publishing.qa.pages.Page.waitForElementPresence(Page.java:86)\n\tat com.balfour.publishing.qa.pages.Page.isLoaded(Page.java:133)\n\tat com.balfour.publishing.qa.pages.sb4.Sb4HomePage.\u003cinit\u003e(Sb4HomePage.java:45)\n\tat com.balfour.publishing.qa.pages.sb4.Sb4LoginPage.loginAs(Sb4LoginPage.java:198)\n\tat com.balfour.publishing.qa.Stubs_Base.verifyTestUser(Stubs_Base.java:184)\n\tat com.balfour.publishing.qa.Stubs_SB.user_can_log_into_SB(Stubs_SB.java:385)\n\tat ✽.And user can log into SB(ProjUser.feature:16)\nCaused by: org.openqa.selenium.NoSuchElementException: no such element\n  (Session info: chrome\u003d45.0.2454.93)\n  (Driver info: chromedriver\u003d2.15.322448 (52179c1b310fec1797c81ea9a20326839860b7d3),platform\u003dWindows NT 10.0 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 10.15 seconds\nFor documentation on this error, please visit: http://seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027d-cmanning-mbp.local\u0027, ip: \u002710.33.8.173\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.10.5\u0027, java.version: \u00271.8.0_60\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, chrome\u003d{userDataDir\u003dC:\\Users\\ADMINI~1\\AppData\\Local\\Temp\\scoped_dir2848_20965}, takesHeapSnapshot\u003dtrue, hasMetadata\u003dtrue, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d45.0.2454.93, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, webdriver.remote.sessionid\u003d0f532ef099b649b280dc2bda4e15d49c, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, takesScreenshot\u003dtrue, browserName\u003dchrome, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 0f532ef099b649b280dc2bda4e15d49c\n*** Element info: {Using\u003dxpath, value\u003d//a[.\u003d\u0027Book Status\u0027]}\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:352)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:449)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:357)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:344)\n\tat sun.reflect.GeneratedMethodAccessor12.invoke(Unknown Source)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:497)\n\tat org.openqa.selenium.support.events.EventFiringWebDriver$2.invoke(EventFiringWebDriver.java:101)\n\tat com.sun.proxy.$Proxy16.findElement(Unknown Source)\n\tat org.openqa.selenium.support.events.EventFiringWebDriver.findElement(EventFiringWebDriver.java:184)\n\tat org.openqa.selenium.support.ui.ExpectedConditions.findElement(ExpectedConditions.java:730)\n\tat org.openqa