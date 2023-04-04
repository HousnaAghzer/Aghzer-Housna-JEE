# Activité N°2 part 2 : Use case JPA, Hibernate Spring Data, One To Many, One To One

### Architecture du projet :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/45.png)

### Package entities :
- L'entité Patient :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/46.png)

- L'entité Medecin :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/47.png)

- L'entité RendezVous :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/48.png)

- L'entité Consultation :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/49.png)

- L'entité StatusRDV :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/50.png)

### Package repositories :
- L'interface PatientRepository :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/51.png)

- L'interface MedecinRepository :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/52.png)

- L'interface RendezVousRepository :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/54.png)

- L'interface ConsultationRepository :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/53.png)

### Package service :
- L'interface IHospitalService et la classe IHospitalServiceImpl qui implémente cette interface :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/55.png)
![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/56.png)
![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/57.png)

### Package web :
- La classe PatientController :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/58.png)

- La classe HospitalApplication :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/59.png)
![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/60.png)
![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/61.png)

- Le fichier application.properties :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/62.png)

- Start H2Database :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/63.png)

- La table Patient :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/38.png)

- La table Medecin :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/39.png)

- La table RendezVous :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/43.png)

- La table Consultation :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/42.png)

### Résultats :

![Login](https://github.com/HousnaAghzer/All-Ressources-/blob/master/44.png)
