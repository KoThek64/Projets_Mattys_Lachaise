import org.junit.jupiter.api.*
import univ.nantes.UMLChecker
import kotlin.reflect.KVisibility

	/***** Generated JUnit/UMLChecker Test Cases for Manipulable *****/

class TestUmlManipulable {

	lateinit var uml : UMLChecker

	@BeforeEach
	fun init() {
		uml = UMLChecker.create(Manipulable::class)
	}

	@Test
	fun `test0 - class Manipulable is abstract or not`() {
		uml.isAbstract(true)
	}

	@Test
	fun `test1 - class Manipulable is open or not`() {
		uml.isOpen(false)
	}

	@Test
	fun `test2 - 'Manipulable' extends other classe(s)`() {
		uml.extendNothing()
	}

	@Test
	fun `test3 - 'Manipulable' has attribute(s)`() {
		uml.attributeNumber(0)
	}

	@Test
	fun `test4 - 'Manipulable' has method(s)`() {
		uml.methodNumber(2)
	}

	@Test
	fun `test5 - 'Manipulable' has a method 'deplacer'`() {
		uml.methodCheck("deplacer", methParamAndTypes=arrayOf(Pair("nx", Int::class), Pair("ny", Int::class)), isAbstract=true)
	}

	@Test
	fun `test6 - 'Manipulable' has a method 'dessiner'`() {
		uml.methodCheck("dessiner", String::class, isAbstract=true)
	}


}
