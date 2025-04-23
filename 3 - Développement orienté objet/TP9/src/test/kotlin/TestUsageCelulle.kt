import iut.collections.Cellule
import org.junit.jupiter.api.Assertions.assertAll
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class TestUsageCelulle {

    lateinit var cell: Cellule

    @BeforeEach
    fun init() {
        cell = Cellule(1)
    }

    @Test
    fun testInitValeur() {
        assertEquals(1, cell.valeur())
    }

    @Test
    fun testInitSuivant() {
        assertEquals(null, cell.suivant())
    }

    @Test
    fun testChainage() {
        val cell2 = Cellule(2, cell)
        assertAll(
            { assertEquals(2, cell2.valeur()) },
            { assertEquals(cell, cell2.suivant()) } ,
            { assertEquals(1, cell2.suivant()?.valeur()) },
            { assertEquals(null, cell2.suivant()?.suivant()) }
        )
    }

    @Test
    fun testModifieSuivant() {
        val cell2 = Cellule(2)
        cell.modifieSuivant(cell2)
        assertAll(
            { assertEquals(1, cell.valeur()) },
            { assertEquals(cell2, cell.suivant())},
            { assertEquals(2, cell.suivant()?.valeur()) },
            { assertEquals(null, cell.suivant()?.suivant()) },
        )
    }

}