# Projet de Microservices E-commerce

## Team de développement
- **Hamza Bouars et Oussama El Meskini**



## Table des matières
1. [Présentation du projet](#présentation-du-projet)
2. [Tâches](#tâches)
   - [1. Architecture technique](#1-architecture-technique)
   - [2. Développement et tests des microservices technique](#2-développement-technique-et-tests-des-microservices)
   - [3. Développement et tests du microservice fonctionelle ](#3-développement-et-tests-du-service-de-ressources)

---
## Project Overview

```
 Ce projet vise à créer une architecture de microservices produit/commande.

La table « COMMANDE » est composée » des colonnes suivantes [id, 
description, quantité, date, montant]
la table « COMMANDE » est composée » des colonnes suivantes [id,name,
description, price]
Etapes pour lancer le projet :
**1- Cloner le projet dans votre**
**2- Lancer les microservice technique config-service->discovery-service->gatewaye-service**
**3- Lancer les microservice fonctionelle produit et commande**


```
# Gestion des Réservations

Ce projet consiste en une petit application ecommerce basée sur une architecture de microservices. L'application se compose de deux microservices fonctionnels :

- **Service des produit** : Gère les produit.
- **Service des commandes** : Gère les commandes.


Les fonctionalités et microservices techniques à implémenter sont :

- **Passerelle de Services** : Basée sur Spring Cloud Gateway.
- **Service de Découverte** : Basée sur Eureka Server.
- **Service de Configuration** : Basée sur Spring Cloud Config.
- **Open Fein** : Gère la communication entre les  deux microservices.
- **Resilience4j** : Offre une Implementation du pattern Circuit Breaker pour la tolerance au panne.
  
## Tasks

### 1. Architecture du Projet

Architecture technique du projet, les microservices et ses interation.
![image](https://github.com/hamzabourass/DEVOIR-N-1-Module-JEE/assets/105117343/571fee24-4f40-4ba3-acec-e6003cce6335)
### 2. Développement et tests des microservices technique

Develop and test the following microservices:

- **Discovery Service**:

  ![image](https://github.com/hamzabourass/DEVOIR-N-1-Module-JEE/assets/105117343/5071c6aa-19de-44cb-981c-a01ddddbe2f4)


- **Gateway Service**:

  Test du health du Gateway : 

  ![image](https://github.com/hamzabourass/DEVOIR-N-1-Module-JEE/assets/105117343/2a0b7146-7b18-45c2-a4f9-5b876f0bb893)

  Test de l'acceder à une service via le Gateway :

![image](https://github.com/hamzabourass/DEVOIR-N-1-Module-JEE/assets/105117343/3929cfca-2c4b-456a-9a0b-914707099a3d)

  
- **Config Service**:

  Test du health de service de configuration :

  ![image](https://github.com/hamzabourass/DEVOIR-N-1-Module-JEE/assets/105117343/b5db565f-a151-495e-ab61-22eaec17f294)

  Test de recuperation de config d'une service : 

  ![image](https://github.com/hamzabourass/DEVOIR-N-1-Module-JEE/assets/105117343/b91f83e6-5f0a-4309-90ec-15145a62ca6f)

- **Open Fein** :

  Test de communication entre les deux micro-service (commande et produit) via open Fein :

  ![image](https://github.com/hamzabourass/DEVOIR-N-1-Module-JEE/assets/105117343/7cb276e4-020e-4f1c-a81d-402ce3a80f2c)

- **Circuit Breaker avec Resilience4j** :

  Apres l'arrete du service produit :

  ![image](https://github.com/hamzabourass/DEVOIR-N-1-Module-JEE/assets/105117343/1d7a1952-3e07-4218-bcca-d8194e75768f)


`config git repository` : https://github.com/hamzabourass/ecom-config-repo

### 4. Développement et tests du microservice fonctionelle

Develop and test the des microservices, including:

```
- Entities
- DAO (Data Access Object)
- Service
- DTO (Data Transfer Object)
- Mapper
- RestController
```

* H2 Database
  
![image](https://github.com/hamzabourass/DEVOIR-N-1-Module-JEE/assets/105117343/a3bc142d-e720-4fb3-bc4b-e67ea82eff5c)

* Endpoints Tests et changement a chaud :

  Apres le changement dans la repo distant :

  ![image](https://github.com/hamzabourass/DEVOIR-N-1-Module-JEE/assets/105117343/898e2a38-0fae-497e-8afa-a75d79c8faa7)

  Avant le changment et faire un push au repo distant et l'envoie d'une requete post pour rafraîchir : 

    1 - ![image](https://github.com/hamzabourass/DEVOIR-N-1-Module-JEE/assets/105117343/a1d93847-7096-4fce-97e6-6f4a1149d7fe)
    2 - ![image](https://github.com/hamzabourass/DEVOIR-N-1-Module-JEE/assets/105117343/855c70f4-57b5-4cc6-822c-6918188ebfe9)
    3 - ![image](https://github.com/hamzabourass/DEVOIR-N-1-Module-JEE/assets/105117343/b4d45549-b01b-44ac-aa75-9bafd3b45709)


* Documentation Swagger :

   ![image](https://github.com/hamzabourass/DEVOIR-N-1-Module-JEE/assets/105117343/c74ea983-c2f3-460c-a2a5-63cdec811f15)

   ![image](https://github.com/hamzabourass/DEVOIR-N-1-Module-JEE/assets/105117343/d95dfdda-7d2e-47ca-9b4a-fa1c99d9d31e)



