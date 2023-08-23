Background:

Given I am on the homepage
When I click on the ‘sign in’ button

Scenario: I log in with an invalid email (format)

And I enter an invalid email
And enter the correct password
Then an ‘Invalid format’ error message is displayed

Scenario: I log in with an invalid email (no @ symbol)

And I enter an invalid email
And enter a correct password
Then a ‘Please include an ‘@’ in the email address’ error message is displayed

Scenario: I log in with a password of less than 5 characters

And I enter a password of less than 5 characters
Then a 'Please match the requested format’ error message is displayed

Scenario: I log in without filling in a password or email

And I try to register without filling in a required field
Then a ‘Please fill out this field’ error message is displayed

Scenario: I log in with an incorrect password or email

And I log in with an incorrect email or password
Then an ‘Authentication failed’ message is displayed