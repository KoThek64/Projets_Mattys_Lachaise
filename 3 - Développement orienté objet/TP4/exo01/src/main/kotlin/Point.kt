class Point (X : Int = 0, Y : Int = 0){
    var x : Int private set
    var y : Int private set

    init{
        this.x = X
        this.y = Y
    }

    override fun toString() : String{
        return "($x,$y)"
    }

    fun translater(v : Vecteur) : Point{
        x = x+toInt(v)
        y = y+toInt(v)
        return Point(x,y)
    }
}