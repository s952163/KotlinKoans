fun Int.r(): RationalNumber = RationalNumber(this, denominator = 1)
fun Pair<Int, Int>.r(): RationalNumber = RationalNumber(numerator=this.first,denominator = this.second)

data class RationalNumber(val numerator: Int, val denominator: Int)

val x = 10.r()
val x2 = Pair(10,20).r()


