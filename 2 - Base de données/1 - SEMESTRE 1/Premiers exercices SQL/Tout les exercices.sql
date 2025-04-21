drop table travail;
drop table projet;
drop table services;
drop table employes;

create table employes(
    nuempl number(3) PRIMARY KEY,
    nomempl varchar(30),
    hebdo number(3),
    salaire number(7,2),
    affect number(3)
    );
    
create table services(
    nuserv number(3) PRIMARY KEY,
    nomserv varchar(40),
    chef number(3) references employes(nuempl)
    initially deferred deferrable
    ); 
    
create table projet(
    nuproj number(3) PRIMARY KEY,
    nomproj varchar(25) not null unique,
    resp number(3),
    foreign key (resp) references employes(nuempl)
    );
    
create table travail(
    nuempl number(2) references employes(nuempl),
    nuproj number(3) references projet(nuproj),
    durée number(5),
    PRIMARY KEY (nuempl,nuproj)
    );
    
alter table employes
    add foreign key (affect) references services(nuserv)
    initially deferred deferrable ;
    
insert into employes values(20,'marcel',35,2000,3);
insert into employes values(23,'claude',20,2500,3);
insert into employes values(37,'michèle',35,3000,3);
insert into employes values(39,'léon',35,1900,1);
insert into employes values(41,'jules',35,2800,1);
insert into employes values(30,'edith',30,4000,4);
insert into employes values(17,'sophie',35,2800,2);
insert into employes values(57,'anne',35,1300,2);
insert into employes values(68,'casimir',20,3000,4);
insert into employes values(10,'martin',null,1000,4);

insert into services values(1,'achat',41);
insert into services values(2,'vente',17);
insert into services values(3,'informatique',23);
insert into services values(4,'mécanique',20);

insert into projet values(103,'cobra',30);
insert into projet values(237,'zorro',30);
insert into projet values(370,'erasmus',57);
insert into projet values(492,'commet',20);
insert into projet values(135,'eureka',57);
insert into projet values(160,'esprit',5);

insert into travail values(17,135,5);
insert into travail values(20,492,10);
insert into travail values(23,237,15);
insert into travail values(23,135,10);
insert into travail values(30,103,5);
insert into travail values(30,370,5);
insert into travail values(30,492,5);
insert into travail values(30,135,5);
insert into travail values(30,160,5);
insert into travail values(37,160,30);
insert into travail values(39,237,10);
insert into travail values(39,135,15);
insert into travail values(41,103,20);
insert into travail values(41,492,20);
insert into travail values(57,103,20);
insert into travail values(57,370,10);
insert into travail values(37,135,5);
insert into travail values(68,370,25);
insert into travail values(30,237,10);

alter table employes
    add adresse varchar(20);

update employes set adresse = 'nantes'
    where noempl='jules';

update employes set salaire = 0
    where affect = 3;
    
alter table services add NB number(3);
Update services set NB = (Select count(nuempl) from employes where nuserv = affect);

select nomempl from employes, travail where employes.nuempl = travail.nuempl;

select nomempl from employes join travail on employes.nuempl = travail.nuempl;

select nomempl from employes natural join travail;

select nomempl from employes where noempl in (select nomepl from travail);

select nuempl from employes where exists (select * from travail where travail.noempl = employes .noempl);

select employes nomempl, travail.durée from employes, travail, where employes.nuempl = travail.nuempl;

select nuempl, nomempl from employes;

select count(*) from employes;

select avg(hebdo) from employes where hebdo is not null;

select sum(durée) from travail;

select nomempl from employes order by nomepl;

select nuempl.durée from travail.projet order by nuempl desc;

select nomserv from services where nuserv = 1;

select nomserv from services where nuserv != 1;

select nomempl from employes where hebdo is null;

select nomempl from employes where hebdo > 20 and hebdo < 30;

select nomempl from employes, services where employes.affect =services.nuserv and services.nom = "Achat";

select nomempl from employes natural join service where services.nom = "Achat";

select nomempl from employes where affect in (select nuserv from services where nomserv="Achat");

select nomempl from employes where exists (select * from services where affect = nuserv end nomserv ="Achat");

select nomempl from employes where nuempl not in (select nuempl from travail);

select nomempl from employes where not exists (select * from travail where travail.nuempl=employes.nuempl);

select nomempl from employes where nuempl <> ALL (select nuempl from travail);

select nomempl from employes where nomempl in (select nomempl from employes minus select nomempl from travail);

select nomproj from projet join travail on projet.nuproj = travail.nuproj where nuempl = 20;

select nomproj from projet natural join travail where nuempl = 20;

select nomproj from projet , travail where projet.nuproj = travail.nuproj and nuempl =20;

select nomproj from projet where nuproj in (select nuproj from travail where nuempl = 20);

select nomproj from projet where exists (select * from travail where nuempl = 20 and travail.nuproj = projet.nuproj);

select nomempl from employes join travail on employes.nuempl = travail.nuempl where travail.durée = 5;

select nomempl from employes where nuempl in (select nuempl from travail minus select nuempl from travail where durée <> 5);

select nomempl from employes where nuempl in (select nuempl from travail where nuproj in (select nuproj from projet where resp = 30));

select nomempl from employes where exists (select * from travail where travail.nuempl = employes.nuempl);

select nomempl from employes where nomempl in (select nomempl from travail);

select nomempl from employes join travail on employes.nuempl = travail.nuempl;

select nomempl from employes natural join travail ;

select nomempl from employes, travail where employes.nuempl = travail.nuempl;

select nomempl from employes where nomempl not in (select nomempl from travail);

select nomempl from employes where not exists (select * from travail where travail.nuempl = employes.nuempl);

select nomempl from employes where nuempl in (select nuempl from employes minus select nuempl from travail);

select nomserv, nomempl from services, employes where nuempl = chef;

select nomempl, nuproj from travail t, employes e where e.nuempl = t.nuempl;

select nomempl, nuproj from services, employes, travail where services.nomserv = 'achat' and services.chef = employes.nuempl and travail.nuempl = employes.nuempl;

select nomproj, nomempl from projet, employes where resp = nuempl;

select nomempl, t.nuempl from employes e, travail t, projet where projet.nomproj = 'zorro' and resp = e.nuempl and projet.nuproj = t.nuproj;

select employes.nomempl, travail.nuproj from employes left join travail on employes.nuempl = travail.nuempl;

select distinct nuempl from travail where nuproj in (select nuproj from projet where resp = 20);

select nomempl, nomproj from employes, projet where (nuempl, nuproj) in (select nuempl, nuproj from travail);

select nomempl from employes where nuempl in (select chef from services);

select resp, count(*) from projet group by resp;

select affect,count(nuempl) from employes group by affect having count(nuempl) >=2;

select nuempl from travail group by nuempl having count (nuproj) = (select count(nuproj) from projet);

select nuempl from employes where not exists (select * from projet where not exists(select * from travail where projet.nuproj = travail.nuproj and employes.nuempl = travail.nuempl));

