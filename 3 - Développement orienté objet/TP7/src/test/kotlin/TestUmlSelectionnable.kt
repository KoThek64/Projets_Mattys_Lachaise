import org.junit.jupiter.api.*
import univ.nantes.UMLChecker
import kotlin.reflect.KVisibility

	/***** Generated JUnit/UMLChecker Test Cases for Selectionnable *****/

class TestUmlSelectionnable {

	lateinit var uml : UMLChecker

	@BeforeEach
	fun init() {
		uml = UMLChecker.create(Selectionnable::class)
	}

	@Test
	fun `test0 - class Selectionnable is abstract or not`() {
		uml.isAbstract(true)
	}

	@Test
	fun `test1 - class Selectionnable is open or not`() {
		uml.isOpen(false)
	}

	@Test
	fun `test2 - 'Selectionnable' extends other classe(s)`() {
		uml.extendNothing()
	}

	@Test
	fun `test3 - 'Selectionnable' has attribute(s)`() {
		uml.attributeNumber(0)
	}

	@Test
	fun `test4 - 'Selectionnable' has method(s)`() {
		uml.methodNumber(1)
	}

	@Test
	fun `test5 - 'Selectionnable' has a method 'selectionner'`() {
		uml.methodCheck("selectionner", methParamAndTypes=arrayOf(Pair("ok", Boolean::class)), isAbstract=true)
	}


}
