$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./Features/MA_4.feature");
formatter.feature({
  "line": 1,
  "name": "Tide Home Page",
  "description": "",
  "id": "tide-home-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "How to Read laundry Symbols",
  "description": "",
  "id": "tide-home-page;how-to-read-laundry-symbols",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "User launch Chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User opens URl \"https://tide.com/en-us\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user clicks on Learn More under how to do laundry module",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "verify if the text \"How to Read Laundry Symbols\" is present in How to do Laundry Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_launch_Chrome_browser()"
});
formatter.result({
  "duration": 2073212600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://tide.com/en-us",
      "offset": 16
    }
  ],
  "location": "StepDefinition.user_opens_URl(String)"
});
formatter.result({
  "duration": 3047366200,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.user_clicks_on_Learn_More_under_how_to_do_laundry_module()"
});
formatter.result({
  "duration": 10276854300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "How to Read Laundry Symbols",
      "offset": 20
    }
  ],
  "location": "StepDefinition.verify_if_the_text_is_present_in_How_to_do_Laundry_Page(String)"
});
formatter.result({
  "duration": 350774500,
  "status": "passed"
});
formatter.after({
  "duration": 4135816900,
  "status": "passed"
});
});