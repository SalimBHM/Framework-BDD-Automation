@connexion
Feature: Authentication - OrangeHRM
  En tant que utilisateur je souhaite m'authentifier

  @cnx
  Scenario: Vérifier l'authentification
    Given J'ouvre l'application OrangeHRM
    When Je saisi le username "Admin"
    And Je saisi le mot de passe "admin123"
    And Je clique sur le bouton
    Then Redirection vers la page Home de l'application OrangeHRM "Welcome"