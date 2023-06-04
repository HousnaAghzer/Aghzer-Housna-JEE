# Activité N°1 Part 1 : La mise en oeuvre de l'injection des dépendances

#### Architecture du projet :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/15.PNG)

- Le package dao contient l'interface IDao et la classe DaoImpl qui implémente cette interface :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/17.PNG)
![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/16.PNG)

- Le package ext contient les classes DaoImpl2 et DaoImplVWS :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/18.PNG)
![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/19.PNG)

- Le package metier contient l'interface IMetier et la classe MetierImpl qui implémente cette interface :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/20.PNG)
![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/21.PNG)

- Le package pres contient les classes Presentation et pres2 :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/23.PNG)
![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/22.PNG)

- Le fichier config.txt :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/24.PNG)

- Résultats d'injection des dépendances par instanciation statique :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/26.PNG)

- Résultats d'injection des dépendances par instanciation dynamique :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/25.PNG)
- Le nouveau fichier config.txt :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/27.PNG)

- Résultats d'injection des dépendances par instanciation dynamique :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/28.PNG)
