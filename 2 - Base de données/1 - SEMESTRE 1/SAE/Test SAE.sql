select dragon, sexe, crachedufeu from dragons;

select comportementamoureux from dragons;

select dragon, sexe from dragons where sexe = 'M';

select dragon, sexe , crachedufeu from dragons where sexe = 'M' and crachedufeu = 'o';

select dragon, comportementamoureux from dragons where comportementamoureux = 'timide' or comportementamoureux = 'sincere';

select dragon, longueur from dragons where longueur > 200;

select dragon, longueur from dragons where longueur < 200 and longueur > 100;

select dragon, comportementamoureux from dragons where comportementamoureux <> 'macho' and comportementamoureux <> 'timide';

select dragon from dragons where dragon like '%oc%';

select dragon from dragons where longueur is null;

select dragon, longueur - nombreecailles from dragons;

select dragon, sexe, produit from dragons, nourritures;

select distinct dragons.dragon, dragons.sexe from dragons, repas where dragons.dragon = repas.dragon;

select dragon, longueur from dragons where longueur > (select longueur from dragons where dragon = 'Birduth');

select dragon, longueur from dragons where longueur > (select longueur from dragons where dragon = 'Birduth') and nombreecailles = (select nombreecailles from dragons where dragon = 'Birduth');

select dragons.dragon, sexe, produit from dragons left join repas on dragons.dragon = repas.dragon;

select avg(longueur) from dragons;

select comportementamoureux, avg(longueur), sexe from dragons group by comportementamoureux,sexe having sexe = 'M';

select comportementamoureux, avg(longueur), sexe from dragons where sexe = 'M' group by comportementamoureux,sexe having count(sexe) >=2;

//21//
    
select * from (select dragons.longueur from dragons order by longueur desc) where rownum <= 2;

