# kinomap-android
## Énoncé :
Réaliser une application affichant une liste de véhicule, via un appel d’API, avec les
spécificités suivantes :
- Chaque cellule de la liste doit avoir un icône et le nom du véhicule.
- Lorsque l’on clique sur la cellule, il faut afficher l’id du véhicule.
- Vous êtes libre de mettre le design, de prendre les bibliothèques que vous souhaitez.

N’hésitez pas à prendre des initiatives si vous avez des idées à ajouter dans l’application du
moment que l’énoncé est réalisé.
Pensez à utiliser les bonne pratique de développement.

## L’appel de la liste des véhicules est :
http://api.kinomap.com/vehicle/list?icon=1&lang=en-gb&forceStandard=1&outputFormat=json&appToken=8qohg5a9c6q6x58szpyxizvp91yary3setxdxutl10dugtel1syjs6gmrp33oo40a356j2cxt6vdcpzg095drsym5blnyen0hi4bdq32j61clfux2i9vtuhr

## Technologies utilisées :
- langages :  
![Java](https://img.shields.io/badge/-Java-3f4441?style=plastic&logo=java)  

- Versionning :  
![Git](https://img.shields.io/badge/-Git-black?style=plastic&logo=git)
- IDE and editor :  
![Android Studio](https://img.shields.io/badge/-Android%20Studio-162387?style=plastic&logo=android%20studio) ![vscode](https://img.shields.io/badge/-VS%20Code-007ACC?style=plastic&logo=visual-studio-code)

## Temps estimé :

Le projet a débuté le dimanche 01/11/2020 à 9h et n'est pas encore fini. La branche main se termine le lundi 02/11/2020 à 11h. 
Temps passé dessus : 10h.

## Problèmes rencontrés :

Je n'ai pas réussi à intercepter la liste de véhicule au niveau de l'API. Je suis tombé sur une erreur "java.lang.IllegalStateException: Expected BEGIN_ARRAY but was BEGIN_OBJECT".
Après avoir vu sur StackkOverflow, cette erreur est lié aux objets mais je ne vois pas ce qui cloche.
Si vous avez la solution, j'aimerai la connaitre.