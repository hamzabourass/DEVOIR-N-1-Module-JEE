# Projet de Microservices E-commerce

## Table des matières
1. [Présentation du projet](#présentation-du-projet)
2. [Tâches](#tâches)
   - [1. Architecture technique](#1-architecture-technique)
   - [2. Projet Maven](#2-projet-maven)
   - [3. Développement technique et tests des microservices](#3-développement-technique-et-tests-des-microservices)
   - [4. Développement et tests du service de ressources](#4-développement-et-tests-du-service-de-ressources)
   - [5. Développement et tests du service de réservation](#5-développement-et-tests-du-service-de-réservation)

---
## Project Overview

```
 Ce projet vise à créer une architecture de microservices produit/commande.

La table « COMMANDE » est composée » des colonnes suivantes [id, 
description, quantité, date, montant]
la table « COMMANDE » est composée » des colonnes suivantes [id,name,
description, price]
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
