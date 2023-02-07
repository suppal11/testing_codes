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
@uber
Feature: Uber booking feature

Background: 
Enter user login details
Enter the details 2nd time

  @booking
  Scenario: Booking cab
    Given user wants to select a car type "sedan" from uber app
    When user selects car "sedan" and pick up point "Bangalore" and drop location "Pune"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD

@booking2
  Scenario: Booking cab
    Given user wants to select a car type "mini" from uber app
    When user selects car "mini" and pick up point "Pune" and drop location "Mumbai"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD

@booking3
  Scenario: Booking cab
    Given user wants to select a car type "micro" from uber app
    When user selects car "micro" and pick up point "Bangalore" and drop location "Mumbai"
    Then Driver starts the journey
    And Driver ends the journey
    Then User pays 1000 USD
  