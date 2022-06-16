package me.mayaraferreira.moduleOne

import me.mayaraferreira.moduleOne.exercises.calendar.CalendarExercises
import me.mayaraferreira.moduleOne.exercises.calendar.ICalendarExercises
import me.mayaraferreira.moduleOne.exercises.counting.CountingExercises
import me.mayaraferreira.moduleOne.exercises.counting.ICountingExercises
import me.mayaraferreira.moduleOne.providers.DateProvider
import me.mayaraferreira.moduleOne.providers.IDateProvider

object ModuleOneFactory{
    fun createCalendarExercises(): ICalendarExercises {
        val dateProvider: IDateProvider = DateProvider()
        return CalendarExercises(dateProvider)
    }

    fun createCountingExercises(): ICountingExercises {
        return CountingExercises()
    }
}