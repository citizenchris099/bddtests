Feature: SBv3 On Campus Order Page

  Background: 
    Given logged into SBv3 as an adviser
    And on OCO list page

  @oco
  Scenario: new order appears on OCO list page
    Given new OCO form
    When fill out form
    Then order is found on OCO list page

  @oco
  Scenario: edit existing order
    Given order is found
    When edit order
    Then changes to order persist

  @oco
  Scenario: new order appears on OCO list page
    Given new OCO form
    When fill out form
    Then order info is correct
