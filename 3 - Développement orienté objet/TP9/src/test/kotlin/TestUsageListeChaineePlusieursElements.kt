import iut.collections.ListeChainee
import iut.collections.iListe
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import org.junit.jupiter.api.assertThrows
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import org.junit.jupiter.params.provider.ValueSource


class TestUsageListeChaineePlusieursElements {

    lateinit var liste : iListe

    @BeforeEach
    fun init() {
        liste = ListeChainee()
        liste.empiler(42)
        liste.empiler(0)
        liste.empiler(-2)
        liste.empiler(4)
        liste.empiler(-42)
        liste.empiler(-4)
        liste.empiler(99)
    }

    @Test
    fun `liste remplie ok`() {
        assertAll(
            { assertFalse(liste.estVide()) },
            { assertEquals(7, liste.taille()) },
        )
    }

    @Test
    fun `consulter debut liste`() {
        val res = liste.consulter()
        assertEquals(99, res)
    }


    @ParameterizedTest
    @CsvSource("0, 99", "1, -4", "2, -42", "3, 4", "4, -2", "5, 0", "6, 42")
    fun `consulter liste position`(position: Int, valeur: Int) {
       assertDoesNotThrow {
           val res = liste.consulter(position)
           assertEquals(valeur, res)
       }
    }

    @ParameterizedTest()
    @ValueSource(ints = [-100, -1, 7, 100])
    fun `consulter liste position exception`(position: Int) {
        assertThrows<IndexOutOfBoundsException> {
            liste.consulter(position)
        }
    }

    @ParameterizedTest
    @CsvSource("0, 99", "1, -4", "2, -42", "3, 4", "4, -2", "5, 0", "6, 42")
    fun `index dans liste`(position: Int, valeur: Int) {
        assertDoesNotThrow {
            val pos = liste.index(valeur)
            assertEquals(position, pos)
        }
    }

    @ParameterizedTest()
    @ValueSource(ints = [-99, 2, 1, 3, 5, 6, 7, 100])
    fun `index dans liste exception`(valeurInconnue: Int) {
        assertThrows<NoSuchElementException> {
            liste.index(valeurInconnue)
        }
    }

    @ParameterizedTest
    @ValueSource(ints = [-100, -1, 8, 100])
    fun `inserer dans liste exception`(positionFausse: Int) {
        assertThrows<IndexOutOfBoundsException> {
            liste.inserer(positionFausse, 666)
        }
    }

    @ParameterizedTest
    @ValueSource(ints = [0, 1, 2, 3, 4, 5, 6, 7])
    fun `inserer dans liste ok`(position: Int) {
        assertDoesNotThrow {
            liste.inserer(position, 666)
            assertAll(
                { assertFalse(liste.estVide()) },
                { assertEquals(8, liste.taille()) },
            )
        }
    }

    @ParameterizedTest
    @CsvSource("0, 99", "1, -4", "2, -42", "3, 4", "4, -2", "5, 0", "6, 42")
    fun `inserer dans liste, puis consulter`(position: Int, valeurPrecedente: Int) {
        assertDoesNotThrow {
            liste.inserer(position, 666)
            assertAll(
                { assertEquals(666, liste.consulter(position)) },
                { assertEquals(valeurPrecedente, liste.consulter(position+1)) }
            )
        }
    }

    @Test
    fun `inserer dans liste fin ok`() {
        assertDoesNotThrow {
            liste.inserer(7, 666)
            assertEquals(666, liste.consulter(7))
        }
    }

    @ParameterizedTest
    @ValueSource(ints = [-100, -1, 7, 100])
    fun `supprimer dans liste exception`(positionFausse: Int) {
        assertThrows<IndexOutOfBoundsException> {
            liste.supprimer(positionFausse)
        }
    }


    @ParameterizedTest
    @ValueSource(ints = [0, 1, 2, 3, 4, 5, 6])
    fun `supprimer dans liste ok`(position: Int) {
        assertDoesNotThrow {
            liste.supprimer(position)
            assertAll(
                { assertFalse(liste.estVide()) },
                { assertEquals(6, liste.taille()) },
            )
        }
    }

    @ParameterizedTest
    @CsvSource("0, -4", "1, -42", "2, 4", "3, -2", "4, 0", "5, 42")
    fun `supprimer dans liste, puis consulter`(position: Int, valeurApres: Int) {
        assertDoesNotThrow {
            liste.supprimer(position)
            assertAll(
                { assertEquals(valeurApres, liste.consulter(position)) }
            )
        }
    }

    @Test
    fun `supprimer dernier dans liste`() {
        assertDoesNotThrow {
            liste.supprimer(6)
        }
    }
}