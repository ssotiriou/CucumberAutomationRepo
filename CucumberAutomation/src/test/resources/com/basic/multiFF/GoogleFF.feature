#Author: ssotiriou@hotmail.com

Feature: Validate Google Search (Google)
As a user you need to validate the google search feature

	@Regression @Smoke
  Scenario: Validate Search Field (Google)
    Given That the user is on google home page
    When User enters search string
    
 
	