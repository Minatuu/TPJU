Feature: US_000 Fabriquer la potion
en tant que Personnage
Je veux preparer une certaine quantité de potion magique
Afin d'assurer la disponibité de potion pour le peuple gaulois

Scenario Outline: calcule totale quantité potion
Given le personnage <personna3> 
When  le personnage prépare une quantité de potion <q>
Then  la quantité totale <quantite> devient la somme de la valeur de <quantite> et de la valeur <q> ajoutée.

Examples:

|quantity|q|
|0       |10|
|10      |0|
|10      |5|
|15      |0|

Scenario Outline: Refus de valeur négative
Given le personnage <personna3> 
When  le personnage prépare une quantité de potion <q> négative
Then  le systéme envoie lui renvoie la quantité initiale <quantite>

Examples:

|quantity|q|
|5      |-2|
|5      |0|
