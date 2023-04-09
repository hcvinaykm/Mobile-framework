Feature: RC3 Test Scenarios

@Regression
    Scenario: verify the  functionality of device id in profile
    Given user is on the login page
    When user verifies the apply button
    When user enters credentials
    When user clicks on Login
    Then user should land on third party terms page
    When user clicks on accept terms button
    Then user is on homepage   
    Then user should see menu in bottom navbars 
    When user clicks on menu
    And user clicks on profile
    And user clicks on device id to copy
    Then user should get text copied popup


    
 @Regresion
     Scenario: verify the  functionality of +new unscheduled visit link from schedule screen for patient not in the list
     Given user is on the login page
     When user verifies the apply button
     When user enters credentials
     When user clicks on Login
     Then user should land on third party terms page
     When user clicks on accept terms button
     Then user is on homepage
     When user clicks on New Unscheduled Visit 
     Then user should land on new visit page
     When user clicks on patient not in list button
     When Click on continue
     Then user should land on POC page
     And click on Clock out
     Then user is on homepage

 @Regresion
     Scenario: create an unscheduled visit from +new unscheduled visit link from schedule screen for patient in the list
     Given user is on the login page
     When user verifies the apply button
     When user enters credentials
     When user clicks on Login
     Then user should land on third party terms page
     When user clicks on accept terms button
     Then user is on homepage
     When user clicks on New Unscheduled Visit link
     Then user should land on new visit page
     When user clicks on any patient which are in the list 
     Then user should land on Confirm Unscheduled Visit popup
     When user clicks on Create Unscheduled Visit button
     When Click on continue
     Then user should land on POC page
     When user selects any service from service code selection
     And user clicks on OK button
     And click on Clock out
     And Click on continue
     Then user is on homepage

@Regresion
     Scenario: cretae an unscheduled visit from patients tab by selecting any patient which is in the list
     Given user is on the login page
     When user verifies the apply button
     When user enters credentials
     When user clicks on Login
     Then user should land on third party terms page
     When user clicks on accept terms button
     Then user is on homepage
     Then user should see patients in bottom navbars 
     When user clicks on Patients
     Then user should land on patient screen
     When user clicks on any patient which are in the list 
     And user clicks on New Visit button
     Then user should land on Confirm Unscheduled Visit popup
     When user clicks on Create Unscheduled Visit button
     And Click on continue
     Then user should land on POC page
     When user selects any service from service code selection
     And user clicks on OK button
     And click on Clock out
     And Click on continue
     Then user is on homepage

@Regresion
     Scenario: Service code selection from schedule screen
     Given user is on the login page
     When user verifies the apply button
     When user enters credentials
     When user clicks on Login
     Then user should land on third party terms page
     When user clicks on accept terms button
     Then user is on homepage
     When user clicks on New Unscheduled Visit link
     Then user should land on new visit page
     When user clicks on any patient which are in the list 
     Then user should land on Confirm Unscheduled Visit popup
     When user clicks on Create Unscheduled Visit button
     When Click on continue
     Then user should land on POC page
     When user selects any service from service code selection
     And user clicks on OK button
     And click on Clock out
     And Click on continue
     Then user is on homepage
     
@Regresion
     Scenario: Service code selection from patients tab
     Given user is on the login page
     When user verifies the apply button
     When user enters credentials
     When user clicks on Login
     Then user should land on third party terms page
     When user clicks on accept terms button
     Then user is on homepage
     When user clicks on Patients
     Then user should land on patient screen
     When user clicks on any patient which are in the list 
     And user clicks on New Visit button
     Then user should land on Confirm Unscheduled Visit popup
     When user clicks on Create Unscheduled Visit button
     And Click on continue
     Then user should land on POC page
     When user selects any service from service code selection
     And user clicks on OK button
     And click on Clock out
     And Click on continue
     Then user is on homepage

  @Regresion
    Scenario: verify the  functionality of patient search for invalid patientname
     Given user is on the login page
     When user verifies the apply button
     When user enters credentials    
     When user clicks on Login
     Then user should land on third party terms page
     When user clicks on accept terms button
     Then user is on homepage
     When user clicks on Patients
     Then user should land on patient screen
     When user enters invalid patient name 
     Then Error message should be displayed accordingly

 

  @Regresion
    Scenario: verify the  functionality of patient search for valid patientname
     Given user is on the login page
     When user verifies the apply button
     When user enters credentials
     When user clicks on Login
     Then user should land on third party terms page
     When user clicks on accept terms button
     Then user is on homepage
     When user clicks on Patients
     Then user should land on patient screen
     When user enters valid patient name
     Then Result should match with patient name
     
 