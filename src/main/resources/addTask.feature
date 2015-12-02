Feature: add task

  Background:
	Given on login page
    When enter valid credentials
    Then arrive at main spec page
    
    
  @smoke @loggedIn
  Scenario Outline: task appears in task queue immediately after creation
    Given on main spec page
    When a task is created with "<task>"
    Then task is displayed in task queue
    
     Examples: 
      | task        | 
      | sumary only | 
   
  @regression @addTask @loggedIn
  Scenario Outline: task appears in task queue immediately after creation
    Given on main spec page
    When a task is created with "<task>"
    Then task is displayed in task queue
    
     Examples: 
      | task                                             | 
      | sumary only                                      | 
      | description                                      | 
      | location                                         | 
      | due date                                         | 
      | date picker                                      | 
      | labels                                           | 
      | assignee                                         | 
      | description,location                             | 
      | description,due date                             | 
      | description,date picker                          | 
      | description,labels                               | 
      | description,assignee                             | 
      | location,due date                                | 
      | location,date picker                             | 
      | location,labels                                  | 
      | location,assignee                                | 
      | due date,labels                                  | 
      | due date,assignee                                | 
      | labels,date picker                               | 
      | labels,assignee                                  | 
      | assignee,date picker                             | 
      | description,location,due date                    | 
      | location,due date,labels                         | 
      | due date,labels,assignee                         | 
      | description,location,date picker                 | 
      | location,date picker,labels                      | 
      | date picker,labels,assignee                      | 
      | description,location,assignee                    | 
      | description,date picker,assignee                 | 
      | description,labels,assignee                      | 
      | description,location,due date,labels             | 
      | location,due date,labels,assignee                | 
      | due date,labels,assignee,description             | 
      | description,location,date picker,labels          | 
      | location,date picker,labels,assignee             | 
      | date picker,labels,assignee,description          | 
      | description,location,assignee,labels             | 
      | description,date picker,assignee,labels          | 
      | description,labels,assignee,location             | 
      | description,labels,assignee,location,due date    | 
      | description,labels,assignee,location,date picker | 
      
      
  @regression @loggedIn @addTask @test
  Scenario Outline: newly added task appears correct in edit task area immediately after entry
    Given on main spec page
    When a task is created with "<task>"
    Then task is displayed in task queue
    And task is selected
    And task info appears correct in the edit task area
    
     Examples: 
      | task                                             | 
      | sumary only                                      | 
      | description                                      | 
      | location                                         | 
      | due date                                         | 
      | date picker                                      |
      | labels                                           | 
      | assignee                                         | 
      | description,location                             | 
      | description,due date                             | 
      | description,date picker                          | 
      | description,labels                               | 
      | description,assignee                             | 
      | location,due date                                | 
      | location,date picker                             | 
      | location,labels                                  | 
      | location,assignee                                | 
      | due date,labels                                  | 
      | due date,assignee                                | 
      | labels,date picker                               | 
      | labels,assignee                                  | 
      | assignee,date picker                             | 
      | description,location,due date                    | 
      | location,due date,labels                         | 
      | due date,labels,assignee                         | 
      | description,location,date picker                 | 
      | location,date picker,labels                      | 
      | date picker,labels,assignee                      | 
      | description,location,assignee                    | 
      | description,date picker,assignee                 | 
      | description,labels,assignee                      | 
      | description,location,due date,labels             | 
      | location,due date,labels,assignee                | 
      | due date,labels,assignee,description             | 
      | description,location,date picker,labels          | 
      | location,date picker,labels,assignee             | 
      | date picker,labels,assignee,description          | 
      | description,location,assignee,labels             | 
      | description,date picker,assignee,labels          | 
      | description,labels,assignee,location             | 
      | description,labels,assignee,location,due date    | 
      | description,labels,assignee,location,date picker |  
      


  @regression @addTask @loggedIn
  Scenario Outline: task is found in task queue by task creator
    Given a task is created with "<task>"
    When task creator searches for task using "<searches>"
    Then task is displayed in task queue

    Examples: 
      | task                                             | searches    |
      | sumary only                                      | sumary      |
      | description                                      | sumary      |
      | location                                         | sumary      |
      | due date                                         | sumary      |
      | date picker                                      | sumary      |
      | labels                                           | sumary      |
      | assignee                                         | sumary      |
      | description,location                             | sumary      |
      | description,due date                             | sumary      |
      | description,date picker                          | sumary      |
      | description,labels                               | sumary      |
      | description,assignee                             | sumary      |
      | location,due date                                | sumary      |
      | location,date picker                             | sumary      |
      | location,labels                                  | sumary      |
      | location,assignee                                | sumary      |
      | due date,labels                                  | sumary      |
      | due date,assignee                                | sumary      |
      | labels,date picker                               | sumary      |
      | labels,assignee                                  | sumary      |
      | assignee,date picker                             | sumary      |
      | description,location,due date                    | sumary      |
      | location,due date,labels                         | sumary      |
      | due date,labels,assignee                         | sumary      |
      | description,location,date picker                 | sumary      |
      | location,date picker,labels                      | sumary      |
      | date picker,labels,assignee                      | sumary      |
      | description,location,assignee                    | sumary      |
      | description,date picker,assignee                 | sumary      |
      | description,labels,assignee                      | sumary      |
      | description,location,due date,labels             | sumary      |
      | location,due date,labels,assignee                | sumary      |
      | due date,labels,assignee,description             | sumary      |
      | description,location,date picker,labels          | sumary      |
      | location,date picker,labels,assignee             | sumary      |
      | date picker,labels,assignee,description          | sumary      |
      | description,location,assignee,labels             | sumary      |
      | description,date picker,assignee,labels          | sumary      |
      | description,labels,assignee,location             | sumary      |
      | description,labels,assignee,location,due date    | sumary      |
      | description,labels,assignee,location,date picker | sumary      |
      | description                                      | description |
      | description,location                             | description |
      | description,due date                             | description |
      | description,date picker                          | description |
      | description,labels                               | description |
      | description,assignee                             | description |
      | description,location,due date                    | description |
      | description,location,date picker                 | description |
      | description,location,assignee                    | description |
      | description,date picker,assignee                 | description |
      | description,labels,assignee                      | description |
      | description,location,due date,labels             | description |
      | due date,labels,assignee,description             | description |
      | description,location,date picker,labels          | description |
      | date picker,labels,assignee,description          | description |
      | description,location,assignee,labels             | description |
      | description,date picker,assignee,labels          | description |
      | description,labels,assignee,location             | description |
      | description,labels,assignee,location,due date    | description |
      | description,labels,assignee,location,date picker | description |
      | location                                         | location    |
      | description,location                             | location    |
      | location,due date                                | location    |
      | location,date picker                             | location    |
      | location,labels                                  | location    |
      | location,assignee                                | location    |
      | description,location,due date                    | location    |
      | location,due date,labels                         | location    |
      | description,location,date picker                 | location    |
      | location,date picker,labels                      | location    |
      | description,location,assignee                    | location    |
      | description,location,due date,labels             | location    |
      | location,due date,labels,assignee                | location    |
      | description,location,date picker,labels          | location    |
      | location,date picker,labels,assignee             | location    |
      | description,location,assignee,labels             | location    |
      | description,labels,assignee,location             | location    |
      | description,labels,assignee,location,due date    | location    |
      | description,labels,assignee,location,date picker | location    |
      
      
  @regression @addTask @loggedIn
  Scenario Outline: task is found by task creator in task queue when searching by lable
    Given a task is created with "<task>"
    When task creator searches for task using lable
    Then task is displayed in task queue

    Examples: 
      | task                                             | 
      | labels                                           |
      | description,labels                               | 
      | location,labels                                  | 
      | due date,labels                                  | 
      | labels,date picker                               | 
      | labels,assignee                                  | 
      | location,due date,labels                         | 
      | due date,labels,assignee                         | 
      | location,date picker,labels                      | 
      | date picker,labels,assignee                      | 
      | description,labels,assignee                      | 
      | description,location,due date,labels             | 
      | location,due date,labels,assignee                | 
      | due date,labels,assignee,description             | 
      | description,location,date picker,labels          | 
      | location,date picker,labels,assignee             | 
      | date picker,labels,assignee,description          | 
      | description,location,assignee,labels             | 
      | description,date picker,assignee,labels          | 
      | description,labels,assignee,location             | 
      | description,labels,assignee,location,due date    | 
      | description,labels,assignee,location,date picker |  
      
      
      