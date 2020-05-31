Feature: US_02 AlimentationStockPotion
  En tant que magicien
  Je souhaite pouvoir stocker une quantite preparee de potion
  Afin d'alimenter le stock des potions

  Scenario Outline: Alimentation
    Given un magicien qui souhaite stocker une quantite preparee de potion
    When le magicien saisie le nom <name> et la quantite de potion <q>
    Then la potion est ajoutée au stock de potions

    Examples: 
      | name    | q  |
      |"Fortex" | 1 |



