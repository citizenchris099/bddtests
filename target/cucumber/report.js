$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("logout.feature");
formatter.feature({
  "line": 1,
  "name": "Log out of Studio Balfour v3",
  "description": "",
  "id": "log-out-of-studio-balfour-v3",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5651474077,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Successfully Logout",
  "description": "",
  "id": "log-out-of-studio-balfour-v3;successfully-logout",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@smoke"
    },
    {
      "line": 3,
      "name": "@regression"
    },
    {
      "line": 3,
      "name": "@lo"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "logged into SBv3",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "click log out",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "arrive at the SBv3 log in screen",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 15
    }
  ],
  "location": "Stubs_LogOut.logged_into_SBv(int)"
});
formatter.result({
  "duration": 44470273099,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_LogOut.click_log_out()"
});
formatter.result({
  "duration": 37212114825,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 17
    }
  ],
  "location": "Stubs_LogOut.arrive_at_the_SBv_log_in_screen(int)"
});
formatter.result({
  "duration": 295529701,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 858259245,
  "status": "passed"
});
});