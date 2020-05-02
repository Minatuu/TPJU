Feature: US_000 Fabriquer la potion
  en tant que Personnage
  Je veux preparer une certaine quantité de potion magique
  Afin que les personnages puissent en boire

  Scenario Outline: Préparer une quantité de potion
    Given un personnage qui souhaite préparer de la potion
    When le personnage saisit la quantité de potion <q>
    Then la quantité totale devient la somme de quantité et de la quantitité préparé

    Examples: 
      | q  |
      | 10 |
