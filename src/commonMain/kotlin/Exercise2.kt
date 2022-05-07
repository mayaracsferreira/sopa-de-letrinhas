interface Exercise2Interface{
    fun getRandomNullList() : MutableList<Int?>

}
class Exercise2 : Exercise2Interface{
    val numericList = listOf(0,1,2,3,4,5,6,7,8,9)

    override fun getRandomNullList(): MutableList<Int?> {
        var randomNullList: MutableList<Int?>  = numericList.toMutableList()
        // TODO("Randomly change items for null")
        randomNullList.apply { this[3] = null }
        return randomNullList
    }
}