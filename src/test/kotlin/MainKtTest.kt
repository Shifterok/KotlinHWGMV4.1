import org.junit.Assert.assertEquals
import org.junit.Test

class MainKtTest {

    @Test
    fun transferFounds(whatPaySystem: Any, amo: Any, finalAmount: Any {
        val amountOfTransaction = 15000
        val amountBeforeDiscInDouble = 15_000.00
        val finalAmount = 14_660.0

        val resoult = transferFounds(
            
            amount = amountOfTransaction,
            finalPriceAtDouble = amountBeforeDiscInDouble,
            amountOfTransaction = finalAmount

        )
        assertEquals(15_000.00, resoult)
    }
}
