fun main() {
    val num = "AaakbKJJKJHjh".numCap()
    println(num)
    println("AaakbKJJKJHjh".numCapitals)
    println(listOf(1,2,3,4,5).filterBy { it > 2 })
    listOf(1,2,3,4,5,6)
        .filterBy { it > 3 } //этот метод возвращает list
        .dropLast(1)
        .map { it * 2 } //смотреть сигнатуру метода

    listOf(1,2,3,4,5,6)
//        .asSequence()
        .filter {
            println("Filter: $it")
            it > 3
        }
        .find {
            println("Find: $it")
            it == 5
        }
}

fun String.numCap() = this.count { it.isUpperCase() }

val String.numCapitals: Int
    get() = count { it.isUpperCase() }

fun List<Int>.filterBy(lam: (Int) -> Boolean): List<Int> { //более короткий вариант
    filter(lam) //так можно, потому что у filter такая же сигнатура, как у нашей лямбды
    return filter { lam(it) } //или так, более понятно
}

fun List<Int>.filterByLambda(lam: (Int) -> Boolean): List<Int> {
    val list = mutableListOf<Int>()

    for (item in this) { //более длинный вариант
        if (lam(item)) {
            list.add(item)
        }
    }

    this.forEach { item -> //вариант получше, кстати, this здесь можно вообще не писать
        if (lam(item)) {
            list.add(item)
        }
    }
    return list
}

