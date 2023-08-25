@Address
Feature: address amendment test

  Background:
    Given I am on the HomePage
    When I click Sign in link
    And I enter "spiderman@test.com" and "testautomation"
    And I click the Sign in button
    And I click View My Account link

  Scenario: user adds first address to account
    And I click add first address link
    And I enter "Spiderman", "Spideyson", "567 bubble lane", "Leeds", "Alabama", "28453" and "country"
    And I click save button
    Then the following address will be added to account

  Scenario: user amends address on account
    And I click View My Account link again
    And I click Addresses link
    And I click update link
    And I enter "Batman", "Batmanson", "234 strawberry ave", "Leeds", "Alabama", "38432" and "country"
    And I click save button
    Then the latter address will replace the former

  Scenario: user deletes address
    And I click Addresses link
    And I click Delete link
    Then address will be deleted


