Feature: US_001 Boire potion
en tant que Personnage
Je veux boire une certaine quantité de potion
Afin d'etre plus fort et rapide

Scenario Outline: calcule quantité restante 
Given le personnage <personna1> 
When  le personnage boit une quantité de potion <q>
Then  la quantité restance <quantite> devient la différence entre la valeur <quantite> et de la valeur <q> bue.

Examples:

|quantity|q|
|15       |5|
|10      |0|
|10      |2|
|8      |0|

Scenario Outline: Controle de la quantité <q> entrée
Given le personnage <personna1> 
When  le personnage veux boire une quantité de potion <q> supérieure à la quantité disponible <quantite>
Then  le systéme refuse avec le <messageErreur>

Examples:

|quantity|q|
|10      |15|


Scenario Outline: Refus de valeur négative
Given le personnage <personna1> 
When  le personnage boit une quantité de potion <q> négative
Then  le systéme envoie lui renvoie la quantité initiale <quantite>

Examples:

|quantity|q|
|5      |-2|
|5      |0|
