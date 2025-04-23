import org.junit.jupiter.api.*
import univ.nantes.UMLChecker
import kotlin.reflect.KVisibility

	/***** Generated JUnit/UMLChecker Test Cases for ObjetManipulable *****/

class TestUmlObjetManipulable {

	lateinit var uml : UMLChecker

	@BeforeEach
	fun init() {
		uml = UMLChecker.create(ObjetManipulable::class)
	}

	@Test
	fun `test0 - class ObjetManipulable is abstract or not`() {
		uml.isAbstract(true)
	}

	@Test
	fun `test1 - class ObjetManipulable is open or not`() {
		uml.isOpen(false)
	}

	@Test
	fun `test2 - 'ObjetManipulable' extends other classe(s)`() {
		uml.extend("ObjetGraphique", "Manipulable", "Coloriable")
	}

	@Test
	fun `test3 - 'ObjetManipulable' has a constructor`() {
		uml.constructorCheck(paramsAndTypes=arrayOf(Pair("x", Int::class), Pair("y", Int::class)))
	}

	@Test
	fun `test4 - 'ObjetManipulable' has attribute(s)`() {
		uml.attributeNumber(5)
	}

	@Test
	fun `test5 - 'ObjetManipulable' has an attribute 'selectionne'`() {
		uml.attributeCheck("selectionne", Boolean::class)
	}

	@Test
	fun `test6 - 'ObjetManipulable' has an attribute 'x'`() {
		uml.attributeCheck("x", Int::class)
	}

	@Test
	fun `test7 - 'ObjetManipulable' has an attribute 'y'`() {
		uml.attributeCheck("y", Int::class)
	}

	@Test
	fun `test8 - 'ObjetManipulable' has an attribute 'couleurPremierPlan'`() {
		uml.attributeCheck("couleurPremierPlan", String::class)
	}

	@Test
	fun `test9 - 'ObjetManipulable' has an attribute 'couleurArrierePlan'`() {
		uml.attributeCheck("couleurArrierePlan", String::class)
	}

	@Test
	fun `test10 - 'ObjetManipulable' has method(s)`() {
		uml.methodNumber(5)
	}

	@Test
	fun `test11 - 'ObjetManipulable' has a method 'selectionner'`() {
		uml.methodCheck("selectionner", methParamAndTypes=arrayOf(Pair("ok", Boolean::class)), isOpenOrOverride=true)
	}

	@Test
	fun `test12 - 'ObjetManipulable' has a method 'colorierPremier'`() {
		uml.methodCheck("colorierPremier", methParamAndTypes=arrayOf(Pair("nouvelleCouleur", String::class)), isOpenOrOverride=true)
	}

	@Test
	fun `test13 - 'ObjetManipulable' has a method 'colorierArriere'`() {
		uml.methodCheck("colorierArriere", methParamAndTypes=arrayOf(Pair("nouvelleCouleur", String::class)), isOpenOrOverride=true)
	}

	@Test
	fun `test14 - 'ObjetManipulable' has a method 'deplacer'`() {
		uml.methodCheck("deplacer", methParamAndTypes=arrayOf(Pair("nx", Int::class), Pair("ny", Int::class)), isOpenOrOverride=true)
	}

	@Test
	fun `test15 - 'ObjetManipulable' has a method 'dessiner'`() {
		uml.methodCheck("dessiner", String::class, isOpenOrOverride=true)
	}


}
