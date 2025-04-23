import iut.collections.PileChainee
import iut.collections.iPile
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*

class TestUsagePileChainee1Element {

    lateinit var pile : iPile

    @BeforeEach
    fun init() {
        pile = PileChainee()
        pile.empiler(42)
    }



    @Test
    fun `pile 1 elt`() {
        assertFalse(pile.estVide())
    }

    @Test
    fun `pile 1 elt - taille`() {
        assertEquals(1, pile.taille())
    }

    @Test
    fun `pile 1 elt - consulter`() {
        assertDoesNotThrow { pile.consulter() }
    }

    @Test
    fun `pile 1 elt - consulter - res`() {
        assertEquals(42, pile.consulter())
    }

    @Test
    fun `pile 1 elt - depiler`() {
        assertDoesNotThrow { pile.depiler() }
    }

    @Test
    fun `pile 1 elt - depiler -res`() {
        assertEquals(42, pile.depiler())
    }

    @Test
    fun `pile 1 elt - depiler - apres`() {
        assertDoesNotThrow {pile.depiler()}
        assertThrows<NoSuchElementException> { pile.depiler() }
    }


    @Test
    fun `pile 1 elt - après consulter`() {
        val res = pile.consulter()
        assertEquals(42, res)
        assertAll(
            { assertFalse(pile.estVide()) },
            { assertEquals(1, pile.taille()) },
        )
    }

    @Test
    fun `pile 1 elt - après depiler`() {
        val res = pile.depiler()
        assertEquals(42, res)
        assertAll(
            { assertTrue(pile.estVide()) },
            { assertEquals(0, pile.taille()) },
        )
    }
}