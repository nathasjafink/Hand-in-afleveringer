package com.example.hand_in_afleveringer

import java.util.Scanner

// Main function
fun main () {
    //checkAge()
    minNumber(minNumbers)
    maxNumber(maxNumbers)
}

/*
1.
A person is elligible to vote if his/her age is greater than or equal to 18.
Define a method to find out if he/she is elligible to vote.
Let the user input their age. Get inspiration in the terminal output below:
 */
fun checkAge () {
    val reader = Scanner(System.`in`)
    println("Please enter your age: ")

    var integer: Int = reader.nextInt()

    if (integer >= 18) {
        println("You're allowed to vote!")
    } else {
        println("You're too young to vote!")
    }
}

/*
2.
Define two functions to print the maximum and
the minimum number respectively among three numbers
 */
val minNumbers = listOf<Int>(1,18,-8)
fun minNumber (numbers: List<Int>) {
    val getMin = numbers.min()
    println("Min: $getMin")
}

val maxNumbers = listOf<Int>(1,18,8)
fun maxNumber (numbers: List<Int>) {
    val getMax = numbers.max();
    println("Max: $getMax")
}
