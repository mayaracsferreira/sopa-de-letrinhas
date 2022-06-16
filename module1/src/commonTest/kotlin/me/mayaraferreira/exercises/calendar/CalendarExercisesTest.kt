package me.mayaraferreira.exercises.calendar

import kotlinx.datetime.LocalDate
import me.mayaraferreira.moduleOne.exercises.calendar.CalendarExercises
import me.mayaraferreira.moduleOne.providers.IDateProvider
import me.mayaraferreira.providers.DateProviderStub
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
        val sunday = LocalDate(1900, 6, 3 )
        val monday = LocalDate(1900, 6, 4)
        val tuesday = LocalDate(1900, 6, 5)
        val wednesday = LocalDate(1900, 6, 6)
        val thursday = LocalDate(1900, 6, 7)
        val friday = LocalDate(1900, 6, 8)
        val saturday = LocalDate(1900, 6, 9)
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
