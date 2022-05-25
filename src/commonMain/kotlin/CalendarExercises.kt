class CalendarExercises(private val dateProvider: IDateProvider) : ICalendarExercises {
    override fun isCurrentDayOfMonth(day: Int): Boolean {
        val today = dateProvider.getToday()
        return today.dayOfMonth == day
    }

    override fun isCurrentWeek(daysOfWeekList: List<Int>): Boolean {
        val today = dateProvider.getToday()
        val currentWeeDaysList = dateProvider.getDaysOfTheWeek(today)
        return daysOfWeekList.equals(currentWeeDaysList)
    }

    override fun isMonthDuration(daysOfMonthCount: Int): Boolean {
        val today = dateProvider.getToday()
        //val month = today.month
        //val a = dateNow.lengthOfMonth()
        TODO("Not yet implemented")
    }

    override fun isWeekDuration(daysOfWeekCount: Int): Boolean {
        return daysOfWeekCount == DateProvider.WEEK_DURATION
    }
}