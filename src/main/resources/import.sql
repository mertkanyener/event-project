INSERT INTO USER_ (ID, EMAIL, USERNAME, PASSWORD) VALUES (1, 'admin@email.com', 'admin', 'admin1');
INSERT INTO ROLE (ROLE_ID, ROLE) VALUES (1, 'ADMIN');
INSERT INTO ROLE (ROLE_ID, ROLE) VALUES (2, 'USER');
INSERT INTO USER_ROLE (USER_ID, ROLE_ID) VALUES (1, 1);
INSERT INTO USER_ROLE (USER_ID, ROLE_ID) VALUES (1, 2);

INSERT INTO ARTIST(ID, NAME) VALUES (1, 'Tarkan');
INSERT INTO ARTIST (ID, NAME) VALUES (2, 'Sila');
INSERT INTO VENUE (ID, NAME, ADDRESS) VALUES (1, 'Harbiye', 'some address');
INSERT INTO EVENT (ID, NAME, DATE, VENUE_ID, ARTIST_ID) VALUES (1, 'Concert', '2018-12-12', 1, 1);
INSERT INTO EVENT (ID, NAME, DATE, VENUE_ID, ARTIST_ID) VALUES (2, 'Concert', '2018-12-10', 1, 2);
