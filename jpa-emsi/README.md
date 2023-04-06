# Activité N°2 part 3 : Use Case JPA Hibernate Spring Data Many To Many Case

### Architecture du projet :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/74.PNG)

### Package entities :
- L'entité User :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/75.PNG)

- L'entité Role :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/76.PNG)

### Package repositories :
- L'interface UserRepository :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/77.PNG)

- L'interface RoleRepository :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/78.PNG)

### Package service :
- L'interface UserService et la classe UserServiceImpl qui implémente cette interface :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/79.PNG)
![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/80.PNG)
![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/81.PNG)
![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/82.PNG)

### Package web :
- La classe UserController :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/83.PNG)

- La classe JpaEmsiApplication :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/84.PNG)
![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/85.PNG)

- Le fichier application.properties :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/86.PNG)

#### En utilisant H2Database :
- La table Users :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/64.PNG)

- La table Role :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/65.PNG)

- La table Role_Users :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/66.PNG)

#### En utilisant Mysql :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/67.PNG)

- La table Users :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/69.PNG)

- La table Role :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/68.PNG)

- La table Role_Users :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/70.PNG)

### Résultats :
- Affichage des rôles d'utilisateur (user1) :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/73.PNG)

- Informations sur l'utilisateur (admin) :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/71.PNG)

- Informations sur l'utilisateur (user1) :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/72.PNG)
