class Groupe(objet1 : ObjetGraphique, objet2 : ObjetGraphique) : ObjetGraphique(){
    var nbObjetsRegroupes : Int private set

    private var objetsRegroupes : Array<ObjetGraphique?> = arrayOfNulls(15)

    init {
        this.nbObjetsRegroupes = 2
    }

    fun regrouper(objetAjoute : ObjetGraphique) : Boolean{
        if (nbObjetsRegroupes == 15){
            return false
        }
        objetsRegroupes += objetAjoute
        nbObjetsRegroupes += 1
        return true
    }

    override fun selectionner(ok : Boolean){
        TODO()
    }
}