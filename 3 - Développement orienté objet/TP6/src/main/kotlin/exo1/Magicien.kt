package exo1

class Magicien (nom : String, force : Int, agi : Int, intel : Int, mag : Int = 1, sort0 : Sort) : Personnage(nom, force, agi, intel){
    private var carac_magie : Int = mag
    var nbSortsConnus : Int private set
    private var grimoire : Array<Sort?> = arrayOfNulls(10)

    init{
        this.nbSortsConnus = 1
        super.prend(Equipement("Grimoire"))
    }

    override fun listeCaracteristiques() : String {
        return super.listeCaracteristiques() + ",MAG=$carac_magie"
    }

    fun apprend(nouveau : Sort) : Boolean {
        TODO()
    }

    fun lance(sort : Sort) : Boolean {
        TODO()
    }

    fun listeDesSorts() : Array<Sort?> {
        TODO()
    }
}