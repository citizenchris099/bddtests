Feature: Log out of Studio Balfour v3

  @regression @fu @pu
  Scenario: fake  user roles limited to photographer, designer & editor
    Given logged into SB as an adviser
    When on PU Grid
    Then fake user role are limited

  @regression @fu @pu
  Scenario: fake user can log into SB
    Given fake user
    When fake user log in
    Then fake user information is correct

  @regression @fu @pu 
  Scenario: fake user present on PU after log out log in
    Given fake user
    And logged into SB as an adviser
    When on PU Grid
    Then user is found on PU Grid

  @ua @regression @fu 
  Scenario: fake user present on UA after log out log in
    Given fake user
    And logged into SB as >adviser
    When on User Admin Grid
    Then user is found User Admin Grid

  @regression @fu @pu 
  Scenario: fake user role restricted
    Given fake user
    When fake user log in
    Then fake user role is restricted

  @regression @fu @pu
  Scenario: Edit fake user First Name persist on PU grid
    Given fake user created
    And logged into SB as an adviser
    When on PU Grid
    And edit user first name direclty on PU grid
    Then edits to user should persist on PU grid

  @regression @fu @pu 
  Scenario: Edit fake user First Name persist profile
    Given fake user created
    And logged into SB as an adviser
    When on PU Grid
    And edit user first name direclty on PU grid
    Then edits to user should persist on user profile

  @pu @regression @fu 
  Scenario: Edit fake user last Name persist on grid
    Given fake user created
    And logged into SB as an adviser
    When on PU Grid
    And edit user last name direclty on PU grid
    Then edits to user should persist on PU grid

  @pu @regression @fu
  Scenario: Edit fake user last Name persist on profile
    Given fake user created
    And logged into SB as an adviser
    When on PU Grid
    And edit user last name direclty on PU grid
    Then edits to user should persist on user profile

  @pu @regression @fu 
  Scenario: Edit fake user role persist on PU grid
    Given fake user created
    And logged into SB as an adviser
    When on PU Grid
    And edit user role direclty on PU grid
    Then edits to user should persist on PU grid

  @pu @regression @fu 
  Scenario: Edit fake user role respected
    Given fake user created
    And logged into SB as an adviser
    When on PU Grid
    And edit user role direclty on PU grid
    And fake user log in
    Then fake user role is restricted

  @pu @regression @fu 
  Scenario: Edit fake user role persist on profile
    Given fake user created
    And logged into SB as an adviser
    When on PU Grid
    And edit user role direclty on PU grid
    Then edits to user should persist on user profile

  @ua @regression @fu 
  Scenario: Fake User Admin Grid Search
    Given fake user created
    And logged into SB as >adviser
    When on User Admin Grid
    Then user is found User Admin Grid

  @ua @regression @fu
  Scenario: User Admin Grid Edit Fake User First Name persist on grid
    Given fake user created
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user first name direclty on grid
    Then edits to fake user should persist on UA grid

  @ua @regression @fu
  Scenario: User Admin Grid Edit Fake User Last Name persist on grid
    Given fake user created
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user last name direclty on grid
    Then edits to fake user should persist on UA grid

  @ua @regression @fu
  Scenario: User Admin Grid Edit Fake User Role persist on grid
    Given fake user created
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user role direclty on grid
    Then edits to fake user should persist on UA grid

  @regression @fu @ua
  Scenario: UA Grid Edit Fake User Role persist on PU grid
    Given fake user created
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user role direclty on grid
    Then edits to user should persist on PU grid

  @ua @regression @fu
  Scenario: UA Grid Edit Fake User First Name persist on PU grid
    Given fake user created
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user first name direclty on grid
    Then edits to user should persist on PU grid

  @ua @regression @fu
  Scenario: UA Grid Edit Fake User Last Name persist on PU grid
    Given fake user created
    And logged into SB as >adviser
    When on User Admin Grid
    And edit user last name direclty on grid
    Then edits to user should persist on PU grid

  @regression @fu @pu 
  Scenario: Edit fake user First Name persist on PU grid
    Given fake user created
    And logged into SB as an adviser
    When on PU Grid
    And edit user first name direclty on PU grid
    Then edits to user should persist on PU edit fake user screen

  @regression @fu @pu
  Scenario: Edit fake user First Name persist on PU grid
    Given fake user created
    And logged into SB as an adviser
    When on PU Grid
    And edit user last name direclty on PU grid
    Then edits to user should persist on PU edit fake user screen

  @regression @fu @pu
  Scenario: Edit fake user First Name persist on PU grid
    Given fake user created
    And logged into SB as an adviser
    When on PU Grid
    And edit user role direclty on PU grid
    Then edits to user should persist on PU edit fake user screen

  @regression @fu @pu
  Scenario: Edit fake user info from PU edit fake user screen persist on PU grid
    Given fake user created
    And logged into SB as an adviser
    When on PU Grid
    And edit user info on PU edit fake user screen
    Then edits to user should persist on PU grid

  @regression @fu @pu  @test
  Scenario: Edit fake user info from PU edit fake user screen persist on profile
    Given fake user created
    And logged into SB as an adviser
    When on PU Grid
    And edit user info on PU edit fake user screen
    Then edits to user should persist on user profile

  @regression @fu @ua  @test
  Scenario: Edit fake user info from PU edit fake user screen persist UA grid
    Given fake user created
    And logged into SB as an adviser
    When on PU Grid
    And edit user info on PU edit fake user screen
    Then edits to fake user should persist on UA grid

  @regression @fu @ua
  Scenario: Edit fake user info from PU edit fake user screen persist on PU edit fake user screen
    Given fake user created
    And logged into SB as an adviser
    When on PU Grid
    And edit user info on PU edit fake user screen
    Then edits to user should persist on PU edit fake user screen

  @ua @regression @fu  @test
  Scenario: user disabled from UA cannot log in
    Given fake user created
    And logged into SB as >adviser
    When on User Admin Grid
    And disable user
    Then user cannot log into SB

  @regression @fu @pu  @test
  Scenario: user disabled from PU cannot log in
    Given fake user created
    And logged into SB as an adviser
    When on PU Grid
    And disable user from PU
    Then user cannot log into SB

  @pu @regression @fu  @test
  Scenario: fake user re-enabled from PU can log in
    Given PU disabled fake user can't log in
    When user re-enabled from PU
    Then user can log into SB

  @ua @regression @fu
  Scenario: fake user re-enabled from UA can log in
    Given UA disabled fake user can't log in
    When user re-enabled
    Then user can log into SB

  @fu @profile @regression
  Scenario: fake user can edit profile
    Given fake user created
    When fake user log in
    And fake user update profile
    Then edits to user should persist on user profile

  @fu @profile @regression
  Scenario: fake user profile persists on PU edit fake user screen
    Given fake user created
    When fake user log in
    And fake user update profile
    Then edits to user should persist on PU edit fake user screen

  @fu @profile @regression
  Scenario: fake user profile persists on on UA grid
    Given fake user created
    When fake user log in
    And fake user update profile
    Then edits to fake user should persist on UA grid

  @fu @profile @regression
  Scenario: fake user profile persists on on PU grid
    Given fake user created
    When fake user log in
    And fake user update profile
    Then edits to user should persist on PU grid

  @fu @profile @regression
  Scenario: fake user can edit profile
    Given fake user created
    When fake user log in
    And user update password
    Then user can log in with updated password

  @fu @ua @regression
  Scenario: fake UA Edit persist on UA grid
    Given fake user created
    And logged into SB as >adviser
    When on User Admin Grid
    And edit fake user info on UA edit fake user screen
    Then edits to user should persist on UA grid

  @fu @ua @regression
  Scenario: fake UA Edit persist on PU grid
    Given fake user created
    And logged into SB as >adviser
    When on User Admin Grid
    And edit fake user info on UA edit fake user screen
    Then edits to user should persist on PU grid

  @fu @ua @regression
  Scenario: fake UA Edit persist on user profile
    Given fake user created
    And logged into SB as >adviser
    When on User Admin Grid
    And edit fake user info on UA edit fake user screen
    Then edits to user should persist on user profile
