package me.mayaraferreira.moduleOne.exercises.calendar
import kotlinx.datetime.LocalDate

interface ICalendarExercises {
    fun isCurrentDayOfMonth(day: Int): Boolean

    fun isCurrentWeek(daysOfWeekList: List<LocalDate>): Boolean

    fun isWeekDuration(daysOfWeekCount: Int): Boolean
}