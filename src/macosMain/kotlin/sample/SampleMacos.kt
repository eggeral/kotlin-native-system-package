package sample

import kotlin.system.getTimeMillis

fun hello(): String = "Hello, Kotlin/Native!"

fun main() {
    println(hello())
    println(getTimeMillis())
}
