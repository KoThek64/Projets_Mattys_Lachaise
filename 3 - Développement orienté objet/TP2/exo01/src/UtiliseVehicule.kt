fun main() {
    //Exercice 1
    println("----------------EX1----------------")
    var maSaxo = Vehicule("Saxo","rouge",4,180.0)
    println(maSaxo)
    maSaxo.demarrer()
    maSaxo.accelerer(50.0)
    println(maSaxo)
    maSaxo.accelerer(40.0)
    println(maSaxo.vitesse())
    var voitureMattys = Vehicule("Mazda","rouge",4,450.0)
    voitureMattys.demarrer()
    voitureMattys.accelerer(400.0)
    println(voitureMattys.vaPlusVite(maSaxo))
    maSaxo.arreter()
    voitureMattys.arreter()


    //Exercice 4
    println("----------------EX4----------------")
    var v1 = Vehicule("Mercedes","bleu",4,280.0)
    var v2 = Vehicule("Porsche","noire",4,400.0)
    var v3 = Vehicule("kawasaki","vert",2,365.0)
    var v4 = Vehicule("renault","gris",4,120.0)
    val camion = arrayOf(maSaxo,voitureMattys,v1,v2,v3,v4)
    afficherC(camion)

    val parking = arrayOfNulls<Vehicule>(100)
    decharger(camion,parking)
    afficherP(parking)
    parking[0] = null
    afficherP(parking)
}

fun afficherC(camion : Array<Vehicule>){
    for (i in 0 until camion.size){
        println(camion[i])
    }
}

fun decharger(camion : Array<Vehicule>, parking : Array<Vehicule?>){
    for (i in 0 until camion.size){
        parking[i] = camion[i]
    }
}

fun afficherP(parking : Array<Vehicule?>){
    println("----------------PARKING----------------")
    for (i in 0 until parking.size){
        if (parking[i] == null){
            continue
        }
        println(parking[i])
    }
}