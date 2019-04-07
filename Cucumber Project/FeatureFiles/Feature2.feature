Feature: Composing a mail

  Scenario Outline: To Check a user is able to compose a mail to a given address
    Given Application is up and running
    And User is logged in successfully
    When User clicks on compose option
    And User enters <email_id> and <subject>
    And User Clicks on Send button
    Then Compose window is closed
    And Message window pops up.

    Examples: 
      | email_id            | subject        |
      | techbodhi@gmail.com | Resume for job |
      | ganeshabc@gmail.com | assignment     |
