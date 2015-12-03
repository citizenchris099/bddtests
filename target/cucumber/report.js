$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("comment.feature");
formatter.feature({
  "line": 1,
  "name": "task comment",
  "description": "",
  "id": "task-comment",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5855796622,
  "status": "passed"
});
formatter.before({
  "duration": 14276425134,
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
  "duration": 427827117,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.enter_valid_credentials()"
});
formatter.result({
  "duration": 2863962275,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.arrive_at_main_spec_page()"
});
formatter.result({
  "duration": 211163655,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "comment text entered displays correctly in edit task area",
  "description": "",
  "id": "task-comment;comment-text-entered-displays-correctly-in-edit-task-area;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@regression"
    },
    {
      "line": 8,
      "name": "@loggedIn"
    },
    {
      "line": 8,
      "name": "@comment"
    },
    {
      "line": 8,
      "name": "@edit"
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
  "name": "\"add comment\" change is made to task",
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
  "duration": 3447938548,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.task_is_displayed_in_task_queue()"
});
formatter.result({
  "duration": 233461476,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.task_is_selected()"
});
formatter.result({
  "duration": 715792346,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "add comment",
      "offset": 1
    }
  ],
  "location": "Stubs_Spec.change_is_made_to_task(String)"
});
formatter.result({
  "duration": 1498214313,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.edited_task_is_displayed_in_task_queue()"
});
formatter.result({
  "duration": 4549008928,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.the_change_persists_within_the_edit_task_area()"
});
formatter.result({
  "duration": 25457279646,
  "status": "passed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 1512299393,
  "status": "passed"
});
formatter.after({
  "duration": 2408118350,
  "status": "passed"
});
formatter.uri("status.feature");
formatter.feature({
  "line": 1,
  "name": "task status",
  "description": "",
  "id": "task-status",
  "keyword": "Feature"
});
formatter.before({
  "duration": 79923414,
  "status": "passed"
});
formatter.before({
  "duration": 3644112908,
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
  "duration": 199015033,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.enter_valid_credentials()"
});
formatter.result({
  "duration": 2384472590,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.arrive_at_main_spec_page()"
});
formatter.result({
  "duration": 290296665,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "task with open status selected display correct status in open task queue",
  "description": "",
  "id": "task-status;task-with-open-status-selected-display-correct-status-in-open-task-queue;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@regression"
    },
    {
      "line": 8,
      "name": "@loggedIn"
    },
    {
      "line": 8,
      "name": "@status"
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
  "name": "task status changed to \"in progress\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "edited task is displayed in open task queue",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "\"in progress\" displays correctly in open task queue",
  "matchedColumns": [
    1
  ],
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
  "duration": 2951203282,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.task_is_displayed_in_task_queue()"
});
formatter.result({
  "duration": 238369014,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.task_is_selected()"
});
formatter.result({
  "duration": 511270704,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "in progress",
      "offset": 24
    }
  ],
  "location": "Stubs_Spec.task_status_changed_to(String)"
});
formatter.result({
  "duration": 1048818913,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.edited_task_is_displayed_in_open_task_queue()"
});
formatter.result({
  "duration": 4413338493,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "in progress",
      "offset": 1
    }
  ],
  "location": "Stubs_Spec.displays_correctly_in_open_task_queue(String)"
});
formatter.result({
  "duration": 1853343235,
  "status": "passed"
});
formatter.embedding("image/png", "embedded1.png");
formatter.after({
  "duration": 6151352966,
  "status": "passed"
});
formatter.after({
  "duration": 2491427331,
  "status": "passed"
});
formatter.before({
  "duration": 77850802,
  "status": "passed"
});
formatter.before({
  "duration": 3234347976,
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
  "duration": 181694611,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.enter_valid_credentials()"
});
formatter.result({
  "duration": 2136766203,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.arrive_at_main_spec_page()"
});
formatter.result({
  "duration": 203730677,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "task with open status selected display correct status in open task queue",
  "description": "",
  "id": "task-status;task-with-open-status-selected-display-correct-status-in-open-task-queue;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@regression"
    },
    {
      "line": 8,
      "name": "@loggedIn"
    },
    {
      "line": 8,
      "name": "@status"
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
  "name": "task status changed to \"on hold\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "edited task is displayed in open task queue",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "\"on hold\" displays correctly in open task queue",
  "matchedColumns": [
    1
  ],
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
  "duration": 2672834310,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.task_is_displayed_in_task_queue()"
});
formatter.result({
  "duration": 218615598,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.task_is_selected()"
});
formatter.result({
  "duration": 533025578,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "on hold",
      "offset": 24
    }
  ],
  "location": "Stubs_Spec.task_status_changed_to(String)"
});
formatter.result({
  "duration": 996296777,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.edited_task_is_displayed_in_open_task_queue()"
});
formatter.result({
  "duration": 3907693564,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "on hold",
      "offset": 1
    }
  ],
  "location": "Stubs_Spec.displays_correctly_in_open_task_queue(String)"
});
formatter.result({
  "duration": 1707748355,
  "status": "passed"
});
formatter.embedding("image/png", "embedded2.png");
formatter.after({
  "duration": 1209026836,
  "status": "passed"
});
formatter.after({
  "duration": 2186775179,
  "status": "passed"
});
formatter.before({
  "duration": 73100234,
  "status": "passed"
});
formatter.before({
  "duration": 3001731390,
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
  "duration": 211151424,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.enter_valid_credentials()"
});
formatter.result({
  "duration": 2249747513,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.arrive_at_main_spec_page()"
});
formatter.result({
  "duration": 187071059,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "task with closed status selected display correct status in closed task queue",
  "description": "",
  "id": "task-status;task-with-closed-status-selected-display-correct-status-in-closed-task-queue;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 22,
      "name": "@regression"
    },
    {
      "line": 22,
      "name": "@loggedIn"
    },
    {
      "line": 22,
      "name": "@status"
    }
  ]
});
formatter.step({
  "line": 24,
  "name": "a task is created with \"sumary only\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "task is displayed in task queue",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "task is selected",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "task status changed to \"complete\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 28,
  "name": "edited task is displayed in closed task queue",
  "keyword": "Then "
});
formatter.step({
  "line": 29,
  "name": "\"complete\" displays correctly in closed task queue",
  "matchedColumns": [
    1
  ],
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
  "duration": 2645890756,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.task_is_displayed_in_task_queue()"
});
formatter.result({
  "duration": 200409078,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.task_is_selected()"
});
formatter.result({
  "duration": 547221344,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "complete",
      "offset": 24
    }
  ],
  "location": "Stubs_Spec.task_status_changed_to(String)"
});
formatter.result({
  "duration": 1012921548,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.edited_task_is_displayed_in_closed_task_queue()"
});
formatter.result({
  "duration": 3995600045,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "complete",
      "offset": 1
    }
  ],
  "location": "Stubs_Spec.displays_correctly_in_closed_task_queue(String)"
});
formatter.result({
  "duration": 1533900193,
  "status": "passed"
});
formatter.embedding("image/png", "embedded3.png");
formatter.after({
  "duration": 991917510,
  "status": "passed"
});
formatter.after({
  "duration": 2557608275,
  "status": "passed"
});
formatter.before({
  "duration": 104214846,
  "status": "passed"
});
formatter.before({
  "duration": 3512649972,
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
  "duration": 180516909,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.enter_valid_credentials()"
});
formatter.result({
  "duration": 2395085004,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.arrive_at_main_spec_page()"
});
formatter.result({
  "duration": 173462040,
  "status": "passed"
});
formatter.scenario({
  "line": 45,
  "name": "task with closed status selected do not display in open task queue",
  "description": "",
  "id": "task-status;task-with-closed-status-selected-do-not-display-in-open-task-queue;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 35,
      "name": "@regression"
    },
    {
      "line": 35,
      "name": "@loggedIn"
    },
    {
      "line": 35,
      "name": "@status"
    }
  ]
});
formatter.step({
  "line": 37,
  "name": "a task is created with \"sumary only\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 38,
  "name": "task is displayed in task queue",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "task is selected",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "task status changed to \"complete\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 41,
  "name": "edited task is not displayed in open task queue",
  "keyword": "Then "
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
  "duration": 2611946814,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.task_is_displayed_in_task_queue()"
});
formatter.result({
  "duration": 215388488,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.task_is_selected()"
});
formatter.result({
  "duration": 581551246,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "complete",
      "offset": 24
    }
  ],
  "location": "Stubs_Spec.task_status_changed_to(String)"
});
formatter.result({
  "duration": 1131281009,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.edited_task_is_not_displayed_in_open_task_queue()"
});
formatter.result({
  "duration": 9501351178,
  "status": "passed"
});
formatter.embedding("image/png", "embedded4.png");
formatter.after({
  "duration": 997658136,
  "status": "passed"
});
formatter.after({
  "duration": 2376132407,
  "status": "passed"
});
formatter.before({
  "duration": 81035458,
  "status": "passed"
});
formatter.before({
  "duration": 3362158441,
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
  "duration": 189600573,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.enter_valid_credentials()"
});
formatter.result({
  "duration": 2371811627,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.arrive_at_main_spec_page()"
});
formatter.result({
  "duration": 190292827,
  "status": "passed"
});
formatter.scenario({
  "line": 57,
  "name": "task with open status selected do not display in closed task queue",
  "description": "",
  "id": "task-status;task-with-open-status-selected-do-not-display-in-closed-task-queue;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 47,
      "name": "@regression"
    },
    {
      "line": 47,
      "name": "@loggedIn"
    },
    {
      "line": 47,
      "name": "@status"
    }
  ]
});
formatter.step({
  "line": 49,
  "name": "a task is created with \"sumary only\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 50,
  "name": "task is displayed in task queue",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "task is selected",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "task status changed to \"in progress\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 53,
  "name": "edited task is not displayed in closed task queue",
  "keyword": "Then "
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
  "duration": 2757631738,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.task_is_displayed_in_task_queue()"
});
formatter.result({
  "duration": 220238940,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.task_is_selected()"
});
formatter.result({
  "duration": 599059706,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "in progress",
      "offset": 24
    }
  ],
  "location": "Stubs_Spec.task_status_changed_to(String)"
});
formatter.result({
  "duration": 985586252,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.edited_task_is_not_displayed_in_closed_task_queue()"
});
formatter.result({
  "duration": 9951752499,
  "status": "passed"
});
formatter.embedding("image/png", "embedded5.png");
formatter.after({
  "duration": 1061798125,
  "status": "passed"
});
formatter.after({
  "duration": 2253025569,
  "status": "passed"
});
formatter.before({
  "duration": 84577376,
  "status": "passed"
});
formatter.before({
  "duration": 3069260113,
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
  "duration": 208510082,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.enter_valid_credentials()"
});
formatter.result({
  "duration": 2413217793,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.arrive_at_main_spec_page()"
});
formatter.result({
  "duration": 259655568,
  "status": "passed"
});
formatter.scenario({
  "line": 58,
  "name": "task with open status selected do not display in closed task queue",
  "description": "",
  "id": "task-status;task-with-open-status-selected-do-not-display-in-closed-task-queue;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 47,
      "name": "@regression"
    },
    {
      "line": 47,
      "name": "@loggedIn"
    },
    {
      "line": 47,
      "name": "@status"
    }
  ]
});
formatter.step({
  "line": 49,
  "name": "a task is created with \"sumary only\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 50,
  "name": "task is displayed in task queue",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "task is selected",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "task status changed to \"on hold\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 53,
  "name": "edited task is not displayed in closed task queue",
  "keyword": "Then "
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
  "duration": 2818857211,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.task_is_displayed_in_task_queue()"
});
formatter.result({
  "duration": 197653244,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.task_is_selected()"
});
formatter.result({
  "duration": 562873036,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "on hold",
      "offset": 24
    }
  ],
  "location": "Stubs_Spec.task_status_changed_to(String)"
});
formatter.result({
  "duration": 1086463900,
  "status": "passed"
});
formatter.match({
  "location": "Stubs_Spec.edited_task_is_not_displayed_in_closed_task_queue()"
});
formatter.result({
  "duration": 9679724812,
  "status": "passed"
});
formatter.embedding("image/png", "embedded6.png");
formatter.after({
  "duration": 1183288177,
  "status": "passed"
});
formatter.after({
  "duration": 2160228853,
  "status": "passed"
});
});