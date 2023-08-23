@SortByFunction
Feature: Sort by functionality

  Background:
    Given I am on the home page
    When I search "dress" in the search bar

  Scenario: Sort by name A-Z
    And I sort by name A-Z
    Then I see product results in alphabetical order

  Scenario: Sort by name Z-A
    And I sort by name Z-A
    Then I see product results in reverse alphabetical order

  Scenario: Sort by price low to high
    And I sort by price low to high
    Then I see products ordered from lowest price to highest price
