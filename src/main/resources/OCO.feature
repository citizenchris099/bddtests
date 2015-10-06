Feature: Log out of Studio Balfour v3

  @smoke @regression @lo
  Scenario: Successfully Logout
    Given logged into SBv3
    When click log out
    Then arrive at the SBv3 log in screen
