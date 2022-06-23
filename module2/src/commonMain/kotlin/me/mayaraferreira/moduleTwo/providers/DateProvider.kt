package me.mayaraferreira.moduleTwo.providers

import kotlinx.datetime.Clock
import kotlinx.datetime.LocalDate
import kotlinx.datetime.TimeZone
import kotlinx.datetime.number
import kotlinx.datetime.toLocalDateTime
import me.mayaraferreira.moduleTwo.model.Month
import me.mayaraferreira.moduleTwo.model.number
import me.mayaraferreira.moduleTwo.model.DayOfWeek as DayOfWeekEnum

internal class DateProvider : IDateProvider {
    override fun getToday(): LocalDate {
        val now = Clock.System.now()
        return now.toLocalDateTime(TimeZone.UTC).date
    }

    override fun getMonthDuration(month: Int, leapYear: Boolean): Int {
        return Month.month(month).lenth(leapYear)
    }

    override fun getCurrentYear(): Int {
        val now = Clock.System.now()
        return now.toLocalDateTime(TimeZone.UTC).date.year
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

    override fun getMonthByNumber(month: Int): Month {
        return Month.month(month)
    }

    override fun getWeekDaysNamePtBr(): List<String> {
        return DayOfWeekEnum.values().map { element ->
            element.toString()
        }
    }
}