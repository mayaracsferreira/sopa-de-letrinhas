package me.mayaraferreira

interface ICountingExercises {
    fun isElementSelectedUserAge(numericSet: Set<Int>, ageSelected: Int, userAge: Int): Boolean

    fun completeTheList(numericList: MutableList<Int?>, missingValues: List<Int>): MutableList<Int>

    fun isMaxListElement(numericList: List<Int>, elementSelected: Int): Boolean

    fun startsWithDistinctNumber(numericList: List<Int>, elementsSelected: List<Int>): Boolean

    fun isDistinctDigitsList(numericList: List<Int>, elementsSelected: List<Int>): Boolean

    fun hasKeyMinMapValue(keyValues: Map<String, Int>, keySelected: String): Boolean

    fun hasKeyMaxMapValue(keyValues: Map<String, Int>, keySelected: String): Boolean

    fun isNumbersSortedAsc(numbers: List<Int>): Boolean
}