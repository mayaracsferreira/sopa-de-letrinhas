package me.mayaraferreira.moduleOne.exercises.counting

internal class CountingExercises : ICountingExercises {

    override fun isElementSelectedUserAge(numericSet: Set<Int>, ageSelected: Int, userAge: Int): Boolean {
        if (!numericSet.contains(userAge)) throw IllegalArgumentException("Collection must contain user age")
        return ageSelected == userAge
    }

    override fun completeTheList(
        expectedList: List<Int>,
        numericList: MutableList<Int?>,
        actualMissingValues: List<Int>
    ): Boolean {
        // TODO find better exception type
        if (numericList.count { it == null } != actualMissingValues.size) throw NullPointerException("List of items to complete the list must match number of missing values")

        val missingValuesIterator = actualMissingValues.iterator()
        val mergedList: MutableList<Int> =
            numericList.map { element ->
                if (element == null) {
                    return@map missingValuesIterator.next()
                }
                element
            } as MutableList<Int>
        return expectedList == mergedList
    }

    override fun isMaxListElement(numericList: List<Int>, elementSelected: Int): Boolean {
        val maxElement = numericList.maxOf { it }
        return elementSelected == maxElement
    }

    override fun startsWithDistinctNumber(numericList: List<Int>, elementsSelected: List<Int>): Boolean {
        val digitsList = numericList.map { element -> getFirstDigitOfInteger(element) }
        val uniqueFirstDigits = getUniqueValues(digitsList)
        val uniqueValues = numericList.filter { element ->
            uniqueFirstDigits.contains(getFirstDigitOfInteger(element))
        }
        return uniqueValues == elementsSelected
    }

    override fun hasDistinctDigits(element: Int): Boolean {
        val distinctDigits = element.toString().split("").drop(1).dropLast(1).toSet()
        return distinctDigits.size == element.toString().count()
    }

    override fun hasKeyMinMapValue(keyValues: Map<String, Int>, keySelected: String): Boolean {
        return keyValues.values.minOf { it } == keyValues.getValue(keySelected)
    }

    override fun hasKeyMaxMapValue(keyValues: Map<String, Int>, keySelected: String): Boolean {
        return keyValues.values.maxOf { it } == keyValues.getValue(keySelected)
    }

    override fun isNumbersSortedAsc(numbers: List<Int>): Boolean {
        return numbers.sorted() == numbers
    }

    private fun getFirstDigitOfInteger(number: Int): Int {
        return number.toString().first().digitToInt()
    }

    private fun getUniqueValues(numbers: List<Int>): Set<Int> {
        return numbers.groupingBy { it }.eachCount().filter { it.value == 1 }.keys
    }
}