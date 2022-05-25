import kotlinx.datetime.LocalDate

class DateProviderStub : IDateProvider {
    private val todayDate = LocalDate(2022, 5, 22)
    override fun getDaysOfTheWeek(today: LocalDate): MutableList<LocalDate> {
        TODO("Not yet implemented")
    }

    override fun getPreviousWeek(today: LocalDate): Pair<LocalDate, LocalDate> {
        TODO("Not yet implemented")
    }

    override fun getLastSundayFrom(date: LocalDate): LocalDate = todayDate

    override fun getToday(): LocalDate = todayDate
}