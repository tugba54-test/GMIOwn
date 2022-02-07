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
    When user enter "<Password>" it should be see this "<Expected>"
    Examples:
   | Password|Expected|
   |eA22HJK  |rgba(255, 255, 0, 1)|
   |ee2$HJK  |rgba(0, 255, 0, 1) |
   | AS23    |rgba(255, 153, 0, 1)|
  # |eAA$HJK  |rgba(255, 255, 0, 1)|
  # | AS       |rgba(255, 153, 0, 1)  |
  # |AA2$HJK   | background-color: rgb(255, 255, 0); |
#   |eeAA44$$GYVE|5      |
#   |eA2$HJK       |5      |

