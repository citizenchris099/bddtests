Feature: task comment

  Background:
	Given on login page
    When enter valid credentials
    Then arrive at main spec page

  @regression @loggedIn @edit @comment
  Scenario Outline: comment text entered displays correctly in edit task area
    Given a task is created with "<add>"
    And task is displayed in task queue
    And task is selected
    When "<edit>" change is made to task
    Then edited task is displayed in task queue
    And the change persists within the edit task area
    
     Examples: 
      | add         | edit        |
      | sumary only | add comment |


