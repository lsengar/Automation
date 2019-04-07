Feature: Gmail login feature
  I want to use this template for my feature file

  Scenario: To check if the user is able to login gmail with valid credentials
    Given Application is up and running
    When User enters valid credentials
    Then Home page should be displayed
