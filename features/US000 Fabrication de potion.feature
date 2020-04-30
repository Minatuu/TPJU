Feature: US_000 Fabriquer la potion
en tant que Personnage
Je veux preparer une certaine quantité de potion magique
Afin que les personnages puissent en boire

Scenario Outline: Préparer une quantité de potion
Given le personnage <nom> qui souhaite préparer de la potion
When  le personnage saisit la quantité de potion <q>
Then  la quantité totale <quantite> devient la somme de <quantite> et de <q>.

Examples:

|personna   |quantity|q|
|"Panoramix"|0       |10|
|"Panoramix"|10      |0|
|"Panoramix"|10      |5|
|"Panoramix"|15      |0|

Scenario Outline: Refus de valeur négative
Given le personnage <nom> qui souhaite préparer de la potion
When  le personnage saisit une quantité de potion <q> négative
Then  le systéme lui renvoie la quantité initiale <quantite> de potion

Examples:

|personna   |quantity|q|
|"Panoramix"|10       |-2|
|"Panoramix"|10      |0|

