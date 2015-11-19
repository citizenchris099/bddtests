$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Log In to Spec",
  "description": "",
  "id": "log-in-to-spec",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9904571621,
  "status": "passed"
});
formatter.before({
  "duration": 3394122109,
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
  "duration": 476355393,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.enter_valid_credentials()"
});
formatter.result({
  "duration": 4262596566,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.arrive_at_main_spec_page()"
});
formatter.result({
  "duration": 164405619,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.log_out_of_spec()"
});
formatter.result({
  "duration": 2748239250,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 187775050,
  "status": "passed"
});
formatter.after({
  "duration": 27553,
  "status": "passed"
});
formatter.before({
  "duration": 30488443,
  "status": "passed"
});
formatter.before({
  "duration": 672959179,
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
  "duration": 248102511,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.enter_invalid_username()"
});
formatter.result({
  "duration": 2382897583,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.user_receives_error_msg_and_remains_on_log_in_page()"
});
formatter.result({
  "duration": 182241044,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 196848032,
  "status": "passed"
});
formatter.after({
  "duration": 22199,
  "status": "passed"
});
formatter.before({
  "duration": 45796767,
  "status": "passed"
});
formatter.before({
  "duration": 735431434,
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
  "duration": 239611558,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.enter_invalid_password()"
});
formatter.result({
  "duration": 3956657959,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.user_receives_error_msg_and_remains_on_log_in_page()"
});
formatter.result({
  "duration": 203472253,
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 187702168,
  "status": "passed"
});
formatter.after({
  "duration": 20539,
  "status": "passed"
});
});