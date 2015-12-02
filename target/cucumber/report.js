$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("addTask.feature");
formatter.feature({
  "line": 1,
  "name": "add task",
  "description": "",
  "id": "add-task",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5895956256,
  "status": "passed"
});
formatter.before({
  "duration": 6762859225,
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
  "duration": 572913954,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.enter_valid_credentials()"
});
formatter.result({
  "duration": 3082426375,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.arrive_at_main_spec_page()"
});
formatter.result({
  "duration": 203002370,
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
  "duration": 185413323,
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
  "duration": 3398764066,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.task_is_displayed_in_task_queue()"
});
formatter.result({
  "duration": 222827186,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 919074885,
  "status": "passed"
});
formatter.after({
  "duration": 1461917728,
  "status": "passed"
});
formatter.uri("editTask.feature");
formatter.feature({
  "line": 1,
  "name": "add task",
  "description": "",
  "id": "add-task",
  "keyword": "Feature"
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
  "duration": 74373037,
  "status": "passed"
});
formatter.before({
  "duration": 4023411047,
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
  "duration": 229423267,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.enter_valid_credentials()"
});
formatter.result({
  "duration": 2560956636,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.arrive_at_main_spec_page()"
});
formatter.result({
  "duration": 245124688,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 1060821133,
  "status": "passed"
});
formatter.after({
  "duration": 1410622448,
  "status": "passed"
});
formatter.before({
  "duration": 79102143,
  "status": "passed"
});
formatter.before({
  "duration": 3976426893,
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
  "duration": 189656194,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.enter_invalid_username()"
});
formatter.result({
  "duration": 2104588207,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.user_receives_error_msg_and_remains_on_log_in_page()"
});
formatter.result({
  "duration": 190369025,
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 360490651,
  "status": "passed"
});
formatter.before({
  "duration": 75201863,
  "status": "passed"
});
formatter.before({
  "duration": 3646455490,
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
  "duration": 232491207,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.enter_invalid_password()"
});
formatter.result({
  "duration": 2233034142,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.user_receives_error_msg_and_remains_on_log_in_page()"
});
formatter.result({
  "duration": 174346060,
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "duration": 391458930,
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
  "duration": 76194916,
  "status": "passed"
});
formatter.before({
  "duration": 3594407077,
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
  "duration": 198372965,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.enter_valid_credentials()"
});
formatter.result({
  "duration": 2541946417,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.arrive_at_main_spec_page()"
});
formatter.result({
  "duration": 181258125,
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
  "duration": 771312806,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.click_My_Tasks()"
});
formatter.result({
  "duration": 806489889,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.All_Tasks_is_in_active()"
});
formatter.result({
  "duration": 197268610,
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png");
formatter.after({
  "duration": 926629561,
  "status": "passed"
});
formatter.after({
  "duration": 1568739886,
  "status": "passed"
});
});