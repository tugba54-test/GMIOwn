@InValidLogin2
Feature:should not be accessible with invalid credentials

  Scenario Outline: should not be accessible with invalid credentials
    Given user navigate to "http://www.gmibank.com"
    Then click sign in button
    When user enter "<Username>"  and "<Password>"  And see the  "<Message>"
    Examples:
  |Username|Password|Message|
  |admin   |12345   |Failed to sign in!|
  |user    |12345   |Failed to sign in!|
  # |12345   |admin   |Failed to sign in! Please check your credentials and try again.|
#  |12345   |user    |





#    User cannot login with invalid username validating the error message
#    User cannot login with invalid password validating the error message
#    User cannot login with invalid username and password validating the error message
#    User with invalid credentials should be given an option to reset their password
#    User should be given the option to navigate to registration page if they did not register yet


