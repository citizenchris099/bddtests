Feature: task filters

  Background:
	Given on login page
    When enter valid credentials
    Then arrive at main spec page

  @regression @filters @loggedIn @smoke
  Scenario: My Tasks filter becomes active
    Given All Tasks is active
    When click My Tasks
    Then All Tasks is in active


