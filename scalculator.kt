fun main() {
    var expression = getOperandsFromString(getGata())
    println(expression.toString())
}

fun getGata(): String {
    var expression: String? = null
//    while (expression != "q" || expression != "Q") {
        println("enter an arithmetic expression then press 'enter': ")
        expression = readLine()
//    }
    return expression ?: ""
}

data class Expression(var x: Number = 0, var y: Number = 0, var action: String = "")

fun getOperandsFromString(string: String): Expression {
    var expression = Expression()
    var operand1: String = ""
    var operand2: String = ""
    var action: String = ""
    val operands = mutableListOf<String>()
    if (string.isNotBlank()) {
        val regex = Regex("""-?\d+(\.\d+)?""")
        regex.findAll(string).forEach {
//            print(it.value)
            operands.add(it.value)
        }
        println(operands)

//        var (operand1, action, operand2) = string.split(" ")
//
//        if (action in "+-*/") {
//            expression.action = action
//        }
//
//        if (operand1.contains('.')) {
//            expression.x = operand1.toDouble()
//        } else {
//            expression.x = operand1.toInt()
//        }
//
//        if (operand2.contains('.')) {
//            expression.y = operand2.toDouble()
//        } else {
//            expression.y = operand2.toInt()
//        }
    }
    return expression
}
