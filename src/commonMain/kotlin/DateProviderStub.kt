import kotlinx.datetime.LocalDate

class DateProviderStub : IDateProvider {
    private val todayDate = LocalDate(2022, 5, 22)

    private val sunday = LocalDate(1900, 6, 3 )
    private val monday = LocalDate(1900, 6, 4)
    private val tuesday = LocalDate(1900, 6, 5)
    private val wednesday = LocalDate(1900, 6, 6)
    private val thursday = LocalDate(1900, 6, 7)
    private val friday = LocalDate(1900, 6, 8)
    private val saturday = LocalDate(1900, 6, 9)
    private val daysOfWeekList = listOf(sunday, monday, tuesday, wednesday, thursday, friday, saturday)

    override fun getDaysOfTheWeek(today: LocalDate): List<LocalDate> = daysOfWeekList

    override fun getLastSundayFrom(date: LocalDate): LocalDate = todayDate

    override fun getToday(): LocalDate = todayDate
}