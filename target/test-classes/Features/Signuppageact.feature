Feature: Getting usernames and passwords
  @signup
  Scenario Outline: usernames and passwords data for signup page
    Given Open the Browser
    Then enter the Url
    And Click on the Signup page to Create new user
    Then enter the '<Email>'
    And Enter '<Password>'
    Then Enter Full name '<Full name>'
    Then Click on the Sign-up button to create new user
    Examples:
      |Email|                        |Password|      |Full name|
      |harika22222@gmail.com|        |Passcode|       |Harika|
      |harikapenmatsa22@gmail.com |  |Password   |   |Pesnmatsa |