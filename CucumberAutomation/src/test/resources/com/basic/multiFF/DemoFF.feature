#Author: ssotiriou@hotmail.com

Feature: Validate First and Last Name (Demo)
As a user you need to validate the first and last name of the automation testing site

	@Smoke
  Scenario: Check first name and last name (Demo)
    Given That the user is on the demo site page
    When User enters first name
    When User enters last name
    Then Close browser promptly
    
    
 
	