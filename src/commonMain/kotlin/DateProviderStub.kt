import kotlinx.datetime.LocalDate
import kotlinx.datetime.Month

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

    override fun getMonthDuration(currentDate: LocalDate): Int {
        val monthDuration = when(currentDate.month){
            Month.JANUARY -> 31
            Month.FEBRUARY -> 28
            Month.MARCH -> 31
            Month.APRIL -> 30
            Month.MAY -> 31
            Month.JUNE -> 30
            Month.JULY -> 31
            Month.AUGUST -> 31
            Month.SEPTEMBER -> 30
            Month.OCTOBER -> 31
            Month.NOVEMBER -> 30
            Month.DECEMBER -> 31
            else -> 0
        }
        return monthDuration
    }
}