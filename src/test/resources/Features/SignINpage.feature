Feature: Signin Page
  @signin
  Scenario: Signin using the signupdata got from the features file
    Given Open the Browser
    Then enter the Url
    Then Click on sign-in page
    And Enter Email-data in email field
    Then  Enter Passcode
    Then Click on Signin button
