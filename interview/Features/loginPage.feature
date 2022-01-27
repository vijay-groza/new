@login
Feature: Login feature


  Scenario: validation of login page
    Given the user is provided with the login page
    When the user enters the user name and the password
    And the user clicks the login button
    Then the user enters into the Home Page
