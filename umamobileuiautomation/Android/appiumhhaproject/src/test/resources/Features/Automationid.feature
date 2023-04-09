Feature: Check Login Functionality


@Regresion
  Scenario: Check login functinality with valid credentials
    Given user is on the login page 
     When user enters username
     When user enters password 
    When user clicks on Login