Feature: Registering a user

  Scenario: User is able to register
    Given I am on the sign in page
    When I press "No account?Create one here"
    And I will be directed to the registration page
    Then I can enter "First Name", "Last Name", "Email", "Password"
    And press "create an account"