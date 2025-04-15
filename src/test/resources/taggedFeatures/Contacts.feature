@PhaseOne
Feature: Deals CRUD Management

@SmokeTest
Scenario: Create a new Contact
Given User is logged in
When User create a new Contact

@RegressionTest @SmokeTest
Scenario: View a new Contact
Given User is logged in
When User view Contact details

Scenario: Delete a new Contact
Given User is logged in
When User delete a Contact