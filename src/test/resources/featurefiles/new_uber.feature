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
@newuber
Feature: Uber booking feature

  Background: 
    Given Enter user login details
    Given Enter the details 2nd time


  @cab1
  Scenario: Booking cab1
    Given user want to select a car type "sedan" from uber app
    When user selecs car "sedan" and pick up point "Bangalore" and drop location "Pune"
    Then Driver strts the journey
    
  @cab2
  Scenario: Booking cab2
    Given ser wants to select a car type "mini" from uber app
    When user selcts car "mini" and pick up point "Pune" and drop location "Mumbai"
    Then Driver sarts the journey
  