Feature: edit task

  Background:
	Given on login page
    When enter valid credentials
    Then arrive at main spec page

  @loggedIn @smoke
  Scenario Outline: changest made to task persist in the edit task area
    Given a task is created with "<add>"
    And task is displayed in task queue
    And task is selected
    When "<edit>" change is made to task
    Then edited task is displayed in task queue
    And the change persists within the edit task area
    
     Examples: 
      | add         | edit        |
      | sumary only | edit sumary |    
    
  @regression @loggedIn @edit
  Scenario Outline: changest made to task persist in the edit task area
    Given a task is created with "<add>"
    And task is displayed in task queue
    And task is selected
    When "<edit>" change is made to task
    Then edited task is displayed in task queue
    And the change persists within the edit task area
    
     Examples: 
      | add         | edit        |
#      | sumary only | edit sumary |
#      | description | edit sumary |
#      | location    | edit sumary |
#      | due date    | edit sumary |
#      | date picker | edit sumary |
#      | labels      | edit sumary |
#      | assignee    | edit sumary |
#      | sumary only | edit description |
#      | description | edit description |
#      | sumary only | add location |
#      | sumary only | add date |
#      | sumary only | add labels |
#      | sumary only | add assignee |
#      | sumary only | edit date |
#      | sumary only | edit description,add location |
#      | sumary only | edit description,add location,add date |
#      | sumary only | edit description,add location,add date,add labels |
#      | sumary only | edit description,add location,add date,add labels,add assignee |
   
  
      
      
      