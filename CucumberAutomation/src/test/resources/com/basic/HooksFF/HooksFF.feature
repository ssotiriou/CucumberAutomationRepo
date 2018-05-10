#Author: ssotiriou@hotmail.com

Feature: Create account in Facebook (Hooks)
As a user you need to open the Facebook home page and complete validations

	@Regression
  Scenario: Validate First Name Field (Hooks)
    Given That the User is on the Facebook login page
    When User enters "David" as first name
    Then Check that the username "David" is present within the first name field
    
  @Smoke @Regression 
  Scenario Outline: Validate create user multiple fields (Hooks)
    Given That the User is on the Facebook login page
    When User enters "<firstname>" as first name
    And User enters their surname "<surname>"
    Then Check that the username "<firstname>" is present within the first name field 
    But User mobile field should be blank
	Examples:	
	| firstname | surname |
	| Tom  | Jerry   |
	| Bob  | Hart    |