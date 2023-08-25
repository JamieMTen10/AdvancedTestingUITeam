@CategoriesTest

Feature: Viewing items by category
  As a user
  I want to be able to use categories
  So that I can view a reduced number of items matching the category selected

  Background:
    Given I am on the HomePage
    When I click the All Products link

    #all products
  Scenario: Display all products
    Then the "HOME" products page is displayed
#
#    #women
  Scenario: Display "Women" category
    And I click the Women link
    Then the "WOMEN" products page is displayed
#
#    #tops
  Scenario: Display "Tops" category
    And I click the Women link
    And I click the Tops link
    Then the "TOPS" products page is displayed
#
  Scenario: Display "T-shirts" category
    And I click the Women link
    And I click the Tops link
    And I click the T-shirts link
    Then the "T-SHIRTS" products page is displayed
#
  Scenario: Display "Blouses" category
    And I click the Women link
    And I click the Tops link
    And I click the Blouses link
    Then the "BLOUSES" products page is displayed
#
    #dresses
  Scenario: Display "Dresses" category
    And I click the Women link
    And I click the Dresses link
    Then the "DRESSES" products page is displayed
#
  Scenario: Display "Casual Dresses" category
    And I click the Women link
    And I click the Dresses link
    And I click the Casual Dresses link
    Then the 'CASUAL DRESSES' products page is displayed
#
  Scenario: Display "Evening Dresses" category
    And I click the Women link
    And I click the Dresses link
    And I click the Evening Dresses link
    Then the 'EVENING DRESSES' products page is displayed
#
  Scenario: Display "Summer Dresses" category
    And I click the Women link
    And I click the Dresses link
    And I click the Summer Dresses link
    Then the 'SUMMER DRESSES' products page is displayed