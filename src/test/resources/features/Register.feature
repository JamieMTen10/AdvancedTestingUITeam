Feature: Registering a user

  Scenario: User is able to register
    Given I am on the sign in page
    When I press "No account?Create one here"
    And I will be directed to the registration page
    And I enter "firstname", "lastname", "email", "password"
    And press "create an account"
    Then I am registered
    And the HomePage is displayed 
    And I am logged in
