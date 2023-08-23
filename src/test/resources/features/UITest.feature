
  @tag
    Feature: site is able to be accessed
      Background:
        Given I am on the loan app site
    Scenario Outline: enter login details
      When I click sign out
      And I enter username as "<username>"
      And I enter password as "<password>"
      And click sign in
      Then I am logged in
      Examples:
        | username  | password |
        | user      | password |


    When I click on the loan application link