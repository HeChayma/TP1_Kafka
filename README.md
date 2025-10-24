# TP1_Kafka
<br>
1. Docker  : 
<br>
✅ Création d’un consumer qui écoute le topic R2 avec Kafka : 
<br>
<code><pre> $ docker exec --interactive --tty broker kafka-console-consumer --bootstrap-server broker:9092 --topic R2 </code></pre>
<br>
✅ Création d’un producer qui permet d’envoyer des messages dans le topic R2 : 
<br>
<code><pre> $ docker exec --interactive --tty broker kafka-console-producer --bootstrap-server broker:9092 --topic R2 </code></pre>
✅ Test  :
<br>
=> Producer "Envoyer un message 'Hello CCN'" : 
<br>
<img width="1779" height="150" alt="image" src="https://github.com/user-attachments/assets/bf583fb0-f547-4f0a-9168-e12991c9e7e3" />
<br>
=> Consumer :
<img width="1795" height="155" alt="image" src="https://github.com/user-attachments/assets/0a3fd454-365b-4bb2-b930-810b087e9ab2" />

2. Kafka via StreamBridge :
<br>
=> Partie 1 :
<br>
L’envoi d’un message via l’URL du navigateur sur le topic R1
<br>
<img width="475" height="124" alt="image" src="https://github.com/user-attachments/assets/5938ff69-2441-4abf-b1aa-67c92f0fb8a5" />
<br>
Création d’un consumer qui permet d’écouter le topic R1 pour voir les messages
<br>
<img width="1801" height="124" alt="image" src="https://github.com/user-attachments/assets/b5959d25-8627-4131-8bbe-d38020d15460" />






