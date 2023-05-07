package com.mediasoft.exercise1.task1
/*
FizzBuzz
перебрать числа от 1 до 100
если число делится на 3 - вывести вместо него Fizz
если на 5 - вывести вместо него Buzz
если и на 3 и на 5 - вывести вместо него FizzBuzz
*/
fun main() {
    for (i in 1..100) {
        var string = ""
        if (i % 3 == 0) string += "Fizz"
        if (i % 5 == 0) string += "Buzz"
        if (string.isEmpty()) string = i.toString()
        print("$string ")
    }
}