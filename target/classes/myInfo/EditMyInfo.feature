@myinfo
Feature: Modifier mes infos
  En tant que utilisateur je souhaite modifier mes infos dans personal details

  Background: 
    Given J'ouvre l'application OrangeHRM
    When Je saisi le username "Admin"
    And Je saisi le mot de passe "admin123"
    And Je clique sur le bouton
    Then Redirection vers la page Home de l'application OrangeHRM "Welcome"

  Scenario: Modifier infos
    When Je clique sur le bouton My Info
    And Je clique sur le bouton Edit de Personal Details
  	And Je saisis les champs de Full Name "Salim" et "Ben" et "Hammouda" 
    And Je saisie le champ Date of Birth "1990-05-16"
    And Je clique sur le bouton save Edit my Info
    Then Je verifie que mes donnees sont changees correctement 
    
