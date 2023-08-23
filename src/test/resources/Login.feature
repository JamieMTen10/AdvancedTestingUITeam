Background:

Given I am on the HomePage
When I click on the Sign in link

Scenario: I log in with an invalid email (format)

And I enter 'email' and 'password'
And I click the Sign in button
Then a "Invalid format" error message is displayed

Scenario: I log in with an invalid email (no @ symbol)

And I enter an 'email' and 'password'
And I click the Sign in button
Then a "Please include an '@' in the email address" error message is displayed

Scenario: I log in with a password of less than 5 characters

And I enter an 'email' and 'password'
And I click the Sign in button
Then a "Please match the requested format" error message is displayed

Scenario: I log in without filling in a password or email

And I register without filling in a required field
Then a "Please fill out this field" error message is displayed

Scenario: I log in with an incorrect password or email

And I enter an 'email' and 'password'
And I click the Sign in button
Then an "Authentication failed" message is displayed
