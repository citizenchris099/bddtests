Feature: block and cancel task

  Background:
	Given on login page
    When enter valid credentials
    Then arrive at main spec page

  @regression @loggedIn @edit @block
  Scenario Outline: blocked task shows as blocked in the edit task area
    Given a task is created with "<add>"
    And task is displayed in task queue
    And task is selected
    When "<edit>" change is made to task
    Then edited task is displayed in task queue
    And the change persists within the edit task area
    
     Examples: 
      | add         | edit        |
      | sumary only | block task  |
      
      
  @regression @loggedIn @edit @cancel 
  Scenario Outline: canceled task shows as canceled in the edit task area
    Given a task is created with "<add>"
    And task is displayed in task queue
    And task is selected
    When "<edit>" change is made to task
    Then edited task is displayed in closed task queue
    And the change persists within the edit task area
    
     Examples: 
      | add         | edit        |
      | sumary only | cancel task |
      
  @regression @loggedIn @edit @block 
  Scenario Outline: blocked flag displays for tasks that are blocked
    Given a task is created with "<add>"
    And task is displayed in task queue
    And task is selected
    When "<edit>" change is made to task
    Then edited task is displayed in task queue
    And block flag displays for task
    
     Examples: 
      | add         | edit        |
      | sumary only | block task  |
      
  @regression @loggedIn @edit @cancel 
  Scenario Outline: canceled flag displays for tasks that are canceled
    Given a task is created with "<add>"
    And task is displayed in task queue
    And task is selected
    When "<edit>" change is made to task
    Then edited task is displayed in closed task queue
    And canceled flag displays for task
    
     Examples: 
      | add         | edit        |
      | sumary only | cancel task |
      
  @regression @loggedIn @edit @block
  Scenario Outline: unblocked task shows as unblocked in the edit task area
    Given a task is created with "<add>"
    And task is displayed in task queue
    And task is selected
    When "<edit>" change is made to task
    And task is unblocked
    Then edited task is displayed in task queue
    And the change persists within the edit task area
    
     Examples: 
      | add         | edit        |
      | sumary only | block task  |
      
  @regression @loggedIn @edit @cancel 
  Scenario Outline: canceled task shows as canceled in the edit task area
    Given a task is created with "<add>"
    And task is displayed in task queue
    And task is selected
    When "<edit>" change is made to task
    And task is reopened
    Then edited task is displayed in open task queue
    And the change persists within the edit task area
    
     Examples: 
      | add         | edit        |
      | sumary only | cancel task |
      
  @regression @loggedIn @edit @block 
  Scenario Outline: blocked task shows its original status
    Given a task is created with "<add>"
    And task is displayed in task queue
    And task is selected
    When task status changed to "<status>"
    And task is blocked
    Then edited task is displayed in open task queue
    And "<status>" displays correctly in open task queue
    
     Examples: 
      | add         | status      |
      | sumary only | in progress |
      | sumary only | on hold     |
      | sumary only | not started |


