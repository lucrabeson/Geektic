drop table geekInteret if exists cascade;
drop table interet if exists cascade;
drop table geek if exists cascade;

create table geek (
	id int primary key,
	pseudo varchar(255) not null,
	prenom varchar(255) not null,
	nom varchar(255) not null,
	mail varchar(255) unique not null,
	male tinyint not null,
);

create table interet (
	nom varchar(255) primary key
);

create table geekInteret(
	idGeek int foreign key references geek(id),
	nomInteret varchar(255) foreign key references interet(nom),
	primary key(idGeek, nomInteret)
);