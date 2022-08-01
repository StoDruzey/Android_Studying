import androidx.core.text.isDigitsOnly

fun main() {
    action(getData())
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
//    operands.last().takeLast(1).
    return operands
}

fun action(ops: List<String>) {
    var operands = ops.toMutableList()
    var i: Int = 0
    var size = operands.size
    while (i < (size - 1)) {
        println(operands)
        when (operands[i].takeLast(1)) {
            "*" -> {
                val num1 = operands[i].dropLast(1).toDouble()
//                if (i == size - 2) {
//                    val num2 = operands[i + 1].dropLast(1).toDouble()
//                }
                val num2 = operands[i + 1].dropLast(1).toDouble()
                val act2 = if (i == size - 2) "" else operands[i + 1].takeLast(1)
                operands[i + 1] = (num1 * num2).toString() + act2
                operands.removeAt(i)
                --size
                --i
            }
            "/" -> {
                val num1 = operands[i].dropLast(1).toDouble()
                val num2 = operands[i + 1].dropLast(1).toDouble()
                val act2 = if (i == size - 2) "" else operands[i + 1].takeLast(1)
                operands[i + 1] = (num1 / num2).toString() + act2
                operands.removeAt(i)
                --size
                --i
            }
//            else ->
        }
        ++i
    }
    println(ops)
    println(operands)
}


//data class Expression(var x: Number = 0, var y: Number = 0, var action: String = "")

//fun getOperandsFromString(string: String): Expression {
//    var expression = Expression()
//    var operand1: String = ""
//    var operand2: String = ""
//    var action: String = ""
//
//
////        var (operand1, action, operand2) = string.split(" ")
////
////        if (action in "+-*/") {
////            expression.action = action
////        }
////
////        if (operand1.contains('.')) {
////            expression.x = operand1.toDouble()
////        } else {
////            expression.x = operand1.toInt()
////        }
////
////        if (operand2.contains('.')) {
////            expression.y = operand2.toDouble()
////        } else {
////            expression.y = operand2.toInt()
////        }
//    }
//    return expression
//}
