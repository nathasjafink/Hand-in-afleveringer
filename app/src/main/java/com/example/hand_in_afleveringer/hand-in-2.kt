package com.example.hand_in_afleveringer

// Main function
fun main () {
    // Exercise 1
    val employeeOne = Employee("Jonas","Smith",2500.0)
    val employeeTwo = Employee("Kathrine","Johnson",4000.0)

    // Display yearly salary
    println("Yearly salary of ${employeeOne.firstName} ${employeeOne.lastName}: ${employeeOne.yearlySalary()}")
    println("Yearly salary of ${employeeTwo.firstName} ${employeeTwo.lastName}: ${employeeTwo.yearlySalary()}")

    // Give the employees 10% raise and display yearly salary
    employeeOne.givingRaise(10.0)
    employeeTwo.givingRaise(10.0)

    println("The new yearly salary of ${employeeOne.firstName} ${employeeOne.lastName}: ${employeeOne.yearlySalary()}")
    println("The new yearly salary of ${employeeTwo.firstName} ${employeeTwo.lastName}: ${employeeTwo.yearlySalary()}")

    // Exercise 2
    val laptop = Laptop(452,true,13.1, 8)
    laptop.storageSize()
    laptop.checkPowerstatus()
    laptop.addMoreRam(8)

    val newSmartphone = SmartPhone(256,false,5.0,46)
    newSmartphone.storageSize()
    newSmartphone.checkPowerstatus()
    newSmartphone.howMuchBatteryLeft()

    // Exercise 3
    val productOne = Shoe("Nike",250,5)
    productOne.identifyProductCategory()
    val productTshirt = Tshirt("Blue T-shirt",20,54)
    productTshirt.identifyProductCategory()
    val productBook = Book("Riverdale", 250,10)
    productBook.identifyProductCategory()

    // Exercise 4
    //Circle
    val cirkel = Circle(3.14,2.0,"red",false)
    println(cirkel.calculatePermeter())
    println(cirkel.calculateArea())
    // Retangle
    val retankel = Retangle(5.0,10.0,"Blue",true)
    println(retankel.calculatePermeter())
    println(retankel.calculateArea())
    // Triangle
    val trekant = Triangle(5.0,3.5,7.0,"Purple", false)
    println(trekant.calculatePermeter())
    println(trekant.calculateArea())
}

/*
1.
Create a class called Employee that includes three pieces of information as instance variables
A first name
A last name
A monthly salary
Your class should have a constructor that initializes the three instance variables.
If the monthly salary is not positive, set it to 0.0.
Create two Employee objects and display each object’s yearly salary.
Then give each Employee a 10% raise and display each Employee’s yearly salary again.
*/
class Employee (firstName : String, lastName : String, monthlySalary : Double) {
    var firstName : String = firstName
    var lastName : String = lastName
    var monthlySalary : Double = if (monthlySalary > 0) monthlySalary else 0.0
        private set

    fun yearlySalary () : Double {
        return monthlySalary * 12
    }

    fun givingRaise (percentage : Double) {
        monthlySalary += monthlySalary * (percentage / 100)
    }

}

/*
2.
Create a new class called Computer. Before you add any more code, know that you will need to add two additional classes: Laptop and SmartPhone
For a parent class add 3 properties, 2 methods, and a constructor.
For a child class add at least 1 additional property and 1 additional method.
In the main method create a Laptop and a SmartPhone
*/
open class Computer (storage: Int, power: Boolean, screenSize : Double) {
// Parent class
    var power = power
    var storage = storage
    var screenSize = screenSize

    fun checkPowerstatus () {
        println("Power is: ${if (power) "On" else "Off"}")
    }

    fun storageSize () {
        if (storage in 250..600) {
            println("$storage")
        } else {
            println("Buy another computer!")
        }
    }

    fun maxAndMinScreenSize () {
        if (screenSize < 10) {
            println("That's not a computer, it's a phone!")
        }
        else if (screenSize in 12.0..17.0) {
            println("$screenSize, That's a common screen size")
        }
        else {
            println("Give an accurate screen size")
        }
    }
}

class Laptop (storage: Int,power: Boolean,screenSize: Double,ram: Int) : Computer(storage, power, screenSize) {
// Subclass
    var ram = ram
    fun addMoreRam (ramInput : Int) {
        ram += ramInput
        println("New ram size: $ram")
    }

}

class SmartPhone (storage: Int,power: Boolean,screenSize: Double, batteryLeft : Int) : Computer(storage, power, screenSize) {
// Subclass
    var batteryLeft = batteryLeft

    fun howMuchBatteryLeft () {

        if (batteryLeft in 50..100) {
            println("How much battery left: $batteryLeft% is good")
        }
        else if (batteryLeft in 20..49) {
            println("How much battery left: $batteryLeft%. Might keep a charger nearby")
        }
        else {
            println("How much battery left: $batteryLeft%. Charge your phone!")
        }
    }

}

/*
3.
Create a base class Product with attributes like name, price, and quantity and a function identifyProductCategory.
Subclass it to create specific product types like Shoe, T-shirt, and Book. Override the function such that:
The shoe outputs "I am a shoe" .
The T-shirt outputs "I am a T-shirt"
The book outputs "I am a book"
*/
open class Product (val name : String, val price : Int, val quantity : Int) {
    open fun identifyProductCategory () {
        println("I'm a product")
    }
}

class Shoe (name: String, price: Int, quantity: Int ) : Product (name, price, quantity) {
    override fun identifyProductCategory () {
        println("I am a shoe")
    }
}

class Tshirt (name: String,price: Int,quantity: Int) : Product(name, price, quantity) {
    override fun identifyProductCategory () {
        println("I am a t-shirt")
    }
}

class Book (name: String,price: Int,quantity: Int) : Product(name, price, quantity) {
    override fun identifyProductCategory () {
        println("I am a book")
    }
}
/*
4.
Create 3 classes Circle, Rectangle & Triangle with a parent class: Shape.
Every shape has two attributes
color
isTransparent
Furthermore every class has private attributes to calculate perimeter and area for each shape.
E.g. a Rectangle has the attributes: height, width, color & isTransparent
The attributes are set in the constructor
The 3 classes all overrides the following abstract methods from their parent class:
calculatePermeter
calculateArea
The functions will return the permeter or area of the shape.
 */

abstract class Shape (val color: String, val isTransparent: Boolean) {
    abstract fun calculatePermeter (): Double

    abstract fun calculateArea (): Double
}

class Circle (private val pi: Double, private val radius: Double, color: String, isTransparent : Boolean ) : Shape(color, isTransparent) {

    override fun calculatePermeter(): Double {
        return 2 * radius * pi
    }

    override fun calculateArea(): Double {
        return pi * radius * radius
    }
}

class Retangle (private val length : Double, private val width : Double, color: String, isTransparent: Boolean) : Shape(color, isTransparent) {
    override fun calculatePermeter(): Double {
        return 2 * (length + width)
    }

    override fun calculateArea(): Double {
        return length * width
    }
}

class Triangle (private val sideA : Double, private val sideB : Double, private val sideC : Double, color: String, isTransparent: Boolean) : Shape(color, isTransparent) {
    override fun calculatePermeter(): Double {
        return sideA + sideB + sideC
    }

    override fun calculateArea(): Double {
        return 1/2 * sideA * sideB
    }
}