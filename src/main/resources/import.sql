-- INSERT INTO USER_ (ID, EMAIL, USERNAME, PASSWORD) VALUES (1, 'admin@email.com', 'admin', 'admin1');
-- INSERT INTO ROLE (ROLE_ID, ROLE) VALUES (1, 'ADMIN');
-- INSERT INTO ROLE (ROLE_ID, ROLE) VALUES (2, 'USER');
-- INSERT INTO USER_ROLE (USER_ID, ROLE_ID) VALUES (1, 1);
-- INSERT INTO USER_ROLE (USER_ID, ROLE_ID) VALUES (1, 2);

-- INSERT INTO ARTIST(ID, NAME, IMAGE) VALUES (1, 'Tarkan', 'http://localhost:9999/images/artists/shiba.jpg');
-- INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (2, 'Sıla', 'http://localhost:9999/images/artists/sila.jpg');
-- INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (3, 'Kenan Doğulu', 'http://localhost:9999/images/artists/kenan_dogulu.jpg');
-- INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (4, 'Ezhel', 'http://localhost:9999/images/artists/ezhel.jpg');
-- INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (5, 'Mehmet Erdem', 'http://localhost:9999/images/artists/mehmet_erdem.jpg');
-- INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (6, 'Manga', 'http://localhost:9999/images/artists/manga.jpg');


INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (1, 'Tarkan', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (2, 'Sıla', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (3, 'Kenan Doğulu', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (4, 'Ezhel', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (5, 'Mehmet Erdem', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (6, 'Manga', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (7,'Ceza','http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (8,'Athena','http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (9,'mor ve ötesi','http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (10,'Hey Douglas!','http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (11,'Mabel Matiz','http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (12,'Edis','http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (13,'Murat Boz','http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (14,'Teoman','http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (15,'MFÖ','http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (16, 'Serdar Ortaç', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (17, 'Hande Yener', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (18, 'Bengü', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (19, 'Aleyna Tilki', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (20, 'Murat Dalkılıç', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (21, 'Yıldız Tilbe', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (22, 'Hadise', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (23, 'Ben Fero', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (24, 'Duman', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (25, 'Adamlar', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (26, 'Büyük Ev Ablukada', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (27, 'Yüzyüzeyken Konuşuruz', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (28, 'Son Feci Bisiklet', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (29, 'Gaye Su Akyol', 'http://localhost:9999/images/artists/shiba.jpg');
INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (30, 'Demet Akalın', 'http://localhost:9999/images/artists/shiba.jpg');



INSERT INTO VENUE (ID, NAME, ADDRESS, LATITUDE, LONGITUDE) VALUES (1, 'Harbiye Cemil Topuzlu Açık Hava Tiyatrosu', 'Nişantaşı, Harbiye Mahallesi, 34367 Şişli/İstanbul', 41.046053, 28.990041 );
INSERT INTO VENUE (ID, NAME, ADDRESS, LATITUDE, LONGITUDE) VALUES (2, 'Küçükçiftlik Park', 'Harbiye Mahallesi, Kadırgalar Yokuşu No:4, 34367 Maçka/İstanbul', 41.044681, 28.993117 );
INSERT INTO VENUE (ID, NAME, ADDRESS, LATITUDE, LONGITUDE) VALUES (3, 'Zorlu PSM', 'Levazım Mah., Koru Sok. No:2, 34340 Beşiktaş/İstanbul', 41.066146, 29.017428 );
INSERT INTO EVENT (ID, NAME, DATE, TIME, VENUE_ID) VALUES (1, 'Tarkan', '2019-08-12', '20:00' , 1);
INSERT INTO EVENT (ID, NAME, DATE, TIME, VENUE_ID) VALUES (2, 'Sıla', '2019-08-12', '19:30' , 1);
INSERT INTO EVENT (ID, NAME, DATE, TIME, VENUE_ID) VALUES (3, 'Ceza', '2019-08-20', '20:30', 3);
INSERT INTO EVENT (ID, NAME, DATE, TIME, VENUE_ID) VALUES (4, 'Athena', '2019-08-01', '21:00', 3);
INSERT INTO EVENT (ID, NAME, DATE, TIME, VENUE_ID) VALUES (5, 'Teoman', '2019-08-07', '21:00', 3 );
INSERT INTO EVENT (ID, NAME, DATE, TIME, VENUE_ID) VALUES (6, 'Summerfest', '2019-07-25', '15:00', 2);
INSERT INTO EVENT (ID, NAME, DATE, TIME, VENUE_ID) VALUES (7, 'Tarkan', '2019-07-18', '20:30', 2);
INSERT INTO EVENT (ID, NAME, DATE, TIME, VENUE_ID) VALUES (8, 'Teoman', '2019-07-26', '20:30', 1);
INSERT INTO EVENT (ID, NAME, DATE, TIME, VENUE_ID) VALUES (9, 'Kenan Doğulu', '2019-07-10', '20:00', 1);
INSERT INTO EVENT (ID, NAME, DATE, TIME, VENUE_ID) VALUES (10, 'Tarkan', '2019-06-29', '20:00', 3);
INSERT INTO EVENT (ID, NAME, DATE, TIME, VENUE_ID) VALUES (11, 'Tarkan', '2019-07-29', '20:00', 3);
INSERT INTO EVENT (ID, NAME, DATE, TIME, VENUE_ID) VALUES (12, 'Tarkan', '2019-08-29', '20:00', 2);
INSERT INTO EVENT (ID, NAME, DATE, TIME, VENUE_ID) VALUES (13, 'Tarkan', '2019-08-15', '20:00', 2);
INSERT INTO EVENT (ID, NAME, DATE, TIME, VENUE_ID) VALUES (14, 'Tarkan', '2019-07-10', '20:00', 1);
INSERT INTO EVENT (ID, NAME, DATE, TIME, VENUE_ID) VALUES (15, 'Tarkan', '2019-07-21', '20:00', 3);
INSERT INTO EVENT (ID, NAME, DATE, TIME, VENUE_ID) VALUES (16, 'Tarkan', '2019-06-30', '20:00', 2);


INSERT INTO EVENT_ARTIST (ARTIST_ID, EVENT_ID) VALUES (1, 1);
INSERT INTO EVENT_ARTIST (ARTIST_ID, EVENT_ID) VALUES (2, 2);
INSERT INTO EVENT_ARTIST (ARTIST_ID, EVENT_ID) VALUES (7, 3);
INSERT INTO EVENT_ARTIST (ARTIST_ID, EVENT_ID) VALUES (8, 4);
INSERT INTO EVENT_ARTIST (ARTIST_ID, EVENT_ID) VALUES (14, 5);
INSERT INTO EVENT_ARTIST (ARTIST_ID, EVENT_ID) VALUES (7, 6);
INSERT INTO EVENT_ARTIST (ARTIST_ID, EVENT_ID) VALUES (14, 6);
INSERT INTO EVENT_ARTIST (ARTIST_ID, EVENT_ID) VALUES (4, 6);
INSERT INTO EVENT_ARTIST (ARTIST_ID, EVENT_ID) VALUES (6, 6);
INSERT INTO EVENT_ARTIST (ARTIST_ID, EVENT_ID) VALUES (10, 6);
INSERT INTO EVENT_ARTIST (ARTIST_ID, EVENT_ID) VALUES (15, 6);
INSERT INTO EVENT_ARTIST (ARTIST_ID, EVENT_ID) VALUES (9, 6);
INSERT INTO EVENT_ARTIST (ARTIST_ID, EVENT_ID) VALUES (1, 7);
INSERT INTO EVENT_ARTIST (ARTIST_ID, EVENT_ID) VALUES (14, 8);
INSERT INTO EVENT_ARTIST (ARTIST_ID, EVENT_ID) VALUES (3, 9);
INSERT INTO EVENT_ARTIST (ARTIST_ID, EVENT_ID) VALUES (1, 10);
INSERT INTO EVENT_ARTIST (ARTIST_ID, EVENT_ID) VALUES (1, 11);
INSERT INTO EVENT_ARTIST (ARTIST_ID, EVENT_ID) VALUES (1, 12);
INSERT INTO EVENT_ARTIST (ARTIST_ID, EVENT_ID) VALUES (1, 13);
INSERT INTO EVENT_ARTIST (ARTIST_ID, EVENT_ID) VALUES (1, 14);
INSERT INTO EVENT_ARTIST (ARTIST_ID, EVENT_ID) VALUES (1, 15);
INSERT INTO EVENT_ARTIST (ARTIST_ID, EVENT_ID) VALUES (1, 16);
INSERT INTO EVENT_ARTIST (ARTIST_ID, EVENT_ID) VALUES (1, 6);


