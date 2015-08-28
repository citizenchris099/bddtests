Feature: SBv3 School Config Form Page

  Background: 
    Given logged into SBv3 with user than has more than seven projects

  @schoolconfig @regression
  Scenario: edit school info
    Given School is found on School List page
    When updates School Config Page
    Then School View Page displays correct info

  Scenario: changes made on School Config affect OCO
    Given on School Config Page
    When updates School Config Page
    And Go to OCO
    Then OCO reflects updates made on SC

  Scenario: changes made on School Config affect Project Config
    Given on School Config Page
    When updates School Config Page
    And Go to Project Config
    Then Project Config reflects updates made on School Config
