fun main() {
    val num = "AaakbKJJKJHjh".numCap()
    println(num)
    println("AaakbKJJKJHjh".numCapitals)
    println(listOf(1,2,3,4,5).filterBy { it > 2 })
}

fun String.numCap() = this.count { it.isUpperCase() }

val String.numCapitals: Int
    get() = count { it.isUpperCase() }

fun List<Int>.filterBy(lam: (Int) -> Boolean): List<Int> {
    return filter { lam(it) }
}
