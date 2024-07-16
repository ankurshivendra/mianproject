
@tag
Feature: verify successfull login

 
  @tag
  Scenario: succefully login
    Given enter valid username "standard_user" password "secret_sauce"
    When click on login button
    Then verify login pages
