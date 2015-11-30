$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("addTask.feature");
formatter.feature({
  "line": 1,
  "name": "add task",
  "description": "",
  "id": "add-task",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4581349512,
  "status": "passed"
});
formatter.before({
  "duration": 3378242726,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "enter valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "arrive at main spec page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stubs_Spec.on_login_page()"
});
formatter.result({
  "duration": 665301564,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.enter_valid_credentials()"
});
formatter.result({
  "duration": 2129654309,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.arrive_at_main_spec_page()"
});
formatter.result({
  "duration": 193658072,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "task appears in task queue immediately after creation",
  "description": "",
  "id": "add-task;task-appears-in-task-queue-immediately-after-creation;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 9,
      "name": "@smoke"
    },
    {
      "line": 9,
      "name": "@loggedIn"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "on main spec page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "a task is created with \"sumary only\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "task is displayed in task queue",
  "keyword": "Then "
});
formatter.match({
  "location": "Stubs_Spec.on_main_spec_page()"
});
formatter.result({
  "duration": 175197048,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "sumary only",
      "offset": 24
    }
  ],
  "location": "Stubs_Spec.a_task_is_created_with(String)"
});
formatter.result({
  "duration": 2268025200,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.task_is_displayed_in_task_queue()"
});
formatter.result({
  "duration": 218554015,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 992438642,
  "status": "passed"
});
formatter.after({
  "duration": 1108641933,
  "status": "passed"
});
formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Log In to Spec",
  "description": "",
  "id": "log-in-to-spec",
  "keyword": "Feature"
});
formatter.before({
  "duration": 72200347,
  "status": "passed"
});
formatter.before({
  "duration": 2619655101,
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
      "name": "@loggedIn"
    },
    {
      "line": 3,
      "name": "@smoke"
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
formatter.match({
  "location": "Stubs_Spec.on_login_page()"
});
formatter.result({
  "duration": 178517195,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.enter_valid_credentials()"
});
formatter.result({
  "duration": 2057311968,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.arrive_at_main_spec_page()"
});
formatter.result({
  "duration": 162374375,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 890810156,
  "status": "passed"
});
formatter.after({
  "duration": 1103428775,
  "status": "passed"
});
formatter.before({
  "duration": 97647113,
  "status": "passed"
});
formatter.before({
  "duration": 2575934291,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "invalid user name receives msg and can\u0027t log in",
  "description": "",
  "id": "log-in-to-spec;invalid-user-name-receives-msg-and-can\u0027t-log-in",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 9,
      "name": "@regression"
    },
    {
      "line": 9,
      "name": "@login"
    },
    {
      "line": 9,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 11,
  "name": "on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "enter invalid username",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "user receives error msg and remains on log in page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stubs_Spec.on_login_page()"
});
formatter.result({
  "duration": 190290348,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.enter_invalid_username()"
});
formatter.result({
  "duration": 1935141545,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.user_receives_error_msg_and_remains_on_log_in_page()"
});
formatter.result({
  "duration": 178415906,
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 432838301,
  "status": "passed"
});
formatter.before({
  "duration": 74061057,
  "status": "passed"
});
formatter.before({
  "duration": 2550919966,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "invalid password receives msg and can\u0027t log in",
  "description": "",
  "id": "log-in-to-spec;invalid-password-receives-msg-and-can\u0027t-log-in",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@regression"
    },
    {
      "line": 15,
      "name": "@login"
    },
    {
      "line": 15,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "enter invalid password",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user receives error msg and remains on log in page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stubs_Spec.on_login_page()"
});
formatter.result({
  "duration": 192461132,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.enter_invalid_password()"
});
formatter.result({
  "duration": 1636072144,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.user_receives_error_msg_and_remains_on_log_in_page()"
});
formatter.result({
  "duration": 183721089,
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "duration": 484847230,
  "status": "passed"
});
formatter.uri("taskFilters.feature");
formatter.feature({
  "line": 1,
  "name": "task filters",
  "description": "",
  "id": "task-filters",
  "keyword": "Feature"
});
formatter.before({
  "duration": 82573541,
  "status": "passed"
});
formatter.before({
  "duration": 2403254288,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "enter valid credentials",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "arrive at main spec page",
  "keyword": "Then "
});
formatter.match({
  "location": "Stubs_Spec.on_login_page()"
});
formatter.result({
  "duration": 178334805,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.enter_valid_credentials()"
});
formatter.result({
  "duration": 1986403276,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.arrive_at_main_spec_page()"
});
formatter.result({
  "duration": 185854540,
  "status": "passed"
});
formatter.scenario({
  "line": 9,
  "name": "My Tasks filter becomes active",
  "description": "",
  "id": "task-filters;my-tasks-filter-becomes-active",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 8,
      "name": "@regression"
    },
    {
      "line": 8,
      "name": "@filters"
    },
    {
      "line": 8,
      "name": "@loggedIn"
    },
    {
      "line": 8,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "All Tasks is active",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "click My Tasks",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "All Tasks is in active",
  "keyword": "Then "
});
formatter.match({
  "location": "Stubs_Spec.All_Tasks_is_active()"
});
formatter.result({
  "duration": 592585336,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.click_My_Tasks()"
});
formatter.result({
  "duration": 581421851,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.All_Tasks_is_in_active()"
});
formatter.result({
  "duration": 171362845,
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png");
formatter.after({
  "duration": 803118068,
  "status": "passed"
});
formatter.after({
  "duration": 1137451295,
  "status": "passed"
});
});