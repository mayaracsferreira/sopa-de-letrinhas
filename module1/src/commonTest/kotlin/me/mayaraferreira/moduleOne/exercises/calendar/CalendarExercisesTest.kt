package me.mayaraferreira.moduleOne.exercises.calendar

import me.mayaraferreira.moduleOne.providers.IDateProvider
import me.mayaraferreira.moduleOne.providers.DateProviderStub
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class CalendarExercisesTest{
    private lateinit var sut: CalendarExercises
    private lateinit var dateProvider: IDateProvider

    @BeforeTest
    fun initialize() {
        dateProvider = DateProviderStub()
        sut = CalendarExercises(dateProvider)
    }

    @Test
    fun isCurrentDayOfMonth() {
        // Act
        val result = sut.isCurrentDayOfMonth(22)

        // Assert
        assertTrue(result)
    }

    @Test
    fun isCurrentWeek() {
        // Arrange
        val sunday = 3
        val monday = 4
        val tuesday = 5
        val wednesday = 6
        val thursday = 7
        val friday = 8
        val saturday = 9
        val daysOfWeekList = listOf(sunday, monday, tuesday, wednesday, thursday, friday, saturday)

        // Act
        val result = sut.isCurrentWeek(daysOfWeekList)

        // Assert
        assertTrue(result)
    }

    @Test
    fun isWeekDuration() {
        // Act
        val result = sut.isWeekDuration(7)

        // Assert
        assertTrue(result)
    }

    @Test
    fun isNotWeekDuration() {
        // Act
        val result = sut.isWeekDuration(9)

        // Assert
        assertFalse(result)
    }
}
