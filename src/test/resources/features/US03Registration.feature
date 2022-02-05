@Register
Feature: Registration page should restrict password usage to a secure
  and high level passcode
  #"There should be at least 1 lowercase char for stronger password and
#  see the level chart change accordingly"
#  There should be at least 1 uppercase char and see the level  chart change accordingly
#  There should be at least 1 digit  and see the level  chart change accordingly
#  There should be at least 1 special char and see the level bar change accordingly
#  There should be at least 7 chars for a stronger password


  Scenario Outline:Password Restriction validate
    Given user navigate to "http://www.gmibank.com"
    Then click register
    When user enter "<Password>" it should be see this "<Message>"
    Examples:
   | Password|Message|
   |eA22HJK  |Your password should contain at least one uppercase,one digit, one lowercase and one special character|
   |eAA$HJK  |Your password should contain at least one uppercase,one digit, one lowercase and one special character |
   |AA2$HJK   | Your password should contain at least one uppercase,one digit, one lowercase and one special character   |
#   |ee2$HJK      |5      |
#   |eeAA44$$GYVE|5      |
#   |eA2$HJK       |5      |

