# Activité pratique 4 : Spring Security (En cours - Pas encore finalisé)

### Objectif de cette activité :

Sécuriser une application qui permet de gérer les patients en intégrant un système d'authentification basé sur Spring security.
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

### Réalisation : 

- Architecture et structure du projet :

![Architecture](https://github.com/AghzerHousna12/All-Ressources-/blob/master/117.PNG)

### Package entities :
- L'entité Patient :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/118.PNG)

### Package repositories :
- L'interface PatientRepository :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/119.PNG)

### Package security :
- La classe SecurityConfig :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/120.PNG)
![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/121.PNG)

### Package web :
- La classe PatientController :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/122.PNG)
![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/123.PNG)
![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/124.PNG)

- La classe SecurityController :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/125.PNG)

- La classe PatientsMvcApplication :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/126.PNG)

- Le fichier application.properties :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/127.PNG)

- PhpMyAdmin :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/135.PNG)

- La table des patients :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/136.PNG)

### Résultats :
- Authentification :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/104.PNG)

- Affichage des patients avec pagination :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/134.PNG)

- Recherche d'un patient :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/133.PNG)

#### Coté administrateur :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/128.PNG)

- Ajout d'un patient :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/129.PNG)

- Modification d'un patient :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/130.PNG)

- Suppression d'un patient :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/131.PNG)





