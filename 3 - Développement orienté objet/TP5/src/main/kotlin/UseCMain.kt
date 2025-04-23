package exo1

fun main() {
    // on affecte à c0 un objet de type C
    val c0: C = C()

    // on appelle la méthode ope0() sur c0 (et on affiche le résultat)
    println(c0.ope0()) //100.0

    // on appelle les méthodes ope1() et ope2() sur c0

    println(c0.ope1()) //-1.0
    println(c0.ope2()) //10.0

    // on affecte à c1 un objet de type C1
    val c1: C1 = C1()

    // on appelle les méthodes ope1() et ope3() sur c1

    println(c1.ope1()) //42.0
    println(c1.ope3()) //0.0

    // on appelle les méthodes ope0() et ope2() sur c1 : est-ce possible ?

    println(c1.ope0()) //100.0
    println(c1.ope2()) //10.0

    // on affecte à c2 un objet de type C1
    var c2: C = C1()

    // on appelle les méthodes ope0() et ope2() sur c2 : est-ce possible ?

    println(c2.ope0()) //100.0
    println(c2.ope2()) //10.0

    // on appelle la méthode ope1() sur c2 : est-ce possible ?

    println(c2.ope1()) //42.0

    // quel est le résultat ? est-ce logique ?
    // la réponse est 42.0, oui c'est logique car c2 à été affecté sur un objet de type C1()


    // on appelle la méthode ope3() sur c2 : est-ce possible ?

    //TODO println(c2.ope3()) // 100.0

    // quel est le résultat ? est-ce logique ?
    // ne fonctionne pas


    // on re-affecte c2 avec un objet de type C2
    c2 = C2()

    // on appelle les méthodes ope0() et ope1() sur c2 : est-ce possible ?

    println(c2.ope0()) //100.0
    println(c2.ope1()) //-1.0

    // on appelle la méthode ope2() sur c2 : est-ce possible ?

    println(c2.ope2()) //66.6

    // quel est le résultat ? est-ce logique ?
    // le résultat est 66.6, oui c'est logique car c2 à été réaffcté sur un onjet de type C2() est la fonction ope2() dans C2() return 66.6
}