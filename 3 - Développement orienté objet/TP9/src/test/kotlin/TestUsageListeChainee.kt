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


class TestUsageListeChainee {

    lateinit var liste : iListe

    @BeforeEach
    fun init() {
        liste = ListeChainee()
    }


    @Test
    fun `liste vide`() {
        assertAll(
            { assertTrue(liste.estVide()) },
            { assertEquals(0, liste.taille()) },
        )
    }

    @ParameterizedTest()
    @ValueSource(ints = [-100, 0, -1, 7, 100])
    fun `consulter liste vide position exception`(position: Int) {
        assertThrows<IndexOutOfBoundsException> {
            liste.consulter(position)
        }
    }

    @ParameterizedTest()
    @ValueSource(ints = [-99, 2, 1, 3, 5, 6, 7, 100])
    fun `index dans liste vide exception`(valeur: Int) {
        assertThrows<NoSuchElementException> {
            liste.index(valeur)
        }
    }

}