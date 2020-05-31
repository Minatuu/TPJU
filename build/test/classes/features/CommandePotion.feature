Feature: US_01 CommanderPotion
  En tant que guerrier
  Je souhaite pouvoir commander de la potion
  Afin de consommer la potion et devenir plus fort

  Scenario Outline: Commander
    Given un guerrier qui souhaite commander de la potion
    When le guerrier commande une potion en saisissant le nom <name> et la quantite <q>
    Then la potion est suprimée du stock de potion disponible

    Examples: 
       | name    | q  |
       |"Fortex" | 1 |

  Scenario Outline: Controle de la disponibilite d'une quantite
    Given un guerrier qui souhaite commander de la potion
    When le guerrier commande une potion non disponible dans le stock en saisissant le nom <name> et la quantite <q>
    Then le systeme lui renvoie un message qui indique la rupture de stock de potion

    Examples: 
       | name    | q  |
       |"rapidix" | 10 |
