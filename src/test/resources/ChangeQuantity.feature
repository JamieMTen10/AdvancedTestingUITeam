Feature: I can change the quantity of the product
  Background:
    Given I am on the HomePage

    Scenario: I can increase quantity before adding to basket
    When I click on a product
    Then I am taken to the product's page
    When I click to increase quantity
    Then I see the quantity has increased
    Then I click add to cart
    When I click proceed to checkout
    Then I see the same quantity in the basket page

    Scenario: I can decrease quantity before adding to basket
      When I click on a product
      Then I am taken to the product's page
      When I click to decrease quantity
      Then I see the quantity has decreased
      Then I click add to cart
      When I click proceed to checkout
      Then I see the same quantity in the basket page

    Scenario: I can increase quantity after adding to basket
      When I click on cart
      Then I am taken to the cart page
      When I click to Increase quantity
      Then I see the quantity has inceased

    Scenario: I can decrease quantity after adding to basket
      When I click on cart
      Then I am taken to the cart page
      When I click to decrease quantity
      Then I see the quantity has decreased