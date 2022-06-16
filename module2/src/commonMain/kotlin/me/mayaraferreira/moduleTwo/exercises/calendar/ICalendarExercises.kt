package me.mayaraferreira.moduleTwo.exercises.calendar

import kotlinx.datetime.LocalDate

interface ICalendarExercises {
    fun IsCurrentMonth(month: String): Boolean

    fun isPreviousMonthName(month: String): Boolean

    fun isNextMonthName(month: String): Boolean

    fun IsMonthDuration(month: Int, numberOfDays: Int, leapYear: Boolean = false): Boolean

    fun IsMonthNameAndNumber(monthName: String, monthNumber: Int): Boolean

    fun isDaysOfWeekNames(daysOfWeek: List<String>): Boolean

    fun isDayOfTheWeekFromDate(dayOfWeek: Int, date: LocalDate): Boolean
}