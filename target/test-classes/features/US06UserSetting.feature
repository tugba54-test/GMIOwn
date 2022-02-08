@UserSetting
Feature: User info segment (User Settings) should be editable on Homepage

  Scenario:(User Settings) should be editable on Homepage
    Given user navigate to "http://www.gmibank.com"
    Then click sign in button
    When user enter "t37user"  and "12345As!"  successfully login
  Given User update "t38" and lastname "last" email "t38last@gmail.com" and "Turkish"
  Then it should be language  option as Turkish and English


#  There should be user info being populated when navigating to user info "firstname, lastname,
#  email and language"
#  There should be 2 languages available "English and Turkish"
#  There should be an option to update firstname
#  There should be an option to update lastname
#  There should be an option to update email id adding "@" sign and "." extension
