import org.junit.jupiter.api.*
import univ.nantes.UMLChecker
import kotlin.reflect.KVisibility

	/***** Generated JUnit/UMLChecker Test Cases for Coloriable *****/

class TestUmlColoriable {

	lateinit var uml : UMLChecker

	@BeforeEach
	fun init() {
		uml = UMLChecker.create(Coloriable::class)
	}

	@Test
	fun `test0 - class Coloriable is abstract or not`() {
		uml.isAbstract(true)
	}

	@Test
	fun `test1 - class Coloriable is open or not`() {
		uml.isOpen(false)
	}

	@Test
	fun `test2 - 'Coloriable' extends other classe(s)`() {
		uml.extendNothing()
	}

	@Test
	fun `test3 - 'Coloriable' has attribute(s)`() {
		uml.attributeNumber(0)
	}

	@Test
	fun `test4 - 'Coloriable' has method(s)`() {
		uml.methodNumber(2)
	}

	@Test
	fun `test5 - 'Coloriable' has a method 'colorierPremier'`() {
		uml.methodCheck("colorierPremier", methParamAndTypes=arrayOf(Pair("nouvelleCouleur", String::class)), isAbstract=true)
	}

	@Test
	fun `test6 - 'Coloriable' has a method 'colorierArriere'`() {
		uml.methodCheck("colorierArriere", methParamAndTypes=arrayOf(Pair("nouvelleCouleur", String::class)), isAbstract=true)
	}


}
