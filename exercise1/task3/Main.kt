package com.mediasoft.exercise1.task3

/*
Дан список строк. Нужно вывести все буквы,
которые встречаются в каждой из строк списка (включая дубликаты).
 */

fun main() {
    val list1 = listOf("bella", "label", "roller")
    val list2 = listOf("cool", "lock", "cook")

    println(commonChars(list1)) // ['e', 'l', 'l']
    println(commonChars(list2)) // ['c', 'o']
}

fun commonChars(lst: List<String>): List<Char> {
    if (lst.isEmpty()) return emptyList()
    val result = mutableListOf<Char>()

    for (char in lst[0].toSet()) {
        val count = lst.map { it.count { c -> c == char } }.minOrNull() ?: 0
        result.addAll(List(count) { char })
    }
    return result.sorted()
}