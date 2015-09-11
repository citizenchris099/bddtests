Feature: SBv3 Project User Page

 @smoke @regression @pw
  Scenario: correct after navigating to & from sales dashbaord
    Given user w/access to all projects logged into system
    When switch project
    And navigate to sales db
    And navigate back home
    Then correct proj loaded in proj switcher
