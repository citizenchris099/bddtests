Feature: Log out of Studio Balfour v3

  @ua
  Scenario: User Admin Grid Search
    Given registered user
    And logged into SB as >adviser
    When on User Admin Grid
    Then user is found User Admin Grid
