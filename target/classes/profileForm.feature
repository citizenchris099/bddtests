Feature: SBv3 Profile Form Page

  Background: 
    Given logged into SBv3
    And On SBv3 Profile Form Page

  @regression @profile
  Scenario: valid update profile
    Given valid profile email
    When update profile
    Then updates to Profile Page persist upon return
    And email updated in enfold and sbv3 font and back end

  @regression @profile1
  Scenario: invalid update profile
    Given invalid profile email
    When attempt to update profile
    Then updates do not persist for profile upon return to Profile page

  @regression @profile
  Scenario: cancel edit of Profile info
    Given valid profile email
    When cancel update
    Then user returned to home page
    And updates do not persist for profile upon return to Profile page


