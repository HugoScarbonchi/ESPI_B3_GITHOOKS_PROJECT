# ESPI_B3_GITHOOKS_PROJECT

## Classes
### Store
#### Attributes
- name
- address
- nbMaximumEmployees

### Product
#### Attributes
- nam
- collection
- price

### Collection
#### Attributes
- name

### Personn
#### Attributes
- firstname
- lastname

### Client
- id

### Employee

# Hooks

## Push
Hook de pre-push qui va vérifier la branche sur laquelle on push. La branche concernée est récupérée dans notre **script pre-push** et le tratiement est fait dans un fichier **Java**.
L'idée de ce hook est de **respecter les bonnes pratiques de Git**. Notre Hook va **bloquer automatiquement le push si la branche de destination est la main** (ici c'est notre branche qui sert de prod).
## Commit 
- Ajouter date, heure et émoji