package me.mayaraferreira.moduleTwo.providers

import kotlinx.datetime.LocalDate
import me.mayaraferreira.moduleTwo.model.Month

internal class DateProviderStub : IDateProvider {
    private val todayDate = LocalDate(2022, 5, 22)

    private val sunday = LocalDate(1900, 6, 3)
    private val monday = LocalDate(1900, 6, 4)
    private val tuesday = LocalDate(1900, 6, 5)
    private val wednesday = LocalDate(1900, 6, 6)
    private val thursday = LocalDate(1900, 6, 7)
    private val friday = LocalDate(1900, 6, 8)
    private val saturday = LocalDate(1900, 6, 9)
    private val daysOfWeekList = listOf(sunday, monday, tuesday, wednesday, thursday, friday, saturday)

    override fun getDaysOfCurrentWeek(today: LocalDate): List<LocalDate> = daysOfWeekList

    override fun getLastSundayFrom(date: LocalDate): LocalDate = todayDate

    override fun getToday(): LocalDate = todayDate

    override fun getMonthDuration(month: Int, leapYear: Boolean): Int = 31

    override fun getCurrentYear(): Int = 2022

    override fun getPreviousMonth(): Month = Month.APRIL

    override fun getCurrentMonth(): Month = Month.MAY

    override fun getNextMonth(): Month = Month.JUNE

    override fun getMonthByNumber(month: Int): Month = Month.JANUARY

    override fun getWeekDaysNamePtBr(): List<String> = arrayOf("segunda-feira", "terça-feira", "quarta-feira", "quinta-feira", "sexta-feira", "sabado", "domingo" ).toList()
}