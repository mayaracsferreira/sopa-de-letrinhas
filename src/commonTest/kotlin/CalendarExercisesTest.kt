import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class CalendarExercisesTest{
    private lateinit var sut: CalendarExercises
    private lateinit var dateProvider: IDateProvider

    @BeforeTest
    fun initialize() {
        dateProvider = DateProviderStub()
        sut = CalendarExercises(dateProvider)
    }

    @Test
    fun isCurrentDayOfMonth() {
        // Act
        val result = sut.isCurrentDayOfMonth(22)
        // Assert
        assertTrue(result)
    }

    @Test
    fun isCurrentWeek() {
        // Arrange
        // Act
        //sut.isCurrentWeek(22)
        // Assert
    }

    @Test
    fun isMonthDuration() {
        // Arrange
        // Act
        // Assert
    }

    @Test
    fun isWeekDuration() {
        // Act
        var result = sut.isWeekDuration(7)

        // Assert
        assertTrue(result)
    }

    @Test
    fun isNotWeekDuration() {
        // Act
        var result = sut.isWeekDuration(9)

        // Assert
        assertFalse(result)
    }
}