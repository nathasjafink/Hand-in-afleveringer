package com.example.hand_in_afleveringer

import java.util.Scanner

// Main function
fun main () {
    //checkAge()
    minNumber(minNumbers)
    maxNumber(maxNumbers)
    calculateAvg()
    //checkCprNumber()
    multiplesProgram()
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

/*
3.
Write a Kotlin function named calculateAverage
that takes in a list of numbers and returns their average
 */
fun calculateAvg () {
    val numbers = listOf<Double>(5.0,9.0,58.0,65.0,37.0)
    var sum = 0.0

    for (number in numbers) {
        sum += number
    }

    val average = sum / numbers.size
    println("The average is: $average")
}

/*
4.
Write a method that returns if a user has input a valid CPR number.
A valid CPR number has:
10 Digits.
The first 2 digits are not above 31.
The middle 2 digits are not above 12.
The method returns true if the CPR number is valid, false if it is not.
 */

fun checkCprNumber () : Boolean {
    val scanner = Scanner(System.`in`)
    print("Please enter your CPR-Number: ")

    val cprString : String = scanner.nextLine()
    println(cprString)

    val checkString : Int = cprString.length
    if (checkString != 10 || !cprString.all { it.isDigit() }) {
       return false
    }

    val day = cprString.substring(0,2).toIntOrNull()
    val month = cprString.substring(2,4).toIntOrNull()

    return !(day == null || month == null || day !in 1..31 || month !in 1..12)

}

/*
5.
Write a program that prints the numbers from 1 to 100.
But for multiples of three print “Fizz” instead of the number
and for the multiples of five print “Buzz”.
For numbers which are multiples of both three and five print “FizzBuzz”.
 */
fun multiplesProgram () {
    for (i in 1..100) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")
        }
        else if (i % 3 == 0) {
            println("Fizz")
        }
        else if (i % 5 == 0) {
            println("Buzz")
        }
        else println(i)
    }
}
