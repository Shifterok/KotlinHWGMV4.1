import org.junit.Assert.assertEquals
import org.junit.Test

class MainKtTest {

    @Test
    fun transferFounds(whatPaySystem: Int, amo: Int, finalAmount: Double) {
        val paySystem = 1
        val amount = 15_000
        val amountOfTransaction = 14_660.0

        val resoult = transferFounds(
            whatPaySystem = paySystem,
            amo = amount,
            finalAmount = amountOfTransaction
        )
        assertEquals(15000,resoult)
    }
}
