Feature: Feature to Test Login

  Scenario: Login Sample URL using Cucumber
    Given user launch- Login URL
    And Currently in Username Input box
    When user enters username and password
    And clicks submit
    Then login shoulb be successfull
    
