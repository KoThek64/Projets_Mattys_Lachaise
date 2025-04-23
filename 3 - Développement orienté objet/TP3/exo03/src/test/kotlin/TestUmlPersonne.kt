import org.junit.jupiter.api.*
import univ.nantes.UMLChecker
import kotlin.reflect.KVisibility

	/***** Generated JUnit/UMLChecker Test Cases for Personne *****/

class TestUmlV1Personne {

	lateinit var uml : UMLChecker

	@BeforeEach
	fun init() {
		uml = UMLChecker.create(Personne::class)
	}

	@Test
	fun `test0 - class Personne is abstract or not`() {
		uml.isAbstract(false)
	}

	@Test
	fun `test1 - class Personne is open or not`() {
		uml.isOpen(false)
	}

	@Test
	fun `test2 - 'Personne' extends other classe(s)`() {
		uml.extendNothing()
	}

	@Test
	fun `test3 - 'Personne' has a constructor`() {
		uml.constructorCheck(paramsAndTypes=arrayOf(Pair("nom", String::class), Pair("prenom", String::class)))
	}

	@Test
	fun `test4 - 'Personne' has attribute(s)`() {
		uml.attributeNumber(2)
	}

	@Test
	fun `test5 - 'Personne' has an attribute 'nom'`() {
		uml.attributeCheck("nom", String::class)
	}

	@Test
	fun `test6 - 'Personne' has an attribute 'prenom'`() {
		uml.attributeCheck("prenom", String::class)
	}

	@Test
	fun `test7 - 'Personne' has method(s)`() {
		uml.methodNumber(1)
	}

	@Test
	fun `test8 - 'Personne' has a method 'donneNomComplet'`() {
		uml.methodCheck("donneNomComplet", String::class)
	}


}
