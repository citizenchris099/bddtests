Feature: Site Search of Studio Balfour v3

  @smoke @regression @search
  Scenario: Successfull Search
    Given logged into SBv3
    When perform search
    Then arrive at searcg results page
    And links on results page take you to their respective page

  @smoke @regression @search
  Scenario: Unsuccessfull Search
    Given logged into SBv3
    When perform bad search
    Then arrive at searcg results page
    And message appears indicating search not found
