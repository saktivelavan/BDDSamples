Feature: Book Search for
https://danube-webshop.herokuapp.com/

Scenario: Novel Search test
Given User is on Home age
When User search Novels & Stories
Then Should display novel result page

Scenario: Crime Search test
Given User is on Home age
When User search Crime & Thrillers
Then Should display crime result page