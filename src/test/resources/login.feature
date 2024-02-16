Feature: Validating login function of facebook application.
Scenario: Login With Incorrect username and incorrect password.
#Given ---> precondition
Given user is on facebook page
When user enter username and password
And user should click login button
Then user need to verify homepage is appread or not
 
