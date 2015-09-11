Feature: Log out of Studio Balfour v3

  @regression @fu
  Scenario: fake  user roles limited to photographer, designer & editor
    Given adviser user logged in SB
    And on project user page
    When fake option is chosen
    Then roles are limited to photographer, designer & editor

  @regression @fu
  Scenario: adviser can edit fake user from project user grid
    Given adviser user logged in SB
    And on project user page
    When fake option is chosen
    Then roles are limited to photographer, designer & editor
