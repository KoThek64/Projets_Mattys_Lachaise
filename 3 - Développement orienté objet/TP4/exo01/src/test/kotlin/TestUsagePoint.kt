import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertIterableEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertAll
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class TestUsagePoint {

    @ParameterizedTest
    @CsvSource(
        "0, 0",
        "100, 0",
        "50, 12",
        "5,-12",
        "5,120",
        "5,-20",
        "-5,12",
    )
    fun `test init Point`(x: Int, y: Int) {
        var p = Point(x,y)
        assertAll(
            { assertEquals(x, p.x) },
            { assertEquals(y, p.y) },
            { assertEquals("($x,$y)",p.toString()) }
        )
    }

    @Test
    fun `test init Point = valeur par defaut`() {
        var p = Point()
        assertAll(
            { assertEquals(0, p.x) },
            { assertEquals(0, p.y) },
            { assertEquals("(0,0)",p.toString()) }
        )
    }
}
