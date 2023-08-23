@NewsletterSubscribe
Feature: Subscribe to newsletters functionality

  Scenario : Subscribe to newsletter
    Given I am on the HomePage
    When I enter my email address into the subscription box
    Then I see confirmation that I have subscribed to the newsletter

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

  Scenario: Price low to high
    And I sort by price low to high
    Then I see products ordered from lowest price to highest price

  Scenario: Price high to low
    And I sort by price high to low
    Then I see products ordered from highest price to lowest price



