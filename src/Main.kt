//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //Задание 1
    val z1 = listOf("one", "two", "three")
    val z1a = arrayListOf<String>()
    z1.forEach { z1a+=it.reversed() }
    println(z1a)

    //Задание 2
    val z2 = listOf(1, 2, 3, 4, 5)
    val z2a = arrayListOf<Int>()
    z2.forEach { if(it<=3)z2a.add(it*it) }
    println(z2a)

    // Задание 3
    val z3a = listOf("red", "blue", "white")
    val z3b = listOf("красный", "синий", "белый")
    val z3c = z3a.zip(z3b) {z3aEl, z3bEl->
        "Значение: $z3aEl, перевод: $z3bEl"
    }
    println(z3c)

    // Задание 4
    val z4 = arrayOf("Jan", "Feb", "Mar", "Apr", "May")
    var sum = 0
    z4.forEach { sum+=it.length }
    println(sum)
}