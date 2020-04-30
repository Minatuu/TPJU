Feature: US_001 Boire potion
en tant que Personnage
Je veux boire une certaine quantité de potion
Afin d'etre plus fort et rapide

Scenario Outline: Boire une quantité de potion
Given le personnage <nom> qui souhaite boire de la potion
When  le personnage entre la quantité de potion <q>
Then  la quantité restance <quantite> devient la différence entre la valeur <quantite> et de la valeur <q> bue.

Examples:

|personna   |quantity|q|
|"Asterix"  |15      |5|
|"Obelix"   |10      |8|
|"Asterix"  |2       |0|


Scenario Outline: Controle de la quantité de potion entrée
Given le personnage <nom> qui souhaite boire de la potion
When  le personnage entre une quantité de potion <q> supérieure à la quantité de potion disponible <quantite>
Then  le systéme refuse avec le <messageErreur>

Examples:

|personna   |quantity|q |
|"Asterix"  |2       |10|


Scenario Outline: Refus de valeurs négatives
Given le personnage <nom> qui souhaite boire de la potion
When  le personnage entre une quantité de potion <q> négative
Then  le systéme lui renvoie la quantité de potion initiale <quantite>

Examples:

|personna   |quantity|q |
|"Obelix"   |5       |-2|
