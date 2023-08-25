@Register
Feature:
Background:

Given I am on the HomePage
When I click the Sign in link
And I click on the No account? Create one here link

Scenario: I register with an invalid email (format)

And I register with "name" and "last name" and "testtesttesttesttest@com" and "password"
Then a "Invalid format." error message is displayed

Scenario: I register with an invalid email (no @ symbol)

And I register with "name" and "last name" and "testtesttesttesttest.com" and "testtesttesttesttest"
Then the "Please include an ‘@’ in the email address" error message is displayed

Scenario: I do not fill out the email field in the form

And I register with "name" and "last name" and "" and "testtesttesttesttest"
Then the "Please fill out this field" error message is displayed

Scenario: I enter a number or a special character (not including ') into the name field

And I register with "tom3" and "last name" and "testtesttesttesttest@test.com" and "testtesttesttesttest"
Then a "Invalid name" error message is displayed

Scenario: I enter a password with less than 5 characters

And I register with "name" and "last name" and "testtesttesttesttest@test.com" and "1234"
Then the "Please match the requested format" error message is displayed

Scenario: I enter an email that has already been registered

And I register with "name" and "last name" and "testtesttest@test.com" and "password"
Then a "The email \"testtesttest@test.com\" is already used, please choose another one or sign in" error message is displayed