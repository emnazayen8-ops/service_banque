# TP 5 : Service de banque avec Java RMI et JNDI

## Objectif

- Mettre en œuvre une communication client/serveur avec Java RMI.
- Comprendre l'intégration entre JNDI et RMI pour la recherche d'objets distants.

## 1. Projet serveur (RMIBanque_Server)

![Arborescence serveur](RMIBanque_Server/images/arborescence-serveur.png)

## 2. Projet client (RMIBanque_Client)

![Arborescence client](RMIBanque_Server/images/arborescence-client.png)

## 3. Exécution avec RMI

![ client](RMIBanque_Server/images/console-client.png)

## 4. Utilisation de JNDI

Ajout du fichier `jndi.properties` dans les deux projets. Le serveur utilise `InitialContext.rebind()` et le client `InitialContext.lookup()`.


![ client](RMIBanque_Server/images/console-client_JNDI.png)



