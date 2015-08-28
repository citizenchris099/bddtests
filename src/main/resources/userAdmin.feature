Feature: SBv3 User Admin Page

  @ua @regression
  Scenario: Add user to the user register table
    Given on user admin page
    When comploetes user reg form
    Then user appears on user admin page

  @ua @regression
  Scenario: New User Completes Registration
    Given on new user profile page
    When complete form
    Then user can log into SB
    And users profile information is correct

  @ua @regression
  Scenario: New User Completes Registration and changes username
    Given on new user profile page
    When complete form including changing the default username
    Then user can log into SB with unique username
    And users profile information is correct

  @ua @regression
  Scenario: User is found on User Admin Page
    Given newly registered user
    When search for User
    Then the user appears on user admin grid

  @ua @regression
  Scenario: User can be edited from User Admin Page
    Given newly registered user
    When search for User
    And edit user info
    Then user info persists on grid
    And user info persists on edit screen

  @ua @regression
  Scenario: User Project can be edited from User Admin Page
    Given newly registered user
    When add a new project to user
    Then user has access to Project

  @ua @regression
  Scenario: User Project made default from User Admin Page
    Given newly registered user
    And user has access to multiple projects
    When change default project
    Then user default project has changed

  @ua1 @regression
  Scenario: User Project removed from User Admin Page
    Given newly registered user
    And default project changed
    When remove default project from user
    Then user no longer has access to project

  @ua @regression
  Scenario: Register User can be deleted from User Admin Page
    Given user register present on grid
    When click delete register
    Then user register no longer present on grid
