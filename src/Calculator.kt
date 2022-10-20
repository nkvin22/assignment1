class Calculator<in T: Number> {

    fun calculate(num1: Int, num2: Int, operation: Operation): Number {
        return when (operation) {
            Operation.ADD -> num1 + num2
            Operation.SUB -> num1 - num2
            Operation.MUL -> num1 * num2
        }
    }


}