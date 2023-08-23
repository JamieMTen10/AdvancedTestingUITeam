Background:

Given I am on the homepage
When I click on the ‘sign in’ button
And the ‘No account? Create one here’ button

Scenario: I register with an invalid email (format)

And I register with an invalid email
Then an ‘Invalid format’ error message is displayed

Scenario: I register with an invalid email (no @ symbol)

And I register with an invalid email
Then a ‘Please include an ‘@’ in the email address’ error message is displayed

Scenario: I do not fill out a required field

And I register without filling in a required field
Then a ‘Please fill out this field’ error message is displayed

Scenario: I enter a number or a special character (not including ') into the name field

And I register by entering a number or a special character (not including ') into the first or last name fields
Then an ‘invalid name’ error message is displayed

Scenario: I enter a password with less than 5 characters

And I register by entering a password with less than 5 characters
Then a 'Please match the requested format’ error message is displayed

Scenario: I enter an email that has already been registered

And I register with an email that has already been registered
Then a 'The email is already used, please choose another one or sign in' error message is displayed