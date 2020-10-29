
@FunctionalTest
Feature: Free CRM application testing


@SmokeTest @RegrassionTest
Scenario: Login with valid username and password
Given This is a valid login test

@SmokeTest @EndToEnd
Scenario: Login with invalid username and password
Given This is a ivalid login test

@sanatyTest @MonkeyTest
Scenario: Create a contact 
Given This is a contact test case 

@RegrassionTest
Scenario: Create a  task
Given This is a contact task test case
@ExploratoryTest
Scenario: Create a deal 
Given This is deal test case
@RegrassionTest  @ExploratoryTest
Scenario: Create a calender 
Given This is a calender test case
@ExploratoryTest @SmokeTest
Scenario: Create a case 
Given This is a case test case


