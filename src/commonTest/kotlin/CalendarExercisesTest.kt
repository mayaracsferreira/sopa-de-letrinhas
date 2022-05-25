
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

internal class CalendarExercisesTest{
    private lateinit var sut: CalendarExercises

    @BeforeTest
    fun initialize() {
        sut = CalendarExercises()
    }

    @Test
    fun isCurrentDay() {
        // Arrange
        // Act
        // Assert
    }

    @Test
    fun isCurrentWeek() {
        // Arrange
        // Act
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