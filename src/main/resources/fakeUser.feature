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

  @pu @regression @fu
  Scenario: Edit fake user last Name persist on grid
    Given fake user created
    And logged into SB as an adviser
    When on PU Grid
    And edit user last name direclty on PU grid
    Then edits to user should persist on PU grid

  @pu @regression @fu
  Scenario: Edit fake user role persist on PU grid
    Given fake user created
    And logged into SB as an adviser
    When on PU Grid
    And edit user role direclty on PU grid
    Then edits to user should persist on PU grid

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

  @regression @fu @pu @test
  Scenario: Edit fake user First Name persist on PU grid
    Given fake user created
    And logged into SB as an adviser
    When on PU Grid
    And edit user last name direclty on PU grid
    Then edits to user should persist on PU edit fake user screen

  @regression @fu @pu @test
  Scenario: Edit fake user First Name persist on PU grid
    Given fake user created
    And logged into SB as an adviser
    When on PU Grid
    And edit user role direclty on PU grid
    Then edits to user should persist on PU edit fake user screen
