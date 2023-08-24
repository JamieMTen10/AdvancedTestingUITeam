@ChangeQuantity
Feature: I can change the quantity of the product
  Background:
    Given I am on the HomePage
    When I click on a product
      And I click to increase quantity on the product page 2 times

    Scenario: I can increase quantity before adding to basket
      Then I see the quantity has increased on the product page

      Scenario: I can decrease quantity before adding to basket
        And I click to decrease quantity on the product page
        Then I see the quantity has decreased on the product page

    Scenario: The quantity change is carried over to the basket
      When I click add to cart
        And I click proceed to checkout
        Then I see the same quantity in the basket page