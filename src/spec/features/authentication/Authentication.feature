@connexion
Feature: Authentication - OrangeHRM
  En tant que utilisateur je souhaite m'authentifier

  @tag1
  Scenario: Vérifier l'authentification
    Given j'ouvre l'application OrangeHRM
    When je saisi le username
    And je saisi le mot de passe
    And je clique sur le bouton
    Then Redirection vers la page Home de l'application OrangeHRM
    