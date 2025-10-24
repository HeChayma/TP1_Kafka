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
=> Producer "Envoyer un message 'Hello CCN'" : 
<br>
<img width="1779" height="150" alt="image" src="https://github.com/user-attachments/assets/bf583fb0-f547-4f0a-9168-e12991c9e7e3" />
<br>
=> Consumer :
<img width="1795" height="155" alt="image" src="https://github.com/user-attachments/assets/0a3fd454-365b-4bb2-b930-810b087e9ab2" />

