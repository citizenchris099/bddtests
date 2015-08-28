Feature: Studio Balfour Project Switcher

  @proj @regression
  Scenario: User with less than eight projects changes projects
    Given logged into SBv3 with user than has less than eight projects
    When choose project from project menu
    Then project has changed

  @proj @regression
  Scenario: User with more than seven projects changes projects
    Given logged into SBv3 with user than has more than seven projects
    When search project
    Then the project has changed
