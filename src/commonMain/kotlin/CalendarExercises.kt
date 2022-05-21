interface CalendarExercisesInterface {
    fun isCurrentDayOfMonth(day : Int): Boolean

    fun isCurrentWeek(daysOfWeekList: List<Int>): Boolean

    fun isMonthDuration(daysOfMonthCount: Int): Boolean

    fun isWeekDuration(daysOfWeekCount: Int): Boolean
}

class CalendarExercises : CalendarExercisesInterface {
    override fun isCurrentDayOfMonth(day: Int): Boolean {
        //return day == LocalDateTime.now().dayOfMonth
        // TODO find multiplatform datetime library
        TODO("Not yet implemented")
    }

    override fun isCurrentWeek(daysOfWeekList: List<Int>): Boolean {
        TODO("Not yet implemented")
    }

    override fun isMonthDuration(daysOfMonthCount: Int): Boolean {
        TODO("Not yet implemented")
    }

    override fun isWeekDuration(daysOfWeekCount: Int): Boolean {
        TODO("Not yet implemented")
    }
}