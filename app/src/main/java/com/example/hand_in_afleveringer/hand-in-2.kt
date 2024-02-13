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

    println("Yearly salary of ${employeeOne.firstName} ${employeeOne.lastName}: ${employeeOne.yearlySalary()}")
    println("Yearly salary of ${employeeTwo.firstName} ${employeeTwo.lastName}: ${employeeTwo.yearlySalary()}")
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

/*
3.
Create a base class Product with attributes like name, price, and quantity and a function identifyProductCategory. Subclass it to create specific product types like Shoe, T-shirt, and Book. Override the function such that:
The shoe outputs "I am a shoe" .
The T-shirt outputs "I am a T-shirt"
The book outputs "I am a book"
*/

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