import kotlin.random.*

fun main() {
	var p1 = Point()
	var p2 = Point(1,2)
	println(p1.getX())
	println(p2.getX())
	p2.setY(3)
	println(p2.getY())
	p2.translater(1,1)
	println(p2)
	p1.deplacer(2,10)
	println(p1)
	println(p2.distanceOrigine())
	println(p1.distance(p2))
	p1 = Point(p2)
	println(p1)
	println(p2)
	p1.translater(2,1)
	println(p1)
	println(p2)
	//je suis surpris :D

	//Partie 2
	println("-------------------------------------")
	println("PARTIE 2")
	var tableau = arrayOfNulls<Point?>(10)
	tableau[0] = p1
	println("Avant remplir")
	afficher(tableau)
	remplir(tableau)
	println("après remplir")
	afficher(tableau)
}

fun afficher(points : Array<Point?>){
	for (i in 0 until points.size){
		if (points[i] == null){
			break
		}
		println(points[i])
	}
}

fun remplir(points : Array<Point?>) : Array<Point?>{
	for (i in 0 until points.size-1){
		points[i+1] = Point(points[i]) 
		points[i+1]!!.translater(Random.nextInt(1,10),Random.nextInt(1,10))
	}
	return points
}
