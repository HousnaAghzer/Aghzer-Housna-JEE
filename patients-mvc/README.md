# Activité N°3 : Spring Boot Spring MVC avec Thymeleaf Spring Data

### Objectif :

Créer une application Web JEE basée sur Spring MVC, Thylemeaf et Spring Data JPA qui permet de gérer les patients.
L'application doit permettre les fonctionnalités suivantes :
- Afficher les patients
- Faire la pagination
- Chercher les patients
- Supprimer un patient

### Architecture du projet :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/87.png)

### Package entities :
- L'entité Patient :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/88.png)

### Package repositories :
- L'interface PatientRepository :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/89.png)

### Package web :
- La classe PatientController :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/90.png)
![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/91.png)

- La classe PatientsMvcApplication :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/92.png)

- Patients.html : 

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/93.png)
![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/94.png)

- Le fichier application.properties :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/95.png)

### Résultats :
- Liste des patients format json :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/96.png)


- Affichage des patients avec pagination :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/97.png)

- Recherche d'un patient :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/98.png)

- Suppression d'un patient:

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/99.png)

