package exo1

open class Personnage (nom : String, force : Int, agi : Int, intel : Int){
    private var nom : String = nom
    private var carac_force : Int = force
    private var carac_agilite : Int = agi
    protected var carac_intelligence : Int = intel
    var nbEquipementsPossedes : Int private set

    private val inventaire : Array<Equipement?> = arrayOfNulls(6)

    init{
        this.nbEquipementsPossedes = 0
    }

    open fun listeCaracteristiques() : String {
        return "FOR=$carac_force,AGI=$carac_agilite,INT=$carac_intelligence"
    }

    fun prend(equipement : Equipement) : Boolean {
        if (nbEquipementsPossedes == inventaire.size){
            return false
        }
        for (i in 0 until inventaire.size) {
            if (inventaire[i] == equipement){
                return false
            }
            if (inventaire[i] == null){
                inventaire[i] = equipement
                nbEquipementsPossedes += 1
                return true
            }
        }
        return false
    }

    fun attaque(arme : Arme, cible : Personnage) : Boolean {
        for (i in 0 until inventaire.size){
            if (inventaire[i] == arme){
                println("attaque <$cible> avec <$arme>")
                return true
            }
        }
        return false
    }

    override fun toString() : String {
        return "$nom <${listeCaracteristiques()}>"
    }

    fun listeInventaire() : String {
        TODO()
    }

}