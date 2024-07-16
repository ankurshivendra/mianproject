
@tag
Feature: Cart button
 

  @tag
  Scenario: verify cart button funstionality
    Given enter valid username "standard_user" password "secret_sauce"
    And   click on login button 
    Then  add product into cart
    
 @tag
 
 Scenario: cart verification
    Given enter valid username "standard_user" password "secret_sauce"
    And   click on login button 
    Then  add product into cart
    And   verify cart element
    
  
  @tag
  
    Scenario: verify cart button functions
    Given enter valid username "standard_user" password "secret_sauce"
    And   click on login button 
    Then  add product into cart 
    Then  click on cart btn
    
   

 