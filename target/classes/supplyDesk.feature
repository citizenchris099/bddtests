Feature: SBv3 Supply Desk Page

  Background: 
    Given logged into SBv3
    When navigate to Supplies Page

  @wip
  Scenario: Submit Order to Supply Desk Page
    Given arrive at the Supplies Page
    When place order
    Then order is sent to BAAN

 