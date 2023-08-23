
Feature: address amendment test

  Background:
    Given I am on the homepage
    When I click sign in link/button
    And I enter username and password
    And I click the sign in button
    And I click view my account link
    And I click address button

  Scenario: user adds first address to account
    And I click add first address button
    And I enter firstname, lastname, address, city, state zip/postal code and country
    And I click save button
    Then the following address will be added to account

  Scenario: user amends address on account
    And I click update link
    And I enter firstname, lastname, address, city, state zip/postal code and country
    And I click save button
    Then the latter address will replace the former

  Scenario: user deletes address
    And I navigate to your addresses
    And I click delete address link
    Then address will be deleted

