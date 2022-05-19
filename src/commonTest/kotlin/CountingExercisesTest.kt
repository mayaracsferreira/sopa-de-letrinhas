import kotlin.test.*

internal class CountingExercisesTest {

    @Test
    fun selectUserAgeFromList() {
        // Arrange
        val sut = CountingExercises()
        val numbers = (1..10).toSet()
        val userAge = 9
        val valueSelected = 9

        // Act
        var result = sut.isElementSelectedUserAge(numbers, valueSelected, userAge)

        // Assert
        assertTrue(result)
    }

    @Test
    fun selectUserAgeFromListWrongValue() {
        // Arrange
        val sut = CountingExercises()
        val numbers = (1..10).toSet()
        val userAge = 9
        val valueSelected = 7

        // Act
        var result = sut.isElementSelectedUserAge(numbers, valueSelected, userAge)

        // Assert
        assertFalse(result)
    }

    @Test
    fun selectUserAgeFromListThrowsWhenSetNotContainsUserAge() {
        // Arrange
        val sut = CountingExercises()
        val numbers = (1..10).toSet()
        val userAge = 11
        val valueSelected = 9

        // Assert
        assertFailsWith<IllegalArgumentException> {
            sut.isElementSelectedUserAge(numbers, valueSelected, userAge)
        }
    }

    @Test
    fun completeTheList() {
        // Arrange
        val sut = CountingExercises()
        val numbers = listOf(1, 2, null, 4, 5, null, null, 8, 9, 10).toMutableList()
        val missingNumbers = listOf(3, 6, 7)
        val expected = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).toMutableList()

        // Act
        var result = sut.completeTheList(numbers, missingNumbers)

        // Assert
        assertContentEquals(expected, result)
    }

    @Test
    fun completeTheListThrowsOnMismatchedInputsSize() {
        // Arrange
        val sut = CountingExercises()
        val numbers = listOf(1, 2, null, 4, 5, null, null, 8, 9, 10).toMutableList()
        val missingNumbers = listOf(3, 6)

        // Assert
        assertFailsWith<Exception> {
            sut.completeTheList(numbers, missingNumbers)
        }
    }
}