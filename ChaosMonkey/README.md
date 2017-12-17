# SOSIE

---

### Chaos Monkey

---

#### Installation

* Installer Halyard, cet outil permet de configurer Spinnaker plus facilement.

````
curl -O https://raw.githubusercontent.com/spinnaker/halyard/master/install/stable/InstallHalyard.sh
sudo bash InstallHalyard.sh```

On vérifie que hal est bien installé avec `hal -v` pour obtenir la version de hal.
Exemple : *0.38.0-20171207201947*
````

* Configurer Halyard pour fonctionner en local :
`hal config deploy edit --type localdebian`

---
__Storage__

Google

- Créer un nouveau projet
- Suivre la documentation pour Google Cloud Storage de Spinnaker
http://cloud.google.com/sdk/downloads#apt-get

---
__Deploy__

Sélectionner la version de Spinnaker à déployer   
`hal version list`  
`export VERSION=1.0.0`  
`hal config version edit --version $VERSION`  

Déploiement de l'application :  
`sudo hal deploy apply`

On accède à l'interface graphique de Spinnaker via http://localhost:9000  
__Si ça ne marche pas__
- Redémarrer la machine
- `sudo hal deploy apply`

---
__Chaos Monkey__

- Installer MySQL Server (>= 5.6)  
`sudo apt install mysql-server-5.6`
  - Pour vérifier la version installée : `mysql -V`


- Installer Go  
  - Suivre la documentation sur https://medium.com/@patdhlk/how-to-install-go-1-8-on-ubuntu-16-04-710967aa53c9


- Télécharger chaosmonkey
`go get github.com/netflix/chaosmonkey/cmd/chaosmonkey`

- Configurer Spinnaker pour supporter chaosmonkey
  - Ouvrir le fichier de config dans `~/.hal/config`
  - Aller à la catégorie features : `chaos=true`
  - Mettre à jour hal : `sudo hal deploy apply`  

On retourne sur http://localhost:9000, on crée une application et la case Chaos Monkey devrait apparaître.

- Créer base de données MySQL pour chaosmonkey
`CREATE DATABASE chaosmonkey`

- Créer un fichier de configuration pour chaosmonkey
`sudo nano chaosmonkey.toml`

```
// chaosmonkey.toml

[chaosmonkey]
enabled = true
schedule_enabled = true
leashed = false
accounts = ["production", "test"]
time_zone = "UTC"

[database]
host = "localhost"
name = "chaosmonkey"
user = "root"
encrypted_password = "m@x"

[spinnaker]
endpoint = "http://localhost:9000"
```

`chaosmonkey migrate`  

On vérifie que chaosmonkey peut communiquer avec Spinnaker
`chaosmonkey config sosie`
