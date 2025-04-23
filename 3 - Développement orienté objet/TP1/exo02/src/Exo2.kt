
const val max = 10_000
var x = 2
var y = 12.0
var z : Boolean = true

fun main() {
    y++
    truc(y)
    z = (x == 2)
    if (inc(x) == 3){
        print("ok")
    }
}

fun truc(a : Double) {
    println(a)
}

fun inc(a : Int) :Int {
    var b = a
    b++
    return b
}

