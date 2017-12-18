Travail realisé dans le projet 

Auparavant dans SOSIE, la connexion à la base se faisait avec jdbc, nous avons remplacé ce système pour un service d'authentification LDAP.

LDAP est un protocole qui permet de gérer des annuaires légers. C’est-à-dire accéder à des bases d'informations sur les utilisateurs d'un réseau 
par l'intermédiaire de protocoles TCP/IP.

Sur LDAP, on travaille en structure hierachique (sous forme d'arbre )
o :organization (o=ISTY)  
ou organization unit (ou=people)
**************************************************************************************************************************************************************
les fichiers modifiés dans le projet SOSIE 

application.properties // qui contient les paramètres de configuration de LDAP (url, group,pattern)

WebSecurityConfig.java // module qui gère les l'authentification des users dans l'application

pom.xml   //on rajoute des dependances Maven (librairie qui contienent des fonctions ) 
            pour utiliser les services de Spring pour gerer l'authentification LDAP (Spring Security et Spring LDAP) 

Spring prend les paramètres dans application.properties et les injecte dans WebSecurityConfig.java 
Pour lancer l'application , on run le fichier Application.java
**************************************************************************************************************************************************************
comment ça marche 

l'utilisateur se connecte  en entrant ces informations de login.
Ces informations sont enregistrés dans la base et l'authentification se fait via un service LDAP.
les users présents dans la base de données seront créer manuellement dans LDAP.

Pour afficher la page de connexion. On fait appel fait au WebController qui permet d'orienter les pages .
le WebController.java lui va utiliser le webSecurityConfig.java
le fichier webSecurity.config va passer les infos d'authentification à WebController via la variable "auth" 
WebSecurityConfig.java  contient les appels de "méthodes" auxquelles on rajoute des paramètres (ldapUrls, ldapUserDnPattern=uid, ldapGroup,userPassword)
***************************************************************************************************************************************************************
Installation et configuration des outils 

Etape 1 Installation à faire 

- installer Eclipse Oxygen (importer le projet SOSIE)
- installer Apache Directory studio (implementation LDAP en version free)
- installer MySql Installer Community

Etapte 2 Configurer LDAP dans Apache Directory (voir fichier de configuration.pdf)

Etape 3 configuration dans la base
Une fois l'installation terminée , on creer dans MYSQL un schema de données, ensuite dans Eclispe on run le projet . 
Spring se charge de creer les tables de la base 



