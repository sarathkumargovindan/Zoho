$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/sriva/eclipse-workspace/Zoho/src/main/java/com/feature/zoho.feature");
formatter.feature({
  "line": 1,
  "name": "Zoho project",
  "description": "",
  "id": "zoho-project",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "go To The Application Homepage",
  "description": "",
  "id": "zoho-project;go-to-the-application-homepage",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "launch The Url",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "enter The Login Details",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "take Screenshot Of The Webpage",
  "keyword": "Then "
});
formatter.match({
  "location": "Stepdefinition.launch_The_Url()"
});
formatter.result({
  "duration": 3166535500,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.enter_The_Login_Details()"
});
formatter.result({
  "duration": 3419609700,
  "status": "passed"
});
formatter.match({
  "location": "Stepdefinition.take_Screenshot_Of_The_Webpage()"
});
formatter.result({
  "duration": 153231899,
  "status": "passed"
});
});