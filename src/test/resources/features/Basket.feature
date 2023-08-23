@BasketTest
Feature: The Basket Page

  Background:
    Given I am on the HomePage
    When I go to the Products page
    And I add 1 product to the cart

  Scenario: Add products to the cart
    Then The message "Product successfully added to your shopping cart" is displayed
    
  Scenario: Remove products from cart
    And I remove a product from the cart
    Then The product is no longer in the cart

  Scenario: Increasing the quantity of product in cart
    And I increase the number of the product in the cart by 2
    Then There are 3 of the product in the cart

  Scenario: Decreasing the quantity of product in cart
    And I decrease the number of the product in the cart by 1
    Then There are 0 of the product in the cart








