drop table interet if exists cascade;
drop table geek if exists cascade;

create table geek (
	id int not null,
	pseudo varchar(255) not null,
	prenom varchar(255) not null,
	nom varchar(255) not null,
	mail varchar(255) unique not null,
	male tinyint not null,
	primary key (id)
);

create table interet (
	id int not null,
	idGeek int not null,
	nom varchar(255) not null,
	primary key (id),
	foreign key (idGeek) references geek(id)
);