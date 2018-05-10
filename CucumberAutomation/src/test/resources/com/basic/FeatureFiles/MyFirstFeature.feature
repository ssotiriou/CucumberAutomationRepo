#Author: ssotiriou@hotmail.com

Feature: Create account in Facebook (First Feature)
As a user you need to open the Facebook home page and complete validations

  @Regression
  Scenario: Validate First Name Field (First Feature)
    Given That the User is on the Facebook login page
    When User enters their first name
    Then Check that the username field is present within the first name field
    