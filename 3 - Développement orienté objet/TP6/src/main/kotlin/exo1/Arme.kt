package exo1

class Arme (desc : String, att : Int, def : Int) : Equipement(desc){
    private var attaque : Int = att
    private var defense : Int = def

    override fun toString () : String{
        return "$description ($attaque,$defense)"
    }
}