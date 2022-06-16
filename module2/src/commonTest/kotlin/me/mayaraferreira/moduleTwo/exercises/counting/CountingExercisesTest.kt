package me.mayaraferreira.moduleTwo.exercises.counting

import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class CountingExercisesTest {
    private lateinit var sut: CountingExercises

    @BeforeTest
    fun initialize() {
        sut = CountingExercises()
    }

    @Test
    fun isSorted(){
        // Arrange
        val sortedList = (1..10).toList()

        // Act
        val result = sut.isSorted(sortedList)

        // Assert
        assertTrue(result)
    }

    @Test
    fun isNotSorted(){
        // Arrange
        val sortedList = (1..10).reversed().toList()

        // Act
        val result = sut.isSorted(sortedList)

        // Assert
        assertFalse(result)
    }

    @Test
    fun allItemsDivisibleBy(){
        // Arrange
        val divider = 2
        val numbers  = arrayOf(2, 4, 6).toList()

        // Act
        val result = sut.allItemsDivisibleBy(numbers, divider)

        // Assert
        assertTrue(result)
    }

    @Test
    fun allItemsDivisibleByReturnsFalse(){
        // Arrange
        val divider = 2
        val numbers  = arrayOf(2, 3, 6).toList()

        // Act
        val result = sut.allItemsDivisibleBy(numbers, divider)

        // Assert
        assertFalse(result)
    }
}