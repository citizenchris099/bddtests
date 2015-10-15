Feature: Studio Balfour User Admin Screen

  @pu @regression
  Scenario: PU Register User completes profile
    Given logged into SB as an adviser
    When on PU Grid
    And create PU user register
    Then user can register to SB

  @pu @regression @user
  Scenario: PU Register User can log in
    Given logged into SB as an adviser
    When on PU Grid
    And create PU user register
    Then user can register to SB
    And user can log into SB

  @pu @regression
  Scenario: PU Grid Search
    Given registered PU user
    And logged into SB as an adviser
    When on PU Grid
    Then user is found on PU Grid

  @pu @regression
  Scenario: PU Grid Edit First Name persist on grid
    Given registered PU user
    And logged into SB as an adviser
    When on PU Grid
    And edit user first name direclty on PU grid
    Then edits to user should persist on PU grid

  @pu @regression
  Scenario: PU Grid Edit Last Name persist on grid
    Given registered PU user
    And logged into SB as an adviser
    When on PU Grid
    And edit user last name direclty on PU grid
    Then edits to user should persist on PU grid

  @pu @regression
  Scenario: PU Grid Edit Role persist on grid
    Given registered PU user
    And logged into SB as an adviser
    When on PU Grid
    And edit user role direclty on PU grid
    Then edits to user should persist on PU grid

  @pu @regression
  Scenario: PU Grid Edit fname persist on PU edit user screen
    Given registered PU user
    And logged into SB as an adviser
    When on PU Grid
    And edit user first name direclty on PU grid
    Then edits to user should persist on PU edit user screen

  @pu @regression
  Scenario: PU Grid Edit lname persist on PU edit user screen
    Given registered PU user
    And logged into SB as an adviser
    When on PU Grid
    And edit user last name direclty on PU grid
    Then edits to user should persist on PU edit user screen

  @pu @regression
  Scenario: PU Grid Edit role persist on PU edit user screen
    Given registered PU user
    And logged into SB as an adviser
    When on PU Grid
    And edit user role direclty on PU grid
    Then edits to user should persist on PU edit user screen

  @pu @regression @ua
  Scenario: PU Grid Edit fname persist on UA grid
    Given registered PU user
    And logged into SB as an adviser
    When on PU Grid
    And edit user first name direclty on PU grid
    Then edits to user should persist on UA grid

  @pu @regression @ua
  Scenario: PU Grid Edit lname persist on UA grid
    Given registered PU user
    And logged into SB as an adviser
    When on PU Grid
    And edit user last name direclty on PU grid
    Then edits to user should persist on UA grid

  @pu @regression
  Scenario: PU Grid Edit fname persist on user profile
    Given registered PU user
    And logged into SB as an adviser
    When on PU Grid
    And edit user first name direclty on PU grid
    Then edits to user should persist on user profile

  @pu @regression
  Scenario: User Admin Grid Edit lname persist on user profile
    Given registered PU user
    And logged into SB as an adviser
    When on PU Grid
    And edit user last name direclty on PU grid
    Then edits to user should persist on user profile

  @pu @regression
  Scenario: PU Grid Edit role persist on user profile
    Given registered PU user
    And logged into SB as an adviser
    When on PU Grid
    And edit user role direclty on PU grid
    Then edits to user should persist on user profile

  @pu @regression
  Scenario: PU Edit persist on PU grid
    Given registered PU user
    And logged into SB as an adviser
    When on PU Grid
    And edit user info on PU edit user screen
    Then edits to user should persist on PU grid

  @pu @regression
  Scenario: PU Edit persist on user profile
    Given registered PU user
    And logged into SB as an adviser
    When on PU Grid
    And edit user info on PU edit user screen
    Then edits to user should persist on user profile

  @pu @regression @fail
  Scenario: PU Edit persist on PU edit user screen
    Given registered PU user
    And logged into SB as an adviser
    When on PU Grid
    And edit user info on PU edit user screen
    Then edits to user should persist on PU edit user screen

  @ua @pu @regression
  Scenario: PU Edit persist on UA grid
    Given registered PU user
    And logged into SB as an adviser
    When on PU Grid
    And edit user info on PU edit user screen
    Then edits to user should persist on UA grid

  @pu @regression
  Scenario: Role Change persist on Proj and Role
    Given registered PU user
    And logged into SB as an adviser
    When on PU Grid
    And edit user role direclty on PU grid
    Then edits to user role should persist on Project and Role page

  @pu @regression @fail
  Scenario: button to add all projects appears
    Given registered adviser
    And logged into SB as >adviser
    When add new project to adviser
    Then button to add all projects should appear on PU edit user screen

  @pu @regression
  Scenario: disabled user cannot log in
    Given registered PU user
    And logged into SB as an adviser
    When on PU Grid
    And disable user from PU
    Then user cannot log into SB

  @pu @regression
  Scenario: disabled user displays on PU gird
    Given registered PU user
    And logged into SB as an adviser
    When on PU Grid
    And disable user from PU
    Then edits to user should persist on PU grid

  @pu @regression @fail
  Scenario: PU user re-enabled can log in
    Given PU disabled user can't log in
    When user re-enabled
    Then user can log into SB

  @pu @regression
  Scenario: edit PU user register first name persist on PU
    Given PU user register
    When edit user first name direclty on PU grid
    Then edits to user should persist on PU grid

  @pu @regression
  Scenario: edit PU user register last name persist on PU
    Given PU user register
    When edit user last name direclty on PU grid
    Then edits to user should persist on PU grid

  @pu @regression
  Scenario: edit user register email persist on PU
    Given PU user register
    When edit user email direclty on PU grid
    Then edits to user should persist on PU grid

  @pu @regression
  Scenario: PU edit user register role persist on PU
    Given PU user register
    When edit user role direclty on PU grid
    Then edits to user should persist on PU grid

  @pu @regression @ua
  Scenario: edit user register first name persist on UA
    Given PU user register
    When edit user first name direclty on PU grid
    Then edits to user should persist on UA grid

  @pu @regression @ua
  Scenario: edit user register last name persist on UA
    Given PU user register
    When edit user last name direclty on PU grid
    Then edits to user should persist on UA grid

  @ua @pu @regression @ua
  Scenario: edit user register email persist on UA
    Given PU user register
    When edit user email direclty on PU grid
    Then edits to user should persist on UA grid

  @ua @pu @regression @ua
  Scenario: edit user register role persist on UA
    Given PU user register
    When edit user role direclty on PU grid
    Then edits to user should persist on UA grid

  @pu @regression @test
  Scenario: adviser appears on PU grid for all projects
    Given registered adviser
    When logged into SB as Customer Support
    Then adviser appears on PU grid of all projects
