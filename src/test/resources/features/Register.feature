@RegisterTest
Feature: Registering a user

  Background: I am on the HomePage
    Given I am on the Sign in page
    When I press "No account?Create one here"
    And I will be directed to the registration page

