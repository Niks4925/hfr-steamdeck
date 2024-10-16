[b]Je peux jouer à quoi ? [/b]

Voici quelques recommendations pour prendre en main le SD:
[*] [url=https://store.steampowered.com/app/1902490/Aperture_Desk_Job/]Aperture Desk Job[/url]
[*] [url=https://store.steampowered.com/app/1794680/Vampire_Survivors/]Vampire Survivors[/url]

La liste des 100 jeux les plus joués sur SD:
https://store.steampowered.com/charts/steamdecktopplayed
Globalement vous pouvez être sûr que ceux là fonctionnent correctement.


[b]Les plugins Decky Loader[/b]
Changer complètement l'apparence, ajouter de nouvelles fonctionnalités comme un VPN, modifier les graphismes de n'importe quel jeu, voire même ajouter des contrôles plus poussés de l'APU ?
C'est possible avec le gestionnaire de plugins [url=https://github.com/SteamDeckHomebrew/decky-loader]Decky Loader[/url].

Il fonctionne en injectant des composants React dans l'interface utilisateur de Steam et en exécutant des scripts en arrière-plan, de sorte qu'aucun fichier n'est modifié, tout en étant conçu pour être léger et ne pas causer de lag.
L'utilisation de ce plugin de lancement vous offre de nombreuses nouvelles options pour affiner votre expérience en mode jeu et sur le Steam Deck en général.

[u]Téléchargement de Decky Loader[/u]
Étape 1:
Aller sur la page Github de [url=https://github.com/SteamDeckHomebrew/decky-loader]Decky Loader[/url] et cliquer sur le bouton "Download".

Étape 2:
Une fois le fichier téléchargé, ouvrez le dossier dans lequel il a été téléchargé.
Il faut changer le nom du fichier téléchargé pour s'assurer qu'il peut être exécuté.
Pour ce faire, nous allons changer le nom de :
[cpp]decky_installer.desktop.download[/cpp]
en :
[cpp]decky_installer.desktop[/cpp]
Il est possible qu'un navigateur différent télécharge sans le .download à la fin, alors vérifiez à nouveau le nom pour vous en assurer.

[u]Installation de Decky Loader[/u]
Étape 3:
Double-cliquer sur le fichier Decky Installer que vous venez de télécharger/renommer.
Un message devrait apparaître vous demandant si vous voulez continuer, ce que vous ferez en cliquant sur "Continue".

Étape 4:
Une nouvelle fenêtre Konsole s'ouvre automatiquement. Tout d'abord, elle demandera d'entrer votre mot de passe sudo
Ensuite, elle vous demandera si vous voulez la version "release" ou "pre-release" du gestionnaire de plugins.
Je recommande la version "release" car c'est la version stable.

Retournez dans le mode Gaming et allez dans le menu d'accès rapide.
Vous devriez voir l'icône de Decky Loader.
[url=https://i.imgur.com/5y47G5u.png][img]https://i.imgur.com/5y47G5uh.png[/img][/url]


[u]Plugins utiles[/u]
[*] CSS Loader - Modifier les éléments de l'interface utilisateur du mode jeu.
[*] [strike]VibrantDeck - Modifie la saturation de l'écran pour donner l'impression d'être plus coloré ou pour faire ressortir les couleurs.[/strike] [i]obsolète depuis SteamOS 3.5[/i]
[*] SteamGridDB - Changez facilement l'illustration des jeux de votre bibliothèque.
[*] DeckSettings - Permet de consulter facilement les paramètres recommandés pour les performances des jeux.
[*] Decky Recorder - Enregistrez facilement de petits clips de jeux et sauvegardez-les directement sur votre Deck.

[b]Tweaks[/b] :non:[i]Partie pour ceux qui veulent bidouiller[/i]:non:

En éteignant la console complètement, vous pouvez avoir accès à 3 menus spécifiques.
Maintenir [b]Volume -[/b] et [b]bouton Power[/b] = Boot Manager
Maintenir [b]Volume +[/b] et [b]bouton Power[/b] = BIOS
Maintenir [b]...[/b] et [b]bouton Power[/b] = Recovery Manager

[u]Boot Manager[/u]
Ce menu permet de choisir sur quelle partition booter. 
A utiliser en cas d'installation de Windows et/ou de votre OS sur uSD ou SSD externe.
Vous pouvez accéder à ce menu dans le BIOS aussi.

[u]BIOS[/u]
Comme tout ordinateur, on peut accéder au BIOS du Steamdeck pour changer quelques paramètres avant le lancement de l'OS.
[*] UMA Frame buffer size [i](Setup Utility > Advanced)[/i]
Il s'agit de la quantité de mémoire vive partagée que vous allez attribué au GPU. 
En augmentant ce paramètre, vous avez plus de mémoire pour charger des textures, mais moins de mémoire vive utilisable.
Par défaut, elle est à 1gb, je conseille 4gb. 
[*] Battery stockage mode [i](Setup Utility > Power)[/i]
Ce mode permet de mettre la batterie en mode stockage, comme quand vous avez reçu la console. Elle coupe l'accès à la batterie jusqu'au branchement du chargeur secteur.
Parfait quand vous savez que vous n'allez pas y jouer pendant un moment ou si vous démontez la console et que vous ne voulez pas débrancher la batterie.

[i]En construction[/i]

[b]Emulation[/b]
[i]En construction[/i]
Voir https://steamdeckhq.com/tips-and-guides/setting-up-emulation-with-emudeck/
(A traduire)

[b]Installation de Windows[/b]
[i]En construction[/i]
Voir https://steamdeckhq.com/tips-and-guides/install-windows-10-11-on-steam-deck/
(A traduire)
