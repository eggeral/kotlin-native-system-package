package sample

actual fun getSystemTimeInMillis() = System.currentTimeMillis()

fun main() {
    printSystemTimeMillis()
}
