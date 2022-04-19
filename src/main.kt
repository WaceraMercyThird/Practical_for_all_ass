//1.Create a function that takes in 4 strings  and creates an array out of them then
//prints out the array(2 points)

//2.Create a function that given an array below:
//var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
//prints out the names of the cities in the correct grammatical case.      (2 points)
//3.Create one function that given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements(1 point)
//(ii) prints out the index of 158                                                                                (1 point)
//(iii) prints out the elements in ascending order                                           (2 points)
//4.Create a function that takes in 3 names and returns a string array containing
fun main() {

    var person = Human("Mary", 10, 12.0)
    var autoMotors = Car("Toyota", "corolla", "grey", 50)
    var Express = Bus("Toyota", "corolla", "grey", 50)


//Human class
    println("${person.name} ${person.age} ${person.weight}")
    person.eat(34)
    person.speak("I am speaking English")
    println(person.age)
    person.birthday()
    println(person.age)
    //Create an instance of this human class and invoke all its functions
    println("${person.name} ${person.age} ${person.weight}")
    var jane = User("Monica", "Andrews", "monicaandrews@gmail.com", "0783733786", "tyreyuw")
    println("${jane.firstName} ${jane.lastName} ${jane.email} ${jane.phoneNumber} ${jane.password}")

        // Car
    autoMotors.carry(51)
    autoMotors.identity()
    var result = autoMotors.calculateparkingFees(10)
    println(result)
    println(" ")

    // Class of Bus
    var journey = Express.maxTripFare(45.0,2)
    println(journey)
   var tripFee= Express.calculateparkingFees(1)
    println(tripFee)


    //The bus’calculateParkingFees method returns the product of hours and
//the capacity of the bus(3 points)
   println(Express.capacity)
    Express.carry(56)
    Express.identity()
    var re = Express.calculateparkingFees(10)
    println(re)
    println("Bus")
    println(" ")



}

//1.Create a class called Human with these attributes: name, age, weight. It has
//the following functions:
class Human(var name: String, var age: Int, var weight: Double) {
    //-eat(foodWeight: Int) :Prints “I am eating {foodWeight}kgs of food”
//and increments the human’s weight by the weight of the food eaten
//(3 points)
    fun eat(foodWeigt: Int) {
        weight += foodWeigt
        println("I am eating ${foodWeigt} kgs of food")

    }

    //-speak(speech: String) :Prints the string passed toit                (2
//points)
    fun speak(speach: String) {
        println(speach)
    }

    //-birthday( ) :Increments the human’s age by 1(2
//points)
    fun birthday() {
        age++
        println(age)
    }

}

//2.Create a data class User with these fields: firstName, lastName, email,
//phoneNumber, password. Create an instance of User  and print out any 2
//attributes
data class User(
    var firstName: String,
    val lastName: String,
    val email: String,
    val phoneNumber: String,
    var password: String
)

//1.Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
 open class Car(var make: String, var model: String, var color: String, var capacity: Int) {

    //-carry(people: Int) : Prints out “Carrying $peoplepassengers” if the
//number of people is within its capacity else it prints out “Over capacity
//by $x people” where x is the number of people exceeding its capacity
//(3 points)
    fun carry(people: Int) {
        val x = people - capacity
        if (people <= capacity) {
            println("Carring $people passenger")
        } else {
            println("Over capacity with $x people")
        }
    }

    //-identity() : Prints out the color, make and modelin the following
//format e.g:  “I am a white subaru legacy”(1 point)
    fun identity() {
        println("I am a $color $make $model")
    }

    //-calculateParkingFees(hours: Int) : Calculates and returns the
//parking fees by multiplying the hours by 20(1 point)
    fun calculateparkingFees(hours: Int): Int {
        var total = hours * 20
        return total

    }

}


//2.Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per
//trip.(2 points)

class  Bus (make: String, model: String, color: String, capacity: Int): Car(make, model, color, capacity){
    fun maxTripFare(fare: Double, trip: Int): Double{
        var maxMount = fare * trip
        return maxMount

    }



}

//Make use of inheritance to avoid duplication. Also be sure to instantiate both classes
//and call each of the functions on the objects