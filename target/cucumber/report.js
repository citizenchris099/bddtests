$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ProjUser.feature");
formatter.feature({
  "line": 1,
  "name": "Studio Balfour User Admin Screen",
  "description": "",
  "id": "studio-balfour-user-admin-screen",
  "keyword": "Feature"
});
formatter.before({
  "duration": 30222458167,
  "status": "passed"
});
formatter.before({
  "duration": 124325444,
  "status": "passed"
});
formatter.scenario({
  "line": 114,
  "name": "PU Edit persist on PU grid",
  "description": "",
  "id": "studio-balfour-user-admin-screen;pu-edit-persist-on-pu-grid",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 113,
      "name": "@pu"
    },
    {
      "line": 113,
      "name": "@regression"
    },
    {
      "line": 113,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 115,
  "name": "registered PU user",
  "keyword": "Given "
});
formatter.step({
  "line": 116,
  "name": "logged into SB as an adviser",
  "keyword": "And "
});
formatter.step({
  "line": 117,
  "name": "on PU Grid",
  "keyword": "When "
});
formatter.step({
  "line": 118,
  "name": "edit user info on PU edit user screen",
  "keyword": "And "
});
formatter.step({
  "line": 119,
  "name": "edits to user should persist on PU grid",
  "keyword": "Then "
});
formatter.match({
  "location": "Stubs_SB.registered_PU_user()"
});
formatter.result({
  "duration": 81737434927,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_SB.logged_into_SB_as_an_adviser()"
});
formatter.result({
  "duration": 13138042555,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_SB.on_PU_Grid()"
});
formatter.result({
  "duration": 3391616365,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_SB.edit_user_info_on_PU_edit_user_screen()"
});
formatter.result({
  "duration": 21205434570,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: keys should be a string\n  (Session info: chrome\u003d45.0.2454.85)\n  (Driver info: chromedriver\u003d2.15.322448 (52179c1b310fec1797c81ea9a20326839860b7d3),platform\u003dWindows NT 10.0 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 534 milliseconds\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027d-cmanning-mbp.local\u0027, ip: \u002710.33.10.117\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.10.5\u0027, java.version: \u00271.8.0_60\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, chrome\u003d{userDataDir\u003dC:\\Users\\ADMINI~1\\AppData\\Local\\Temp\\scoped_dir2908_4615}, takesHeapSnapshot\u003dtrue, hasMetadata\u003dtrue, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d45.0.2454.85, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, webdriver.remote.sessionid\u003d2f8bde6dd188480ea8974cb17e8a2fa7, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, takesScreenshot\u003dtrue, browserName\u003dchrome, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 2f8bde6dd188480ea8974cb17e8a2fa7\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:268)\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:89)\n\tat sun.reflect.GeneratedMethodAccessor11.invoke(Unknown Source)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:497)\n\tat org.openqa.selenium.support.events.EventFiringWebDriver$EventFiringWebElement$1.invoke(EventFiringWebDriver.java:331)\n\tat com.sun.proxy.$Proxy19.sendKeys(Unknown Source)\n\tat org.openqa.selenium.support.events.EventFiringWebDriver$EventFiringWebElement.sendKeys(EventFiringWebDriver.java:354)\n\tat com.balfour.publishing.qa.pages.sb4.Sb4EditUserPage.setPhone(Sb4EditUserPage.java:168)\n\tat com.balfour.publishing.qa.pages.sb4.Sb4EditUserPage.updateUser(Sb4EditUserPage.java:312)\n\tat com.balfour.publishing.qa.pages.sb4.Sb4EditUserPage.successfullUpdate(Sb4EditUserPage.java:330)\n\tat com.balfour.publishing.qa.Stubs_SB.edit_user_info_on_PU_edit_user_screen(Stubs_SB.java:475)\n\tat ✽.And edit user info on PU edit user screen(ProjUser.feature:118)\n",
  "status": "failed"
});
formatter.match({
  "location": "Stubs_SB.edits_to_user_should_persist_on_PU_grid()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 20095,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 486531180,
  "status": "passed"
});
formatter.before({
  "duration": 2547095670,
  "status": "passed"
});
formatter.before({
  "duration": 305744488,
  "status": "passed"
});
formatter.scenario({
  "line": 122,
  "name": "PU Edit persist on user profile",
  "description": "",
  "id": "studio-balfour-user-admin-screen;pu-edit-persist-on-user-profile",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 121,
      "name": "@pu"
    },
    {
      "line": 121,
      "name": "@regression"
    },
    {
      "line": 121,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 123,
  "name": "registered PU user",
  "keyword": "Given "
});
formatter.step({
  "line": 124,
  "name": "logged into SB as an adviser",
  "keyword": "And "
});
formatter.step({
  "line": 125,
  "name": "on PU Grid",
  "keyword": "When "
});
formatter.step({
  "line": 126,
  "name": "edit user info on PU edit user screen",
  "keyword": "And "
});
formatter.step({
  "line": 127,
  "name": "edits to user should persist on user profile",
  "keyword": "Then "
});
formatter.match({
  "location": "Stubs_SB.registered_PU_user()"
});
formatter.result({
  "duration": 76222303011,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_SB.logged_into_SB_as_an_adviser()"
});
formatter.result({
  "duration": 12905387488,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_SB.on_PU_Grid()"
});
formatter.result({
  "duration": 3764300137,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_SB.edit_user_info_on_PU_edit_user_screen()"
});
formatter.result({
  "duration": 21906363178,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: keys should be a string\n  (Session info: chrome\u003d45.0.2454.85)\n  (Driver info: chromedriver\u003d2.15.322448 (52179c1b310fec1797c81ea9a20326839860b7d3),platform\u003dWindows NT 10.0 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 282 milliseconds\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027d-cmanning-mbp.local\u0027, ip: \u002710.33.10.117\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.10.5\u0027, java.version: \u00271.8.0_60\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, chrome\u003d{userDataDir\u003dC:\\Users\\ADMINI~1\\AppData\\Local\\Temp\\scoped_dir2908_4615}, takesHeapSnapshot\u003dtrue, hasMetadata\u003dtrue, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d45.0.2454.85, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, webdriver.remote.sessionid\u003d2f8bde6dd188480ea8974cb17e8a2fa7, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, takesScreenshot\u003dtrue, browserName\u003dchrome, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 2f8bde6dd188480ea8974cb17e8a2fa7\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:268)\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:89)\n\tat sun.reflect.GeneratedMethodAccessor11.invoke(Unknown Source)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:497)\n\tat org.openqa.selenium.support.events.EventFiringWebDriver$EventFiringWebElement$1.invoke(EventFiringWebDriver.java:331)\n\tat com.sun.proxy.$Proxy19.sendKeys(Unknown Source)\n\tat org.openqa.selenium.support.events.EventFiringWebDriver$EventFiringWebElement.sendKeys(EventFiringWebDriver.java:354)\n\tat com.balfour.publishing.qa.pages.sb4.Sb4EditUserPage.setPhone(Sb4EditUserPage.java:168)\n\tat com.balfour.publishing.qa.pages.sb4.Sb4EditUserPage.updateUser(Sb4EditUserPage.java:312)\n\tat com.balfour.publishing.qa.pages.sb4.Sb4EditUserPage.successfullUpdate(Sb4EditUserPage.java:330)\n\tat com.balfour.publishing.qa.Stubs_SB.edit_user_info_on_PU_edit_user_screen(Stubs_SB.java:475)\n\tat ✽.And edit user info on PU edit user screen(ProjUser.feature:126)\n",
  "status": "failed"
});
formatter.match({
  "location": "Stubs_SB.edits_to_user_should_persist_on_user_profile()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 16938,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 566269047,
  "status": "passed"
});
formatter.before({
  "duration": 2474054638,
  "status": "passed"
});
formatter.before({
  "duration": 140239546,
  "status": "passed"
});
formatter.scenario({
  "line": 130,
  "name": "PU Edit persist on PU edit user screen",
  "description": "",
  "id": "studio-balfour-user-admin-screen;pu-edit-persist-on-pu-edit-user-screen",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 129,
      "name": "@pu"
    },
    {
      "line": 129,
      "name": "@regression"
    },
    {
      "line": 129,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 131,
  "name": "registered PU user",
  "keyword": "Given "
});
formatter.step({
  "line": 132,
  "name": "logged into SB as an adviser",
  "keyword": "And "
});
formatter.step({
  "line": 133,
  "name": "on PU Grid",
  "keyword": "When "
});
formatter.step({
  "line": 134,
  "name": "edit user info on PU edit user screen",
  "keyword": "And "
});
formatter.step({
  "line": 135,
  "name": "edits to user should persist on PU edit user screen",
  "keyword": "Then "
});
formatter.match({
  "location": "Stubs_SB.registered_PU_user()"
});
formatter.result({
  "duration": 75133912732,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_SB.logged_into_SB_as_an_adviser()"
});
formatter.result({
  "duration": 13400707142,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_SB.on_PU_Grid()"
});
formatter.result({
  "duration": 3878040576,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_SB.edit_user_info_on_PU_edit_user_screen()"
});
formatter.result({
  "duration": 21064111202,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: keys should be a string\n  (Session info: chrome\u003d45.0.2454.85)\n  (Driver info: chromedriver\u003d2.15.322448 (52179c1b310fec1797c81ea9a20326839860b7d3),platform\u003dWindows NT 10.0 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 361 milliseconds\nBuild info: version: \u00272.45.0\u0027, revision: \u00275017cb8e7ca8e37638dc3091b2440b90a1d8686f\u0027, time: \u00272015-02-27 09:10:26\u0027\nSystem info: host: \u0027d-cmanning-mbp.local\u0027, ip: \u002710.33.10.117\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.10.5\u0027, java.version: \u00271.8.0_60\u0027\nDriver info: org.openqa.selenium.remote.RemoteWebDriver\nCapabilities [{applicationCacheEnabled\u003dfalse, rotatable\u003dfalse, mobileEmulationEnabled\u003dfalse, chrome\u003d{userDataDir\u003dC:\\Users\\ADMINI~1\\AppData\\Local\\Temp\\scoped_dir2908_4615}, takesHeapSnapshot\u003dtrue, hasMetadata\u003dtrue, databaseEnabled\u003dfalse, handlesAlerts\u003dtrue, version\u003d45.0.2454.85, platform\u003dXP, browserConnectionEnabled\u003dfalse, nativeEvents\u003dtrue, acceptSslCerts\u003dtrue, webdriver.remote.sessionid\u003d2f8bde6dd188480ea8974cb17e8a2fa7, locationContextEnabled\u003dtrue, webStorageEnabled\u003dtrue, takesScreenshot\u003dtrue, browserName\u003dchrome, javascriptEnabled\u003dtrue, cssSelectorsEnabled\u003dtrue}]\nSession ID: 2f8bde6dd188480ea8974cb17e8a2fa7\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:422)\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:204)\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:156)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:599)\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:268)\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:89)\n\tat sun.reflect.GeneratedMethodAccessor11.invoke(Unknown Source)\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\n\tat java.lang.reflect.Method.invoke(Method.java:497)\n\tat org.openqa.selenium.support.events.EventFiringWebDriver$EventFiringWebElement$1.invoke(EventFiringWebDriver.java:331)\n\tat com.sun.proxy.$Proxy19.sendKeys(Unknown Source)\n\tat org.openqa.selenium.support.events.EventFiringWebDriver$EventFiringWebElement.sendKeys(EventFiringWebDriver.java:354)\n\tat com.balfour.publishing.qa.pages.sb4.Sb4EditUserPage.setPhone(Sb4EditUserPage.java:168)\n\tat com.balfour.publishing.qa.pages.sb4.Sb4EditUserPage.updateUser(Sb4EditUserPage.java:312)\n\tat com.balfour.publishing.qa.pages.sb4.Sb4EditUserPage.successfullUpdate(Sb4EditUserPage.java:330)\n\tat com.balfour.publishing.qa.Stubs_SB.edit_user_info_on_PU_edit_user_screen(Stubs_SB.java:475)\n\tat ✽.And edit user info on PU edit user screen(ProjUser.feature:134)\n",
  "status": "failed"
});
formatter.match({
  "location": "Stubs_SB.edits_to_user_should_persist_on_PU_edit_user_screen()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 21635,
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 429898683,
  "status": "passed"
});
});