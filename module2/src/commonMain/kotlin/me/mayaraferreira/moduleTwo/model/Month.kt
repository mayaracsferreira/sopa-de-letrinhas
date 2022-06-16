package me.mayaraferreira.moduleTwo.model

internal enum class Month(val ptBrName: String) {
    JANUARY("JANEIRO"),
    FEBRUARY("FEVEREIRO"),
    MARCH("MARÇO"),
    APRIL("ABRIL"),
    MAY("MAIO"),
    JUNE("JUNHO"),
    JULY("JULHO"),
    AUGUST("AGOSTO"),
    SEPTEMBER("SETEMBRO"),
    OCTOBER("OUTUBRO"),
    NOVEMBER("NOVEMBRO"),
    DECEMBER("DEZEMBRO");

    fun next(): Month {
        return allMonths[(number + 1) % allMonths.size]
    }

    fun previous(): Month {
        return allMonths[(number - 1) % allMonths.size]
    }

    fun lenth(leapYear: Boolean = false): Int{
        return when (number) {
            1 -> 31
            2 -> if(leapYear) 29 else 28
            3 -> 31
            4 -> 30
            5 -> 31
            6 -> 30
            7 -> 31
            8 -> 31
            9 -> 30
            10 -> 31
            11 -> 30
            12 -> 31
            else -> throw IllegalArgumentException("Invalid month")
        }
    }

    companion object {
        fun month(number: Int): Month {
            require(number in 1..12)
            return allMonths[number - 1]
        }
    }
}

internal val Month.number: Int get() = ordinal + 1

private val allMonths = Month.values().asList()