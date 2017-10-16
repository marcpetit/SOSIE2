# SOSIE2

## Contexte

Dans le cadre de cours d'Architecture Logicielle, la promotion IATIC5 (dernière 
année à l'école d'ingénieur en informatique ISTY de l'Université de Versailles) 
met en pratique les connaissances qu'elle acquiert sur un projet de développement. 
Le projet est mené par Marc Petit et a pour objectif d'être repris d'une année 
sur l'autre.

## Fonctionnement de développement

- Client : Marc Petit.
- Chef de projet : Marc Petit.
- Sprints de une semaine.
- Équipes de 3 à 4 étudiants.
- 2 sprints en simultanée : rédaction et développement.
- Point hebdomadaire.

## Objectifs

SOSIE2 pour Système d'Optimisation du Système d'Informations pour Établissement. 
Ce projet consiste à développer une application permettant la gestion des étudiants, 
des cours, des salles de classes, etc. au sein d'un établissement universitaire 
ou scolaire.
Les spécifications évolueront au fur et à mesure en tenant compte des besoins du 
client et de l'avancée du développement.

## Installation de l'environnement de travail

Sont nécessaire comme outils :
- Eclipse
- Plugin Maven
- MySQL

## Configuration de l'environnement de travail

Étape 1 :
Télécharger le projet : [Dépôt GitHub de SOSIE2](https://github.com/marcpetit/SOSIE2).

Étape 2 :
Dans Eclipe, faire *import existing maven projects* et mettre le projet.

Étape 3:
Créer une base de données et un utilisateur avec les commandes suivantes :

	mysql > create database architecture;
	mysql > create user 'admin'@'localhost' identified by ‘admin’;
	mysql > grant all on architecture.* to 'admin'@'localhost';

Étape 4 :
Changer le fichier "src/main/resources/application.properties" : pour le premier lancement de l'application, il faut changer l'instruction "spring.jpa.hibernate.ddl-auto=update" par "spring.jpa.hibernate.ddl-auto=create". Après, vous pouvez mettre "upade" sinon, à chaque run de l'application, la base de données va être initialiser (vide).

## Exécution du projet

Étape 1 :
Faire *run as* -> *Spring Boot App*.

Étape 2 :
Sur votre navigateur, allez sur [localhost:8080/](http://localhost:8080/).

## Contributeurs au projet

Référent : Marc Petit

Promotion IATIC5 (2017-2018)
