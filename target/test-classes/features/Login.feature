@invalid
Feature: Invalid Email
  Scenario Outline:Email id cannot contain just digits or chars without "@" sign or "." extension
    Given user navigate to "http://www.gmibank.com"
    Then click register
    When user enter the "<email>" see "<errormessage>"

    Examples:
      |email          |errormessage         |
      |12345gmail.com |Your email is invalid |
      |12345@gmailcom |Your email is invalid|
      |Aysegmail.com  |Your email is invalid|
      |Ayse@gmailcom  |Your email is invalid|

 # Scenario: There should not be an option of any other language other than English or Turkish



      #Admin	123-48-8888	t37	admin	ab 123	832-555-5555	t37admin	t37admin@gmail.com	12345As!
      #User	123-48-8887	t37	user	ab 123	832-555-5555	t37user	t37user@gmail.com	12345As!
      #Employee	123-48-8886	t37	employee	ab 123	832-555-5555	t37employee	t37employee@gmail.com	12345As!
      #Manager	123-48-8885	t37	manager	ab 123	832-555-5555	t37manager	t37manager@gmail.com	12345As!