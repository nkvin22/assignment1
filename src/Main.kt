fun main(){

    val calculator = Calculator<Int>()

    println(calculator.calculate(2, 3, Operation.ADD))
    println(calculator.calculate(1, 9, Operation.MUL))
    println(calculator.calculate(5, 8, Operation.SUB))

    val a = My3DVector( 1.4, 2.0, 3.2)
    val b = My3DVector( 4.4, 5.2, 6.1)

    println(a.dotproduct(b))
    println(a.crossproduct(b))
}

