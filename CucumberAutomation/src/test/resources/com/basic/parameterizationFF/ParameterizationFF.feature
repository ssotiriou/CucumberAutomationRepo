#Author: ssotiriou@hotmail.com

Feature: Create account in Facebook (Parameterization)
As a user you need to open the Facebook home page and complete validations

  @Critical
  Scenario: Validate First Name Field (Parameterization)
    Given That the User is on the Facebook login page
    When User enters "David" as first name
    Then Check that the username "David" is present within the first name field
    Then Close browser
    
  @Critical  
  Scenario Outline: Validate create user multiple fields (Parameterization)
    Given That the User is on the Facebook login page
    When User enters "<firstname>" as first name
    And User enters their surname "<surname>"
    Then Check that the username "<firstname>" is present within the first name field 
    But User mobile field should be blank  
		Then Close browser
	Examples:	
	| firstname | surname |
	| Tom  | Jerry   |
	| Bob  | Hart    |
	