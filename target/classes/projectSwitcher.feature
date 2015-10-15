Feature: SBv3 Project User Page

 @ua @regression
  Scenario: user with finite project access switch projects
    Given registered user with multiple projects
    And logged into SB as user with multiple projects
    When User switch Projects
    Then edits to user role should persist on all projects on Project and Role page

