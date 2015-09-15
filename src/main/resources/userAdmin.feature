Feature: Log out of Studio Balfour v3

  Scenario: User Admin Grid Search
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    Then user is found User Admin Grid

  Scenario: User Admin Grid Edit First Name persist on grid
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user first name direclty on grid
    Then edits to user should persist on UA grid

  Scenario: User Admin Grid Edit Last Name persist on grid
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user last name direclty on grid
    Then edits to user should persist on UA grid

  Scenario: User Admin Grid Edit Role persist on grid
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user role direclty on grid
    Then edits to user should persist on UA grid

  @ua
  Scenario: User Admin Grid Edit fname persist on edit user screen
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user first name direclty on grid
    Then edits to user should persist on edit user screen

  @ua
  Scenario: User Admin Grid Edit lname persist on edit user screen
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user last name direclty on grid
    Then edits to user should persist on edit user screen

  @ua
  Scenario: User Admin Grid Edit role persist on edit user screen
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user role direclty on grid
    Then edits to user should persist on edit user screen

  Scenario: User Admin Grid Edit fname persist on PU grid
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user first name direclty on grid
    Then edits to user should persist on PU grid

  Scenario: User Admin Grid Edit lname persist on PU grid
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user last name direclty on grid
    Then edits to user should persist on PU grid

  Scenario: User Admin Grid Edit role persist on PU grid
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user role direclty on grid
    Then edits to user should persist on PU grid

  @ua
  Scenario: User Admin Grid Edit fname persist on user profile
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user first name direclty on grid
    Then edits to user should persist on user profile

  @ua
  Scenario: User Admin Grid Edit lname persist on user profile
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user last name direclty on grid
    Then edits to user should persist on user profile

  @ua
  Scenario: User Admin Grid Edit role persist on user profile
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user role direclty on grid
    Then edits to user should persist on user profile

  Scenario: User Admin Edit persist on grid
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user info
    Then edits to user should persist on UA grid

  @ua
  Scenario: User Admin Edit persist on user profile
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user info
    Then edits to user should persist on user profile

  Scenario: User Admin Edit persist on edit user screen
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user info
    Then edits to user should persist on edit user screen

  Scenario: User Admin Edit persist on PU
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user info
    Then edits to user should persist on PU grid

  Scenario: Base Role Change
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user role direclty on grid
    Then edits to user role should persist on Project and Role page

  Scenario: Base Role Change
    Given registered user with multiple projects
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user role direclty on grid
    Then edits to user role should persist on all projects on Project and Role page
