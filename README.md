# Projet-Architecture

Etape 1 :
Télécharger le projet.

Etape 2 :
Dans Eclipe, faire "import existing maven projects" et mettre le projet.

Etape 3:
Créer une base de données et un utilisateur avec les commandes suivantes :

mysql> create database architecture;
mysql> create user 'admin'@'localhost' identified by ‘admin’;
mysql> grant all on architecture.* to 'admin'@'localhost';


Etape 4 :
Changer le fichier "src/main/resources/application.properties" : pour le premier lancement de l'application, il faut changer l'instruction "spring.jpa.hibernate.ddl-auto=update" par "spring.jpa.hibernate.ddl-auto=create". Après, vous pouvez mettre "upade" sinon, à chaque run de l'application, la base de données va être initialiser (vide).

Etape 4 :
Faire "run as" -> "Spring Boot App"

Etape 5 :
localhost:8080/

