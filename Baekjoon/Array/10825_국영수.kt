data class Student(
    val name: String,
    val ko: Int,
    val en: Int,
    val ma: Int
)

fun main() {
    val n = readLine()!!.toInt()
    val li = mutableListOf<Student>()

    for (i in 0 until n) {
        val (name, k, e, m) = readLine()!!.split(" ")
        li.add(Student(name, k.toInt(), e.toInt(), m.toInt()))
    }

    val ans = li.sortedWith(
        compareBy(
            { -it.ko },
            { it.en },
            { -it.ma },
            { it.name }
        )
    )

    for (i in ans) {
        println(i.name)
    }
}