# Activité N°1 Part 2 : La mise en oeuvre de l'injection des dépendances

### Dans cette partie on va voir comment créer une application fermée à la modification et ouverte à l'extension en utilisant le couplage faible et l'injection des dépendances :

#### Architecture du projet :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/29.PNG)
![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/30.PNG)

- Le package dao contient l'interface IDao et la classe DaoImpl qui implémente cette interface :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/17.PNG)
![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/16.PNG)

- Le package ext contient les classes DaoImpl2 et DaoImplVWS :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/18.PNG)
![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/19.PNG)

- Le package metier contient l'interface IMetier et la classe MetierImpl qui implémente cette interface ainsi que la classe Calcul :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/20.PNG)
![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/32.PNG)
![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/31.PNG)

- Le package pres contient les classes Presentation, pres2, PresSpringAnnotations et PresSpringXML :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/23.PNG)
![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/22.PNG)
![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/33.PNG)
![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/34.PNG)

- Le fichier applicationContext.xml :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/36.PNG)

- On a crée une classe nommée CalculTest pour le test unitaire :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/35.PNG)

- Résultat :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/37.PNG)
