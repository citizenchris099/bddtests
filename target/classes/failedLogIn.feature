Feature: incorrect user name or password message

  @smoke @regression
  Scenario: user enters incorrect username and or password
    Given on SBv3 log in page
    When enters wrong username and or password
    Then receives message indicating wrong username or password was entered
