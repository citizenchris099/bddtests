Feature: change password via profile form

  @pword @regression
  Scenario: Successfully change password
    Given logged into SBv3
    When on profile page
    And enter same password into both password fields
    Then can only log into SBv3 with new password
