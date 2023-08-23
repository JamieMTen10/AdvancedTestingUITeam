@tag
Feature: Subscribe to newsletters functionality

  Scenario : Subscribe to newsletter
    Given I am on the home page
    When   I enter my email address into the subscription box
    Then I see confirmation that I have subscribed to the newsletter

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


Feature: User can Checkout

  Background:
    Given I am on the home page
    When I am signed in

  Scenario: Navigate to Checkout Page
    And I click on a product
    And I add the product to the cart
    And I click proceed to checkout
    Then I am on the checkout page

  Scenario: Purchase product with check
    And I am on the checkout page
    And I select my address
    And I select my shipping method
    And I pay by check
    And I agree to the terms of service
    Then My order confirmation is displayed

  Scenario: Purchase product with bank wire
    And I am on the checkout page
    And I select my address
    And I select my shipping method
    And I select pay by bank wire
    And I agree to the terms of service
    Then My order confirmation is displayed

