@admin
Feature: Ajouter admin-OrangeHRM
  En tant que utilisateur je souhaite ajouter des admins dans systeme users

  Background: 
    Given J'ouvre l'application OrangeHRM
    When Je saisi le username "Admin"
    And Je saisi le mot de passe "admin123"
    And Je clique sur le bouton
    Then Redirection vers la page Home de l'application OrangeHRM "Welcome"

  Scenario Outline: Ajouter admin
    When Je clique sur le bouton Admin
    And Je clique sur le bouton Add
    And Je saisis le champ Emplyee Name "<employee>"
    And Je saisis le champ Username "<username>"
    And Je saisis le champ Password "<password>"
    And Je saisis le champ Confirm Password "<confirmPassword>"
    And Je clique sur le bouton save
		
		#And Je remplis le formulaire User System "<employee>" et "<username>" et "<password>" et "<confirmPassword>"

    Examples: 
      | employee | username     | password  | confirmPassword |
      | Salim    | Ben Hammouda | salim123  | salim123        |
      | Wissal   | Argoubi      | wissal123 | wissal123       |
      | Zied     | Hannachi     | zied123   | zied123         |
      | Sahar    | Mili         | sahar123  | sahar123        |
