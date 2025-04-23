class Texte(x : Int, y : Int, valeur : String) : ObjetManipulable(x,y), Editable{
    private var valeur : String = valeur
    private var police : String = "Times"
    private var taille : Int = 10

    override fun editer(nouveau : String){
        TODO()
    }

    override fun dessiner() : String{
        return "\"$valeur\":${super.dessiner()}P=$police,S=$taille"
    }
}