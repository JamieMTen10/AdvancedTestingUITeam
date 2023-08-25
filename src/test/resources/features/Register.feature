@RegisterTest
Feature: Registering a user

  Background: I am on the HomePage
    Given I am on the Sign in page
    When I press "No account?Create one here"
    And I will be directed to the registration page

  Scenario: I am registering with just the firstname,lastname,email and password
    When I enter "firstname", "lastname", "email", "password"
    And press "save"
    Then I am registered
    And the HomePage is displayed
    And I am logged in


