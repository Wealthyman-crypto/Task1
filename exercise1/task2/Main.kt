package com.mediasoft.exercise1.task2
/*
отсортировать 1й список по элементам 2го
дан массив a = [1, 4, 6] и массив  b = [11, 33, 22]
если отсортировать первый массив по второму должен получиться массив [1,6,4]
 */
fun main() {
    val a = listOf(1, 4, 6)
    val b = listOf(11, 33, 22)

    val sortedList = a.sortedBy { b[a.indexOf(it)] }

    println(sortedList)
}