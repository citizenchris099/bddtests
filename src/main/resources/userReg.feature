Feature: SBv3 Project User Page

  @ur
  Scenario Outline: Successfull User Registration
    Given project set to "<regType>"
    When user registers to project set to "<regType>"
    Then user can log into project
    And user is set to the approved role

    Examples: 
      | regType       |
      | Open          |
      | Password Only |
      | Invite Only   |

  @ur1
  Scenario Outline: UnSucessfull User Registration
    Given on project config page
    When the project is set to "<regType>"
    Then when user attempts to register against project set to "<regType>" they receive "<msg>"

    Examples: 
      | regType       | msg                         |
      | Closed        | Project Registration Closed |
      | Password Only | Invalid Project Password    |
