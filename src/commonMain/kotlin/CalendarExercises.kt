import kotlinx.datetime.*

interface CalendarExercisesInterface {
    fun isCurrentDayOfMonth(day: Int): Boolean

    fun isCurrentWeek(daysOfWeekList: List<Int>): Boolean

    fun isMonthDuration(daysOfMonthCount: Int): Boolean

    fun isWeekDuration(daysOfWeekCount: Int): Boolean
}

class CalendarExercises : CalendarExercisesInterface {
    val WEEK_DURATION = 7

    override fun isCurrentDayOfMonth(day: Int): Boolean {
        val now = Clock.System.now()
        val dateNow = now.toLocalDateTime(TimeZone.currentSystemDefault()).date
        return dateNow.dayOfMonth == day
    }

    override fun isCurrentWeek(daysOfWeekList: List<Int>): Boolean {
        val now = Clock.System.now()
        val dateNow = now.toLocalDateTime(TimeZone.currentSystemDefault()).date

        TODO("Not yet implemented")
    }

    override fun isMonthDuration(daysOfMonthCount: Int): Boolean {
        val now = Clock.System.now()
        val dateNow = now.toLocalDateTime(TimeZone.currentSystemDefault()).date
        val month = dateNow.month
        //val a = dateNow.lengthOfMonth()
        TODO("Not yet implemented")
    }

    override fun isWeekDuration(daysOfWeekCount: Int): Boolean {
        return daysOfWeekCount == WEEK_DURATION
    }

    private fun isLeap(year: Int): Boolean {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true
                }
                return false
            }
            return true
        }
        return false
    }

    fun getDaysOftheWeek() {
        TODO("Not yet implemented\"d")
    }

    fun getPreviousWeek(today: LocalDate): Pair<LocalDate, LocalDate> {
        var sunday = getSUnday(today);
        var sundayEarly = sunday.plus(-7, DateTimeUnit.DAY);

        return Pair(sundayEarly, sunday)
    }

    fun getSUnday(date: LocalDate): LocalDate {
        var sunday = date
        while (sunday.dayOfWeek != DayOfWeek.SUNDAY) {
            sunday = sunday.plus(-1, DateTimeUnit.DAY)
        }
        return sunday
    }
}