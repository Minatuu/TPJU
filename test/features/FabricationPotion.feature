Feature: US_000 Fabriquer la potion
  en tant que Personnage
  Je veux preparer une potion magique avec un nom et une quantite
  Afin que les personnages puissent en boire

  Scenario Outline: Préparer une quantité de potion
    Given un personnage qui souhaite préparer de la potion
    When le personnage saisit le nom <name> et la quantité de potion <q>
    Then la quantité totale devient la somme de quantité et de la quantitité préparé

    Examples: 
     | name    | q  |
     |"Fortex" | 10 |
