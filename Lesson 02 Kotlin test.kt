fun main() {
    println(show(Shape.Rectangle(1,2)))
    println(aShow(ASquare()))
    test { println("foo") }
    testLambda { println("test lambda acton") }

    val list = listOf(1,2,3,4,5,6,7,8)
    var result = 0
    for (item in list) {
        if (item > 3) {
            result = item
            break
        }
    }
}

fun show(shape: Shape) : String {
    return when(shape) {
        is Shape.Square -> "Square"
        is Shape.Rectangle -> "Rectangle"
        else -> "error"
    }
}

sealed class Shape {
    class Square(val x: Int) : Shape()
    class Rectangle(val x: Int, val y: Int) : Shape()
}

abstract class AShape
class ASquare : AShape()
class ARectangle : AShape()
fun aShow(ashape: AShape): String {
    return when(ashape) {
        is ASquare -> "aSquare"
        is ARectangle -> "aRectangle"
        else -> "aError"
    }
}

fun interface Action {
    fun foo()
}
fun test(action: Action) {
    action.foo()
}
fun testLambda(action: () -> Unit) {
    action()
}