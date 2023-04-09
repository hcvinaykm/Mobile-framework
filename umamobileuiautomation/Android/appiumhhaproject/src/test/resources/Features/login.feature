Feature: Login Module


@Regresion
  Scenario: Check login functinality with valid credentials
    Given user is on the login page 
     #When user enters username
     #When user enters password 
    When user enters credentials
    When user clicks on Login
    
  @Smoke
  Scenario: Check login functionality with valid credentials
    Given user is on the login page   
    When user enters credentials
  #  When user clicks on Login
  # Then user is on homepage
    Then user Logout from account

   
