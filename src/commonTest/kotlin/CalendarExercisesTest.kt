
import kotlinx.datetime.*
import kotlin.test.BeforeTest
import kotlin.test.Test

internal class CalendarExercisesTest{
    private lateinit var sut: CalendarExercises

    @BeforeTest
    fun initialize() {
        sut = CalendarExercises()
    }

    @Test
    fun isCurrentDay() {
        // Arrange
        //mockkStatic(Clock::class)
        val now = Clock.System.now()
        var dateNow = now.toLocalDateTime(TimeZone.currentSystemDefault()).date
        val dayOfMonth = dateNow.dayOfMonth


        while (dateNow.dayOfWeek != DayOfWeek.SUNDAY){
            dateNow = dateNow.plus(-1, DateTimeUnit.DAY)
        }
       var b = dateNow

        // Act
        //sut.isCurrentDay(current)
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
        // Arrange
        // Act
        // Assert
    }
}