package sample

expect fun getSystemTimeInMillis(): Long

fun printSystemTimeMillis() {
    println("System time in millis: ${getSystemTimeInMillis()}")
}
