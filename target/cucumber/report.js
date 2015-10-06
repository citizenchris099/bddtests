$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("ProjUser.feature");
formatter.feature({
  "line": 1,
  "name": "Studio Balfour User Admin Screen",
  "description": "",
  "id": "studio-balfour-user-admin-screen",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11243384228,
  "status": "passed"
});
formatter.before({
  "duration": 151932473,
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
  "duration": 20214899799,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_SB.on_PU_Grid()"
});
formatter.result({
  "duration": 3310633622,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_SB.create_PU_user_register()"
});
formatter.result({
  "duration": 12036153144,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_SB.user_can_register_to_SB()"
});
formatter.result({
  "duration": 12589067833,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_SB.user_can_log_into_SB()"
});
formatter.result({
  "duration": 28988494871,
  "status": "passed"
});
formatter.after({
  "duration": 29069,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 524999126,
  "status": "passed"
});
});