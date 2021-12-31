# PK Chat - Chat Based JavaFx Library

Selamat Datang Di Repository PK Chat, 

Cara Menggunakan Client : 

1. Download Client - Latest Di : https://github.com/smpkska/pkchat-client/releases/latest/download/pkchat.jar
2. Apabila Kalian belum Memiliki Java Silahkan Download Java Terlebih Dahulu Di : https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html
3. Apabila Sudah Memiliki Java Silahkan Ketik Ini Di CMD : 
```
java -jar pkchat.jar
```
Mudah Bukan :) ?

Cara Membuat Server Sendiri : 

Pastikan Device Yang akan di gunakan untuk menjadi server memenuhi dibawah ini : 

1GB RAM +
5GB Disk
Internet
Java JRE 8+

1. Download Server - Latest Di : https://github.com/smpkska/pkchat-client/releases/latest/download/server.jar
2. Gunakan ``tmux`` untuk membuat server 24/7 (Untuk Linux)
3. Ketik : 
```
java -Xms128M -Xmx1080M -jar server.jar nogui
```
4. Selamat Server Kamu Sudah Berhasil Menyala, Jangan lupa buka port : 9001 dan gunakan IP Device kamu untuk konek di Client
