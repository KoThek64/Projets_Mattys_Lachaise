package iut.exo1

import java.net.InetAddress
import java.net.UnknownHostException

fun main() {
    print("Saisir un nom : ")
    val nom = readln()
    var ip : String = ""
    try{
        ip = nomVersIP(nom)
    }
    catch(e : UnknownHostException){
        println("Il y a une erreur dans l'adresse")
    }
    println("IP correspondante :$ip")
}


fun nomVersIP(nom : String) : String {
    return InetAddress.getByName(nom).hostAddress
}