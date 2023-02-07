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
@amazon
Feature: Amazon feature

  @smoke
  Scenario: Search a product
    Given I have a search field on amazon page
    When I search for a product with name "Apple macbook" and price 1000
    Then product with name "Apple macbook" should be displayed
    And i want to test1
    But i want to test 2

  @regression
  Scenario: Search a product
    Given I have a search field on amazon page
    When I search for a product with name "Apple macbook0" and price 1000
    Then product with name "Apple macbook" should be displayed
    