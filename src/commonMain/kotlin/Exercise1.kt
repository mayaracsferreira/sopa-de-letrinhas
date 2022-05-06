import kotlin.random.Random
/**
 *
 */
class Exercise1 {
    var random = Random
    var userAge = 9

    fun IsUserAge( ageSelected : Int): Boolean {
        return ageSelected == userAge
    }

    /**
     * List of ages.
     * Generates a list with unique int values including the user age
     */
    val ages: MutableSet<Int>
        get() {
            var agesSet : MutableSet<Int> = arrayOf(userAge).toMutableSet()
            while (agesSet.size < 5) {
                val item = (6..100).random()
                agesSet.add(item)
            }
            return agesSet
        }
}