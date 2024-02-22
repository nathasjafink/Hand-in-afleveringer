package com.example.hand_in_afleveringer
// Main Function
fun main () {
    // Exercise 1
    val arrayList = arrayListOf<Article>(
        Article("Kotlin for Beginners", "John Doe"),
        Article("Advanced Kotlin Techniques", "Jane Smith"),
        Article("Understanding Coroutines", "Alice Johnson"),
        Article("Exploring Kotlin DSL", "Bob Brown"),
        Article("Kotlin Multiplatform in Action", "Chris Green")
        )
    println(arrayList)

    // Exercise 2
    val fastFoods : List<Fastfood> = listOf(Sandwich(),Pizza(),Cheeseburger())
    Cheeseburger().removeItem("Tomato")
    fastFoods.forEach { food ->
        food.prepare()
        food.serve()
        println("Sandwich price: ${Sandwich().price}, Pizza price: ${Pizza().price}, Cheeseburger price: ${Cheeseburger().price}")
    }
    // Exercise 3
    val car = Car()
    car.changeGear(4)
    car.speedUp(60)
    car.applyBrakes(110)

}

/*
1.
Write a class: Article
An article has an author and a title
Create 5 articles, add them into an ArrayList and print them by overriding the .toString() method
*/
class Article (private val author : String, private val title : String) {
    override fun toString(): String {
        return "Article Title: \"$title\" by Author: $author"
    }
}
/*
2.
Create an interface called FastFood (with appropriate methods) and create a Sandwich class, a Pizza class and a class you decide that implements the FastFood interface.
Add some different Fastfood objects to an array. Now iterate through that array and use some of the methods you have created above.
*/
interface Fastfood {
    fun prepare()
    fun serve()
    var price : Double
    var ingredients : MutableList<String>
    fun removeItem(productBeRemoved : String)
}

class Sandwich  : Fastfood {
    override var price: Double = 45.00
    override var ingredients: MutableList<String> = mutableListOf("Bread", "Cheese", "Ham", "Tomato")

    override fun prepare() {
        return println("Sandwich is being prepared")
    }

    override fun serve() {
        return println("Sandwich is ready to be served")
    }

    override fun removeItem(productBeRemoved: String) {
        val removeIngredients = ingredients.remove(productBeRemoved)
        if (removeIngredients) {
            println("$productBeRemoved was removed")
        } else {
            println("$productBeRemoved was not removed")
        }
    }

}

class Pizza : Fastfood {

    override var price: Double = 80.00
    override var ingredients: MutableList<String> = mutableListOf("Pizza Dough", "Tomato Sauce", "Cheese", "Pepperoni")
    override fun prepare() {
        return println("Pizza is being prepared")
    }

    override fun serve() {
        return println("Pizza is ready to be served")
    }



    override fun removeItem(productBeRemoved: String) {
        val removeIngredients = ingredients.remove(productBeRemoved)
        if (removeIngredients) {
            println("$productBeRemoved was removed")
        } else {
            println("$productBeRemoved was not removed")
        }
    }


}

class Cheeseburger : Fastfood {
    override var price: Double = 60.00
    override var ingredients: MutableList<String> = mutableListOf("Bun", "Beef Patty", "Cheese", "Lettuce", "Tomato")
    override fun prepare() {
        return println("Chesseburger is being prepared")
    }

    override fun serve() {
        return println("Chesseburger is ready to be served")
    }


    override fun removeItem(productBeRemoved: String) {
        val removeIngredients = ingredients.remove(productBeRemoved)
        if (removeIngredients) {
            println("$productBeRemoved was removed")
        } else {
            println("$productBeRemoved was not removed")
        }
    }


}
/*
3.
Create a class that implements the following interface. Now create two objects using the class created
interface Vehicle {
    changeGear(int a);
    speedUp(int a);
    applyBrakes(int a);
}
*/

internal interface Vehicle {
    fun changeGear(a: Int)
    fun speedUp(a: Int)
    fun applyBrakes(a: Int)
}

class Car : Vehicle {
    override fun changeGear(a: Int) {
        if (a == 1) {
            println("You're in first gear")
        }
        else if (a == 2) {
            println("You're in second gear")
        }
        else if (a == 3) {
            println("You're in third gear")
        }
        else if (a == 4) {
            println("You're in fourth gear")
        }
        else if (a in 5..6) {
            println("You're in the highest gear")
        }
        else {
            println("There is not that many gears in a car!")
        }
    }

    override fun speedUp(a: Int) {
        return println("This is your speed: $a")
    }

    override fun applyBrakes(a: Int) {
        return println("Breaking enable")
    }



}
/*
4.
Write a class: RedditPost
A Redditpost has :
A date of which is has been posted
An author
A balance of upvotes / downvotes
A Title
When a new instance of RedditPost is instantiated:
The current date will be generated.
The balance of upvotes and downvotes starts at 1.
The title and author has to be provided by the constructor.
Ensure all attributes are private, but accesible by getters & setters.
Implement functionality such that redditposts can be sorted by upvotes/downvotes
4.5
Write a class: RedditFrontPage
The RedditFrontPage has:
A List of all RedditPosts
A method in RedditFrontPage deletes a RedditPost from the list, by its index number
*/
class RedditPost (
    val date: Long,
    val author : String,
    val title : String,
    var upvotes : Int,
    var downvotes : Int  ) {

}

class RedditFrontPage (
    var listOfPosts : MutableList<String>
) {
    fun removePostFromList () {

    }
}

/*
5.
Write a program that takes a list of words as input and prints the frequency of each word.
Hint: Use a MutableMap
 */