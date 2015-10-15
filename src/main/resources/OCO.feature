Feature: Log out of Studio Balfour v3

  # SaN = save and new
  # Cash = order payment type is cash
  # PiF = paid in full
  # Stu = only student info filled out
  @oco @regression
  Scenario: Successfull SaN Cash PiF Stu
    Given on OCO list page
    When create OCO using SaN Cash PiF Stu
    Then view OCO info is correct

  @oco @regression
  Scenario: Successfull SaN Cash PiF Stu
    Given on OCO list page
    When create OCO using SaN Cash PiF Stu
    Then view OCO info is correct
    And edit OCO info is correct
