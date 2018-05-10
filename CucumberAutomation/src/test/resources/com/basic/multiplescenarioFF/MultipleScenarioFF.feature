#Author: ssotiriou@hotmail.com

Feature: Create account in Facebook (MultipleScenario)
As a user you need to open the Facebook home page and complete validations

  @Regression @Smoke
  Scenario: Validate First Name Field (MultipleScenario)
    Given That the User is on the Facebook login page
    When User enters their first name
    Then Check that the username field is present within the first name field
    Then Close browser
    
  @Smoke  
  Scenario: Validate create user multiple fields (MultipleScenario)
    Given That the User is on the Facebook login page
    When User enters their first name 
    And User enters their surname
    Then Check that the username field is present within the first name field 
    But User mobile field should be blank  
		Then Close browser