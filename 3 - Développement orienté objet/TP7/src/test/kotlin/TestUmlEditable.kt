import org.junit.jupiter.api.*
import univ.nantes.UMLChecker
import kotlin.reflect.KVisibility

	/***** Generated JUnit/UMLChecker Test Cases for Editable *****/

class TestUmlEditable {

	lateinit var uml : UMLChecker

	@BeforeEach
	fun init() {
		uml = UMLChecker.create(Editable::class)
	}

	@Test
	fun `test0 - class Editable is abstract or not`() {
		uml.isAbstract(true)
	}

	@Test
	fun `test1 - class Editable is open or not`() {
		uml.isOpen(false)
	}

	@Test
	fun `test2 - 'Editable' extends other classe(s)`() {
		uml.extendNothing()
	}

	@Test
	fun `test3 - 'Editable' has attribute(s)`() {
		uml.attributeNumber(0)
	}

	@Test
	fun `test4 - 'Editable' has method(s)`() {
		uml.methodNumber(1)
	}

	@Test
	fun `test5 - 'Editable' has a method 'editer'`() {
		uml.methodCheck("editer", methParamAndTypes=arrayOf(Pair("nouveau", String::class)), isAbstract=true)
	}


}
