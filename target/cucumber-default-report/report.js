$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\features\\Login.feature");
formatter.feature({
  "name": "Invalid Email",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@invalid"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Email id cannot contain just digits or chars without \"@\" sign or \".\" extension",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "user navigate to \"http://www.gmibank.com\"",
  "keyword": "Given "
});
formatter.step({
  "name": "click register",
  "keyword": "Then "
});
formatter.step({
  "name": "user enter the \"\u003cemail\u003e\" see \"\u003cerrormessage\u003e\"",
  "keyword": "When "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "errormessage"
      ]
    },
    {
      "cells": [
        "12345gmail.com",
        "Your email is invalid"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Email id cannot contain just digits or chars without \"@\" sign or \".\" extension",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@invalid"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user navigate to \"http://www.gmibank.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "InvalidLoginStep.user_navigate_to(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click register",
  "keyword": "Then "
});
formatter.match({
  "location": "InvalidLoginStep.click_register()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the \"12345gmail.com\" see \"Your email is invalid\"",
  "keyword": "When "
});
formatter.match({
  "location": "InvalidLoginStep.user_enter_the_see(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});