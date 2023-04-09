Feature: RC4 Test Scenarios

  #Executable on Local/Single Device on AWS
  # uncomment if required to run below test scenarios(Local/Single device on AWS) by creating test data via uma portal
  
  #@Smoke
  #Scenario: verify the  functionality of clock in and out procedure linked consecutive shifts
  #Given user is on the login page
  #When user verifies the apply button
  #When user enters credentials
  #When user clicks on Login
  # Then user should land on third party terms page
  # When user clicks on accept terms button
  #Then user is on homepage
  #When user Click on the linked patient details
  #When user Click on the Clock In button
  #When Click on continue
  #Then user should land on POC page
  #When Click on continue for first shift
  #Then click on Clock out
  #When Click on continue
  #Then user is on homepage
  
  #Executable on Local/Single Device on AWS
  #@Smoke
  #Scenario: verify the  functionality of clock in and out procedure
  #Given user is on the login page
  #When user verifies the apply button
  #When user enters credentials for consecutive user
  #When user clicks on Login
  # Then user should land on third party terms page
  # When user clicks on accept terms button
  #Then user is on homepage
  #When user Click on the patient details
  #When user Click on the Clock In button for consecutive shift
  #And Click on continue
  #Then click on Clock out
  #When Click on continue
  #Then user is on homepage
  #Executable on Local/Single Device on AWS
  
  #@Smoke
  #Scenario: verify the  functionality of clock in and out procedure mutual consecutive shifts
  #Given user is on the login page
  #When user verifies the apply button
  #When user enters credentials
  #When user clicks on Login
  #Then user should land on third party terms page
  #When user clicks on accept terms button
  #Then user is on homepage
  #When user Click on the mutual patient details
  #When user Click on the Clock In button for consecutive shift
  #When Click on continue
  #Then user should land on POC page
  #When Click on continue for first shift
  #Then click on Clock out
  #When Click on continue
  #Then user is on homepage
  #Executable on Local/Single Device on AWS
  
  #@Smoke
  #Scenario: verify the  functionality of clock in and out procedure of single consecutive shifts
  #Given user is on the login page
  #When user verifies the apply button
  #When user enters credentials for consecutive user
  #When user clicks on Login
  # Then user should land on third party terms page
  # When user clicks on accept terms button
  #Then user is on homepage
  #When user Click on the consecutive patient details
  #When user Click on the Clock In button for consecutive shift
  #When Click on continue
  #Then user should land on POC page
  #When Click on continue for first shift
  #And Click on continue for second shift
  #Then click on Clock out
  #When Click on continue
  #Then user is on homepage
  #Executable on Local/Single Device on AWS
  
  #@Smoke
  #Scenario: verify the  functionality of clock in and out procedure of comingled consecutive shifts
  #Given user is on the login page
  #When user verifies the apply button
  #When user enters credentials for commingled user
  #When user clicks on Login
  #Then user should land on third party terms page
  #When user clicks on accept terms button
  #Then user is on homepage
  #When user Click on the comingled consecutive patient details
  #When user Click on the Clock In button
  #When Click on continue
  #Then user should land on POC page
  #When Click on continue for first shift
  #And Click on continue for second shift
  #And Click on continue for third shift
  #And Click on continue for fourth shift
  #Then click on Clock out
  #When Click on continue
  #Then user is on homepage
  
  #Executable on Local/Multiple Device on AWS
  @Smoke
  Scenario: Validate the functionality of visit Search in Schedule Page
    Given user is on the login page
    When user verifies the apply button
    When user enters credentials
    When user clicks on Login
    # Then user should land on third party terms page
    # When user clicks on accept terms button
    Then user is on homepage
    When user clicks on visit search
    Then user should land on visit search page
    When user enters patient name
    And user enters date range to search
    When user clicks on search button
    Then user should see the data

  #Executable on Local/Multiple Device on AWS
  @Regression
  Scenario: Validate the functinality of Forgot password
    Given user is on the login page
    When user verifies the apply button
    And user clicks on forgot password button
    Then user should land on forward password page

  #Executable on Local/Multiple Device on AWS
  @Smoke
  Scenario: verify the  functionality of change language for Hindi from Login page
    Given user is on the login page
    When user verifies the apply button
    When user clicks on LanguagePicker button
    Then user should see select language page
    When user selects Hindi language
    And user clicks on Apply button for hindi language
    When user enters credentials
    When user clicks on Login for hindi
    # Then user should land on hindi third party terms page
    # When user clicks on hindi accept terms button
    Then user should see all content in hindi

  #Executable on Local/Multiple Device on AWS
  @Smoke
  Scenario: verify the  functionality of change language for Gujarathi from Login page
    Given user is on the login page
    When user verifies the apply button
    When user clicks on LanguagePicker button
    Then user should see select language page
    When user selects Gujarathi language
    And user clicks on Apply button for gujarathi language
    When user enters credentials
    When user clicks on Login for Gujarathi
    # Then user should land on gujarathi third party terms page
    # When user clicks on gujarathi accept terms button
    Then user should see all content in Gujarathi

  #Executable on Local/Multiple Device on AWS
  @Smoke
  Scenario: verify the change language for Francais option from menu
    Given user is on the login page
    When user verifies the apply button
    When user enters credentials
    When user clicks on Login
    # Then user should land on third party terms page
    # When user clicks on accept terms button
    Then user is on homepage
    When user clicks on menu
    And user selects change language option
    And user selects Francais language
    And user clicks on Apply button for francais language
    Then user should see the Francais language on Schedule screen
    Then user should see the Francais language on Patient screen
    Then user should see the Francais language on Chat screen
    Then user should see the Francais language on Menu screen

  #Executable on Local/Multiple Device on AWS
  @Smoke
  Scenario: verify the change language option for espanol from menu
    Given user is on the login page
    When user verifies the apply button
    When user enters credentials
    When user clicks on Login
    # Then user should land on third party terms page
    # When user clicks on accept terms button
    Then user is on homepage
    When user clicks on menu
    And user selects change language option
    And user selects espanol language
    And user clicks on Apply button for espanol language
    Then user should see the espanol language on Schedule screen
    Then user should see the espanol language on Patient screen
    Then user should see the espanol language on Chat screen
    Then user should see the espanol language on Menu screen

  #Executable on Local/Multiple Device on AWS
  @Smoke
  Scenario: Verify all the bottom tabs click functionality after user logs in
    Given user is on the login page
    When user verifies the apply button
    When user enters credentials
    When user clicks on Login
    # Then user should land on third party terms page
    # When user clicks on accept terms button
    Then user is on homepage
    When user clicks on Patients
    Then user should land on patient screen
    When user clicks on chat
    Then user should land on chat screen
    When user clicks on menu
    Then user should land on menu screen
    When user clicks on schedule
    Then user should land on schedule screen

  #Executable on Local/Multiple Device on AWS
  @Smoke
  Scenario: verify the  functionality of Email button for verification
    Given user is on the login page
    When user verifies the apply button
    When user clicks on Sign_Up_Here button
    When user fills Email Address Password Confirm Password Fields
    When user clicks on Signup button

  #Executable on Local/Multiple Device on AWS
  @Smoke
  Scenario: Check login functionality with valid credentials
    Given user is on the login page
    When user verifies the apply button
    When user enters credentials
    When user clicks on Login
    # Then user should land on third party terms page
    # When user clicks on accept terms button
    Then user is on homepage
    Then user Logout from account

  #Executable on Local/Multiple Device on AWS
  @Regresion
  Scenario: verify the  functionality of patient search for invalid patientname
    Given user is on the login page
    When user verifies the apply button
    When user enters credentials
    When user clicks on Login
    #  Then user should land on third party terms page
    #  When user clicks on accept terms button
    Then user is on homepage
    When user clicks on Patients
    Then user should land on patient screen
    When user enters invalid patient name
    Then Error message should be displayed accordingly

  #Executable on Local/Multiple Device on AWS
  @Regresion
  Scenario: verify the  functionality of patient search for valid patientname
    Given user is on the login page
    When user verifies the apply button
    When user enters credentials
    When user clicks on Login
    # Then user should land on third party terms page
    # When user clicks on accept terms button
    Then user is on homepage
    When user clicks on Patients
    Then user should land on patient screen
    When user enters valid patient name
    Then Result should match with patient name

  #Executable on Local/Multiple Device on AWS
  @Regression
  Scenario: verify the  functionality of device id in profile
    Given user is on the login page
    When user verifies the apply button
    When user enters credentials
    When user clicks on Login
    # Then user should land on third party terms page
    # When user clicks on accept terms button
    Then user is on homepage
    Then user should see menu in bottom navbars
    When user clicks on menu
    And user clicks on profile
    And user clicks on device id to copy
    Then user should get text copied popup

  #Executable on Local/Multiple Device on AWS
  @Regresion
  Scenario: verify the  functionality of +new unscheduled visit link from schedule screen for patient not in the list
    Given user is on the login page
    When user verifies the apply button
    When user enters credentials
    When user clicks on Login
    #  Then user should land on third party terms page
    #  When user clicks on accept terms button
    Then user is on homepage
    When user clicks on New Unscheduled Visit
    Then user should land on new visit page
    When user clicks on patient not in list button
    When Click on continue
    Then user should land on POC page
    And click on Clock out
    Then user is on homepage

  #Executable on Local/Multiple Device on AWS
  @Regresion
  Scenario: create an unscheduled visit from +new unscheduled visit link from schedule screen for patient in the list
    Given user is on the login page
    When user verifies the apply button
    When user enters credentials
    When user clicks on Login
    #  Then user should land on third party terms page
    #  When user clicks on accept terms button
    Then user is on homepage
    When user clicks on New Unscheduled Visit link
    Then user should land on new visit page
    When user clicks on any patient which are in the list
    Then user should land on Confirm Unscheduled Visit popup
    When user clicks on Create Unscheduled Visit button
    When Click on continue
    Then user should land on POC page
    When user selects any service from service code selection
    # And user clicks on OK button
    And click on Clock out
    And Click on continue
    Then user is on homepage

  #Executable on Local/Multiple Device on AWS
  @Regresion
  Scenario: cretae an unscheduled visit from patients tab by selecting any patient which is in the list
    Given user is on the login page
    When user verifies the apply button
    When user enters credentials
    When user clicks on Login
    #  Then user should land on third party terms page
    #  When user clicks on accept terms button
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
    # And user clicks on OK button
    And click on Clock out
    And Click on continue
    Then user is on homepage

  #Executable on Local/Multiple Device on AWS
  @Regresion
  Scenario: Service code selection from schedule screen
    Given user is on the login page
    When user verifies the apply button
    When user enters credentials
    When user clicks on Login
    # Then user should land on third party terms page
    # When user clicks on accept terms button
    Then user is on homepage
    When user clicks on New Unscheduled Visit link
    Then user should land on new visit page
    When user clicks on any patient which are in the list
    Then user should land on Confirm Unscheduled Visit popup
    When user clicks on Create Unscheduled Visit button
    When Click on continue
    Then user should land on POC page
    When user selects any service from service code selection
    #And user clicks on OK button
    And click on Clock out
    And Click on continue
    Then user is on homepage

  # Executable on Local/Multiple Device on AWS
  @Regresion
  Scenario: Service code selection from patients tab
    Given user is on the login page
    When user verifies the apply button
    When user enters credentials
    When user clicks on Login
    # Then user should land on third party terms page
    #  When user clicks on accept terms button
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
    # And user clicks on OK button
    And click on Clock out
    And Click on continue
    Then user is on homepage
