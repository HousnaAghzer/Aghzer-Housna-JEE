# Activité N°2 part 3 : Use Case JPA Hibernate Spring Data Many To Many Case

### Architecture du projet :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/74.PNG)

### Package entities :
- L'entité User :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/75.png)

- L'entité Role :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/76.png)

### Package repositories :
- L'interface UserRepository :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/77.png)

- L'interface RoleRepository :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/78.png)

### Package service :
- L'interface UserService et la classe UserServiceImpl qui implémente cette interface :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/79.png)
![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/80.png)
![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/81.png)
![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/82.png)

### Package web :
- La classe UserController :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/83.png)

- La classe JpaEmsiApplication :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/84.png)
![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/85.png)

- Le fichier application.properties :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/86.png)

#### En utilisant H2Database :
- La table Users :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/64.png)

- La table Role :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/65.png)

- La table Role_Users :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/66.png)

#### En utilisant Mysql :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/67.png)

- La table Users :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/69.png)

- La table Role :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/68.png)

- La table Role_Users :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/70.png)

### Résultats :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/73.png)

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/71.png)

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/72.png)
