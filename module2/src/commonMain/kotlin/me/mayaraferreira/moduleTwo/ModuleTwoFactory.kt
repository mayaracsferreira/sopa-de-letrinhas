package me.mayaraferreira.moduleTwo

import me.mayaraferreira.moduleTwo.exercises.calendar.CalendarExercises
import me.mayaraferreira.moduleTwo.exercises.calendar.ICalendarExercises
import me.mayaraferreira.moduleTwo.exercises.counting.CountingExercises
import me.mayaraferreira.moduleTwo.exercises.counting.ICountingExercises
import me.mayaraferreira.moduleTwo.providers.DateProvider
import me.mayaraferreira.moduleTwo.providers.IDateProvider

object ModuleTwoFactory{
    fun createCalendarExercises(): ICalendarExercises {
        val dateProvider: IDateProvider = DateProvider()
        return CalendarExercises(dateProvider)
    }

    fun createCountingExercises(): ICountingExercises {
        return CountingExercises()
    }
}