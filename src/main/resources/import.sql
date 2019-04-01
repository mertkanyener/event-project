-- INSERT INTO USER_ (ID, EMAIL, USERNAME, PASSWORD) VALUES (1, 'admin@email.com', 'admin', 'admin1');
-- INSERT INTO ROLE (ROLE_ID, ROLE) VALUES (1, 'ADMIN');
-- INSERT INTO ROLE (ROLE_ID, ROLE) VALUES (2, 'USER');
-- INSERT INTO USER_ROLE (USER_ID, ROLE_ID) VALUES (1, 1);
-- INSERT INTO USER_ROLE (USER_ID, ROLE_ID) VALUES (1, 2);

INSERT INTO ARTIST(ID, NAME, IMAGE) VALUES (1, 'Tarkan', 'http://localhost:9999/images/artists/tarkan.jpg');
INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (2, 'Sıla', 'http://localhost:9999/images/artists/sila.jpg');
INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (3, 'Kenan Doğulu', 'http://localhost:9999/images/artists/kenan_dogulu.jpg');
INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (4, 'Ezhel', 'http://localhost:9999/images/artists/ezhel.jpg');
INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (5, 'Mehmet Erdem', 'http://localhost:9999/images/artists/mehmet_erdem.jpg');
INSERT INTO ARTIST (ID, NAME, IMAGE) VALUES (6, 'Manga', 'http://localhost:9999/images/artists/manga.jpg');
INSERT INTO VENUE (ID, NAME, ADDRESS, LATITUDE, LONGITUDE) VALUES (1, 'Harbiye Cemil Topuzlu Açık Hava Tiyatrosu', 'Nişantaşı, Harbiye Mahallesi, 34367 Şişli/İstanbul', 41.046053, 28.990041 );
INSERT INTO EVENT (ID, NAME, DATE, TIME, VENUE_ID) VALUES (1, 'Tarkan', '2019-08-12', '20:00' , 1);
INSERT INTO EVENT (ID, NAME, DATE, TIME, VENUE_ID) VALUES (2, 'Sıla', '2019-08-12', '19:30' , 1);
INSERT INTO EVENT_ARTIST (ARTIST_ID, EVENT_ID) VALUES (1, 1);
INSERT INTO EVENT_ARTIST (ARTIST_ID, EVENT_ID) VALUES (2, 2);



