package me.mayaraferreira.moduleTwo.providers

import kotlinx.datetime.LocalDate
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
            LocalDate(2022, 12, 1) to 31
        )

        // Act/Assert
        monthToDuration.forEach { (key, value) ->
            val result = sut.getMonthDuration(key.monthNumber)
            assertEquals(result, value)
        }
    }

    @Test
    fun getMonthLeapDuration() {
        // Arrange
        val leapFebruary = LocalDate(2020, 2, 1)
        val expected = 29

        // Act
        val result = sut.getMonthDuration(leapFebruary.monthNumber, true)

        // Assert
        assertEquals(result, expected)
    }

    @Test
    fun getMonthByNumber() {
        // Arrange
        val months = listOf(
            1 to "JANEIRO",
            2 to "FEVEREIRO",
            3 to "MARÇO",
            4 to "ABRIL",
            5 to "MAIO",
            6 to "JUNHO",
            7 to "JULHO",
            8 to "AGOSTO",
            9 to "SETEMBRO",
            10 to "OUTUBRO",
            11 to "NOVEMBRO",
            12 to "DEZEMBRO"
        )

        // Act/Assert
        months.forEach { (key, value) ->
            val result = sut.getMonthByNumber(key)
            assertEquals(result.ptBrName, value)
        }
    }

    @Test
    fun getWeekDaysNamePtBr() {
        // Arrange
        val expected = listOf(
            "SEGUNDA-FEIRA",
            "TERÇA-FEIRA",
            "QUARTA-FEIRA",
            "QUINTA-FEIRA",
            "SEXTA-FEIRA",
            "SABADO",
            "DOMINGO"
        )

        // Act
        val result = sut.getWeekDaysNamePtBr()

        // Assert
        assertContentEquals(expected, result)
    }
}