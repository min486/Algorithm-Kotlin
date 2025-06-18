fun main() {
    val st = "kot lin"

    println(st.startsWith("k"))  // true
    println(st.startsWith("kot"))  // false (대소문자 구분)
    println(st.endsWith("kotl"))    // true

    println(st.endsWith("lin"))    // false
    println(st.endsWith(" lin"))    // false
    println(st.endsWith(" liN"))    // false
}