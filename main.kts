
class MyTask(val numerator: Int, val denominator: Int) {
    
    var gcd_num: Int
    var gcd_den: Int
    
    init {
        gcd_num = 0
        gcd_den = 0
    }

    fun methodOne() {
        val numGCD = gcd(numerator, denominator)

        gcd_num = numerator / numGCD
        gcd_den = denominator / numGCD
    }

    override fun toString() = "$gcd_num/$gcd_den"
    
    fun gcd(num: Int, den: Int): Int {
        if (den == 0)
        	return num
    	else
        	return gcd(den, num % den)
    }
    
    fun methodTwo(num2: Int, den2: Int): String {
        val val_one = numerator * num2
        val val_two = denominator * den2
        val fin = "$val_one/$val_two"
        return fin
    }
}

fun main() {
    val mainTask = MyTask(2, 10)
    mainTask.methodOne()
    println(mainTask.toString())
    
    println(mainTask.methodTwo(5, 3))

}