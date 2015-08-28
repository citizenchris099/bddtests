Feature: Studio Balfour Pages

  @smoke
  Scenario: Profile Form page load
    Given logged into SBv3
    When navigate to Profile Form
    Then Profile Form page loads

  @smoke
  Scenario: OCO page load
    Given logged into SBv3
    When navigate to OCO
    Then OCO page loads

  @smoke2
  Scenario: Project Config page load
    Given logged into SBv3
    When navigate to Project List Page
    And choose project
    Then Project Config page loads

  @smoke
  Scenario: School List page load
    Given logged into SBv3
    When navigate to School List Page
    And choose school
    Then School Config page loads

  @smoke
  Scenario: Supplies page load
    Given logged into SBv3
    When navigate to Supplies Page Page
    Then Supplies Page loads
