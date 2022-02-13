Feature: System should allow to read all customers info using api end point "https://www.gmibank.com/api/tp-customers"
  Scenario:System should allow to read all customers

  Scenario:System should allow to read all Customer using api end point
    Given user go to api end point "https://www.gmibank.com/api/tp-customers"
    And read all Customer and sets create pojo class
    Then Validate All Customer data

#  Read all customers you created and validate them from your data set
#  Readead all customers you created and validate them 1 by 1