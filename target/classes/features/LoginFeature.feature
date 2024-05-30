Feature: Login feature

Background:
#Given user launched login page

@smoke @regression
Scenario: Xyz
When user enters valid username
When user enters valid password
When user click on login button
Then user should be seeing home page

@regression
Scenario Outline: Xyz1
When user enters email "<username>"
When user enters password as "<password>"
When user click on login button
Then user should be seeing home page
Examples:
|username     |password|
|mithun@ta.com|mithun  |
|deek@ta.com  |deek123 |

@smoke
Scenario Outline: Xyz1
When user creates accounts
Then user should see accounts created
|account|
|acc123 |
|acc1234|
|acc456 |


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
