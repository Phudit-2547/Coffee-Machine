fun main() {
    val num1 = readln().toInt()
    val num2 = readln().toInt()
    val num3 = readln().toInt()
    val case1 = (num1 >= num3) && (num1 <= num2)
    val case2 = (num1 <= num3) && (num1 >= num2)
    val result = case1 || case2
    print(result)
}