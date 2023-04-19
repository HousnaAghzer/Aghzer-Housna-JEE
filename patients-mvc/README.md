# Activité N°3 : Spring Boot Spring MVC avec Thymeleaf Spring Data

### Objectif :

Créer une application Web JEE basée sur Spring MVC, Thylemeaf, Spring Data JPA et Spring security qui permet de gérer les patients.
L'application doit permettre les fonctionnalités suivantes :
- Fonctionnalités pour un simple utilisateur :

      1. S'authentifier 
      2. Afficher les patients
      3. Faire la pagination
      4. Chercher les patients
      5. Se déconnecter

- Fonctionnalités pour un admin :

      1. Toutes les fonctionnalités d'un simple utilisateur
      2. Ajouter un patient
      3. Modifier un patient
      4. Supprimer un patient 

### Architecture du projet :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/107.PNG)

### Package entities :
- L'entité Patient :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/108.PNG)

### Package repositories :
- L'interface PatientRepository :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/109.PNG)

### Package security :
- La classe SecurityConfig :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/110.PNG)
![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/111.PNG)

### Package web :
- La classe PatientController :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/112.PNG)
![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/113.PNG)
![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/114.PNG)

- La classe SecurityController :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/115.PNG)

- La classe PatientsMvcApplication :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/116.PNG)

- patients.html : 

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/93.png)
![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/94.png)

- Le fichier application.properties :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/95.png)

- PhpMyAdmin :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/137.PNG)

- La table des patients :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/138.PNG)

### Résultats :
- Liste des patients format json :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/96.png)

#### Coté simple utilisateur :

- Authentification :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/104.PNG)

- Affichage des patients avec pagination :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/105.PNG)

- Recherche d'un patient :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/106.PNG)

#### Coté administrateur :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/100.PNG)

- Ajout d'un patient :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/101.PNG)

- Modification d'un patient :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/102.PNG)

- Suppression d'un patient :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/103.PNG)

