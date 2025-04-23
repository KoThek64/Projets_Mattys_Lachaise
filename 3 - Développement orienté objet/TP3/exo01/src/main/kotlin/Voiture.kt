class Voiture(
    // declaration des parametres du constructeurs
    mod : String,
    coul : String,
    vitMax : Double = 130.0,
    
) {
    // declaration des attributs
    private var modele : String
    private var couleur : String
    private var vitesseCourante : Double = 0.0
    private var vitesseMaximum : Double
    private var enMarche : Boolean = false

    init {
        // initialisation des attributs
        modele = mod
        couleur = coul
        vitesseMaximum = vitMax

    }
    // TODO (1) : declaration des signatures des méthodes uniquement
    // A cette étape, tous les cas de test UML doivent être OK

    fun demarrer(){
        enMarche = true
    }

    fun arreter(){
        vitesseCourante = 0.0
        enMarche = false
    }

    fun repeindre(nouvelleCouleur : String){
        if (vitesseCourante == 0.0) {
            couleur = nouvelleCouleur
        }
    }

    fun donneInformations() : String{
        return "Voiture ${modele} de couleur ${couleur}"
    }

    fun estEnMarche() : Boolean{
        return enMarche
    }

    fun accelerer(acceleration : Double) : Double{
        if (acceleration <= 0){
            return vitesseCourante
        }
        if (enMarche == false){
            return vitesseCourante
        }
        if ((vitesseCourante + acceleration) >= vitesseMaximum){
            return vitesseMaximum
        }
        vitesseCourante += acceleration
        return vitesseCourante
    }

    fun decelerer(deceleration : Double) : Double{
        if (deceleration <= 0){
            return vitesseCourante
        }
        if (enMarche == false){
            return vitesseCourante
        }
        if ((vitesseCourante - deceleration) <= 0.0){
            return 0.0
        }
        vitesseCourante -= deceleration
        return vitesseCourante
    }
}