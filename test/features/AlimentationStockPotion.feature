Feature: US_02 AlimentationStockPotion
  En tant que magicien
  Je souhaite pouvoir stocker une quantite preparee de potion
  Afin d'alimenter le stock des potions

  Scenario Outline: Alimentation
    Given un magicien qui souhaite stocker une quantite preparee de potion
    When le magicien saisie la quantite du potion preparee <q>
    Then la quantite actuelle du stock devient la somme de la quantite existante plus la quantitee ajoute

    Examples: 
      | q  |
      | 10 |