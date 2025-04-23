import iut.collections.PileChainee
import iut.collections.iPile
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class TestUsagePileChaineePlusieursElements {

    lateinit var pile : iPile

    @BeforeEach
    fun init() {
        pile = PileChainee()
        pile.empiler(42)
        pile.empiler(0)
        pile.empiler(-2)
        pile.empiler(4)
        pile.empiler(-42)
        pile.empiler(-4)
        pile.empiler(99)
    }

    @Test
    fun `pile plusieurs elts`() {
        assertFalse(pile.estVide())
    }

    @Test
    fun `pile plusieurs elts - taille`() {
        assertEquals(7, pile.taille())
    }

    @Test
    fun `pile plusieurs elts - consulter res`() {
        val res = pile.consulter()
        assertEquals(99, res)
    }

    @Test
    fun `pile plusieurs elts - consulter apres`() {
        val res = pile.consulter()
        assertFalse(pile.estVide())
    }

    @Test
    fun `pile plusieurs elts - consulter apres taille`() {
        val res = pile.consulter()
        assertEquals(7, pile.taille())
    }

    @Test
    fun `pile plusieurs elts - depiler`() {
        pile.depiler()
        pile.depiler()
        pile.depiler()
        val res = pile.depiler()
        assertEquals(4, res)
    }

    @Test
    fun `pile plusieurs elts - depiler apres`() {
        pile.depiler()
        pile.depiler()
        pile.depiler()
        pile.depiler()
        assertFalse(pile.estVide())
    }

    @Test
    fun `pile plusieurs elts - depiler apres taille`() {
        pile.depiler()
        pile.depiler()
        pile.depiler()
        assertEquals(4, pile.taille())
    }

    @Test
    fun `pile plusieurs elts - depiler trop`() {

        assertDoesNotThrow { pile.depiler()}
        assertDoesNotThrow { pile.depiler()}
        assertDoesNotThrow { pile.depiler()}
        assertDoesNotThrow { pile.depiler()}
        assertDoesNotThrow { pile.depiler()}
        assertDoesNotThrow { pile.depiler()}
        assertDoesNotThrow { pile.depiler()}

        assertThrows<NoSuchElementException> { pile.depiler()}
    }



}