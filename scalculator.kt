fun main() {
    var expression = getOperandsFromString(getData())
    println(expression.toString())
}

fun getData(): List<String> {
    var string: String? = null
    println("enter an arithmetic expression then press 'enter': ")
    string = readLine()
    string = string ?: ""
    string = string.replace("\\s+".toRegex(), "") //all spaces removed
    val operands = mutableListOf<String>()
    if (string.isNotBlank()) {
        val regex = Regex("""-?\d+(\.\d+)?[*/\-+]?""")
        regex.findAll(string).forEach {
            operands.add(it.value)
        }
    }
    return operands
}

fun action(ops: List<String>) {
    var operands = ops.toMutableList()
    var i: Int = 0
    while (i < (operands.size - 1)) {
        when (operands[i].takeLast(1)) {
            "*" -> {
                val num1 = operands[i].dropLast(1).toDouble()
                val num2 = operands[i + 1].dropLast(1).toDouble()
                val act2 = operands[i + 1].takeLast(1)
                operands[i + 1] = (num1 * num2).toString() + act2
                operands.removeAt(i)

            }
        }
    }
    operands.forEachIndexed() { index, element ->
        while (index < operands.size - 1) {
            when (element.takeLast(1)) {
                "*" -> {
                    val num1 = element.dropLast(1).toDouble()
                    val num2 = element[index + 1].
                }
            }
        }


}


data class Expression(var x: Number = 0, var y: Number = 0, var action: String = "")

fun getOperandsFromString(string: String): Expression {
    var expression = Expression()
    var operand1: String = ""
    var operand2: String = ""
    var action: String = ""


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
