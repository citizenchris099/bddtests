Feature: Log In to Spec

  @regression @login @smoke @test
  Scenario: successful log in
    Given on login page
    When enter valid credentials
    Then arrive at main spec page
    And log out of spec

  @regression @login @smoke
  Scenario: invalid user name receives msg and can't log in
    Given on login page
    When enter invalid username
    Then user receives error msg and remains on log in page

  @regression @login @smoke 
  Scenario: invalid password receives msg and can't log in
    Given on login page
    When enter invalid password
    Then user receives error msg and remains on log in page

