$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("broseropen.feature");
formatter.feature({
  "line": 1,
  "name": "User Purchase Mechanism",
  "description": "As a User I want to perform checkout activityssss\r\n  So I can see my items for checking out",
  "id": "user-purchase-mechanism",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Purchasing my Items",
  "description": "",
  "id": "user-purchase-mechanism;purchasing-my-items",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "I open browser chrome",
  "keyword": "Given "
});
formatter.match({
  "location": "StepsDefinition.i_open_browser_chrome()"
});
formatter.result({
  "duration": 6607370700,
  "status": "passed"
});
});