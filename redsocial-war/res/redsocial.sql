DROP SCHEMA IF EXISTS REDSOCIAL;
CREATE schema REDSOCIAL;
USE REDSOCIAL;

CREATE TABLE VISIBILITY(
	id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	typeVis varchar(20)
);

CREATE TABLE USER (
	id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	nameUser varchar(100),
	email varchar(100) NOT NULL,
	pass varchar(20) NOT NULL,
	alias varchar(50) NOT NULL,
	dateIn datetime NOT NULL
);

CREATE TABLE GROUPP(
	id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	ownerGroup int NOT NULL,
	nameGroup varchar(100) NOT NULL,
	descript varchar(250),
	visibility int NOT NULL,
	dateCreation datetime NOT NULL,
	FOREIGN KEY (ownerGroup) REFERENCES USER(id),
	FOREIGN KEY (visibility) REFERENCES VISIBILITY(id)
);

CREATE TABLE POST(
	id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	creator int NOT NULL,
	textPost varchar(300),
	datePost datetime NOT NULL,
	visibility int NOT NULL,
	FOREIGN KEY (creator) REFERENCES USER(id),
	FOREIGN KEY (visibility) REFERENCES VISIBILITY(id)
);

CREATE TABLE MESSAGE(
	id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	sender int NOT NULL,
	receiver int NOT NULL,
	dateSend datetime NOT NULL,
	textMessage varchar(300),
	isRead boolean DEFAULT false,
	FOREIGN KEY (sender) REFERENCES USER(id),
	FOREIGN KEY (receiver) REFERENCES USER(id)
);

CREATE TABLE FRIEND(
	id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	sender int NOT NULL,
	receiver int NOT NULL,
	dateFriendship datetime NOT NULL,
	FOREIGN KEY (sender) REFERENCES USER(id),
	FOREIGN KEY (receiver) REFERENCES USER(id)
);

CREATE TABLE REQUEST_FRIEND(
	id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	sender int NOT NULL,
	receiver int NOT NULL,
	dateSend datetime NOT NULL,
	FOREIGN KEY (sender) REFERENCES USER(id),
	FOREIGN KEY (receiver) REFERENCES USER(id)
);

CREATE TABLE REQUEST_GROUP(
	id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	sender int NOT NULL,
	receiver int NOT NULL,
	dateSend datetime NOT NULL,
	idGroup int NOT NULL,
	FOREIGN KEY (sender) REFERENCES USER(id),
	FOREIGN KEY (receiver) REFERENCES USER(id),
	FOREIGN KEY (idGroup) REFERENCES GROUPP(id)
);

CREATE TABLE USER_GROUP(
	id int NOT NULL AUTO_INCREMENT PRIMARY KEY,
	idGroup int NOT NULL,
	idUser int NOT NULL,
	dateJoin datetime NOT NULL,
	FOREIGN KEY (idUser) REFERENCES USER(id),
	FOREIGN KEY (idGroup) REFERENCES GROUPP(id)
);

