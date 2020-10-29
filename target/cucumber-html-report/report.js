$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "line": 1,
  "name": "Free Crm Feature",
  "description": "",
  "id": "free-crm-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Freee Crm Login Test Scenario",
  "description": "",
  "id": "free-crm-feature;freee-crm-login-test-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "User already login to the page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "title of login page is Free Crm",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "User enter username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "user clicks on login Button",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefination.Ueser_already_login_to_the_page()"
});
formatter.result({
  "duration": 8466752000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.title_of_login_page_is_Free_Crm()"
});
formatter.result({
  "duration": 14718600,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.User_enter_username_and_password()"
});
formatter.result({
  "duration": 328314800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefination.user_clicks_on_login_Button()"
});
formatter.result({
  "duration": 100826200,
  "status": "passed"
});
});