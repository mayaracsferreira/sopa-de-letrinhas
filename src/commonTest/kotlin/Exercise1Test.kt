import kotlin.test.*

internal class Exercise1Test {

    @Test
    fun testCtorThrowsOnInvalidUserAge(){
        // Assert
        assertFailsWith<IllegalArgumentException>{ Exercise1(-1) }
    }

    @Test
    fun testIsUserAgeCorrectAge() {
        // Arrange
        val exercise1 = Exercise1(9)

        // Act
        val result = exercise1.isUserAge(9)

        // Assert
        assertTrue(result)
    }

    @Test
    fun testIsUserAgeWrongAge() {
        // Arrange
        val exercise1 = Exercise1(7)

        // Act
        val result = exercise1.isUserAge(9)

        // Assert
        assertFalse { result }
    }

    @Test
    fun testAgesListContainsUserAge() {
        // Arrange
        val exercise1 = Exercise1(5)

        // Assert
        assertContains(exercise1.ages, exercise1.userAge)
    }
}