import kotlin.random.Random

interface Exercise1Interface{
    fun isUserAge( ageSelected : Int): Boolean
}

class Exercise1(var userAge: Int) : Exercise1Interface {
    var random = Random

    init {
        if (userAge < 0 ) throw IllegalArgumentException()
    }

    override fun isUserAge(ageSelected : Int): Boolean {
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