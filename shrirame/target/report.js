$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/sravan/shrirame/src/test/resources/bddpackage/logout.feature");
formatter.feature({
  "line": 1,
  "name": "Logout",
  "description": "Scenario : validate logout operation\ngiven : Launch site using \"chrome\"\nWhen do login with valid data\n|mobno     |pwd      |\n|8668218023|Preeti123|\nAnd do logout\nThen home page will be responed\nAnd close site",
  "id": "logout",
  "keyword": "Feature"
});
formatter.uri("D:/sravan/shrirame/src/test/resources/bddpackage/preeti.feature");
formatter.feature({
  "line": 1,
  "name": "Login",
  "description": "Scenario : validate site launcing\nGiven : launch site using \"Chrome\"\nThen Tittle contain \"free sms\"\nAnd close site\n\nScenario Outline : validate login operation\nGiven launch site using \"chrome\"\nWhen enter mobile number as \"\u003cx\u003e\"\nAnd enter password as \"\u003cy\u003e\"\nAnd click login\nThen validate output criteria as \"\u003cz\u003e\"\nAnd close site\n\nExample:\n| x        | y       | z         |\n|8668218023|Preeti123|All_valid  |\n|          |Preeti123|Blank_mobno|\n|8668218023|         |Blank_pwd  |\n|8668218024|Preeti123|Mob_invalid|\n|8668218023|Preeti234|Psw_invalid|",
  "id": "login",
  "keyword": "Feature"
});
});