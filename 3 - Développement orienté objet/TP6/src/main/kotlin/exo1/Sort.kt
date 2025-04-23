package exo1

import com.sun.org.apache.xpath.internal.operations.Bool

class Sort (nom : String, desc : String){
    var nom : String private set
    private var description : String = desc

    init{
        this.nom = nom
    }

    override fun toString() : String {
        return "$nom : $description"
    }

    override fun equals(other : Any?) : Boolean{
        TODO()
    }
}