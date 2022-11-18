CREATE DATABASE VD_2
GO

USE VD_2
GO

CREATE TABLE role(
	id bigint not null identity(1, 1) primary key,
	name varchar(150) not null,
	code varchar(150) not null
)
GO

CREATE TABLE Users_1
(
	Id BIGINT IDENTITY (1,1) NOT NULL,
	UserName VARCHAR(50) NOT NULL,
	PassWord VARCHAR(50) NOT NULL,
	Address NVARCHAR(100) NULL,
	PhoneNum VARCHAR(15) NULL,
	RoleId BIGINT NULL,
	Gender BIT NOT NULL,
	DOB DATE NULL,
	status int not null

	PRIMARY KEY(Id)
)
GO

ALTER TABLE Users_1 ADD CONSTRAINT fk_Users_role FOREIGN KEY(RoleId) REFERENCES role(id)
GO

CREATE TABLE category
(
	id BIGINT NOT NULL PRIMARY KEY IDENTITY(1, 1),
	Name NVARCHAR(255) NOT NULL,
	SoLuong INT NULL,
	code varchar(255) not null
)
GO

CREATE TABLE Sân1
(
	Id BIGINT IDENTITY (1,1) NOT NULL,
	categoryid BIGINT NOT NULL,
	name VARCHAR(150) NOT NULL,
	Date_Open DATE NULL,
	Price FLOAT NOT NULL,
	Status BIT NOT NULL,
    Time DATETIME NULL

	PRIMARY KEY(Id)

	FOREIGN KEY(categoryid) REFERENCES dbo.category(id)
)
GO


CREATE TABLE match_1
(
	Id BIGINT IDENTITY (1,1) NOT NULL,
	Id_Sân BIGINT NULL,
	id_user bigint null,
	Time_Start char(20) NULL,
	Time_End char(20) NULL,
	Status BIT NOT NULL,
	Date_Open DATE NULL

	PRIMARY KEY(Id)
	foreign key(id_user) references users_1(Id),
	FOREIGN KEY(Id_Sân) REFERENCES dbo.Sân(Id)
)
GO


CREATE TABLE bill
(
	Id BIGINT IDENTITY (1,1) NOT NULL,
	id_match BIGINT UNIQUE NOT NULL,
	Id_Client BIGINT NOT NULL,
	Date DATE NOT NULL,
	total FLOAT NOT NULL,
	Status BIT NOT NULL

	PRIMARY KEY(Id)
)
GO

ALTER TABLE bill ADD FOREIGN KEY(id_match) REFERENCES match(Id)

ALTER TABLE bill ADD FOREIGN KEY(Id_Client) REFERENCES dbo.Users(Id)

