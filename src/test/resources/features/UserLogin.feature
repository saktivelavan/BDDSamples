Feature: User Login Function

#Scenario: Valid Login Admin
#Given User is on Login Page
#When User enters "tomsmith" and "SuperSecretPassword!"
#Then Should display success message

#Scenario Outline: Valid Login Admin
#Given User is on Login Page
#When User enters "<username>" and "<password>"
#Then Should display success message

#Examples:
#|username|password|
#|tomsmith|SuperSecretPassword!|
#|tomsmith|SuperSecretPassword1|
#|tomsmith|SuperSecretPassword2|

Scenario: Valid Login Admin
Given User is on Login Page
When User enters credentials
|username|password|
|tomsmith|SuperSecretPassword!|
Then Should display success message
| You logged into a secure area! | 