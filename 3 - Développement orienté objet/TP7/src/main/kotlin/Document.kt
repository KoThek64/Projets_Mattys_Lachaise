class Document(nom : String) : Editable{
    private var nomDeFichier : String = nom
    var compteurFeuilles : Int private set

    private val feuilles : Array<Feuille?> = arrayOfNulls(10)

    init {
        this.compteurFeuilles = 1
    }

    override fun editer(nouveau : String){
        TODO()
    }

    fun nouvelleFeuille(hauteur : Int = 200, largeur : Int = 150) : Boolean{
        compteurFeuilles += 1
        return true
    }

    fun donneFeuille(position : Int) : Feuille?{
        TODO()
    }
}