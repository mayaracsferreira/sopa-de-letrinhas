interface CountingExercisesInterface {
    fun selectUserAgeFromList(numericSet: Set<Int>, ageSelected: Int, userAge: Int): Boolean

    fun completeTheList(numericList: MutableList<Int?>, missingValues: List<Int>): MutableList<Int>
}

class CountingExercises : CountingExercisesInterface {

    override fun selectUserAgeFromList(numericSet: Set<Int>, ageSelected: Int, userAge: Int): Boolean {
        if (!numericSet.contains(userAge)) throw IllegalArgumentException("Collection must contain user age")
        return ageSelected == userAge
    }

    override fun completeTheList(numericList: MutableList<Int?>, missingValues: List<Int>): MutableList<Int> {
        // TODO find better exception type
        if (numericList.count { it == null } != missingValues.size) throw Exception("List of items to complete the list must match number of missing values")

        val missingValuesIterator = missingValues.iterator()
        var mergedList: MutableList<Int> =
            numericList.map { element ->
                if (element == null) {
                    return@map missingValuesIterator.next()
                }
                element
            } as MutableList<Int>
        return mergedList
    }
}