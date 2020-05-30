Feature: US_001 Boire potion
  en tant que Personnage
  Je veux boire une certaine quantité de potion
  Afin d'etre plus fort et rapide

  Scenario Outline: Boire une quantité de potion
    Given un personnage qui souhaite boire de la potion
    When le personnage entre la quantité de potion <q>
    Then la quantité restance devient la différence entre la valeur initiale de quantité et de la valeur bue.

    Examples: 
      | q |
      | 2 |

  Scenario Outline: Controle de la quantité de potion entrée
    Given un personnage qui souhaite boire de la potion
    When le personnage entre une quantité de potion <q> supérieure à la quantité de potion disponible
    Then le systéme lui renvoie la quantité de potion initiale
    Examples: 
      | q |
      | 10|

  Scenario Outline: Refus de valeurs négatives
    Given un personnage qui souhaite boire de la potion
    When le personnage entre une quantité de potion <q> négative
    Then le systéme lui renvoie la quantité de potion initiale 
    Examples: 
      | q |
      | -1|