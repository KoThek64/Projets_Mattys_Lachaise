drop table fourniture;
drop table fournisseur;
drop table produit;

create table fournisseur(
    nof number(3) PRIMARY KEY,
    nom varchar(30),
    adresse varchar(30)
    );
    
create table produit(
    nop number(3) PRIMARY KEY,
    libelle varchar(50) not null unique,
    couleur varchar(10) check (couleur in ('Rouge','Vert','Jaune')),
    prix number(5,2) check (prix BETWEEN 10 and 100)
    );

create table fourniture(
    nof number(3) references fournisseur(nof),
    nop number(3),
    qte number(5,2)not null,
    primary key(nof, nop),
    foreign key(nop) references produit(nop)
    );

insert into fournisseur values(1,'Bidochon','Nantes');
insert into fournisseur values(2,'Mattys','Nantes');
insert into fournisseur values(3,'Julie','Paris');

insert into produit values(1,'Souris','Noir',19);
insert into produit values(2,'Tomate','Rouge',15);
insert into produit values(3,'Telephone','Jaune',100);

insert into fourniture values(1,1,10);
insert into fourniture values(2,2,25);
insert into fourniture values(3,3,2);