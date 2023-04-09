Feature: RC1 Test Scenarios

#@Smoke
    #Scenario: verify the  functionality of clock in and out procedure
    #Given user is on the login page
    #When user enters credentials
    #When user clicks on Login
    #Then user is on homepage
    #When user Click on the patient details
    #When user Click on the Clock In button    
    #And Click on continue
    #Then click on Clock out
    #When Click on continue
    #Then user is on homepage
    

@Smoke
    Scenario: verify the  functionality of change language for Hindi from Login page
    Given user is on the login page
    When user clicks on LanguagePicker button
    Then user should see select language page
    When user selects Hindi language
    And user clicks on Apply button
    When user enters credentials
    When user clicks on Login for hindi
    Then user should see all content in hindi

@Smoke
    Scenario: verify the  functionality of change language for Gujarathi from Login page
    Given user is on the login page
    When user clicks on LanguagePicker button
    Then user should see select language page
    When user selects Gujarathi language
    And user clicks on Apply button
    When user enters credentials
    When user clicks on Login for Gujarathi
    Then user should see all content in Gujarathi
    
@Smoke
Scenario: verify the change language for Francais option from menu
Given user is on the login page   
    When user enters credentials
    When user clicks on Login
    Then user is on homepage
    When user clicks on menu
    And user selects change language option
    And user selects Francais language
    And user clicks on Apply button
    Then user should see the Francais language on Schedule screen
    Then user should see the Francais language on Patient screen
    Then user should see the Francais language on Chat screen
    Then user should see the Francais language on Menu screen


@Smoke
Scenario: verify the change language option for espanol from menu
Given user is on the login page   
    When user enters credentials
    When user clicks on Login
    Then user is on homepage
    When user clicks on menu
    And user selects change language option
    And user selects espanol language
    And user clicks on Apply button
    Then user should see the espanol language on Schedule screen
    Then user should see the espanol language on Patient screen
    Then user should see the espanol language on Chat screen
    Then user should see the espanol language on Menu screen

@Smoke
Scenario: verify the  functionality of patient search 
    Given user is on the login page
    When user enters credentials
    When user clicks on Login
   Then user is on homepage
    When user clicks on Patients
    When user enters valid patient name
    Then result should match with search criteria
    
@Smoke
Scenario: Verify all the bottom tabs click functionality after user logs in
Given user is on the login page
    When user enters credentials
    When user clicks on Login
    Then user is on homepage
    When user clicks on Patients
    Then user should land on patient screen
    When user clicks on chat
    Then user should land on chat screen
    When user clicks on menu
    Then user should land on menu screen
    When user clicks on schedule
    Then user should land on schedule screen

@Smoke
Scenario: verify the  functionality of Email button for verification
    Given user is on the login page
    When user clicks on Sign_Up_Here button
    When user fills Email Address Password Confirm Password Fields
    When user clicks on Signup button


 @Smoke
  Scenario: Check login functionality with valid credentials
    Given user is on the login page   
    When user enters credentials
    When user clicks on Login
   Then user is on homepage
    Then user Logout from account
