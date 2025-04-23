class Feuille(h : Int = 100, l : Int = 100){
    private var hauteur : Int = h
    private var largeur : Int = l
    var compteurObjets : Int private set

    private val objets : Array<ObjetGraphique?> = arrayOfNulls(100)

    init {
        this.compteurObjets = 0
    }

    fun inserer(nouvelObjet : ObjetGraphique){
        TODO()
    }
}