Feature: task status

  Background:
	Given on login page
    When enter valid credentials
    Then arrive at main spec page

  @regression @loggedIn @status
  Scenario Outline: task with open status selected display correct status in open task queue
    Given a task is created with "<add>"
    And task is displayed in task queue
    And task is selected
    When task status changed to "<status>"
    Then edited task is displayed in open task queue
    And "<status>" displays correctly in open task queue
    
     Examples: 
      | add         | status        |
      | sumary only | in progress   |
      | sumary only | on hold   |
      
  @regression @loggedIn @status
  Scenario Outline: task with closed status selected display correct status in closed task queue
    Given a task is created with "<add>"
    And task is displayed in task queue
    And task is selected
    When task status changed to "<status>"
    Then edited task is displayed in closed task queue
    And "<status>" displays correctly in closed task queue
    
     Examples: 
      | add         | status        |
      | sumary only | complete   |
      
  @regression @loggedIn @status 
  Scenario Outline: task with closed status selected do not display in open task queue
    Given a task is created with "<add>"
    And task is displayed in task queue
    And task is selected
    When task status changed to "<status>"
    Then edited task is not displayed in open task queue
    
     Examples: 
      | add         | status        |
      | sumary only | complete   |
      
  @regression @loggedIn @status 
  Scenario Outline: task with open status selected do not display in closed task queue
    Given a task is created with "<add>"
    And task is displayed in task queue
    And task is selected
    When task status changed to "<status>"
    Then edited task is not displayed in closed task queue
    
     Examples: 
      | add         | status        |
      | sumary only | in progress   |
      | sumary only | on hold   |


