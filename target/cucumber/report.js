$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("addTask.feature");
formatter.feature({
  "line": 1,
  "name": "add task",
  "description": "",
  "id": "add-task",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3569721950,
  "status": "passed"
});
formatter.before({
  "duration": 10333865270,
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
  "duration": 416005316,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.enter_valid_credentials()"
});
formatter.result({
  "duration": 2154155929,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.arrive_at_main_spec_page()"
});
formatter.result({
  "duration": 164651273,
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
    },
    {
      "line": 9,
      "name": "@test"
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
  "duration": 160305411,
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
  "duration": 2732082344,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.task_is_displayed_in_task_queue()"
});
formatter.result({
  "duration": 6093159093,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 987582755,
  "status": "passed"
});
formatter.after({
  "duration": 2922800631,
  "status": "passed"
});
formatter.uri("editTask.feature");
formatter.feature({
  "line": 1,
  "name": "edit task",
  "description": "",
  "id": "edit-task",
  "keyword": "Feature"
});
formatter.before({
  "duration": 74198873,
  "status": "passed"
});
formatter.before({
  "duration": 2311068418,
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
  "duration": 190005358,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.enter_valid_credentials()"
});
formatter.result({
  "duration": 1995695136,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.arrive_at_main_spec_page()"
});
formatter.result({
  "duration": 181392325,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "changest made to task persist in the edit task area",
  "description": "",
  "id": "edit-task;changest-made-to-task-persist-in-the-edit-task-area;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@smoke"
    },
    {
      "line": 8,
      "name": "@loggedIn"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "a task is created with \"sumary only\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "task is displayed in task queue",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "task is selected",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "\"edit sumary\" change is made to task",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "edited task is displayed in task queue",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "the change persists within the edit task area",
  "keyword": "And "
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
  "duration": 2640438354,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.task_is_displayed_in_task_queue()"
});
formatter.result({
  "duration": 5961337936,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.task_is_selected()"
});
formatter.result({
  "duration": 403849424,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "edit sumary",
      "offset": 1
    }
  ],
  "location": "Stubs_Spec.change_is_made_to_task(String)"
});
formatter.result({
  "duration": 1589164857,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.edited_task_is_displayed_in_task_queue()"
});
formatter.result({
  "duration": 3763798335,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.the_change_persists_within_the_edit_task_area()"
});
formatter.result({
  "duration": 22325142439,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 979000047,
  "status": "passed"
});
formatter.after({
  "duration": 3289707364,
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
  "duration": 70596585,
  "status": "passed"
});
formatter.before({
  "duration": 2503041573,
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
  "duration": 169161963,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.enter_valid_credentials()"
});
formatter.result({
  "duration": 1984615057,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.arrive_at_main_spec_page()"
});
formatter.result({
  "duration": 187333835,
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 838938233,
  "status": "passed"
});
formatter.after({
  "duration": 2766462733,
  "status": "passed"
});
formatter.before({
  "duration": 80652054,
  "status": "passed"
});
formatter.before({
  "duration": 2534159852,
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
  "duration": 160321616,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.enter_invalid_username()"
});
formatter.result({
  "duration": 1527167048,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.user_receives_error_msg_and_remains_on_log_in_page()"
});
formatter.result({
  "duration": 170077485,
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "duration": 384574476,
  "status": "passed"
});
formatter.before({
  "duration": 73131536,
  "status": "passed"
});
formatter.before({
  "duration": 2230504208,
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
  "duration": 167648604,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.enter_invalid_password()"
});
formatter.result({
  "duration": 1538003380,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.user_receives_error_msg_and_remains_on_log_in_page()"
});
formatter.result({
  "duration": 182521204,
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png");
formatter.after({
  "duration": 424559792,
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
  "duration": 71372138,
  "status": "passed"
});
formatter.before({
  "duration": 2432068202,
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
  "duration": 165561835,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.enter_valid_credentials()"
});
formatter.result({
  "duration": 2143229268,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.arrive_at_main_spec_page()"
});
formatter.result({
  "duration": 160781763,
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
  "duration": 651363516,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.click_My_Tasks()"
});
formatter.result({
  "duration": 577070104,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.All_Tasks_is_in_active()"
});
formatter.result({
  "duration": 166311731,
  "status": "passed"
});
formatter.embedding("image/png", "embedded5.png");
formatter.after({
  "duration": 995262195,
  "status": "passed"
});
formatter.after({
  "duration": 2646310591,
  "status": "passed"
});
});