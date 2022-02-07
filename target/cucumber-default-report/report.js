$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src\\test\\resources\\features\\US03Registration.feature");
formatter.feature({
  "name": "Registration page should restrict password usage to a secure",
  "description": "  and high level passcode",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Register"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Password Restriction validate",
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
  "name": "user enter \"\u003cPassword\u003e\" it should be see this \"\u003cExpected\u003e\"",
  "keyword": "When "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Password",
        "Expected"
      ]
    },
    {
      "cells": [
        "eA22HJK",
        "rgba(255, 255, 0, 1)"
      ]
    },
    {
      "cells": [
        "ee2$HJK",
        "rgba(0, 255, 0, 1)"
      ]
    },
    {
      "cells": [
        "AS23",
        "rgba(255, 153, 0, 1)"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Password Restriction validate",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Register"
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
  "name": "user enter \"eA22HJK\" it should be see this \"rgba(255, 255, 0, 1)\"",
  "keyword": "When "
});
formatter.match({
  "location": "InvalidLoginStep.user_enter_it_should_be_see_this(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Password Restriction validate",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Register"
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
  "name": "user enter \"ee2$HJK\" it should be see this \"rgba(0, 255, 0, 1)\"",
  "keyword": "When "
});
formatter.match({
  "location": "InvalidLoginStep.user_enter_it_should_be_see_this(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Password Restriction validate",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Register"
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
  "name": "user enter \"AS23\" it should be see this \"rgba(255, 153, 0, 1)\"",
  "keyword": "When "
});
formatter.match({
  "location": "InvalidLoginStep.user_enter_it_should_be_see_this(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});