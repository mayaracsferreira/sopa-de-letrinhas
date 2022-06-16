package me.mayaraferreira.moduleTwo.exercises.calendar

import kotlinx.datetime.DayOfWeek
import kotlinx.datetime.LocalDate
import kotlinx.datetime.isoDayNumber
import me.mayaraferreira.moduleTwo.providers.DateProviderStub
import me.mayaraferreira.moduleTwo.providers.IDateProvider
import kotlin.test.BeforeTest
import kotlin.test.Test
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
    fun IsCurrentMonth(){
        // Arrange
        val montName = "Maio"

        // Act
        val result = sut.IsCurrentMonth(montName)

        // Assert
        assertTrue(result)
    }

    @Test
    fun isPreviousMonthName(){
        // Arrange
        val montName = "Abril"

        // Act
        val result = sut.isPreviousMonthName(montName)

        // Assert
        assertTrue(result)
    }

    @Test
    fun isNextMonthName(){
        // Arrange
        val montName = "Junho"

        // Act
        val result = sut.isNextMonthName(montName)

        // Assert
        assertTrue(result)
    }

    @Test
    fun IsMonthDuration(){
        // Arrange
        val month = 1
        val numberOfDays = 31

        // Act
        val result = sut.IsMonthDuration(month, numberOfDays)

        // Assert
        assertTrue(result)
    }

    @Test
    fun IsMonthNameAndNumber(){
        // Arrange
        val montName = "Janeiro"
        val monthNumber = 1

        // Act
        val result = sut.IsMonthNameAndNumber(montName, monthNumber)

        // Assert
        assertTrue(result)
    }

    @Test
    fun isDaysOfWeekNames(){
        // Arrange
        val list = arrayOf("segunda-feira", "terça-feira", "quarta-feira", "quinta-feira", "sexta-feira", "sabado", "domingo" ).toList()

        // Act
        val result = sut.isDaysOfWeekNames(list)

        // Assert
        assertTrue(result)
    }

    @Test
    fun isDayOfTheWeekFromDate(){
        // Arrange
        val dayOfWeek = DayOfWeek.SUNDAY.isoDayNumber
        val date = LocalDate(2022, 5, 1)

        // Act
        val result = sut.isDayOfTheWeekFromDate(dayOfWeek, date)

        // Assert
        assertTrue(result)
    }
}