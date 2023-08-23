
Feature: address amendment test

  Background:
    Given I am on the HomePage
    When I click Sign in link
    And I enter "username" and "password"
    And I click the Sign in button
    And I click View My Account link

  Scenario: user adds first address to account
    And I click add first address button
    And I enter "firstname", "lastname", "address", "city", "state zip/postal code" and "country"
    And I click save button
    Then the following address will be added to account

  Scenario: user amends address on account
    And I click Addresses link
    And I click update link
    And I enter "firstname", "lastname", "address", "city", "state zip/postal code" and "country"
    And I click save button
    Then the latter address will replace the former

  Scenario: user deletes address
    And I click Addresses link
    And I click Delete link
    Then address will be deleted

