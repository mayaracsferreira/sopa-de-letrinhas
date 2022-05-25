import kotlinx.datetime.*

class DateProvider : IDateProvider {
    override fun getDaysOfTheWeek(today: LocalDate): MutableList<LocalDate> {
        var i = 0
        val sunday = getLastSundayFrom(today)
        val daysList: MutableList<LocalDate> = mutableListOf()
        while (i <= 8) {
            daysList.add(sunday.plus(i, DateTimeUnit.DAY))
            i++
        }
        return daysList
    }

    override fun getPreviousWeek(today: LocalDate): Pair<LocalDate, LocalDate> {
        val sunday = getLastSundayFrom(today)
        val sundayEarly = sunday.plus(-WEEK_DURATION, DateTimeUnit.DAY)
        return Pair(sundayEarly, sunday)
    }

    override fun getLastSundayFrom(date: LocalDate): LocalDate {
        var sunday = date
        while (sunday.dayOfWeek != DayOfWeek.SUNDAY) {
            sunday = sunday.plus(-1, DateTimeUnit.DAY)
        }
        return sunday
    }

    override fun getToday(): LocalDate {
        val now = Clock.System.now()
        return now.toLocalDateTime(TimeZone.currentSystemDefault()).date
    }

    companion object{
        const val WEEK_DURATION = 7
    }
}