# Projet de Microservices E-commerce

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
**1- Lancer les microservice technique config-service->discovery-service->gatewaye-service**
**2- Lancer les microservice fonctionelle produit et commande**


```
# Gestion des Réservations

Ce projet consiste en une application de gestion des réservations basée sur une architecture de microservices. L'application se compose de deux microservices fonctionnels :

- **Service des produit** : Gère les produit.
- **Service des commandes** : Gère les commandes.

Les microservices techniques à implémenter sont :

- **Passerelle de Services** : Basée sur Spring Cloud Gateway.
- **Service de Découverte** : Basée sur Eureka Server.
- **Service de Configuration** : Basée sur Spring Cloud Config.
## Tasks

### 1. Architecture du Projet

Architecture technique du projet, les microservices et ses interation.
![image](https://github.com/hamzabourass/DEVOIR-N-1-Module-JEE/assets/105117343/571fee24-4f40-4ba3-acec-e6003cce6335)
### 2. Développement et tests des microservices technique

Develop and test the following microservices:

- **Discovery Service**:

  ![image](https://github.com/hamzabourass/DEVOIR-N-1-Module-JEE/assets/105117343/5071c6aa-19de-44cb-981c-a01ddddbe2f4)


- **Gateway Service**:

![image](https://github.com/hamzabourass/DEVOIR-N-1-Module-JEE/assets/105117343/cd13ccb9-c803-40cb-84b1-d560348bd098)

![image](https://github.com/hamzabourass/DEVOIR-N-1-Module-JEE/assets/105117343/875abaca-0e2a-4421-968c-2f31abc10cfd)

  
- **Config Service**:

![image](https://github.com/hamzabourass/DEVOIR-N-1-Module-JEE/assets/105117343/e09f4d1f-5ce0-4225-b203-fb4b1edb3eff) ![image](https://github.com/hamzabourass/DEVOIR-N-1-Module-JEE/assets/105117343/5166fb4c-88a8-4329-a7a7-a8838de325eb)



`config git repository` : https://github.com/hamzabourass/ecom-config-repo

### 4. Développement et tests du microservice fonctionelle

Develop and test the `resources-service` microservice, including:

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

* Endpoints Tests
  
![image](https://github.com/hamzabourass/DEVOIR-N-1-Module-JEE/assets/105117343/97dce648-dacb-4b77-8f6d-0557eb825b44)

![image](https://github.com/hamzabourass/DEVOIR-N-1-Module-JEE/assets/105117343/6a141c3e-9a83-419b-8b10-512055e9bcc7)

* Swagger

![image](https://github.com/hamzabourass/DEVOIR-N-1-Module-JEE/assets/105117343/c74ea983-c2f3-460c-a2a5-63cdec811f15)

![image](https://github.com/hamzabourass/DEVOIR-N-1-Module-JEE/assets/105117343/d95dfdda-7d2e-47ca-9b4a-fa1c99d9d31e)



