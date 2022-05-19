interface CountingExercisesInterface {
    fun isElementSelectedUserAge(numericSet: Set<Int>, ageSelected: Int, userAge: Int): Boolean

    fun completeTheList(numericList: MutableList<Int?>, missingValues: List<Int>): MutableList<Int>

    fun isMaxListElement(numericList: List<Int>, elementSelected: Int): Boolean

    fun startsWithDistinctNumber(numericList: List<Int>, elementsSelected: List<Int>): List<Int>

    fun distinctDigitsList(numericList: List<Int>, elementsSelected: List<Int>): List<Int>
}

class CountingExercises : CountingExercisesInterface {

    override fun isElementSelectedUserAge(numericSet: Set<Int>, ageSelected: Int, userAge: Int): Boolean {
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

    override fun isMaxListElement(numericList: List<Int>, elementSelected: Int) : Boolean{
        val maxElement = numericList.maxOf { it }
        return elementSelected == maxElement
    }

    // TODO Implement tests
    override fun startsWithDistinctNumber(numericList: List<Int>, elementsSelected: List<Int>): List<Int> {
        TODO("Not yet implemented")
    }

    // TODO Implement tests
    override fun distinctDigitsList(numericList: List<Int>, elementsSelected: List<Int>): List<Int> {
        TODO("Not yet implemented")
    }

    // TODO Exercicios calçados/numero da casa


}