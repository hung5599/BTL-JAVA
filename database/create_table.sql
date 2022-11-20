CREATE DATABASE projectJava
GO

USE projectJava
GO

CREATE TABLE role(
	id bigint not null identity(1, 1) primary key,
	name varchar(150) not null,
	code varchar(150) not null
)
GO

CREATE TABLE users
(
	id BIGINT IDENTITY (1,1) NOT NULL,
	username VARCHAR(50) NOT NULL,
	password VARCHAR(50) NOT NULL,
	address NVARCHAR(100) NULL,
	phonenumber VARCHAR(15) NULL,
	roleid BIGINT NULL,
	gender BIT NOT NULL,
	dob DATE NULL,
	status int not null

	PRIMARY KEY(Id)
)
GO

ALTER TABLE users ADD CONSTRAINT fk_users_role FOREIGN KEY(roleid) REFERENCES role(id)
GO

CREATE TABLE san
(
	id BIGINT IDENTITY (1,1) NOT NULL,
	categoryid BIGINT NOT NULL,
	name VARCHAR(150) NOT NULL,
	dateopen DATE NULL,
	price FLOAT NOT NULL,
	status BIT NOT NULL,
    time DATETIME NULL

	PRIMARY KEY(id)
)
GO


CREATE TABLE match
(
	id BIGINT IDENTITY (1,1) NOT NULL,
	id_san BIGINT NULL,
	id_user bigint null,
	time_start char(20) NULL,
	time_end char(20) NULL,
	status BIT NOT NULL,
	date_open DATE NULL

	PRIMARY KEY(id)
	foreign key(id_user) references users(id),
	FOREIGN KEY(id_sân) REFERENCES dbo.san(id)
)
GO


CREATE TABLE bill
(
	id BIGINT IDENTITY (1,1) NOT NULL,
	id_match BIGINT UNIQUE NOT NULL,
	date DATE NOT NULL,
	total FLOAT NOT NULL,
	type nvarchar(255) null,
	username varchar(255) null

	PRIMARY KEY(Id)
)
GO

ALTER TABLE bill ADD FOREIGN KEY(id_match) REFERENCES match(Id)

