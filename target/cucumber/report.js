$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Log In to Spec",
  "description": "",
  "id": "log-in-to-spec",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4773811077,
  "status": "passed"
});
formatter.before({
  "duration": 4206917939,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "successful log in",
  "description": "",
  "id": "log-in-to-spec;successful-log-in",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@regression"
    },
    {
      "line": 3,
      "name": "@login"
    },
    {
      "line": 3,
      "name": "@smoke"
    },
    {
      "line": 3,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "enter valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "arrive at main spec page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "log out of spec",
  "keyword": "And "
});
formatter.match({
  "location": "Stubs_Spec.on_login_page()"
});
formatter.result({
  "duration": 505336313,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.enter_valid_credentials()"
});
formatter.result({
  "duration": 2412103487,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.arrive_at_main_spec_page()"
});
formatter.result({
  "duration": 202647344,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.log_out_of_spec()"
});
formatter.result({
  "duration": 2307548405,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 338370058,
  "status": "passed"
});
formatter.after({
  "duration": 21463,
  "status": "passed"
});
formatter.before({
  "duration": 78548060,
  "status": "passed"
});
formatter.before({
  "duration": 1991643363,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "invalid user name receives msg and can\u0027t log in",
  "description": "",
  "id": "log-in-to-spec;invalid-user-name-receives-msg-and-can\u0027t-log-in",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@regression"
    },
    {
      "line": 10,
      "name": "@login"
    },
    {
      "line": 10,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "enter invalid username",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "user receives error msg and remains on log in page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stubs_Spec.on_login_page()"
});
formatter.result({
  "duration": 175724076,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.enter_invalid_username()"
});
formatter.result({
  "duration": 1664437166,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.user_receives_error_msg_and_remains_on_log_in_page()"
});
formatter.result({
  "duration": 184771595,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 320124081,
  "status": "passed"
});
formatter.after({
  "duration": 24932,
  "status": "passed"
});
formatter.before({
  "duration": 94084148,
  "status": "passed"
});
formatter.before({
  "duration": 1842708863,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "invalid password receives msg and can\u0027t log in",
  "description": "",
  "id": "log-in-to-spec;invalid-password-receives-msg-and-can\u0027t-log-in",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 16,
      "name": "@regression"
    },
    {
      "line": 16,
      "name": "@login"
    },
    {
      "line": 16,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 18,
  "name": "on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 19,
  "name": "enter invalid password",
  "keyword": "When "
});
formatter.step({
  "line": 20,
  "name": "user receives error msg and remains on log in page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stubs_Spec.on_login_page()"
});
formatter.result({
  "duration": 157333379,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.enter_invalid_password()"
});
formatter.result({
  "duration": 2244611439,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.user_receives_error_msg_and_remains_on_log_in_page()"
});
formatter.result({
  "duration": 187692548,
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 309622183,
  "status": "passed"
});
formatter.after({
  "duration": 15670,
  "status": "passed"
});
});