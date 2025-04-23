fun main() {
    // TODO
    var alpha : Double
    var beta : Int = 42
    var delta = 42.0
    beta--
    println(delta)
    alpha = delta
    println(alpha)
    delta += 3
    println("$delta, $alpha")
    var test = alpha == delta
    println(test)
    alpha = dec2(delta, beta)
    println("$delta, $alpha")
}

fun dec2(epsilon : Double, gamma : Int) =
 epsilon - gamma -2