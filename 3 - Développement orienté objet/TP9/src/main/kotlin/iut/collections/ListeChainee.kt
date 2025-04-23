package iut.collections

import kotlin.math.absoluteValue

class ListeChainee() : PileChainee(), iListe{
    override fun index(element : Int) : Int{

        if (estVide()){
            throw NoSuchElementException()
        }

        var parcours = debut
        var nb = 0

        while (parcours!!.valeur() != element){
            parcours = parcours.suivant()
            nb++
        }

        return nb
    }
    override fun consulter(index : Int) : Int{

        if (estVide()){
            throw NoSuchElementException()
        }

        var nb = 0
        var parcours = debut

        while (nb != index){
            nb ++
            parcours = parcours!!.suivant()
        }

        return parcours!!.valeur()
    }
    override fun inserer(index : Int, element: Int){
        TODO()
    }
    override fun supprimer(index: Int){
        TODO()
    }
    override fun insererEnQueue(element: Int){
        TODO()
    }
    override fun consulterEnQueue(): Int{
        TODO()
    }
    override fun supprimerEnQueue(){
        TODO()
    }

}