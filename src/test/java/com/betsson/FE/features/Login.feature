Feature: Betsson login functionality

@login
Scenario: Login with valid credentials
Given User is on login page
When User enters username
And User enters password
And User click on the signin button
Then User is logged in successfully