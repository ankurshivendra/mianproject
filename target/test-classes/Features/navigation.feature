
@tag
Feature: Navigation Bar
  
  @tag
  Scenario: verify navigation button
    Given enter valid username "standard_user" password "secret_sauce"
    And   click on login button 
    And   check working of navigation button working
    Then  close navigation bar
   
   @tag
   
   Scenario: verify navigation working
    
   Given enter valid username "standard_user" password "secret_sauce"
   And  click on login button 
   And  check working of navigation button working
   Then check successful selection on navigation
   Then successful selection
     
    

  #@Reg
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
