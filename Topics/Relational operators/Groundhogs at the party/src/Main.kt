fun main() {
    val cups = readln().toInt()
    val weekend = readln().toBoolean()
    val case1 = (cups >= 10) && (cups <= 20) && !weekend
    val case2 = (cups >= 15) && (cups <= 25) && weekend
    val result = case1 || case2
    println(result)
}