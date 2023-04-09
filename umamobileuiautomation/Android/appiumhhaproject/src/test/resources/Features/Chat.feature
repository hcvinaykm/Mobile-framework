Feature: Check Chat Module Functionality

@Regression
  Scenario: Verify the functionality of EVV topic in the header
    Given user is on the login page   
    When user enters credentials
    When user clicks on Login
    #Then user is on homepage
    When user click on the Chat command in the bottom navbar
     When user click on the Topics tab
    When user click on a EVV tab
    Then the Conversation pane should be displayed with the EVV in the header

@Regresion
  Scenario: Verify the functionality of Mobile App topic in the header
    Given user is on the login page   
    When user enters credentials
    When user clicks on Login
    #Then user is on homepage
    When user click on the Chat command in the bottom navbar
     When user click on the Topics tab
    When user click on a Mobile App tab
    Then the Conversation pane should be displayed with the Mobile App in the header

@Regresion
  Scenario: Verify the functionality of Scheduling topic in the header
    Given user is on the login page   
    When user enters credentials
    When user clicks on Login
    #Then user is on homepage
    When user click on the Chat command in the bottom navbar
     When user click on the Topics tab
    When user click on a Scheduling tab
    Then the Conversation pane should be displayed with the Scheduling in the header

@Regresion
  Scenario: Verify the functionality of Patient Issue topic in the header
    Given user is on the login page   
    When user enters credentials
    When user clicks on Login
    #Then user is on homepage
    When user click on the Chat command in the bottom navbar
     When user click on the Topics tab
    When user click on a Patient Issue tab
    Then the Conversation pane should be displayed with the Patient Issue in the header

@Regresion
  Scenario: Verify the functionality of General topic in the header
    Given user is on the login page   
    When user enters credentials
    When user clicks on Login
    #Then user is on homepage
    When user click on the Chat command in the bottom navbar
     When user click on the Topics tab
    When user click on a General tab
    Then the Conversation pane should be displayed with the General in the header
    

@Regresion
  Scenario: Verify the functionality of Topics Tab in chat page
    Given user is on the login page   
    When user enters credentials
    When user clicks on Login
    #Then user is on homepage
    When user click on the Chat command in the bottom navbar
     When user click on the Topics tab
    # Then the topics configured by my agency should be presented

@Regresion
  Scenario: Verify the functionality of Chat Tab at bottom navbar
    Given user is on the login page   
    When user enters credentials
    When user clicks on Login
    #Then user is on homepage
     When user click on the Chat command in the bottom navbar
    Then Chat page should be presented with an active MyChats tab

@Regresion
  Scenario: Verify the presence of Chat Tab at bottom navbar
    Given user is on the login page   
    When user enters credentials
    When user clicks on Login
    #Then user is on homepage
    Then Verify Chat is Present in the Bottom navbar
    
