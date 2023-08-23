@CategoriesTest

Feature: Viewing items by category
  As a user
  I want to be able to use categories
  So that I can view a reduced number of items matching the category selected

  Background:
    Given I am on the Homepage
    When I click the "All Products" link

    #all products
  Scenario: Display all products
    Then the Products Page is displayed

    #women
  Scenario: Display "Women" category
    And I click the "Women" link
    Then the 'Women' products page is displayed

    #tops
  Scenario: Display "Tops" category
    And I click the expand button of the category menu
    And I clikc on the "Tops" link
    Then the 'Tops' products page is displayed

  Scenario: Display T-shirts category
    And I click the expand button of the category menu
    And I clikc on the "Tops" link
    And I clikc on the "T-shirts" link
    Then the 'T-shirts' products page is displayed

  Scenario: Display Blouses category
    And I click the expand button of the category menu
    And I clikc on the "Tops" link
    And I clikc on the "Blouses" link
    Then the 'Blouses' products page is displayed

    #dresses
  Scenario: Display "Dresses" category
    And I click the expand button of the category menu
    And I clikc on the "Dresses" link
    Then the 'Dresses' products page is displayed

  Scenario: Display "Casual Dresses" category
    And I click the expand button of the category menu
    And I clikc on the "Dresses" link
    And I clikc on the "Casual Dresses" link
    Then the 'Casual Dresses' products page is displayed

  Scenario: Display "Evening Dresses" category
    And I click the expand button of the category menu
    And I clikc on the "Dresses" link
    And I clikc on the "Evening Dresses" link
    Then the 'Evening Dresses' products page is displayed

  Scenario: Display "Summer Dresses" category
    And I click the expand button of the category menu
    And I clikc on the "Dresses" link
    And I clikc on the "Summer Dresses" link
    Then the 'Summer Dresses' products page is displayed