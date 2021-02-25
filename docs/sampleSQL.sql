CREATE DATABASE DBMSC;

USE DBMSC;

CREATE TABLE ALBUMS(
    CATALOGNUMBER varchar(20) PRIMARY KEY,
    TITLE varchar(100),
    ARTIST varchar(100),
    GENRE varchar(15),
    YEAR int(4),
    FORMAT varchar(20),
    PRICE int(10)
);

INSERT INTO ALBUMS VALUES ('1A 062-97176','A Night At The Opera','Queen','Rock', 1973, 'Vinyl', 18);
INSERT INTO ALBUMS VALUES ('LP 55 5897','Vol 4','Black Sabbath','Metal', 1975, 'Vinyl', 25);
INSERT INTO ALBUMS VALUES ('BMC 76','Chronicle (The 20 Greatest Hits)','Creedence Clearwater Revival','Blues', 1976, 'Cassette', 5);
INSERT INTO ALBUMS VALUES ('7243 8 32700 2 6','Pulse','Pink Floyd','Rock', 1995, 'CD', 10);


Chronicle (The 20 Greatest Hits) 

CREATE TABLE ARTISTS{
    ID int PRIMARY KEY,
    NAME varchar(100),
    COUNTRY varchar(50)
};
