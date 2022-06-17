package me.mayaraferreira.moduleTwo.providers

import kotlinx.datetime.Clock
import kotlinx.datetime.DateTimeUnit
import kotlinx.datetime.DayOfWeek
import kotlinx.datetime.LocalDate
import kotlinx.datetime.TimeZone
import kotlinx.datetime.number
import kotlinx.datetime.plus
import kotlinx.datetime.toLocalDateTime
import me.mayaraferreira.moduleTwo.model.Month
import me.mayaraferreira.moduleTwo.model.number
import me.mayaraferreira.moduleTwo.model.DayOfWeek as DayOfWeekEnum

internal class DateProvider : IDateProvider {
    override fun getDaysOfCurrentWeek(today: LocalDate): List<LocalDate> {
        var i = 0
        val sunday = getLastSundayFrom(today)
        val daysList: MutableList<LocalDate> = mutableListOf()
        while (i <= WEEK_DURATION) {
            daysList.add(sunday.plus(i, DateTimeUnit.DAY))
            i++
        }
        return daysList
    }

    override fun getLastSundayFrom(date: LocalDate): LocalDate {
        val today = date
        var sunday = today
        while (today.dayOfWeek != DayOfWeek.SUNDAY) {
            sunday = today.plus(-1, DateTimeUnit.DAY)
        }
        return sunday
    }

    override fun getToday(): LocalDate {
        val now = Clock.System.now()
        return now.toLocalDateTime(TimeZone.currentSystemDefault()).date
    }

    override fun getCurrentYear(): Int {
        val now = Clock.System.now()
        return now.toLocalDateTime(TimeZone.currentSystemDefault()).date.year
    }

    override fun getMonthDuration(month: Int, leapYear: Boolean): Int {
        return Month.month(month).lenth(leapYear)
    }

    override fun getCurrentMonth(): Month {
        val today = getToday()
        return Month.month(today.month.number)
    }

    override fun getNextMonth(): Month {
        val currentMonth = getCurrentMonth()
        return Month.month(currentMonth.number).next()
    }

    override fun getPreviousMonth(): Month {
        val currentMonth = getCurrentMonth()
        return Month.month(currentMonth.number).previous()
    }

    override fun getMonthByNumber(month: Int): Month{
        return Month.month(month)
    }

    override fun getWeekDaysNamePtBr(): List<String>{
        return DayOfWeekEnum.values().map { element ->
            element.toString()
        }
    }

    companion object {
        const val WEEK_DURATION = 7
    }
}