package me.mayaraferreira.moduleOne.exercises.counting

import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertFailsWith
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class CountingExercisesTest {
    private lateinit var sut: CountingExercises

    @BeforeTest
    fun initialize() {
        sut = CountingExercises()
    }

    @Test
    fun selectUserAgeFromList() {
        // Arrange
        val numbers = (1..10).toSet()
        val userAge = 9
        val valueSelected = 9

        // Act
        val result = sut.isElementSelectedUserAge(numbers, valueSelected, userAge)

        // Assert
        assertTrue(result)
    }

    @Test
    fun selectUserAgeFromListWrongValue() {
        // Arrange
        val numbers = (1..10).toSet()
        val userAge = 9
        val valueSelected = 7

        // Act
        val result = sut.isElementSelectedUserAge(numbers, valueSelected, userAge)

        // Assert
        assertFalse(result)
    }

    @Test
    fun selectUserAgeFromListThrowsWhenSetNotContainsUserAge() {
        // Arrange
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
        val numbers = listOf(1, 2, null, 4, 5, null, null, 8, 9, 10).toMutableList()
        val missingNumbers = listOf(3, 6, 7)
        val expected = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

        // Act
        val result = sut.completeTheList(expected, numbers, missingNumbers)

        // Assert
        assertTrue(result)
    }

    @Test
    fun completeTheListThrowsOnMismatchedInputsSize() {
        // Arrange
        val numbers = listOf(1, 2, null, 4, 5, null, null, 8, 9, 10).toMutableList()
        val missingNumbers = listOf(3, 6)

        // Assert
        assertFailsWith<Exception> {
            sut.completeTheList(listOf(), numbers, missingNumbers)
        }
    }

    @Test
    fun isMaxListElement() {
        // Arrange
        val numbers = (1..10).toList()
        val valueSelected = 10

        // Act
        val result = sut.isMaxListElement(numbers, valueSelected)

        // Assert
        assertTrue(result)
    }

    @Test
    fun startsWithDistinctNumber() {
        // Arrange
        val element1 = 123
        val element2 = 231
        val element3 = 132
        val numbers = listOf(element1, element2, element3)
        val selected = listOf(element2)

        // Act
        val result = sut.startsWithDistinctNumber(numbers, selected)

        // Assert
        assertTrue(result)
    }

    @Test
    fun distinctDigitsList() {
        // Arrange
        val element = 321

        // Act
        val result = sut.isDistinctDigitsList(element)

        // Assert
        assertTrue(result)
    }

    @Test
    fun distinctDigitsListFalse() {
        // Arrange
        val element = 122

        // Act
        val result = sut.isDistinctDigitsList(element)

        // Assert
        assertFalse(result)
    }

    @Test
    fun hasKeyMinMapValue() {
        // Arrange
        val keyValues = mapOf("Estela" to 36, "Marcelo" to 38, "Nina" to 28)

        // Act
        val result = sut.hasKeyMinMapValue(keyValues, "Nina")

        // Assert
        assertTrue(result)
    }

    @Test
    fun hasKeyMinMapValueFalse() {
        // Arrange
        val keyValues = mapOf("Estela" to 36, "Marcelo" to 38, "Nina" to 28)

        // Act
        val result = sut.hasKeyMinMapValue(keyValues, "Estela")

        // Assert
        assertFalse(result)
    }

    @Test
    fun hasKeyMaxMapValue() {
        // Arrange
        val keyValues = mapOf("Estela" to 36, "Marcelo" to 38, "Nina" to 28)

        // Act
        val result = sut.hasKeyMaxMapValue(keyValues, "Marcelo")

        // Assert
        assertTrue(result)
    }

    @Test
    fun hasKeyMaxMapValueFalse() {
        // Arrange
        val keyValues = mapOf("Estela" to 36, "Marcelo" to 38, "Nina" to 28)

        // Act
        val result = sut.hasKeyMaxMapValue(keyValues, "Nina")

        // Assert
        assertFalse(result)
    }

    @Test
    fun isNumbersSortedAsc() {
        // Arrange
        val numbers = (1..10).toList()

        // Act
        val result = sut.isNumbersSortedAsc(numbers)

        // Assert
        assertTrue(result)
    }
}