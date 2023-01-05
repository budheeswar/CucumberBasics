Feature: Feature of Login Functionality

  Scenario: Checking Login Credentials
    Given User on Login Page
    When User enters username and password
    And User clicked Login Page
    Then login should be successful
