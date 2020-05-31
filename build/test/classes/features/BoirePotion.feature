Feature: US_001 Boire potion
  en tant que Personnage
  Je veux boire une certaine quantité de potion
  Afin d'etre plus fort et rapide

  Scenario Outline: Boire une quantité de potion
    Given un personnage qui souhaite boire de la potion
    When le personnage commande une potion en saisissant le nom <name> et la quantite <q>
    Then la potion est suprimée du stock de potion disponible

    Examples: 
       | name    | q  |
       |"Fortex" | 1 |

  Scenario Outline: Controle de la disponibilité de la potion entréee
    Given un personnage qui souhaite boire de la potion
    When le personnage commande une potion non disponible dans le stock en saisissant le nom <name> et la quantite <q>
    Then le systeme lui renvoie un message qui indique la rupture de stock de potion
    Examples: 
      | name    | q  |
       |"Rapidex" | 1 |
