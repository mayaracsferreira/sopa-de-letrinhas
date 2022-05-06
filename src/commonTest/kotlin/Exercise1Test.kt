import kotlin.test.*

internal class Exercise1Test {

    @Test
    fun testIsUserAgeCorrectAge() {
        // Arrange
        val exercise1 = Exercise1()
        exercise1.userAge = 9;

        // Act
        val result = exercise1.IsUserAge(9)

        // Assert
        assertTrue(result)
    }

    @Test
    fun testIsUserAgeWrongAge() {
        // Arrange
        val exercise1 = Exercise1()
        exercise1.userAge = 7;

        // Act
        val result = exercise1.IsUserAge(9)

        // Assert
        assertFalse { result }
    }

    @Test
    fun testAgesListContainsUserAge() {
        // Arrange
        val exercise1 = Exercise1()

        // Assert
        //assertThat(exercise1.ages)
        //    .containsKey(exercise1.userAge)
    }
}