package exo1

open class Equipement (desc : String){
    var description : String private set

    init{
        this.description = desc
    }

    override fun toString () : String{
        return "$description"
    }
}