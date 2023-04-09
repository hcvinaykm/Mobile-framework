Feature: Check Login Functionality


 @Regresion
  Scenario: Check login functinality with valid credentials
    Given user is on the login page   
    When user verifies the apply button
    When user verifies the allow button  
    When user verifies the notyou button
    When user verifies the Hha notification popup
    When user verifies the location services popup
    When user enters credentials
    When user clicks on Login
     Then user should land on third party terms page
    When user clicks on accept terms button
    Then user is on homepage
    
       
 #@Regresion
 #Scenario: Check login functinality with multiple credentials
    #Given user is on the login page
   #When user clicks on username
   #Then user login with multiple credentials 
    
  #  @Regresion
 # Scenario: Check login functinality with empty credentials
   # Given user is on the login page
  #  When user clicks on Login 
   # Then Appropriate Error message should come for the required fields

 # @Regresion
 # Scenario: Check login functinality with valid credentials
  #  Given user is on the login page   
  #  When user enters credentials
  #  When user clicks on Login
  #  Then user is on homepage
    
  #   @Regresion
  #Scenario: Check login functinality with invalid credentials
  # Given user is on the login page   
   # When user enters invalid credentials
   # When user clicks on Login
  #  Then appropriate error must appear
    
   
