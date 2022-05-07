import kotlin.test.Test
import kotlin.test.assertContains

internal class Exercise2Test {

    @Test
    fun testRandomListHasNull(){
        // Arrange
        val exercise2  = Exercise2()

        // Act
        var result = exercise2.getRandomNullList()

        // Assert
        assertContains(result, null)
    }
}