Feature: Betsson Registration and Login functionality

@registerAndLogin
Scenario: Register and login with valid credentials
Given I go to the following site "https://m.betsson.com/en/"
When I register a new user successfully
Then I am able to login with the credentials registered

#more complex scenarios can be done by passing parameters ourself
#and we could also do scenario outlines with multiple examples to replicate different scenarios