package com.mediasoft.exercise1.task4

/*
Дана римская цифра, преобразовать ее в целое число.
 */
fun main() {
    print(romanToInt("MMXXIII"))
}

fun romanToInt(s: String): Int {
    val rimnums = mapOf<Char, Int>('I' to 1, 'V' to 5,
        'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)
    var number = 0

    for ((index, i) in s.withIndex()) {
        if (index + 1 > s.length - 1) {
            number += rimnums.getValue(i)
            break
        }
        if (rimnums.getValue(i) < rimnums.getValue(s[index + 1])) {
            number -= rimnums.getValue(i)
            continue
        }
        number += rimnums.getValue(i)
    }

    return number
}