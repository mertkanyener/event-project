INSERT INTO users (ID, EMAIL, FIRST_NAME, LAST_NAME, PASSWORD, FACEBOOK_USER, START_DATE, STATUS) VALUES (1, 'admin@email.com', 'Mertkan', 'Yener',  '{bcrypt}$2a$10$iNHEgEWcTWY.tnqZF2zmgOz6PJ257IGomy4JqCApdmsSg4r8HpQRC', 0,CURRENT_DATE, 'AC');
INSERT INTO users (ID, EMAIL, FIRST_NAME, LAST_NAME, PASSWORD, FACEBOOK_USER, START_DATE, STATUS) VALUES (2, 'admin2@email.com', 'Mertkan', 'Yener',  '{bcrypt}$2a$10$iNHEgEWcTWY.tnqZF2zmgOz6PJ257IGomy4JqCApdmsSg4r8HpQRC', 0,CURRENT_DATE, 'AC');

INSERT INTO users (ID, EMAIL, FIRST_NAME, LAST_NAME, PASSWORD, FACEBOOK_USER, GENDER, BIRTH_DATE, START_DATE, STATUS) VALUES (1001, 'mertkanyener@mertkan.com', 'Mertkan', 'Yener', '{bcrypt}$2a$10$1YpINoz3P5LZ33TKJ/sLueEgETgN.6MEKk0.kwRnGnFK2BwQ8O2tm', 0, 'male', '1995-06-30', CURRENT_DATE, 'AC');
INSERT INTO users (ID, EMAIL, FIRST_NAME, LAST_NAME, PASSWORD, FACEBOOK_USER, GENDER, BIRTH_DATE, IMAGE, START_DATE, STATUS) VALUES (1002, 'idilcihangir@gmail.com', 'İdil', 'Cihangir', '{bcrypt}$2a$10$1YpINoz3P5LZ33TKJ/sLueEgETgN.6MEKk0.kwRnGnFK2BwQ8O2tm', 0, 'female', '1995-06-30', 'http://localhost:9999/images/users/1002.jpg', CURRENT_DATE, 'AC');
INSERT INTO users (ID, EMAIL, FIRST_NAME, LAST_NAME, PASSWORD, FACEBOOK_USER, GENDER, BIRTH_DATE, IMAGE, START_DATE, STATUS) VALUES (1003, 'anilkocas@gmail.com', 'Anıl', 'Koçaş', '{bcrypt}$2a$10$1YpINoz3P5LZ33TKJ/sLueEgETgN.6MEKk0.kwRnGnFK2BwQ8O2tm', 0, 'male', '1995-06-30', 'http://localhost:9999/images/users/1003.jpg', CURRENT_DATE, 'AC');
INSERT INTO users (ID, EMAIL, FIRST_NAME, LAST_NAME, PASSWORD, FACEBOOK_USER, GENDER, BIRTH_DATE, IMAGE, START_DATE, STATUS) VALUES (1004, 'saimkaraer@gmail.com', 'Saim', 'Karaer', '{bcrypt}$2a$10$1YpINoz3P5LZ33TKJ/sLueEgETgN.6MEKk0.kwRnGnFK2BwQ8O2tm', 0, 'male', '1995-06-30', 'http://localhost:9999/images/users/1004.jpg', CURRENT_DATE, 'AC');
INSERT INTO users(ID, EMAIL, FIRST_NAME, LAST_NAME, PASSWORD, FACEBOOK_USER, GENDER, BIRTH_DATE, IMAGE, START_DATE, STATUS) VALUES (1005, 'freddie@gmail.com', 'Freddie', 'Mercury', '{bcrypt}$2a$10$1YpINoz3P5LZ33TKJ/sLueEgETgN.6MEKk0.kwRnGnFK2BwQ8O2tm', 0, 'male', '1946-09-05', 'http://localhost:9999/images/users/1005.jpg', CURRENT_DATE, 'AC');
INSERT INTO users(ID, EMAIL, FIRST_NAME, LAST_NAME, PASSWORD, FACEBOOK_USER, GENDER, BIRTH_DATE, IMAGE, START_DATE, STATUS) VALUES (1006, 'bowie@gmail.com', 'David', 'Bowie', '{bcrypt}$2a$10$1YpINoz3P5LZ33TKJ/sLueEgETgN.6MEKk0.kwRnGnFK2BwQ8O2tm', 0, 'male', '1947-01-08', 'http://localhost:9999/images/users/1006.jpg', CURRENT_DATE, 'AC' );
INSERT INTO users(ID, EMAIL, FIRST_NAME, LAST_NAME, PASSWORD, FACEBOOK_USER, GENDER, BIRTH_DATE, IMAGE, START_DATE, STATUS) VALUES (1007, 'hendrix@gmail.com', 'Jimi', 'Hendrix', '{bcrypt}$2a$10$1YpINoz3P5LZ33TKJ/sLueEgETgN.6MEKk0.kwRnGnFK2BwQ8O2tm', 0, 'male', '1942-11-27', 'http://localhost:9999/images/users/1007.jpg', CURRENT_DATE, 'AC' );
INSERT INTO users(ID, EMAIL, FIRST_NAME, LAST_NAME, PASSWORD, FACEBOOK_USER, GENDER, BIRTH_DATE, IMAGE, START_DATE, STATUS) VALUES (1008, 'morrison@gmail.com', 'Jim', 'Morrison', '{bcrypt}$2a$10$1YpINoz3P5LZ33TKJ/sLueEgETgN.6MEKk0.kwRnGnFK2BwQ8O2tm', 0, 'male', '1943-12-08', 'http://localhost:9999/images/users/1008.jpg', CURRENT_DATE, 'AC' );
INSERT INTO users(ID, EMAIL, FIRST_NAME, LAST_NAME, PASSWORD, FACEBOOK_USER, GENDER, BIRTH_DATE, IMAGE, START_DATE, STATUS) VALUES (1009, 'hetfield@gmail.com', 'James', 'Hetfield', '{bcrypt}$2a$10$1YpINoz3P5LZ33TKJ/sLueEgETgN.6MEKk0.kwRnGnFK2BwQ8O2tm', 0, 'male', '1963-08-03', 'http://localhost:9999/images/users/1009.jpg', CURRENT_DATE, 'AC' );

INSERT INTO role(ROLE_ID, ROLE) VALUES (0, 'MASTERADMIN');
INSERT INTO role (ROLE_ID, ROLE) VALUES (1, 'ADMIN');
INSERT INTO role (ROLE_ID, ROLE) VALUES (2, 'USER');
INSERT INTO user_role (USER_ID, ROLE_ID) VALUES (1, 0);
INSERT INTO user_role (USER_ID, ROLE_ID) VALUES (2, 1);
INSERT INTO user_role (USER_ID, ROLE_ID) VALUES (1001, 2);
INSERT INTO user_role (USER_ID, ROLE_ID) VALUES (1002, 2);
INSERT INTO user_role (USER_ID, ROLE_ID) VALUES (1003, 2);
INSERT INTO user_role (USER_ID, ROLE_ID) VALUES (1004, 2);
INSERT INTO user_role (USER_ID, ROLE_ID) VALUES (1005, 2);
INSERT INTO user_role (USER_ID, ROLE_ID) VALUES (1006, 2);
INSERT INTO user_role (USER_ID, ROLE_ID) VALUES (1007, 2);
INSERT INTO user_role (USER_ID, ROLE_ID) VALUES (1008, 2);
INSERT INTO user_role (USER_ID, ROLE_ID) VALUES (1009, 2);

-- INSERT INTO USER_ROLE (USER_ID, ROLE_ID) VALUES (1, 2);

-- INSERT INTO ARTIST(ID, NAME, IMAGE) VALUES (1, 'Tarkan', 'http://localhost:9999/images/artists/shiba.jpg');
-- INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (2, 'Sıla', 'http:/localhost:9999/images/artists/sila.jpg');
-- INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (3, 'Kenan Doğulu', 'http://localhost:9999/images/artists/kenan_dogulu.jpg');
-- INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (4, 'Ezhel', 'http://localhost:9999/images/artists/ezhel.jpg');
-- INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (5, 'Mehmet Erdem', 'http://localhost:9999/images/artists/mehmet_erdem.jpg');
-- INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (6, 'Manga', 'http://localhost:9999/images/artists/manga.jpg');


INSERT INTO artist (ID, NAME, IMAGE) VALUES (1, 'Tarkan', 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTSMHYAbOJXRdxt2OiVt8bBp7dBuuCzZQbaCeO15k8lUEmfZCq_A');
INSERT INTO artist (ID, NAME, IMAGE) VALUES (2, 'Sıla', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO artist (ID, NAME, IMAGE) VALUES (3, 'Kenan Doğulu', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO artist (ID, NAME, IMAGE) VALUES (4, 'Ezhel', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO artist (ID, NAME, IMAGE) VALUES (5, 'Mehmet Erdem', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO artist (ID, NAME, IMAGE) VALUES (6, 'Manga', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO artist (ID, NAME, IMAGE) VALUES (7,'Ceza','http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO artist (ID, NAME, IMAGE) VALUES (8,'Athena','http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO artist (ID, NAME, IMAGE) VALUES (9,'mor ve ötesi','http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO artist (ID, NAME, IMAGE) VALUES (10,'Hey Douglas!','http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO artist (ID, NAME, IMAGE) VALUES (11,'Mabel Matiz','http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO artist (ID, NAME, IMAGE) VALUES (12,'Edis','http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO artist (ID, NAME, IMAGE) VALUES (13,'Murat Boz','http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO artist (ID, NAME, IMAGE) VALUES (14,'Teoman','http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO artist (ID, NAME, IMAGE) VALUES (15,'MFÖ','http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO artist (ID, NAME, IMAGE) VALUES (16, 'Serdar Ortaç', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO artist (ID, NAME, IMAGE) VALUES (17, 'Hande Yener', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO artist (ID, NAME, IMAGE) VALUES (18, 'Bengü', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO artist (ID, NAME, IMAGE) VALUES (19, 'Aleyna Tilki', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO artist (ID, NAME, IMAGE) VALUES (20, 'Murat Dalkılıç', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO artist (ID, NAME, IMAGE) VALUES (21, 'Yıldız Tilbe', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO artist (ID, NAME, IMAGE) VALUES (22, 'Hadise', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO artist (ID, NAME, IMAGE) VALUES (23, 'Ben Fero', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO artist (ID, NAME, IMAGE) VALUES (24, 'Duman', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO artist (ID, NAME, IMAGE) VALUES (25, 'Adamlar', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO artist (ID, NAME, IMAGE) VALUES (26, 'Büyük Ev Ablukada', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO artist (ID, NAME, IMAGE) VALUES (27, 'Yüzyüzeyken Konuşuruz', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO artist (ID, NAME, IMAGE) VALUES (28, 'Son Feci Bisiklet', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO artist (ID, NAME, IMAGE) VALUES (29, 'Gaye Su Akyol', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO artist (ID, NAME, IMAGE) VALUES (30, 'Demet Akalın', 'http://localhost:9999/images/artists/shiba.jpg');

UPDATE artist SET TWITTER='twitter.com/tarkan',INSTAGRAM='instagram.com/tarkan',SPOTIFY='https://open.spotify.com/artist/2yMN0IP20GOaN6q0p0zL5k?si=mCDbPUyOSNWiBG4HXGFm_g', FACEBOOK='facebook.com/tarkan' WHERE ID=1;


INSERT INTO venue (ID, NAME, ADDRESS, CITY, LATITUDE, LONGITUDE) VALUES (1, 'Harbiye Cemil Topuzlu Açık Hava Tiyatrosu', 'Nişantaşı, Harbiye Mahallesi, 34367 Şişli/İstanbul', 'istanbul', 41.046053, 28.990041 );
INSERT INTO venue (ID, NAME, ADDRESS, CITY, LATITUDE, LONGITUDE) VALUES (2, 'Küçükçiftlik Park', 'Harbiye Mahallesi, Kadırgalar Yokuşu No:4, 34367 Maçka/İstanbul', 'istanbul',  41.044681, 28.993117 );
INSERT INTO venue (ID, NAME, ADDRESS, CITY, LATITUDE, LONGITUDE) VALUES (3, 'Zorlu PSM - Turkcell Sahnesi', 'Levazım Mah., Koru Sok. No:2, 34340 Beşiktaş/İstanbul', 'istanbul', 41.066146, 29.017428 );
INSERT INTO venue (ID, NAME, ADDRESS, CITY, LATITUDE, LONGITUDE) VALUES (4, 'Babylon', 'Merkez, Silahşör Caddesi & Birahane Sokak Tarihi Bomonti Bira Fabrikası No:1, 34384 Şişli/İstanbul', 'istanbul', 41.058295, 28.979829);
INSERT INTO venue (ID, NAME, ADDRESS, CITY, LATITUDE, LONGITUDE) VALUES (5, 'Volkswagen Arena', 'Huzur, Maslak Ayazağa Cd. 4/A, 34396 Sarıyer/İstanbul', 'istanbul', 41.108725, 29.007590);
INSERT INTO venue (ID, NAME, ADDRESS, CITY, LATITUDE, LONGITUDE) VALUES (6, 'Life Park', 'Kazım Karabekir Paşa, Bahçeköy Cd. No:114, 34473 Sarıyer/İstanbul', 'istanbul', 41.167282, 29.000671);
INSERT INTO venue (ID, NAME, ADDRESS, CITY, LATITUDE, LONGITUDE) VALUES (7, 'IF Performance Hall Beşiktaş', 'Cihannüma, Hasfırın Cd. No:26, 34353 Beşiktaş/İstanbul', 'istanbul', 41.044063, 29.006439);
INSERT INTO venue (ID, NAME, ADDRESS, CITY, LATITUDE, LONGITUDE) VALUES (8, 'IF Performance Hall Ataşehir', 'Barbaros, Ataşehir Blv. No:216, 34746 Ataşehir/İstanbul', 'istanbul', 40.994201, 29.110373);
INSERT INTO venue (ID, NAME, ADDRESS, CITY, LATITUDE, LONGITUDE) VALUES (9, 'Dorock XL', 'Caferağa, Namlı Market Yanı, Mühürdar Cd. No:60, 34710 Kadıköy/İstanbul', 'istanbul', 40.989753, 29.022880);
INSERT INTO venue (ID, NAME, ADDRESS, CITY, LATITUDE, LONGITUDE) VALUES (10, 'Jolly Joker Vadistanbul', 'Ayazağa, Ayazağa Cendere Cd. 109/C, 34396 Sarıyer/İstanbul', 'istanbul', 41.107419, 28.987153);
INSERT INTO venue (ID, NAME, ADDRESS, CITY, LATITUDE, LONGITUDE) VALUES (11, 'Kadıköy Sahne', 'Osmanağa, Kırtasiyeci Sk. No:23, 34714 Kadıköy/İstanbul', 'istanbul', 40.990339, 29.027750);
INSERT INTO venue (ID, NAME, ADDRESS, CITY, LATITUDE, LONGITUDE) VALUES (12, 'Jolly Joker Beyoğlu', 'Hüseyinağa, Balo Sk. No:22, 34435 Beyoğlu/İstanbul', 'istanbul', 41.034952, 28.978550);
INSERT INTO venue (ID, NAME, ADDRESS, CITY, LATITUDE, LONGITUDE) VALUES (13, 'Zorlu PSM - %100 Studio', 'Levazım Mah., Koru Sok. No:2, 34340 Beşiktaş/İstanbul', 'istanbul', 41.066146, 29.017428);
INSERT INTO venue (ID, NAME, ADDRESS, CITY, LATITUDE, LONGITUDE) VALUES (14, '6:45 Kaybedenler Kulübü', 'Kavaklıdere, 174. Sokak, Tunus Cd., 06680 Çankaya/Ankara', 'ankara', 39.906272, 32.859013);
INSERT INTO venue (ID, NAME, ADDRESS, CITY, LATITUDE, LONGITUDE) VALUES (15, 'Congresium Ankara', 'Söğütözü, Söğütözü Cd. 1/A, 06530 Çankaya/Ankara', 'ankara', 39.911447, 32.802691);
INSERT INTO venue (ID, NAME, ADDRESS, CITY, LATITUDE, LONGITUDE) VALUES (16, 'IF Performance Hall Ankara', 'Kavaklıdere, Tunus Cd. 14/A, 06410 Çankaya/Ankara', 'ankara', 39.911659, 32.856092);
INSERT INTO venue (ID, NAME, ADDRESS, CITY, LATITUDE, LONGITUDE) VALUES (17, 'Jolly Joker Ankara', 'Kavaklıdere, Kızılırmak Cd. No:14, 06420 Çankaya/Ankara', 'ankara', 39.914630, 32.858185);
INSERT INTO venue (ID, NAME, ADDRESS, CITY, LATITUDE, LONGITUDE) VALUES (18, 'Section Park', 'Gaziosmanpaşa, Ankara Konya Yolu, 06830 Gölbaşı/Ankara', 'ankara', 39.748726, 32.803590);
INSERT INTO venue (ID, NAME, ADDRESS, CITY, LATITUDE, LONGITUDE) VALUES (19, 'Jolly Joker Alaçatı', 'Alaçatı, 35930 Çeşme/İzmir', 'izmir', 38.232276, 26.365754);
INSERT INTO venue (ID, NAME, ADDRESS, CITY, LATITUDE, LONGITUDE) VALUES (20, 'Suat Taşer Açık Hava Tiyatrosu', 'Bostanlı, Hasan Ali Yücel Blv., 35540 Karşıyaka/İzmir', 'izmir', 38.454399, 27.099707);
INSERT INTO venue (ID, NAME, ADDRESS, CITY, LATITUDE, LONGITUDE) VALUES (21, 'Musicorium Alaçatı Sahne', 'Alaçatı Mahallesi, 18001 Sokak No:3/1, 35930 Çeşme/İzmir', 'izmir', 38.230689, 26.367538);
INSERT INTO venue (ID, NAME, ADDRESS, CITY, LATITUDE, LONGITUDE) VALUES (22, 'Ooze Venue', 'Erzene, Erzene Mahallesi Kazım Karabekir Cad, Çınar Pasajı No:46, 35040 Bornova/İzmir', 'izmir', 38.464624, 27.221720);
INSERT INTO venue (ID, NAME, ADDRESS, CITY, LATITUDE, LONGITUDE) VALUES (23, 'Red Park', 'Kazımdirik, Kazımdirik mah. 372/33 sk Port, 35100 Bornova/İzmir', 'izmir', 38.449312, 27.214441);
INSERT INTO venue (ID, NAME, ADDRESS, CITY, LATITUDE, LONGITUDE) VALUES (24, 'Spiaggia Grande', 'Alaçatı, 35930 Çeşme/İzmir', 'izmir', 38.243313, 26.377280);
INSERT INTO venue (ID, NAME, ADDRESS, CITY, LATITUDE, LONGITUDE) VALUES (25, 'Çeşme Açık Hava Tiyatrosu', 'İsmet İnönü, 2051. Sk., 35930 Çeşme/İzmir', 'izmir', 38.322886, 26.308614);
INSERT INTO venue (ID, NAME, ADDRESS, CITY, LATITUDE, LONGITUDE) VALUES (26, 'İzmir Kültürpark Açık Hava Tiyatrosu', 'Mimar Sinan, 1395. Sk. No:1395, 35220 Konak/İzmir', 'izmir', 38.428679, 27.148239);
INSERT INTO venue (ID, NAME, ADDRESS, CITY, LATITUDE, LONGITUDE) VALUES (27, 'İzmir Arena', 'Turan, 1649. Sk. No: 107, 35540 Bayraklı/İzmir', 'izmir', 38.465594, 27.145240);
INSERT INTO venue (ID, NAME, ADDRESS, CITY, LATITUDE, LONGITUDE) VALUES (28, 'Gala Aya Yorgi', 'Sakarya, Sakarya Mah. 3143 Sok, Ayayorgi Yolu No:22/2, 35930 Çeşme/İzmir', 'izmir', 38.338138, 26.311772);



INSERT INTO event (ID, NAME, START_DATE, TIME, VENUE_ID, IMAGE) VALUES (1, 'Tarkan', '2020-01-12', '20:00' , 1, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTSMHYAbOJXRdxt2OiVt8bBp7dBuuCzZQbaCeO15k8lUEmfZCq_A');
INSERT INTO event (ID, NAME, START_DATE, TIME, VENUE_ID, IMAGE) VALUES (2, 'Sıla', '2020-01-12', '19:30' , 1, 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO event (ID, NAME, START_DATE, TIME, VENUE_ID, IMAGE) VALUES (3, 'Ceza', '2020-01-20', '20:30', 3, 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO event (ID, NAME, START_DATE, TIME, VENUE_ID, IMAGE) VALUES (4, 'Athena', '2020-01-01', '21:00', 3, 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO event (ID, NAME, START_DATE, TIME, VENUE_ID, IMAGE) VALUES (5, 'Teoman', '2020-01-07', '21:00', 3, 'http://localhost:9999/images/artists/shiba.jpg' );
INSERT INTO event (ID, NAME, START_DATE, TIME, VENUE_ID, IMAGE) VALUES (6, 'Summerfest', '2020-01-25', '15:00', 2, 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO event (ID, NAME, START_DATE, TIME, VENUE_ID, IMAGE) VALUES (7, 'Tarkan', '2020-01-18', '20:30', 2, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTSMHYAbOJXRdxt2OiVt8bBp7dBuuCzZQbaCeO15k8lUEmfZCq_A');
INSERT INTO event (ID, NAME, START_DATE, TIME, VENUE_ID, IMAGE) VALUES (8, 'Teoman', '2020-01-26', '20:30', 1, 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO event (ID, NAME, START_DATE, TIME, VENUE_ID, IMAGE) VALUES (9, 'Kenan Doğulu', '2020-01-10', '20:00', 1, 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO event (ID, NAME, START_DATE, TIME, VENUE_ID, IMAGE) VALUES (10, 'Tarkan', '2020-01-29', '20:00', 3, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTSMHYAbOJXRdxt2OiVt8bBp7dBuuCzZQbaCeO15k8lUEmfZCq_A');
INSERT INTO event (ID, NAME, START_DATE, TIME, VENUE_ID, IMAGE) VALUES (11, 'Tarkan', '2020-02-28', '20:00', 3, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTSMHYAbOJXRdxt2OiVt8bBp7dBuuCzZQbaCeO15k8lUEmfZCq_A');
INSERT INTO event (ID, NAME, START_DATE, TIME, VENUE_ID, IMAGE) VALUES (12, 'Tarkan', '2020-01-29', '20:00', 2, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTSMHYAbOJXRdxt2OiVt8bBp7dBuuCzZQbaCeO15k8lUEmfZCq_A');
INSERT INTO event (ID, NAME, START_DATE, TIME, VENUE_ID, IMAGE) VALUES (13, 'Tarkan', '2020-02-15', '20:00', 2, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTSMHYAbOJXRdxt2OiVt8bBp7dBuuCzZQbaCeO15k8lUEmfZCq_A');
INSERT INTO event (ID, NAME, START_DATE, TIME, VENUE_ID, IMAGE) VALUES (14, 'Tarkan', '2020-02-10', '20:00', 1, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTSMHYAbOJXRdxt2OiVt8bBp7dBuuCzZQbaCeO15k8lUEmfZCq_A');
INSERT INTO event (ID, NAME, START_DATE, TIME, VENUE_ID, IMAGE) VALUES (15, 'Tarkan', '2020-01-21', '20:00', 3, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTSMHYAbOJXRdxt2OiVt8bBp7dBuuCzZQbaCeO15k8lUEmfZCq_A');
INSERT INTO event (ID, NAME, START_DATE, TIME, VENUE_ID, IMAGE) VALUES (16, 'Tarkan', '2020-03-30', '20:00', 2, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTSMHYAbOJXRdxt2OiVt8bBp7dBuuCzZQbaCeO15k8lUEmfZCq_A');
INSERT INTO event (ID, NAME, START_DATE, TIME, VENUE_ID, IMAGE) VALUES (17, 'Tarkan', '2020-03-10', '19:00', 25, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTSMHYAbOJXRdxt2OiVt8bBp7dBuuCzZQbaCeO15k8lUEmfZCq_A');
INSERT INTO event (ID, NAME, START_DATE, TIME, VENUE_ID, IMAGE) VALUES (18, 'Tarkan', '2020-03-25', '20:00', 19, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTSMHYAbOJXRdxt2OiVt8bBp7dBuuCzZQbaCeO15k8lUEmfZCq_A');
INSERT INTO event (ID, NAME, START_DATE, TIME, VENUE_ID, IMAGE) VALUES (19, 'Tarkan', '2020-03-10', '20:00', 15, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTSMHYAbOJXRdxt2OiVt8bBp7dBuuCzZQbaCeO15k8lUEmfZCq_A');
INSERT INTO event (ID, NAME, START_DATE, TIME, VENUE_ID, IMAGE) VALUES (20, 'Tarkan', '2020-01-30', '20:00', 14, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTSMHYAbOJXRdxt2OiVt8bBp7dBuuCzZQbaCeO15k8lUEmfZCq_A');
INSERT INTO event (ID, NAME, START_DATE, TIME, VENUE_ID, IMAGE) VALUES (21, 'Tarkan', '2020-02-01', '20:00', 27, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTSMHYAbOJXRdxt2OiVt8bBp7dBuuCzZQbaCeO15k8lUEmfZCq_A');
INSERT INTO event (ID, NAME, START_DATE, TIME, VENUE_ID, IMAGE) VALUES (22, 'Tarkan', '2020-02-05', '20:00', 20, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTSMHYAbOJXRdxt2OiVt8bBp7dBuuCzZQbaCeO15k8lUEmfZCq_A');
INSERT INTO event (ID, NAME, START_DATE, TIME, VENUE_ID, IMAGE) VALUES (23, 'Tarkan', '2020-03-15', '20:00', 21, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTSMHYAbOJXRdxt2OiVt8bBp7dBuuCzZQbaCeO15k8lUEmfZCq_A');
INSERT INTO event (ID, NAME, START_DATE, TIME, VENUE_ID, IMAGE) VALUES (24, 'Tarkan', '2020-03-24', '20:00', 22, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTSMHYAbOJXRdxt2OiVt8bBp7dBuuCzZQbaCeO15k8lUEmfZCq_A');
INSERT INTO event (ID, NAME, START_DATE, TIME, VENUE_ID, IMAGE) VALUES (25, 'Tarkan', '2020-03-25', '20:00', 23, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTSMHYAbOJXRdxt2OiVt8bBp7dBuuCzZQbaCeO15k8lUEmfZCq_A');
INSERT INTO event (ID, NAME, START_DATE, TIME, VENUE_ID, IMAGE) VALUES (26, 'Tarkan', '2020-03-03', '20:00', 24, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTSMHYAbOJXRdxt2OiVt8bBp7dBuuCzZQbaCeO15k8lUEmfZCq_A');
INSERT INTO event (ID, NAME, START_DATE, TIME, VENUE_ID, IMAGE) VALUES (27, 'Tarkan', '2020-03-02', '20:00', 26, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTSMHYAbOJXRdxt2OiVt8bBp7dBuuCzZQbaCeO15k8lUEmfZCq_A');
INSERT INTO event (ID, NAME, START_DATE, TIME, VENUE_ID, IMAGE) VALUES (28, 'Tarkan', '2020-03-31', '20:00', 27, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTSMHYAbOJXRdxt2OiVt8bBp7dBuuCzZQbaCeO15k8lUEmfZCq_A');
INSERT INTO event (ID, NAME, START_DATE, TIME, VENUE_ID, IMAGE) VALUES (29, 'Tarkan', '2020-03-29', '20:00', 28, 'https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTTSMHYAbOJXRdxt2OiVt8bBp7dBuuCzZQbaCeO15k8lUEmfZCq_A');
INSERT INTO event (ID, NAME, START_DATE, TIME, VENUE_ID, IMAGE) VALUES (30, 'Ceza', '2020-01-04', '22:00', 24, 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO event (ID, NAME, START_DATE, TIME, VENUE_ID, IMAGE) VALUES (31, 'Ceza', '2020-01-25', '21:00', 19, 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO event (ID, NAME, START_DATE, TIME, VENUE_ID, IMAGE) VALUES (32, 'Ezhel', '2020-01-15', '21:30', 14, 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO event (ID, NAME, START_DATE, TIME, VENUE_ID, IMAGE) VALUES (33, 'mor ve ötesi', '2020-01-18', '20:00', 27, 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO event (ID, NAME, START_DATE, TIME, VENUE_ID, IMAGE) VALUES (34, 'mor ve ötesi',  '2020-01-28','20:00', 3, 'http://localhost:9999/images/artists/shiba.jpg');



INSERT INTO genre(ID, NAME) VALUES (1, 'Pop');
INSERT INTO genre(ID, NAME) VALUES (2, 'Electronic');
INSERT INTO genre(ID, NAME) VALUES (3, 'Rock');
INSERT INTO genre(ID, NAME) VALUES (4, 'Metal');
INSERT INTO genre(ID, NAME) VALUES (5, 'Jazz');
INSERT INTO genre(ID, NAME) VALUES (6, 'Rap');


INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (1, 1);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (2, 1);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (3, 6);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (4, 1);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (4, 3);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (5, 1);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (5, 3);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (6, 1);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (6, 2);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (6, 3);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (6, 6);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (7, 1);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (8, 1);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (8, 3);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (9, 1);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (10, 1);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (11, 1);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (12, 1);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (13, 1);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (14, 1);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (15, 1);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (16, 1);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (17, 1);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (18, 1);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (19, 1);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (20, 1);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (21, 1);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (22, 1);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (23, 1);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (24, 1);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (25, 1);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (26, 1);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (27, 1);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (28, 1);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (29, 1);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (30, 6);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (31, 6);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (32, 6);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (33, 3);
INSERT INTO event_genre (EVENT_ID, GENRE_ID) VALUES (34, 3);



INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (1, 1);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (2, 2);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (7, 3);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (8, 4);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (14, 5);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (7, 6);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (14, 6);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (4, 6);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (6, 6);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (10, 6);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (15, 6);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (9, 6);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (1, 7);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (14, 8);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (3, 9);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (1, 10);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (1, 11);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (1, 12);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (1, 13);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (1, 14);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (1, 15);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (1, 16);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (1, 6);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (1, 17);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (1, 18);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (1, 19);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (1, 20);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (1, 21);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (1, 22);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (1, 23);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (1, 24);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (1, 25);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (1, 26);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (1, 27);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (1, 28);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (1, 29);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (7, 30);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (7, 31);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (4, 32);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (9, 33);
INSERT INTO event_artist (ARTIST_ID, EVENT_ID) VALUES (9, 34);


INSERT INTO user_saved_events(USER_ID, EVENT_ID) VALUES (1001, 1);
INSERT INTO user_saved_events(USER_ID, EVENT_ID) VALUES (1002, 1);
INSERT INTO user_saved_events(USER_ID, EVENT_ID) VALUES (1003, 1);
INSERT INTO user_saved_events(USER_ID, EVENT_ID) VALUES (1004, 1);
INSERT INTO user_saved_events(USER_ID, EVENT_ID) VALUES (1001, 2);
INSERT INTO user_saved_events(USER_ID, EVENT_ID) VALUES (1001, 3);
INSERT INTO user_saved_events(USER_ID, EVENT_ID) VALUES (1001, 5);
INSERT INTO user_saved_events(USER_ID, EVENT_ID) VALUES (1001, 6);
INSERT INTO user_saved_events(USER_ID, EVENT_ID) VALUES (1001, 10);
INSERT INTO user_saved_events(USER_ID, EVENT_ID) VALUES (1001, 11);
INSERT INTO user_saved_events(USER_ID, EVENT_ID) VALUES (1001, 12);
INSERT INTO user_saved_events(USER_ID, EVENT_ID) VALUES (1001, 20);
INSERT INTO user_saved_events(USER_ID, EVENT_ID) VALUES (1001, 19);
INSERT INTO user_saved_events(USER_ID, EVENT_ID) VALUES (1001, 7);
INSERT INTO user_saved_events(USER_ID, EVENT_ID) VALUES (1001, 21);
INSERT INTO user_saved_events(USER_ID, EVENT_ID) VALUES (1001, 30);
INSERT INTO user_saved_events(USER_ID, EVENT_ID) VALUES (1001, 31);
INSERT INTO user_saved_events(USER_ID, EVENT_ID) VALUES (1001, 4);
INSERT INTO user_saved_events(USER_ID, EVENT_ID) VALUES (1001, 9);
INSERT INTO user_saved_events(USER_ID, EVENT_ID) VALUES (1001, 13);


INSERT INTO user_attending_events(USER_ID, EVENT_ID) VALUES (1001, 1);
INSERT INTO user_attending_events(USER_ID, EVENT_ID) VALUES (1002, 1);
INSERT INTO user_attending_events(USER_ID, EVENT_ID) VALUES (1003, 1);
INSERT INTO user_attending_events(USER_ID, EVENT_ID) VALUES (1004, 1);
INSERT INTO user_attending_events(USER_ID, EVENT_ID) VALUES (1001, 2);
INSERT INTO user_attending_events(USER_ID, EVENT_ID) VALUES (1001, 3);
INSERT INTO user_attending_events(USER_ID, EVENT_ID) VALUES (1001, 4);
INSERT INTO user_attending_events(USER_ID, EVENT_ID) VALUES (1001, 5);
INSERT INTO user_attending_events(USER_ID, EVENT_ID) VALUES (1001, 6);
INSERT INTO user_attending_events(USER_ID, EVENT_ID) VALUES (1001, 7);
INSERT INTO user_attending_events(USER_ID, EVENT_ID) VALUES (1001, 8);
INSERT INTO user_attending_events(USER_ID, EVENT_ID) VALUES (1001, 9);
INSERT INTO user_attending_events(USER_ID, EVENT_ID) VALUES (1001, 10);
INSERT INTO user_attending_events(USER_ID, EVENT_ID) VALUES (1001, 11);
INSERT INTO user_attending_events(USER_ID, EVENT_ID) VALUES (1001, 12);
INSERT INTO user_attending_events(USER_ID, EVENT_ID) VALUES (1001, 13);
INSERT INTO user_attending_events(USER_ID, EVENT_ID) VALUES (1001, 14);


INSERT INTO user_liked_artists(USER_ID, ARTIST_ID) VALUES (1001, 1);
INSERT INTO user_liked_artists(USER_ID, ARTIST_ID) VALUES (1001, 2);
INSERT INTO user_liked_artists(USER_ID, ARTIST_ID) VALUES (1001, 3);
INSERT INTO user_liked_artists(USER_ID, ARTIST_ID) VALUES (1001, 4);
INSERT INTO user_liked_artists(USER_ID, ARTIST_ID) VALUES (1001, 5);
INSERT INTO user_liked_artists(USER_ID, ARTIST_ID) VALUES (1001, 6);
INSERT INTO user_liked_artists(USER_ID, ARTIST_ID) VALUES (1001, 7);
INSERT INTO user_liked_artists(USER_ID, ARTIST_ID) VALUES (1001, 8);
INSERT INTO user_liked_artists(USER_ID, ARTIST_ID) VALUES (1001, 9);
INSERT INTO user_liked_artists(USER_ID, ARTIST_ID) VALUES (1001, 10);

INSERT INTO user_liked_genres(USER_ID, GENRE_ID) VALUES (1001, 1);
INSERT INTO user_liked_genres(USER_ID, GENRE_ID) VALUES (1001, 2);
INSERT INTO user_liked_genres(USER_ID, GENRE_ID) VALUES (1001, 6);





