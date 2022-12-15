# Java - Amélioration Continue
## 🔎 [Sujet de l'évaluation](https://docs.google.com/document/d/14JCQic_200O7LIuUEa7Cjutao78dINbZKudZx8auF-4/edit)

Les personnes ayant travaillé sur ce projet sont :
- Maxime BAUDOIN
- Hugo SCARBONCHI
- Antonin SIMON

### Présentation du projet

>Notre projet java reprend le fonctionnement d'un store comme ceux d'Apple.  🧑‍💻  Il est composé de classes avec des champs et méthodes très simple qui pourraient représenter le fonctionnement d'un Apple Store.

***Parmis les Classes/Enum nous avons :***
- Product
- TypeProduct (Enum)
- Store
- Person
- Employee qui hérite de **Person**
- Customer qui hérite de **Person**

Grâce à [JUnit](https://junit.org/junit5/) nous avons aussi mis en place des tests unitaires sur les classes : 
- Product
- Store

Enfin, nous avons partagé deux Git Hooks pour assurer des bonnes pratiques et améliorer la qualité de son travail via Git :

| Git Hooks | Description |
| ------ | ------ |
| commit-msg | Ajout de la date, de l'heure et d'un smiley à la suite du message |
| pre-push | Vérifie la branche en cours et bloque si cette dernière est la main |

Concernant les hooks, ces derniers sont des scripts exécutés automatiquement par Git après le passage des commandes.
Il est possible que ces derniers ne soient pas récupérés avec les droits d'exécutions.
*Pensez à passer la commande suivante :*
```sh
chmod +x .githooks/commit-msg .githooks/pre-push
```

## Merci pour votre visite et à bientôt ! 👋
