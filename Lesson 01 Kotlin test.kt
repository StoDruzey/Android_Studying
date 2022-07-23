package com.example.androidstudying

fun main() {
    check("Hello world", 'l')
    val set = mutableSetOf(1, 2, 3, 3)
    println(set)
    val map = mapOf<Int, String>(
        0 to "0",
        1 to "1",
        2 to "2"
    )
    val mutaMap = mutableMapOf<Int, String>(
        0 to "0",
        1 to "1",
        2 to "2"
    )
    val test = Test(1)
    test.doubleValue = 1.0
    val user = User("first", "last", 20)
    user.firstName = "new name"
    println(user.fullName)
}
class User(var firstName: String, var lastName: String, val age: Int) {
    val fullName
        get() = "$firstName $lastName"
}

open class Test(var value: Int) {
    var doubleValue: Double
        get() = value.toDouble()
        set(lue) {
            this.value = lue.toInt()
        }
}

fun test() {
    val value1 = readLine()?.toInt() ?: return
    val value2 = readLine()?.toInt() ?: return
    when (value1 * value2) {
        in 0..100 -> println("in range 0..100")
        else -> println("out of range")
    }
}

fun check(string: String, symbol: Char) {
    var count = 0
    for (char in string) {
        if (char == symbol) {
            count++
        }
    }
    println(count)
}