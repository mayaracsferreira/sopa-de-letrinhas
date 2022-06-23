package me.mayaraferreira.moduleTwo.providers

import kotlinx.datetime.LocalDate
import me.mayaraferreira.moduleTwo.model.Month

internal class DateProviderStub : IDateProvider {
    private val todayDate = LocalDate(2022, 5, 22)

    override fun getToday(): LocalDate = todayDate

    override fun getMonthDuration(month: Int, leapYear: Boolean): Int = 31

    override fun getCurrentYear(): Int = 2022

    override fun getPreviousMonth(): Month = Month.APRIL

    override fun getCurrentMonth(): Month = Month.MAY

    override fun getNextMonth(): Month = Month.JUNE

    override fun getMonthByNumber(month: Int): Month = Month.JANUARY

    override fun getWeekDaysNamePtBr(): List<String> = arrayOf("SEGUNDA-FEIRA", "TERÇA-FEIRA", "QUARTA-FEIRA", "QUINTA-FEIRA", "SEXTA-FEIRA", "SABADO", "DOMINGO" ).toList()
}