Background:

Given I am on the HomePage
When I click on the Sign in link
And I click on the No account? Create one here link

Scenario: I register with an invalid email (format)

And I register
Then an "Invalid format" error message is displayed

Scenario: I register with an invalid email (no @ symbol)

And I register
Then a "Please include an ‘@’ in the email address" error message is displayed

Scenario: I do not fill out a required field

And I register
Then a "Please fill out this field" error message is displayed

Scenario: I enter a number or a special character (not including ') into the name field

And I register
Then an "invalid name" error message is displayed

Scenario: I enter a password with less than 5 characters

And I register
Then a "Please match the requested format" error message is displayed

Scenario: I enter an email that has already been registered

And I register with an email that has already been registered
Then a "The email is already used, please choose another one or sign in" error message is displayed
