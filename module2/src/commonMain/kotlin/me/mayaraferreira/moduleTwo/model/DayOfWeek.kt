package me.mayaraferreira.moduleTwo.model

internal enum class DayOfWeek(val ptBrName: String) {
    MONDAY("SEGUNDA-FEIRA"),
    TUESDAY("TERÇA-FEIRA"),
    WEDNESDAY("QUARTA-FEIRA"),
    THURSDAY("QUINTA-FEIRA"),
    FRIDAY("SEXTA-FEIRA"),
    SATURDAY("SABADO"),
    SUNDAY("DOMINGO");

    override fun toString(): String {
        return ptBrName
    }
}
internal val DayOfWeek.number: Int get() = ordinal + 1