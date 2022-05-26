import kotlinx.datetime.LocalDate

class CalendarExercises(private val dateProvider: IDateProvider) : ICalendarExercises {
    override fun isCurrentDayOfMonth(day: Int): Boolean {
        val today = dateProvider.getToday()
        return today.dayOfMonth == day
    }

    override fun isCurrentWeek(daysOfWeekList: List<LocalDate>): Boolean {
        val today = dateProvider.getToday()
        val currentWeeDaysList = dateProvider.getDaysOfTheWeek(today)
        return daysOfWeekList == currentWeeDaysList
    }

    override fun isWeekDuration(daysOfWeekCount: Int): Boolean {
        return daysOfWeekCount == DateProvider.WEEK_DURATION
    }
}