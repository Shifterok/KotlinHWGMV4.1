import junit.framework.Assert.assertEquals
import org.junit.Test

// Если честно вообще не понял что происходит и что не так... в лекции как то разбор идет
//с большим количеством перменных Интов и тп., а у меня по сути метод Воидовый, который ничего не возвращает, и как для него
//написать какой то тест вообще не понял, в инете инфы на русском очень мало, прям совсем, буду рал если подскажите как хоть
//под эту программу какой то тест написать
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