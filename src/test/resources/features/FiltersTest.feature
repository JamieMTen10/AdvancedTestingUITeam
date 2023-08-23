@FiltersTest

Feature: Filtering items using the filtering menu
  As a user
  I want to be able to toggle filters on and off
  So that I can view a reduced number of items matching the filter(s) selected

  Background:
    Given I am on the Homepage
    When I click the "All Products" link

    # one filter at a time
  Scenario Outline: Filter by size: <size>
    And I click the "<size>" filter
    Then the products available in "<size>" are displayed
    Examples:
      | size |
      | S    |
      | M    |
      | L    |

  Scenario Outline: Filter by color: <color>
    And I click the "<color>" filter
    Then the products available in "<color>" are displayed
    Examples:
      | color  |
      | Beige  |
      | White  |
      | Black  |
      | Orange |
      | Blue   |
      | Green  |
      | Yellow |
      | Pink   |

  Scenario Outline: Filter by compositions: <compositions>
    And I click the "<compositions>" filter
    Then the products available in "<compositions>" are displayed
    Examples:
      | compositions |
      | Cotton       |
      | Polyester    |
      | Viscose      |


  Scenario Outline: Filter by styles: <styles>
    And I click the "<styles>" filter
    Then the products available in "<styles>" are displayed
    Examples:
      | styles |
      | Casual |
      | Dressy |
      | Girly  |

  Scenario Outline: Filter by properties: <properties>
    And I click the "<properties>" filter
    Then the products available in "<properties>" are displayed
    Examples:
      | properties     |
      | Colorful Dress |
      | Maxi Dress     |
      | Midi Dress     |
      | Short Dress    |
      | Short Sleeve   |

  Scenario Outline: Filter by price: <price>
    And I click the "<price>" filter
    Then the products available in "<price>" are displayed
    Examples:
      | price           |
      | $16.00 - $17.00 |
      | $25.00 - $32.00 |
      | $50.00 - $53.00 |


    # multiple filters at a time
  Scenario Outline: Filter by size: <size> and color: <color>
    And I click the "<size>" filter
    And I click the "<color>" filter
    Then the products available in "<size>" and "<color>" are displayed
    Examples:
      | size | color  |
      | S    | Green  |
      | M    | Orange |
      | L    | Blue   |

  Scenario Outline: Filter by size: <size>, color: <color> and price: <price>
    And I click the "<size>" filter
    And I click the "<color>" filter
    And I click the "<price>" filter
    Then the products available in "<size>", "<color>" and "<price>"are displayed
    Examples:
      | size | color  | price |
      | S    | Green  | $16.00 - $17.00|
      | M    | Orange | $25.00 - $32.00|
      | L    | Pink   | $50.00 - $53.00|

    Scenario: Clear all filters
      And I click the "S" filter
      And I click the "Orange" filter
      And I click the Clear All button
      Then no active filters are displayed