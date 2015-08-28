Feature: Studio Balfour Project Config Page

  Background: 
    Given logged into SBv3 with user than has more than seven projects

  @projconfig @regression
  Scenario: edit project info
    Given Project is found on Project List page
    When updates Project Config Page
    Then Project View Page displays correct info
