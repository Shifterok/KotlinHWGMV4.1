import org.junit.Assert.assertEquals
import org.junit.Test

class MainKtTest {

    @Test
    fun transferFounds_ifDiscountWork() {
        val amountOfTransaction = 15_000.00
        val paySystem = 2

        val resoult = transferFounds(
            amount = amountOfTransaction,
            whatPaySystem = paySystem,
        )
        assertEquals(14_660.0, resoult,0.01)
    }
}
