package me.mayaraferreira.moduleTwo.exercises.calendar

import kotlinx.datetime.LocalDate
import kotlinx.datetime.isoDayNumber
import me.mayaraferreira.moduleTwo.model.number
import me.mayaraferreira.moduleTwo.providers.IDateProvider

internal class CalendarExercises(private val dateProvider: IDateProvider) : ICalendarExercises {
    override fun IsCurrentMonth(month: String): Boolean {
        val currentMonth = dateProvider.getCurrentMonth()
        return month.uppercase() == currentMonth.ptBrName
    }

    override fun isPreviousMonthName(month: String): Boolean {
        val previousMonth = dateProvider.getPreviousMonth()
        return month.uppercase() == previousMonth.ptBrName
    }

    override fun isNextMonthName(month: String): Boolean {
        val nextMonth = dateProvider.getNextMonth()
        return month.uppercase() == nextMonth.ptBrName
    }

    override fun IsMonthDuration(month: Int, numberOfDays: Int, leapYear: Boolean): Boolean {
        return numberOfDays == dateProvider.getMonthDuration(month, leapYear)
    }

    override fun IsMonthNameAndNumber(monthName: String, monthNumber: Int): Boolean {
        val month = dateProvider.getMonthByNumber(monthNumber)
        return month.ptBrName == monthName.uppercase() && month.number == monthNumber
    }

    override fun isDaysOfWeekNames(daysOfWeek: List<String>): Boolean {
        val dayOfWeekNames = dateProvider.getWeekDaysNamePtBr()
        val daysOfWeekUppercase = daysOfWeek.map { it.uppercase() }
        return daysOfWeekUppercase == dayOfWeekNames
    }

    override fun isDayOfTheWeekFromDate(dayOfWeek: Int, date: LocalDate): Boolean {
        return date.dayOfWeek.isoDayNumber == dayOfWeek
    }
}