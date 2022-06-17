package me.mayaraferreira.moduleTwo.exercises.counting

interface ICountingExercises {
    fun isSorted(numericList:  List<Int>): Boolean

    fun allItemsDivisibleBy(numericList: List<Int>, divider: Int ): Boolean
}
