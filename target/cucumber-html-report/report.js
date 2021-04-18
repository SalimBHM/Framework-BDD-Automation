$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("myInfo/EditMyInfo.feature");
formatter.feature({
  "line": 2,
  "name": "Modifier mes infos",
  "description": "En tant que utilisateur je souhaite modifier mes infos dans personal details",
  "id": "modifier-mes-infos",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@myinfo"
    }
  ]
});
formatter.before({
  "duration": 2785723800,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "J\u0027ouvre l\u0027application OrangeHRM",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Je saisi le username \"Admin\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Je saisi le mot de passe \"admin123\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Je clique sur le bouton",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "Redirection vers la page Home de l\u0027application OrangeHRM \"Welcome\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AuthenticationStepDefinition.jOuvreLApplicationOrangeHRM()"
});
formatter.result({
  "duration": 3891454200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 22
    }
  ],
  "location": "AuthenticationStepDefinition.jeSaisiLeUsername(String)"
});
formatter.result({
  "duration": 119314500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 26
    }
  ],
  "location": "AuthenticationStepDefinition.jeSaisiLeMotDePasse(String)"
});
formatter.result({
  "duration": 82549000,
  "status": "passed"
});
formatter.match({
  "location": "AuthenticationStepDefinition.jeCliqueSurLeBouton()"
});
formatter.result({
  "duration": 3172321100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome",
      "offset": 58
    }
  ],
  "location": "AuthenticationStepDefinition.redirectionVersLaPageHomeDeLApplicationOrangeHRM(String)"
});
formatter.result({
  "duration": 29850700,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Modifier infos",
  "description": "",
  "id": "modifier-mes-infos;modifier-infos",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "Je clique sur le bouton My Info",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Je clique sur le bouton Edit de Personal Details",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "Je saisis les champs de Full Name \"Salim\" et \"Ben\" et \"Hammouda\"",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Je saisie le champ Date of Birth \"1990-05-16\"",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "Je clique sur le bouton save Edit my Info",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Je verifie que mes donnees sont changees correctement",
  "keyword": "Then "
});
formatter.match({
  "location": "MyInfoStepDefinition.jeCliqueSurLeBoutonMyInfo()"
});
formatter.result({
  "duration": 1318945600,
  "status": "passed"
});
formatter.match({
  "location": "MyInfoStepDefinition.jeCliqueSurLeBoutonEdit()"
});
formatter.result({
  "duration": 61745300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Salim",
      "offset": 35
    },
    {
      "val": "Ben",
      "offset": 46
    },
    {
      "val": "Hammouda",
      "offset": 55
    }
  ],
  "location": "MyInfoStepDefinition.jeSaisisLesChampsFullName(String,String,String)"
});
formatter.result({
  "duration": 6581899200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1990-05-16",
      "offset": 34
    }
  ],
  "location": "MyInfoStepDefinition.jeSaisisLeChampDateOfBirth(String)"
});
formatter.result({
  "duration": 2242859100,
  "status": "passed"
});
formatter.match({
  "location": "MyInfoStepDefinition.jeCliqueSurLeBoutonSaveEditMyInfo()"
});
formatter.result({
  "duration": 1560330700,
  "status": "passed"
});
formatter.match({
  "location": "MyInfoStepDefinition.jeVerifieQueMesDonneesSontChangeesCorrectement()"
});
formatter.result({
  "duration": 131179700,
  "status": "passed"
});
formatter.after({
  "duration": 1402845000,
  "status": "passed"
});
});