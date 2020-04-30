Feature: US_002 Connaitre acteurs film
en tant que téléspectateur
Je veux connaitre l'acteur associé à chaque personnage
afin de savoir le personnage joué par mon acteur préféré

Scenario Outline: trouver un acteur à partir du personnage
Given un téléspectateur
When  vouloir connaitre l'acteur associé à un personnage <nom>
Then  afficher le nom de l'acteur <acteur>

Examples:

|nom      |acteur|
|"Asterix"| "Christian Clavier"|
