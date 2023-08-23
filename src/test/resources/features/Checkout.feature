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
