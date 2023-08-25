@NewsletterSubscribe
Feature: Subscribe to newsletters functionality

  Scenario : Subscribe to newsletter
    Given I am on the HomePage
    When I enter my email address into the subscription box
    Then I see confirmation that I have subscribed to the newsletter
