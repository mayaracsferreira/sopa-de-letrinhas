package me.mayaraferreira.moduleOne.exercises.counting

interface ICountingExercises {
    fun isElementSelectedUserAge(numericSet: Set<Int>, ageSelected: Int, userAge: Int): Boolean

    fun completeTheList(
        expectedList: List<Int>,
        numericList: MutableList<Int?>,
        actualMissingValues: List<Int>
    ): Boolean

    fun isMaxListElement(numericList: List<Int>, elementSelected: Int): Boolean

    fun startsWithDistinctNumber(numericList: List<Int>, elementsSelected: List<Int>): Boolean

    fun isDistinctDigitsList(element: Int): Boolean

    fun hasKeyMinMapValue(keyValues: Map<String, Int>, keySelected: String): Boolean

    fun hasKeyMaxMapValue(keyValues: Map<String, Int>, keySelected: String): Boolean

    fun isNumbersSortedAsc(numbers: List<Int>): Boolean
}