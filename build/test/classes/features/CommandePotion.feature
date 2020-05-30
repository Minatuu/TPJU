Feature: US_01 CommanderPotion
  En tant que guerrier
  Je souhaite pouvoir commander une quantite de potion
  Afin de consommer la potion et devenir plus fort

  Scenario Outline: Commander
    Given un guerrier qui souhaite commander une quantite du potion
    When le guerrier commande une quantite de potion <q>
    Then la quantite disponible du potion devient la difference entre la quantite initiale et la quantite commandee.

    Examples: 
      | q |
      | 5 |

  Scenario Outline: Controle de la disponibilite d'une quantite
    Given un guerrier qui souhaite commander une quantite du potion
    When le guerrier commande une quantite du potion <q> superieure à la quantite disponible dans le stock
    Then le systeme lui renvoie un message qui indique la rupture de stock de potion

    Examples: 
      | q  |
      | 2 |
