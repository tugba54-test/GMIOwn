@ReadingApplicant
Feature: System should allow to read all Applicants using api end point
  "https://www.gmibank.com/api/tp-account-registrations"

  Scenario:System should allow to read all Applicants using api end point
 Given user go to api end point  "https://www.gmibank.com/api/tp-customers"
 And read all applicants and sets create pojo class
  Then Validate data
#  System should allow to read all Applicants using api end point
#  "https://www.gmibank.com/api/tp-account-registrations"
#  Read all registrants you created and validate them 1 by 1
