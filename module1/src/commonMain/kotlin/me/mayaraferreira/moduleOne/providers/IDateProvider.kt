package me.mayaraferreira.moduleOne.providers

import kotlinx.datetime.LocalDate

internal interface IDateProvider {

    fun getDaysOfTheWeek(today: LocalDate): List<LocalDate>

    fun getLastSundayFrom(date: LocalDate): LocalDate

    fun getToday(): LocalDate

    fun  getMonthDuration(currentDate: LocalDate): Int
}