package me.mayaraferreira.moduleTwo.exercises.counting

internal class CountingExercises : ICountingExercises {
    override fun isSorted(numericList: List<Int>): Boolean {
        if (numericList.isEmpty() || numericList.size == 1) {
            return true
        }
        val iter: Iterator<Int> = numericList.iterator()
        var current: Int = iter.next()
        var previous:Int = current
        while (iter.hasNext()) {
            current = iter.next()
            if (previous.compareTo(current) > 0) {
                return false
            }
            previous = current
        }
        return true
    }

    override fun allItemsDivisibleBy(numericList: List<Int>, divider: Int): Boolean {
        for(number in numericList){
            if (number % divider != 0) return false
        }
        return true
    }
}