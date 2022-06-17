package me.mayaraferreira.moduleTwo.providers

import kotlinx.datetime.LocalDate
import me.mayaraferreira.moduleTwo.model.Month

internal interface IDateProvider {

    fun getDaysOfCurrentWeek(today: LocalDate): List<LocalDate>

    fun getLastSundayFrom(date: LocalDate): LocalDate

    fun getToday(): LocalDate

    fun getMonthDuration(month: Int, leapYear: Boolean= false): Int

    fun getCurrentYear(): Int

    fun getCurrentMonth(): Month

    fun getNextMonth(): Month

    fun getPreviousMonth(): Month

    fun getMonthByNumber(month: Int): Month

    fun getWeekDaysNamePtBr(): List<String>
}