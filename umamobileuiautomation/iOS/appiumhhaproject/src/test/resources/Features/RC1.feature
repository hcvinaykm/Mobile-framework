Feature: RC1 Testing Scenarios


@Smoke
   Scenario: verify the  functionality of clock in and out procedure
    Given user is on the login page
    When user verifies the apply button
    When user verifies the allow button  
    When user verifies the notyou button
    When user enters credentials
    When user clicks on Login
    Then user is on homepage
    When user Click on the patient details
    When user Click on the Clock In button
    When user verifies the allow button    
    And Click on continue    
    Then click on Clock out
    When Click on continue
    Then user is on homepage
   

@Smoke 
    Scenario: verify the  functionality of change language for Hindi from Login page
    When user verifies the allow button  
    Given user is on the login page
    When user verifies the apply button
    When user verifies the notyou button
    When user verifies the Hha notification popup
    When user verifies the location services popup
    When user clicks on LanguagePicker button
    When user selects Hindi language
    And user clicks on Apply button
    When user verifies the Hha notification popup
    When user verifies the location services popup
    When user enters credentials
    When user clicks on Login 
    When user clicks on menu
    And user selects change language option in hindi
    Then user changes the language to English

@Smoke
    Scenario: verify the  functionality of change language for Gujarathi from Login page
    Given user is on the login page 
    When user verifies the apply button
    When user verifies the notyou button    
    When user verifies the Hha notification popup
    When user verifies the location services popup
    When user clicks on LanguagePicker button
    When user selects Gujarathi language
    And user clicks on Apply button
    When user verifies the Hha notification popup
    When user verifies the location services popup
    When user enters credentials
    When user clicks on Login 
    When user clicks on menu
    And user selects change language option in gujarathi
    Then user changes the language to English
    
@Smoke
   Scenario: verify the change language for Francais option from menu
    Given user is on the login page 
    When user verifies the allow button  
    When user verifies the apply button 
    When user verifies the notyou button 
    When user verifies the Hha notification popup
    When user verifies the location services popup
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
    When user selects change language option in francais
    Then user changes the language to English


@Smoke
    Scenario: verify the change language option for espanol from menu
     Given user is on the login page
     When user verifies the allow button  
     When user verifies the apply button
     When user verifies the notyou button  
     When user verifies the Hha notification popup
     When user verifies the location services popup
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
     When user selects change language option in espanol
     Then user changes the language to English


@Smoke
   Scenario: verify the  functionality of patient search 
    Given user is on the login page
    When user verifies the allow button 
    When user verifies the apply button
    When user verifies the notyou button
    When user verifies the Hha notification popup
    When user verifies the location services popup
    When user enters credentials
    When user clicks on Login
    Then user is on homepage
    When user clicks on Patients
    When user enters valid patient name
    Then result should match with search criteria
    
@Smoke
    Scenario: Verify all the bottom tabs click functionality after user logs in
    Given user is on the login page
    When user verifies the allow button 
    When user verifies the apply button
    When user verifies the notyou button
    When user verifies the Hha notification popup
    When user verifies the location services popup
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
     Scenario: Check login functionality with valid credentials
      Given user is on the login page 
      When user verifies the allow button 
      When user verifies the apply button
      When user verifies the notyou button 
      When user verifies the Hha notification popup
      When user verifies the location services popup
      When user enters credentials
      When user clicks on Login
      Then user is on homepage
      Then user Logout from account