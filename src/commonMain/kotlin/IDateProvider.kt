import kotlinx.datetime.LocalDate

interface IDateProvider {

    fun getDaysOfTheWeek(today: LocalDate): MutableList<LocalDate>

    fun getPreviousWeek(today: LocalDate): Pair<LocalDate, LocalDate>

    fun getLastSundayFrom(date: LocalDate): LocalDate

    fun getToday(): LocalDate
}