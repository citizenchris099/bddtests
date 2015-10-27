Feature: Studio Balfour User Admin Screen

  @ua @regression 
  Scenario: User Admin Register User completes profile
    Given logged into SB as >adviser
    When on User Admin Grid
    And create user register
    Then user can register to SB

  @ua @regression 
  Scenario: User Admin Register User can log in
    Given logged into SB as >adviser
    When on User Admin Grid
    And create user register
    Then user can register to SB
    And user can log into SB

  @ua @regression
  Scenario: User Admin Grid Search
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    Then user is found User Admin Grid

  @ua @regression
  Scenario: User Admin Grid Edit First Name persist on grid
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user first name direclty on grid
    Then edits to user should persist on UA grid

  @ua @regression 
  Scenario: User Admin Grid Edit Last Name persist on grid
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user last name direclty on grid
    Then edits to user should persist on UA grid

  @ua @regression 
  Scenario: User Admin Grid Edit Role persist on grid
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user role direclty on grid
    Then edits to user should persist on UA grid

  @ua @regression
  Scenario: User Admin Grid Edit fname persist on edit user screen
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user first name direclty on grid
    Then edits to user should persist on edit user screen

  @ua @regression 
  Scenario: User Admin Grid Edit lname persist on edit user screen
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user last name direclty on grid
    Then edits to user should persist on edit user screen

  @ua @regression 
  Scenario: User Admin Grid Edit role persist on edit user screen
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user role direclty on grid
    Then edits to user should persist on edit user screen

  @ua @regression
  Scenario: User Admin Grid Edit fname persist on PU grid
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user first name direclty on grid
    Then edits to user should persist on PU grid

  @ua @regression
  Scenario: User Admin Grid Edit lname persist on PU grid
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user last name direclty on grid
    Then edits to user should persist on PU grid

  @ua @regression
  Scenario: User Admin Grid Edit role persist on PU grid
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user role direclty on grid
    Then edits to user should persist on PU grid

  @ua @regression 
  Scenario: User Admin Grid Edit fname persist on user profile
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user first name direclty on grid
    Then edits to user should persist on user profile

  @ua @regression
  Scenario: User Admin Grid Edit lname persist on user profile
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user last name direclty on grid
    Then edits to user should persist on user profile

  @ua @regression
  Scenario: User Admin Grid Edit role persist on user profile
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user role direclty on grid
    Then edits to user should persist on user profile

  @ua @regression
  Scenario: User Admin Edit persist on grid
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user info
    Then edits to user should persist on UA grid

  @ua @regression
  Scenario: User Admin Edit persist on user profile
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user info
    Then edits to user should persist on user profile

  @ua @regression
  Scenario: User Admin Edit persist on edit user screen
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user info
    Then edits to user should persist on edit user screen

  @ua @regression
  Scenario: User Admin Edit persist on PU
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user info
    Then edits to user should persist on PU grid

  @ua @regression
  Scenario: Base Role Change
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user role direclty on grid
    Then edits to user role should persist on Project and Role page

  @ua @regression
  Scenario: Base Role Change
    Given registered user with multiple projects
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user role direclty on grid
    Then edits to user role should persist on all projects on Project and Role page

  @ua @fail @regression
  Scenario: button to add all projects appears
    Given registered adviser
    And logged into SB as >adviser
    When add new project to adviser
    Then button to add all projects should appear on edit user screen

  @ua @fail @regression
  Scenario: adviser inherits all projects of new school
    Given registered adviser
    And logged into SB as >adviser
    When add new project to adviser
    Then button to add all projects should appear on edit user screen
    And when clicked user inherits all projects of new school

  @ua @regression
  Scenario: >adviser role changed to adviser button to add all projects appears
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user role to adviser
    Then button to add all projects should appear on edit user screen

  @ua @regression
  Scenario: default project reflected on UA grid
    Given registered user with multiple projects
    When user change project
    Then default proj and role is reflected correctly on the User Admin Grid

  @ua @regression 
  Scenario: disabled user cannot log in
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And disable user
    Then user cannot log into SB

  @ua @regression 
  Scenario: disabled user displays on PU gird
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    And disable user
    Then edits to user should persist on PU grid

  @ua @regression 
  Scenario: user re-enabled can log in
    Given disabled user can't log in
    When user re-enabled
    Then user can log into SB

  @ua @regression
  Scenario: edit user register first name persist on UA
    Given user register
    When edit user first name direclty on grid
    Then edits to user should persist on UA grid

  @ua @regression
  Scenario: edit user register last name persist on UA
    Given user register
    When edit user last name direclty on grid
    Then edits to user should persist on UA grid

  @ua @regression
  Scenario: edit user register email persist on UA
    Given user register
    When edit user email direclty on grid
    Then edits to user should persist on UA grid

  @ua @regression 
  Scenario: edit user register role persist on UA
    Given user register
    When edit user role direclty on grid
    Then edits to user should persist on UA grid

  @ua @regression
  Scenario: edit user register first name persist on PU
    Given user register
    When edit user first name direclty on grid
    Then edits to user should persist on PU grid

  @ua @regression
  Scenario: edit user register last name persist on PU
    Given user register
    When edit user last name direclty on grid
    Then edits to user should persist on PU grid

  @ua @regression
  Scenario: edit user register email persist on PU
    Given user register
    When edit user email direclty on grid
    Then edits to user should persist on PU grid

  @ua @regression 
  Scenario: edit user register role persist on PU
    Given user register
    When edit user role direclty on grid
    Then edits to user should persist on PU grid
