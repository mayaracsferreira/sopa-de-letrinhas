package me.mayaraferreira.moduleOne.providers

import kotlinx.datetime.Clock
import kotlinx.datetime.Instant
import kotlinx.datetime.LocalDate
import kotlinx.datetime.TimeZone
import kotlinx.datetime.atStartOfDayIn

class ClockMock : Clock {
    override fun now(): Instant {
        return System.now()
    }

    object System : Clock {
        override fun now(): Instant {
            return mockedNow()
        }
        private fun mockedNow(): Instant {
            val date: LocalDate = LocalDate.parse("2022-06-01")
            return date.atStartOfDayIn(TimeZone.UTC)
        }
    }
}