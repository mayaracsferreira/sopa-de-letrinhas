package me.mayaraferreira.moduleOne.providers

import kotlinx.datetime.*

internal class DateProvider : IDateProvider {
    override fun getDaysOfTheWeek(today: LocalDate): List<Int> {
        var i = 0
        val sunday = getLastSundayFrom(today)
        val daysList: MutableList<Int> = mutableListOf()
        while (i < WEEK_DURATION) {
            daysList.add(sunday.plus(i, DateTimeUnit.DAY).dayOfMonth)
            i++
        }
        return daysList
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
        return now.toLocalDateTime(TimeZone.UTC).date
    }

    override fun getMonthDuration(currentDate: LocalDate): Int {
        val nextMonthFirstDay = getNextMonth(currentDate)
        val firstDayMonth = LocalDate(currentDate.year, currentDate.monthNumber, 1 )
        return firstDayMonth.daysUntil(nextMonthFirstDay)
    }

    fun getNextMonth(currentDate: LocalDate): LocalDate {
        if (currentDate.monthNumber == Month.DECEMBER.number)
            return LocalDate(currentDate.year +1, 1, 1 )
        return LocalDate(currentDate.year, currentDate.monthNumber + 1, 1 )
    }

    companion object{
        const val WEEK_DURATION = 7
    }
}