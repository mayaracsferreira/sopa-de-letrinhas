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
        var today = getToday()
        return today.dayOfMonth == day
    }

    override fun isCurrentWeek(daysOfWeekList: List<Int>): Boolean {
        var today = getToday()
        var currentWeeDaysList = getDaysOftheWeek(today)
        return daysOfWeekList.equals(currentWeeDaysList)
    }

    override fun isMonthDuration(daysOfMonthCount: Int): Boolean {
        var today = getToday()
        val month = today.month
        //val a = dateNow.lengthOfMonth()
        TODO("Not yet implemented")
    }

    override fun isWeekDuration(daysOfWeekCount: Int): Boolean {
        return daysOfWeekCount == WEEK_DURATION
    }

    fun getDaysOftheWeek(today: LocalDate): MutableList<LocalDate> {
        var i = 0
        var sunday = getSUnday(today)
        var daysList: MutableList<LocalDate> = mutableListOf()
        while (i <= 8) {
            daysList.add(sunday.plus(i, DateTimeUnit.DAY))
            i++
        }
        return daysList
    }

    fun getPreviousWeek(today: LocalDate): Pair<LocalDate, LocalDate> {
        var sunday = getSUnday(today)
        var sundayEarly = sunday.plus(-WEEK_DURATION, DateTimeUnit.DAY)
        return Pair(sundayEarly, sunday)
    }

    fun getSUnday(date: LocalDate): LocalDate {
        var sunday = date
        while (sunday.dayOfWeek != DayOfWeek.SUNDAY) {
            sunday = sunday.plus(-1, DateTimeUnit.DAY)
        }
        return sunday
    }

    // TODO stub
    fun getToday(): LocalDate {
        val now = Clock.System.now()
        return now.toLocalDateTime(TimeZone.currentSystemDefault()).date
    }
}