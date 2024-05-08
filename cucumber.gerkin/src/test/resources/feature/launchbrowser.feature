
Feature: Login to a Website

  Scenario: User logs in with valid credentials
    Given the user opens the browser
    When the user navigates to the login page
    And enters the "standard_user"
    And enters the password "secret_sauce"
    And clicks the login button
    And the user login in checked
    Then the user login reuslt
    
   Scenario: User logs in with invalid credentials
   		Given the user opens the browser
   		When the user navigates to the login page
   		And enters the "lockedout_user"
   		And enters the password "secret_sauce"
   		And clicks the login button
   		And the user login in checked
   		Then the user login reuslt
    
  Scenario Outline:User credentials
  	Given the user opens the browser
    When the user navigates to the login page
    And enters the "<username>" 
    And enters the password "secret_sauce"
    And clicks the login button
    And the user login in checked
    Then the user login reuslt
    
    Examples:
    |username|
    |standard_user|
    |locked_out_user|
    |problem_user|
    |performance_glitch_user|
    

    
  