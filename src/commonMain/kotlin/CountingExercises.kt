interface CountingExercisesInterface {
    fun isElementSelectedUserAge(numericSet: Set<Int>, ageSelected: Int, userAge: Int): Boolean

    fun completeTheList(numericList: MutableList<Int?>, missingValues: List<Int>): MutableList<Int>

    fun isMaxListElement(numericList: List<Int>, elementSelected: Int): Boolean

    fun startsWithDistinctNumber(numericList: List<Int>, elementsSelected: List<Int>): Boolean

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

    override fun isMaxListElement(numericList: List<Int>, elementSelected: Int): Boolean {
        val maxElement = numericList.maxOf { it }
        return elementSelected == maxElement
    }

    override fun startsWithDistinctNumber(numericList: List<Int>, elementsSelected: List<Int>): Boolean {
        var digitsList = numericList.map { element -> getFirstDigitOfInteger(element) }
        var uniqueFirstDigits = getUniqueValues(digitsList)
        var uniqueValues = numericList.filter { element ->
            uniqueFirstDigits.contains(getFirstDigitOfInteger(element))
        }
        return uniqueValues.equals(elementsSelected)
    }

    override fun distinctDigitsList(numericList: List<Int>, elementsSelected: List<Int>): List<Int> {
        return numericList.filter { element ->
            hasNumberUniqueDigits(element)
        }
    }

    // TODO Exercicios calçados/numero da casa

    private fun getFirstDigitOfInteger(number: Int): Int {
        return number.toString().first().digitToInt()
    }

    private fun getUniqueValues(numbers: List<Int>): Set<Int> {
        return numbers.groupingBy { it }.eachCount().filter { it.value == 1 }.keys
    }

    private fun hasNumberUniqueDigits(number: Int): Boolean {
        val distinctDigits = number.toString().split("").toSet()
        return distinctDigits.size == number.toString().count()
    }
}