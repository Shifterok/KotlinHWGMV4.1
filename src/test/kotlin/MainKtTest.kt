import org.junit.Assert.assertEquals
import org.junit.Test

class MainKtTest {
    @Test
    fun transferFounds_correctRoundToRuble() {
        val amountOfTransaction = 15_000.00
        val paySystem = 2

        val resoult = transferFounds(
            amount = amountOfTransaction,
            whatPaySystem = paySystem,
        )
        assertEquals(14_660.01, resoult, 0.1)
    }
    @Test
    fun transferFounds_correctRoundToPenny() {
        val amountOfTransaction = 15_000.00
        val paySystem = 2

        val resoult = transferFounds(
            amount = amountOfTransaction,
            whatPaySystem = paySystem,
        )
        assertEquals(14_660.01, resoult, 0.01)
    }
}
