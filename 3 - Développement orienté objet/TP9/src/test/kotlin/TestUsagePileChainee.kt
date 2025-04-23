import iut.collections.PileChainee
import iut.collections.iPile
import org.junit.jupiter.api.*
import org.junit.jupiter.api.Assertions.*
import kotlin.random.Random

class TestUsagePileChainee {

    lateinit var pile : iPile

    @BeforeEach
    fun init() {
        pile = PileChainee()
    }

    @Test
    fun `pile vide`() {
        assertTrue(pile.estVide())
    }

    @Test
    fun `pile vide - taille`() {
        assertEquals(0, pile.taille())
    }

    @Test
    fun `pile vide - consulter`() {
        assertThrows<NoSuchElementException> { pile.consulter() }
    }

    @Test
    fun `pile vide depiler`() {
        assertThrows<NoSuchElementException> { pile.depiler() }
    }


    @Test
    fun `empiler Beaucoup beaucoup`() {

        val nbOperationsTotales = 10_000_000
        var nbOperations = nbOperationsTotales
        while (nbOperations > 0) {
            pile.empiler(Random.nextInt(-100,101))
            nbOperations--
        }
        while (nbOperations < nbOperationsTotales) {
            pile.depiler()
            nbOperations++
        }
        assertAll(
            { assertTrue(pile.estVide()) },
            { assertEquals(0, pile.taille()) },
        )
        assertThrows<NoSuchElementException> { pile.depiler()}
    }


}