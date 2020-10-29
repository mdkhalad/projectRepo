Feature: Deal data Creation
Scenario: User should be able to create a new deal 
Given User already login to the page
When title of login page is Free Crm
Then User enter username and password
|username|password|
|khaled.md56@yahoo.com|kyle1116|
Then user clicks on login Button
Then User clicks on deals
Then User clicks on  new button
Then User  enters deals details
|title|commission|
|test1|10|
|test2|20|
|test3|30|
Then User clicks on save button
Then User close the browser