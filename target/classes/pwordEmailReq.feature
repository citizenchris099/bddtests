Feature: SBv3 Password Reset Request Email

  Background: 
    Given on SBv3 log in page
    Then go to password request page

  @email @regression
  Scenario: Request Password Reset Email
    Given valid email
    When request password reset email
    Then receive password rest email

  @email @regression
  Scenario: Request Password Reset using Bad Email
    Given Bad email
    When request password reset with bademail
    Then email not sent

  @email1 @regression
  Scenario: Change Password via Email
    Given Received Password Reset Email
    When enter new password
    Then password updated
