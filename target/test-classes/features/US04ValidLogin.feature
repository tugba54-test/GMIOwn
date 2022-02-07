@ValidLogin
Feature: Login page should accessible with valid credentials

  Scenario Outline: Login page should accessible with valid credentials
    Given user navigate to "http://www.gmibank.com"
    Then click sign in button
    When user enter "<username>"  and "<Password>"  succeessfully login
    Given then can be log out
    Examples:
      | username   | Password |
      |t37customer |12345As!|
      |Sunny       |Jsunny34*|


#  There should be a valid username and password validating the success message to login
#  There should be an option to cancel login



