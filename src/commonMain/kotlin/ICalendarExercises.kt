interface ICalendarExercises {
    fun isCurrentDayOfMonth(day: Int): Boolean

    fun isCurrentWeek(daysOfWeekList: List<Int>): Boolean

    fun isMonthDuration(daysOfMonthCount: Int): Boolean

    fun isWeekDuration(daysOfWeekCount: Int): Boolean
}