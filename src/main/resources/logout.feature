Feature: Log out of Studio Balfour v3

  @smoke @regression
  Scenario: Successfully Logout
    Given logged into SBv3
    When click log out
    Then arrive at the SBv3 log in screen
