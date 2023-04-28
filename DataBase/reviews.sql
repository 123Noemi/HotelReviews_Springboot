--
-- File generated with SQLiteStudio v3.2.1 on ju. abr. 27 18:49:11 2023
--
-- Text encoding used: System
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table: REVIEWS
CREATE TABLE REVIEWS (ID_REVIEW STRING (20) PRIMARY KEY NOT NULL UNIQUE, RATING INTEGER, COMMENT STRING (4000), ID_HOTEL STRING (20) NOT NULL);
INSERT INTO REVIEWS (ID_REVIEW, RATING, COMMENT, ID_HOTEL) VALUES (1, 4, 'NICE HOTEL', 1);
INSERT INTO REVIEWS (ID_REVIEW, RATING, COMMENT, ID_HOTEL) VALUES (2, 5, 'EXCELLENT', 2);
INSERT INTO REVIEWS (ID_REVIEW, RATING, COMMENT, ID_HOTEL) VALUES (3, 3, 'OK', 1);
INSERT INTO REVIEWS (ID_REVIEW, RATING, COMMENT, ID_HOTEL) VALUES (4, 1, 'BAD HOTEL', 3);

COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
