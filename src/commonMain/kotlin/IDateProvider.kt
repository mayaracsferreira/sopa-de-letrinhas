import kotlinx.datetime.LocalDate

interface IDateProvider {

    fun getDaysOfTheWeek(today: LocalDate): List<LocalDate>

    fun getLastSundayFrom(date: LocalDate): LocalDate

    fun getToday(): LocalDate
}