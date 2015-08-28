Feature: SBv3 Project User Page

  @pu @regression
  Scenario Outline: Users Cant View Users of certain role types
    Given registered "<role>"
    And on PU page as "<loginas>"
    When search "<role>"
    Then "<loginas>" cant see "<role>"

    Examples: 
      | loginas          | role             |
      | sales rep        | sales rep        |
      | sales rep        | customer support |
      | sales rep        | administrator    |
      | sales rep        | disabled         |
      | adviser          | sales rep        |
      | adviser          | customer support |
      | adviser          | administrator    |
      | customer support | sales rep        |
      | customer support | customer support |
      | customer support | administrator    |

  @pu @regression
  Scenario Outline: Users Can View Users of certain role types
    Given user registered as "<role>"
    And on PU page as "<loginas>"
    When search "<role>"
    Then "<loginas>" can see "<role>"

    Examples: 
      | loginas          | role         |
      | sales rep        | adviser      |
      | sales rep        | approved     |
      | sales rep        | designer     |
      | sales rep        | editor       |
      | sales rep        | photographer |
      | sales rep        | user         |
      | adviser          | adviser      |
      | adviser          | approved     |
      | adviser          | designer     |
      | adviser          | disabled     |
      | adviser          | editor       |
      | adviser          | photographer |
      | adviser          | user         |
      | customer support | adviser      |
      | customer support | approved     |
      | customer support | designer     |
      | customer support | disabled     |

  @pu @regression
  Scenario: From Project User Add user to the user register table
    Given on Project User page
    When comploetes Project user reg form
    Then user reg appears on Project User page

  @pu @regression
  Scenario: Register User can be deleted from Project User Page
    Given user register present on grid
    When click delete register
    Then user register no longer present on grid

  @pu1 @regression
  Scenario: User project can be added from Project User Page
    Given newly registered user from Project User Page
    When add project to user from Project User Page
    Then user can access to project

  @pu1 @regression
  Scenario: User project can be removed from Project User Page
    Given newly registered user from Project User Page
    And default project changed from Project User Page
    When remove default project from Project User Page
    Then user can no longer access project

  @pu1 @regression
  Scenario: User default project can be changed from Project User Page
    Given newly registered user from Project User Page
    When change default project from Project User Page
    Then user default project changed
