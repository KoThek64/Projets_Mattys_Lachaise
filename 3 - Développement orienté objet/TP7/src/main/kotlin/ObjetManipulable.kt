abstract class ObjetManipulable(x : Int, y : Int) : Coloriable, Manipulable, ObjetGraphique(){
    private var selectionne : Boolean = false
    private var x : Int = x
    private var y : Int = y
    private var couleurPremierPlan : String = "#000000"
    private var couleurArrierePlan : String = "#FFFFFF"

    override fun selectionner(ok : Boolean){
        TODO()
    }

    override fun colorierPremier(nouvelleCouleur : String){
        TODO()
    }

    override fun colorierArriere(nouvelleCouleur : String){
        TODO()
    }

    override fun deplacer(nx : Int, ny : Int){
        x = nx
        y = ny
    }

    override fun dessiner() : String{
        return "X=$x,Y=$y,"
    }
}