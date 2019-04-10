package sample

import kotlin.system.getTimeMillis

actual fun getSystemTimeInMillis() = getTimeMillis()

fun main() {
    printSystemTimeMillis()
}
