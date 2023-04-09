Feature: RC2 Testing scenarios

    
@Smoke
    Scenario: verify the  functionality of clock in and out procedure mutual consecutive shifts
    Given user is on the login page
    When user verifies the apply button
    When user verifies the allow button  
    When user verifies the notyou button
     When user verifies the Hha notification popup
     When user verifies the location services popup
    When user enters credentials
    When user clicks on Login
    Then user is on homepage
    When user Click on the mutual patient details
    When user Click on the Clock In button
     When user verifies the allow button 
    When Click on continue
    When Click on continue for first shift
    Then click on Clock out
    When Click on continue
    Then user is on homepage

@Smoke
    Scenario: verify the  functionality of clock in and out procedure linked consecutive shifts
    Given user is on the login page
      When user verifies the apply button
    When user verifies the allow button  
    When user verifies the notyou button
     When user verifies the Hha notification popup
     When user verifies the location services popup
    When user enters credentials
    When user clicks on Login
    Then user is on homepage
    When user Click on the linked patient details
    When user Click on the Clock In button
     When user verifies the allow button 
   When Click on continue
    When Click on continue for first shift
    Then click on Clock out
   When Click on continue
    Then user is on homepage
    
    @Smoke
    Scenario: verify the  functionality of clock in and out procedure of consecutive shifts
    Given user is on the login page
      When user verifies the apply button
    When user verifies the allow button  
    When user verifies the notyou button
     When user verifies the Hha notification popup
     When user verifies the location services popup
    When user enters credentials
    When user clicks on Login
    Then user is on homepage
    When user Click on the consecutive patient details
    When user Click on the Clock In button for consecutive shift
   When user verifies the allow button 
    When Click on continue
   When Click on continue for first shift
    And Click on continue for second shift
    Then click on Clock out
    When Click on continue
   Then user is on homepage
    
    
@Smoke
    Scenario: verify the  functionality of clock in and out procedure of comingled consecutive shifts
   Given user is on the login page
   When user verifies the apply button
   When user verifies the allow button  
   When user verifies the notyou button
   When user verifies the Hha notification popup
   When user verifies the location services popup
   When user enters credentials
   When user clicks on Login
   Then user is on homepage
   When user Click on the comingled consecutive patient details
   When user Click on the Clock In button for comingled consecutive shift  
   When user verifies the allow button  
   When Click on continue
   When Click on continue for first shift
   And Click on continue for second shift
   And Click on continue for third shift
   And Click on continue for fourth shift
   Then click on Clock out
   When Click on continue
   Then user is on homepage

  @Smoke
  Scenario: Validate the functionality of Search Patient in Schedule Page
  Given user is on the login page  
    When user verifies the apply button
    When user verifies the allow button  
    When user verifies the notyou button 
     When user verifies the Hha notification popup
     When user verifies the location services popup
    When user enters credentials
    When user clicks on Login
    Then user is on homepage
    When user clicks on visit search
    Then user should land on visit search page
    When user enters patient name
    When user clicks on search button
    Then user should see the data
