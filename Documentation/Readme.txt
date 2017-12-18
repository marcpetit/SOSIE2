Travail realis� dans le projet 

Auparavant dans SOSIE, la connexion � la base se faisait avec jdbc, nous avons remplac� ce syst�me pour un service d'authentification LDAP.

LDAP est un protocole qui permet de g�rer des annuaires l�gers. C�est-�-dire acc�der � des bases d'informations sur les utilisateurs d'un r�seau 
par l'interm�diaire de protocoles TCP/IP.

Sur LDAP, on travaille en structure hierachique (sous forme d'arbre )
o :organization (o=ISTY)  
ou organization unit (ou=people)
**************************************************************************************************************************************************************
les fichiers modifi�s dans le projet SOSIE 

application.properties // qui contient les param�tres de configuration de LDAP (url, group,pattern)

WebSecurityConfig.java // module qui g�re les l'authentification des users dans l'application

pom.xml   //on rajoute des dependances Maven (librairie qui contienent des fonctions ) 
            pour utiliser les services de Spring pour gerer l'authentification LDAP (Spring Security et Spring LDAP) 

Spring prend les param�tres dans application.properties et les injecte dans WebSecurityConfig.java 
Pour lancer l'application , on run le fichier Application.java
**************************************************************************************************************************************************************
comment �a marche 

l'utilisateur se connecte  en entrant ces informations de login.
Ces informations sont enregistr�s dans la base et l'authentification se fait via un service LDAP.
les users pr�sents dans la base de donn�es seront cr�er manuellement dans LDAP.

Pour afficher la page de connexion. On fait appel fait au WebController qui permet d'orienter les pages .
le WebController.java lui va utiliser le webSecurityConfig.java
le fichier webSecurity.config va passer les infos d'authentification � WebController via la variable "auth" 
WebSecurityConfig.java  contient les appels de "m�thodes" auxquelles on rajoute des param�tres (ldapUrls, ldapUserDnPattern=uid, ldapGroup,userPassword)
***************************************************************************************************************************************************************
Installation et configuration des outils 

Etape 1 Installation � faire 

- installer Eclipse Oxygen (importer le projet SOSIE)
- installer Apache Directory studio (implementation LDAP en version free)
- installer MySql Installer Community

Etapte 2 Configurer LDAP dans Apache Directory (voir fichier de configuration.pdf)

Etape 3 configuration dans la base
Une fois l'installation termin�e , on creer dans MYSQL un schema de donn�es, ensuite dans Eclispe on run le projet . 
Spring se charge de creer les tables de la base 



