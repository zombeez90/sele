Feature: Athentication


    Scenario: User enters correct credentials 
        When the user enters the correct credentials
        And the user hits the Login button 
        Then the user is logged in on the next page 

    Scenario: User enters incorrect credentials 
        When the user enters the incorrect credentials
        And the user hits the Login button 
        Then an invalid user or passwrd error pops up 

    Scenario: User is logged in on the next page 
        When the user hits the back button  
        Then user will be on the login screen 

    Scenario: User has foggotten password 
        When user hits the fogot password button 
        Then user is presented a page to recover password 

     Scenario: User is at forgot password page 
        Given user is at fogotten password page 
        Then user enters username 
        Then hits reset password button 
        Then user will recive an email to reset their password

           
     Scenario: User is at forgot password page by mistake 
        Given user did not mean to click on forgot password
        When user hits cancel button  
        Then user is redirected to login page  