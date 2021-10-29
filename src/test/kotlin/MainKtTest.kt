import junit.framework.Assert.assertEquals
import org.junit.Test

class MainKtTest {

    @Test
    fun transferFounds_areVkPay() {
        //arrange
        val selectPaySystem = 5
        val money = 10_000

        val resoult = transferFounds(
            whatPaySystem = selectPaySystem,
            amount = money,
        )
        //assert
        assertEquals(10_000, resoult )
    }
}