/*
La fonction calcul doit retourner la valeur de son argument multipliée par 3, à laquelle on ajoute ensuite 5.

@author init.dev (L.Jezequel)

@param x un entier
@return 3 fois x plus 5
 */

fun calcul (x : Int) : Int {
    return x*3+5
}

/*
La fonction estPair indique si un nombre passé en paramètre est pair ou non

@param x un nombre entier
@return vrai si x est un nombre pair
 */
fun estPair(x : Int) : Boolean {
    if (x%2 == 0){
        return true
    }
    return false
}

/*
La fonction estPremier doit indiquer par un booléen si un nombre est premier
ou pas

@author init.dev (L.Jezequel)

@ n un nombre entier
@return un booléen indiquant si n est premier ou pas
*/
fun estPremier(n : Int) : Boolean {
    for (cpt in 0 until n){
        if (n%cpt == 0){
            if (n/n != 1){
                return false
            }
        }
    }
    return true
}
