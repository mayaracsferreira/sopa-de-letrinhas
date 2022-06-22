package me.mayaraferreira.moduleOne.exercises.calendar

interface ICalendarExercises {
    fun isCurrentDayOfMonth(day: Int): Boolean

    fun isCurrentWeek(daysOfWeekList: List<Int>): Boolean

    fun isWeekDuration(daysOfWeekCount: Int): Boolean
}