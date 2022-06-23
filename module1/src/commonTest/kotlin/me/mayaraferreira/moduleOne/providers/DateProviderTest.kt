package me.mayaraferreira.moduleOne.providers

import kotlinx.datetime.LocalDate
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertContentEquals
import kotlin.test.assertEquals

class DateProviderTest {
    private lateinit var sut: IDateProvider

    @BeforeTest
    fun initialize() {
        sut = DateProvider()
    }

    @Test
    fun getDaysOfTheWeek() {
        // Arrange
        val today =
            ClockMock.System.now().toLocalDateTime(TimeZone.UTC).date // "2022-06-01" wednesday
        val expected = listOf<Int>(29, 30, 31, 1, 2, 3, 4)

        // Act
        val result = sut.getDaysOfTheWeek(today)

        //Assert
        assertEquals(DateProvider.WEEK_DURATION, result.size)
        assertContentEquals(expected, result)
    }

    @Test
    fun getLastSundayFrom() {
        // Arrange
        val today =
            ClockMock.System.now().toLocalDateTime(TimeZone.UTC).date // "2022-06-01" wednesday
        val expected = LocalDate(2022, 5, 29)

        // Act
        val result = sut.getLastSundayFrom(today)

        // Assert
        assertEquals(expected, result)
    }

    @Test
    fun getMonthDuration() {
        // Arrange
        val monthToDuration = listOf(
            LocalDate(2022, 1, 1) to 31,
            LocalDate(2022, 2, 1) to 28,
            LocalDate(2022, 3, 1) to 31,
            LocalDate(2022, 4, 1) to 30,
            LocalDate(2022, 5, 1) to 31,
            LocalDate(2022, 6, 1) to 30,
            LocalDate(2022, 7, 1) to 31,
            LocalDate(2022, 8, 1) to 31,
            LocalDate(2022, 9, 1) to 30,
            LocalDate(2022, 10, 1) to 31,
            LocalDate(2022, 11, 1) to 30,
            LocalDate(2022, 12, 1) to 31,
            //leap year
            LocalDate(2020, 2, 1) to 29
        )

        // Act/Assert
        monthToDuration.forEach { (key, value) ->
            val result = sut.getMonthDuration(key)
            assertEquals(result, value)
        }
    }
}