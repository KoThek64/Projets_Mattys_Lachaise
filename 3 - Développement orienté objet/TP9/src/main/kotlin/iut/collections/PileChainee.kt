package iut.collections

open class PileChainee() :iPile {
    protected var debut : Cellule? = null

    override fun estVide() : Boolean{
        return debut == null
    }
    override fun taille() : Int{
        var nb = 0
        var parcours = debut
        while (parcours != null){
            nb++
            parcours = parcours.suivant()
        }
        return nb
    }
    override fun empiler(element : Int){
        debut = Cellule(element,debut)
    }
    override fun consulter() : Int{
        if (estVide()){
            throw NoSuchElementException()
        }
        return debut!!.valeur()
    }
    override fun depiler() : Int{
        if (estVide()){
            throw NoSuchElementException()
        }
        val k = debut!!.valeur()
        debut = debut!!.suivant()
        return k
    }

}