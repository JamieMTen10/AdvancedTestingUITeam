@Login
Feature:

  Background:

    Given I am on the HomePage
    When I click the Sign in link

  Scenario: I log in with an invalid email (format)


    And I enter the email address: "testesttest@testcom" and password: "testtesttesttest"
    And I click the Sign in button
    Then a "Invalid format." error message is displayed

  Scenario: I log in with an invalid email (no @ symbol)

    And I enter the email address: "testesttesttest.com" and password: "testtesttesttest"
    And I click the Sign in button
      #Then the Please include an '@' in the email address error message is displayed

  Scenario: I log in with a password of less than 5 characters

    And I enter the email address: "testesttesttest@test.com" and password: "test"
    And I click the Sign in button
      #Then a "Please match the requested format" error message is displayed

  Scenario: I log in without filling in a password

    And I enter the email address: "testesttesttest@test.com" and password: ""
    And I click the Sign in button
     # Then a "Please fill out this field" error message is displayed

  Scenario: I log in with an incorrect password

    And I enter the email address: "testesttest@test.com" and password: "test123"
    And I click the Sign in button
    Then a "Authentication failed." error message is displayed