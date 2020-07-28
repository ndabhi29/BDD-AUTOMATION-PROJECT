$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/Features/Registration.feature");
formatter.feature({
  "line": 1,
  "name": "Registration feature",
  "description": "",
  "id": "registration-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 9763738700,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should able to register successfully,",
  "description": "so that user can use all user functionality on my website",
  "id": "registration-feature;user-should-able-to-register-successfully,",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@trail"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user clicks on register button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user enters all required registration details",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user clicks on register-submit button",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "user should able to register successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefs.user_is_on_homepage()"
});
formatter.result({
  "duration": 148066600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_clicks_on_register_button()"
});
formatter.result({
  "duration": 1398783100,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_enters_all_required_registration_details()"
});
formatter.result({
  "duration": 1575902500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_clicks_on_register_submit_button()"
});
formatter.result({
  "duration": 1594178900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_should_able_to_register_successfully()"
});
formatter.result({
  "duration": 87800,
  "status": "passed"
});
formatter.after({
  "duration": 3864625600,
  "status": "passed"
});
});