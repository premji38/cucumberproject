Feature: Login features
This feature includes scenario that would validate the following feature 
1) Login as Admin
2) Login as linda.andreson
3) Login with the naigate the data

Background:
Given I am able to navigate to the login page

#Scenario: Login as Admin
#When I enter the username as "Admin"
#And I enter the password as "admin123"
#And I clicked the login button
#Then I should see the username as "Welcome Paulette"

#Scenario: Login as linda.andreson
#When I enter the username as "Admin"
#And I enter the password as "admin123"
#And I clicked the login button
#Then I should see the username as "Welcome Paulette"
@Login
Scenario Outline: Test login with different data
When I enter the username as "<username>"
And I enter the password as "<password>"
And I clicked the login button
Then I should see the username as "<loginName>"

Examples:
|username|password|  loginName|
|Admin   |admin123|Welcome test1|
|Admin   |admin123|Welcome test1|
@InvalidLogin
Scenario: Login with negative data
When I enter the username as "sunil"
And I enter the password as "sunil"
And I clicked the login button
Then I should see the an error message as "Invalid credentials data"


