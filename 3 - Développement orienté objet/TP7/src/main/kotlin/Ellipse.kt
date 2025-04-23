import kotlin.math.PI
import kotlin.math.sqrt

open class Ellipse(x : Int, y : Int, axeVertical : Int, axeHorizontal : Int) : FormeGeo(x,y,axeVertical,axeHorizontal){
    override fun perimetre(): Double {
        val aCarré= (dimension1/2.0)*(dimension1/2.0)
        val bCarré = (dimension2/2.0)*(dimension2/2.0)
        return (2.0* PI*sqrt((aCarré+bCarré)/2.0))
    }

    override fun surface(): Double {
        return (PI * dimension1/2 * dimension2/2)
    }

    override fun dessiner(): String {
        return "(" + super.dessiner() + "AV=$dimension1,AH=$dimension2)"
    }
}