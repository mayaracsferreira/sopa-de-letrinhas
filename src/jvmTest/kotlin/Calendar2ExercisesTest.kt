
import java.time.LocalDateTime
import kotlin.test.BeforeTest
import kotlin.test.Test
import kotlin.test.assertTrue

internal class Calendar2ExercisesTest{
    private lateinit var sut: CalendarExercises

    @BeforeTest
    fun initialize() {
        sut = CalendarExercises()
    }

    @Test
    fun isCurrentDay() {
        // Arrange
        val current = LocalDateTime.now().dayOfMonth

        // Act
        var result = sut.isCurrentDayOfMonth(current)

        // Assert
        assertTrue(result)
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
        // Arrange
        // Act
        // Assert
    }
}