import kotlin.random.*

fun main() {
    val anti = "anticonstitutionnellement"
    println("EX1")
    println(anti.length)
    println("EX2")
    println(anti[4])
    println(anti[19])
    println("EX3")
    for (i in anti.length-1 downTo 0){
        println(anti[i])
    }
    println("EX4")
    var sousChaine1 = anti.substring(1,4)
    println(sousChaine1)
    println("EX5")
    val n = anti.get(1)
    for (i in 0 until anti.length-1){
        if (anti[i] == n){
            println(i)
            break
        }
    }
    for (i in anti.length-1 downTo 0){
        if (anti[i] == n){
            println(i)
            break
        }
    }
    println("EX7")
    var bonjour = "Bonjour"
    bonjour = bonjour + " tout"
    bonjour = bonjour + " le monde !"
    println(bonjour)
    println("EX8")
    var aleatoire = ""
    for (i in 0 until 25){
        val rdm = anti.random()
        aleatoire += rdm
    }
    println(aleatoire)
    println("EX9")
    var majuscule = anti.toUpperCase()
    println(majuscule)
    println("EX10")
    var minuscule = majuscule.toLowerCase()
    println(minuscule)
}
