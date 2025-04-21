-- Suppression des tables si elles existent déjà
DROP TABLE Conducteur CASCADE CONSTRAINTS;
DROP TABLE Gare CASCADE CONSTRAINTS;
DROP TABLE Train CASCADE CONSTRAINTS;
DROP TABLE Trajet CASCADE CONSTRAINTS;

-- Création des tables
CREATE TABLE Trajet (
	Numéro_Trajet NUMBER(10) PRIMARY KEY,
	Ville_Depart VARCHAR2(100),
	Heure_Depart VARCHAR2(5),
	Ville_Arrivee VARCHAR2(100),
	Heure_Arrivee VARCHAR2(5),
	Nombre_Passagers NUMBER(5),
	Numéro_Conducteur NUMBER(10),
	Numéro_Train NUMBER(10)
);

CREATE TABLE Conducteur (
	Numéro_Conducteur NUMBER(10) PRIMARY KEY,
	Nom_Conducteur VARCHAR2(50),
	Adresse_Conducteur VARCHAR2(100),
	Salaire_Conducteur NUMBER(10, 2),
	Commission_Conducteur NUMBER(5, 2),
	Annee_Embauche NUMBER(4)
);

CREATE TABLE Train (
	Numéro_Train NUMBER(10) PRIMARY KEY,
	Type_Train VARCHAR2(50),
	Annee_Mise_Circulation NUMBER(4),
	Nombre_Heures_Route NUMBER(10),
	Nombre_Places NUMBER(5)
);

CREATE TABLE Gare (
	Nom_Gare VARCHAR2(100),
	Ville_Gare VARCHAR2(100),
	PRIMARY KEY (Nom_Gare, Ville_Gare)
);

-- Insertion des données
INSERT INTO Trajet VALUES (243, 'Nantes', '12:35', 'Paris', '14:45', 532, 2, 243);  -- Jacques, train 243
INSERT INTO Trajet VALUES (874, 'Angoulême', '08:50', 'Bordeaux', '09:43', 123, 18, 186); -- Paul, train 186
INSERT INTO Trajet VALUES (1023, 'Montaigu', '18:20', 'Clisson', '18:33', 78, 45, 763); -- Arthur, train 763

INSERT INTO Conducteur VALUES (2, 'Jacques', '12, rue de la poterie, Nantes', 2412, 500, 1998);
INSERT INTO Conducteur VALUES (18, 'Paul', '24, route de la porte d’entrée, Angoulême', 1854, 200, 1989);
INSERT INTO Conducteur VALUES (45, 'Arthur', '145, salon du thé, Clisson', 9001, 300, 2005);

INSERT INTO Gare VALUES ('Gare de Nantes', 'Nantes');
INSERT INTO Gare VALUES ('Gare Angoulême', 'Angoulême');

INSERT INTO Train VALUES (243, 'TER', 1956, 800000, 780);  -- Train TER
INSERT INTO Train VALUES (186, 'TGV', 2000, 150000, 500); -- Train TGV
INSERT INTO Train VALUES (763, 'TGV', 2001, 20000, 650);  -- Train TGV

Requête 1 :
SELECT c.Numéro_Conducteur, c.Nom_Conducteur
FROM Conducteur c
JOIN Trajet t ON c.Numéro_Conducteur = t.Numéro_Conducteur
WHERE t.Ville_Depart = 'Montaigu' AND t.Ville_Arrivee = 'Clisson';

Requête 2 :
SELECT C.Numéro_Conducteur, C.Nom_Conducteur, C.Salaire_Conducteur
FROM Conducteur C
WHERE C.Salaire_Conducteur BETWEEN 2000 AND 8000;

Requête 3 :
SELECT C.Numéro_Conducteur, C.Nom_Conducteur, T.Type_Train
FROM Conducteur C
JOIN Trajet Tr ON C.Numéro_Conducteur = Tr.Numéro_Conducteur
JOIN Train T ON Tr.Numéro_Train = T.Numéro_Train
WHERE C.Adresse_Conducteur LIKE '%Nantes%'
  AND T.Nombre_Heures_Route > 10000;
 
Requête 4 : 
  SELECT C.Numéro_Conducteur, C.Nom_Conducteur, V.Ville_Depart
FROM
	(SELECT DISTINCT Ville_Depart
 	FROM Trajet) V
LEFT JOIN Trajet T
	ON T.Ville_Depart = V.Ville_Depart
	LEFT JOIN Conducteur C
	ON C.Numéro_Conducteur = T.Numéro_Conducteur
WHERE T.Numéro_Conducteur IS NULL;

Requête 5 : 
SELECT T.Numéro_Trajet, T.Ville_Depart, T.Heure_Depart, T.Ville_Arrivee, T.Heure_Arrivee
FROM Trajet T
JOIN Conducteur C ON T.Numéro_Conducteur = C.Numéro_Conducteur
WHERE C.Adresse_Conducteur LIKE '%' || T.Ville_Arrivee || '%';

Requête 6 : 
SELECT DISTINCT T.Numéro_Trajet, T.Ville_Depart, T.Heure_Depart, T.Ville_Arrivee, T.Heure_Arrivee
FROM Trajet T
JOIN Conducteur C ON T.Numéro_Conducteur = C.Numéro_Conducteur
WHERE C.Adresse_Conducteur LIKE '%' || T.Ville_Arrivee || '%';

Requête 7 : 
SELECT C.Numéro_Conducteur, C.Nom_Conducteur, C.Annee_Embauche
FROM Conducteur C
WHERE C.Annee_Embauche > (
	SELECT Annee_Embauche
	FROM Conducteur
	WHERE Numéro_Conducteur = 2
);

Requête 8 : 
SELECT C.Numéro_Conducteur, C.Nom_Conducteur, MAX(T.Nombre_Passagers) AS Passagers_Max
FROM Conducteur C
JOIN Trajet T ON C.Numéro_Conducteur = T.Numéro_Conducteur
GROUP BY C.Numéro_Conducteur, C.Nom_Conducteur
ORDER BY Passagers_Max DESC
FETCH FIRST 1 ROWS ONLY;

Requête 9 : 
SELECT C.Numéro_Conducteur, C.Nom_Conducteur
FROM Conducteur C
LEFT JOIN Trajet T ON C.Numéro_Conducteur = T.Numéro_Conducteur
WHERE T.Numéro_Conducteur IS NULL;

Requête 10 : 
SELECT T.Numéro_Train
FROM Trajet Tr
JOIN Train T ON Tr.Numéro_Train = T.Numéro_Train
GROUP BY T.Numéro_Train
HAVING COUNT(DISTINCT Tr.Ville_Depart) = 1 AND COUNT(DISTINCT Tr.Ville_Arrivee) = 1;



Requête 11 : 
SELECT DISTINCT T.Numéro_Train
FROM Trajet Tr
JOIN Train T ON Tr.Numéro_Train = T.Numéro_Train
WHERE Tr.Ville_Depart = 'Nantes' OR Tr.Ville_Arrivee = 'Nantes';
