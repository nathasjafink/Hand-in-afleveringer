package com.example.hand_in_afleveringer

import java.util.Scanner

// Main function
fun main () {
    // Exercise 1
    checkAge()
    // Exercise 2
    minNumber(minNumbers)
    maxNumber(maxNumbers)
    // Exercise 3
    calculateAvg()
    // Exercise 4
    val isValidCPR = checkCprNumber()
    if (isValidCPR) {
        println("Is a valid Cpr-Number")
    } else {
        println("Invalid Cpr-Number")
    }
    // Exercise 5
    multiplesProgram()
    // Exercise 6
    inputAbbreviations()
    // Exercise 7
    calculateGrade(95)
    //Exercise 8
    val filteredList = filterWordsByLength(strings, minimumLength)
    println(filteredList)
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

    val integer: Int = reader.nextInt()

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

    return day in 1..31 || month in 1..12
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

/*
6.
Write a program that takes your full name as input and displays the abbreviations of the first
and middle names except the last name which is displayed as it is.
For example, if your name is Robert Brett Roser, then the output should be R.B. Roser.
Or Benjamin Dalsgaard Hughes will be B.D. Hughes
 */
fun inputAbbreviations () {
    val scanner = Scanner(System.`in`)
    println("Enter Your Name: ")

    val reader = scanner.nextLine()
    // Checks if the returned string is empty
    if (reader.isNotEmpty()) {
        //Split name into an array
        val splitName : List<String> = reader.split(" ")
        // Checks if the split string has more than one characters
        if (splitName.size > 1) {
            // Get first and middle name first letter
            val firstName = splitName[0].first()
            val middleName : String= splitName.subList(1, splitName.size - 1).joinToString(". ") { it.first().toString() }

            // Get the full last name
            val lastName = splitName.last()
            // Get the name together again
            val result : String = "$firstName. $middleName. $lastName"
            println(result)
            return
        }
    }
    println("Not valid")
}

/*
7.
Write a program that takes a numerical grade (0-100) as input
and prints out the corresponding american letter grade.
Implement a function calculateGrade that takes an integer parameter representing
the grade and returns a string representing the letter grade according to the following scale:

90-100: "A"
80-89: "B"
70-79: "C"
60-69: "D"
Below 60: "F"
 */

fun calculateGrade (int: Int) {
    if (int < 60) {
        println("F")
    }
    else if (int in 60..69) {
        println("D")
    }
    else if (int in 70..79) {
        println("C")
    }
    else if (int in 80..89) {
        println("B")
    }
    else if (int in 90..100) {
        println("A")
    }
}

/*
8.
Write a Kotlin function named filterWordsByLength that takes in a list of strings
and a minimum length, and returns a list containing only the words
that have a length greater than or equal to the specified minimum length.

Use filter function and lambda expressions
 */
val minimumLength : Int = 5
val strings : List<String> = listOf<String>("Banana","Apple","Hey","Everything")
fun filterWordsByLength(listOfStrings: List<String>, minLength: Int) : List<String> {
    return  listOfStrings.filter { it.length >= minLength }
}