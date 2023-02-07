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
@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag1
  Scenario: User registratin with different data
    Given user is on registration page
    When user enters following details
      | naveen    | automation | naveen@gmail.com | 565676 | unr |
      | navee2dn  | automation | naveen@gmail.com | 565676 | unr |
      | naveen555 | automation | naveen@gmail.com | 565676 | unr |
      | navee333n | automation | naveen@gmail.com | 565676 | unr |

  @tag2
  Scenario: User registratin with different data
    Given user is on registration page
    When user enters following details on columns
      | firstname | field      | email            | phone  | city |
      | naveen    | automation | naveen@gmail.com | 565676 | unr  |
      | navee2dn  | automation | naveen@gmail.com | 565676 | unr  |
      | naveen555 | automation | naveen@gmail.com | 565676 | unr  |
      | navee333n | automation | naveen@gmail.com | 565676 | unr  |
