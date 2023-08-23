Feature: I can change the quantity of the product
  Background:
    Given I am on the HomePage

    Scenario: I can increase quantity before adding to basket
    When I click on a product
    When I click to increase quantity
    Then I see the quantity has increased

    Scenario: I can decrease quantity before adding to basket
      When I click on a product
      When I click to decrease quantity
      Then I see the quantity has decreased

    Scenario: The quantity change is carried over to the basket
      When I click on a product
      And I click to Increase quantity
      When I click add to cart
        And I click proceed to checkout
        Then I see the same quantity in the basket page

    Scenario: I can increase quantity after adding to basket
      When I click on cart
      And I click to Increase quantity
      Then I see the quantity has increased

    Scenario: I can decrease quantity after adding to basket
      When I click on cart
      And I click to decrease quantity
      Then I see the quantity has decreased
