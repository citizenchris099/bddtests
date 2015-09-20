Feature: Log out of Studio Balfour v3

  @regression @fu
  Scenario: fake  user roles limited to photographer, designer & editor
    Given logged into SB as an adviser
    When on PU Grid
    Then fake user role are limited

  @regression @fu @test
  Scenario: fake user can log into SB
    Given fake user
    When fake user log in
    Then fake user information is correct

  @test @regression @fu
  Scenario: fake user role restricted
    Given fake user
    When fake user log in
    Then fake user role is restricted
