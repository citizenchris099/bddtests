Feature: SBv3 Project User Page

  Scenario Outline: Users Cant View Users of certain role types
    Given on PU page as "<loginas>"
    When search "<role>"
    Then "<loginas>" cant see "<role>"

    Examples: 
      | loginas          | role             |
      | sales rep        | sales rep        |
      | sales rep        | customer support |
      | sales rep        | administrator    |
      | adviser          | sales rep        |
      | adviser          | customer support |
      | adviser          | administrator    |
      | customer support | sales rep        |
      | customer support | customer support |
      | customer support | administrator    |

  Scenario Outline: Users Can View Users of certain role types
    Given on PU page as "<loginas>"
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

  @pu
  Scenario: default role reflected on PU grid
    Given registered user with multiple projects
    And roles on projects vary
    When user change project
    Then default proj and role is reflected correctly on the PU Grid
