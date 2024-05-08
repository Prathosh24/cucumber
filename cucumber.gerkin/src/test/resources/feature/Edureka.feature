#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Login to Edureka


  Scenario: Title of your scenario
    Given the user launches the browser
    When the user navigates to the Edureka login page
    And the user enters the right login credentials
    Then the user should be logged in successfully
    And the user navigates to the profile page
    And the user navigates to the profile editing page
    And the user populates the page1 with values
    Then the profile should be updated successfully
