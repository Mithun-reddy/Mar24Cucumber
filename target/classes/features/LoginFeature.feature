Feature: Login feature

Background:
Given user launched login page

Scenario:
When user enters valid username
When user enters valid password
When user clicks on login button
Then user should be seeing home page

#Scenario:
#When user enters invalid username
#And user enters valid password
#And user clicks on login button
#Then user should be seeing home page
#
#Scenario:
#When user enters valid username
#When user enters invalid password
#When user clicks on login button
#Then user should be seeing home page
#
#Scenario:
#When user enters invalid username
#When user enters ivalid password
#When user clicks on login button
#Then user should be seeing home page
