package me.mayaraferreira.moduleTwo.model

internal enum class DayOfWeek(val ptBrName: String) {
    MONDAY("segunda-feira"),
    TUESDAY("terça-feira"),
    WEDNESDAY("quarta-feira"),
    THURSDAY("quinta-feira"),
    FRIDAY("sexta-feira"),
    SATURDAY("sabado"),
    SUNDAY("domingo");

    override fun toString(): String {
        return ptBrName
    }
}
internal val DayOfWeek.number: Int get() = ordinal + 1