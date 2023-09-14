fun main(args: Array<String>) {
    //Task2
    printFullName("Ronald","Pupcin")
    //Task6
    println(fibonacci(6))
}
//Task1
fun printFullName(firstName: String, lastName: String){
    println(firstName + " " + lastName)
    //println("$firstName $lastName")
}
//Task3
fun calculateFullName(firstName: String, lastName: String): String{
    return "$firstName $lastName"
}
//Task4
fun calculateFullNameAndLength(firstName: String, lastName: String): Pair<String,Int>{
    return Pair("$firstName $lastName",(firstName + lastName).length)
}
//Task5
fun isPrimeNumber(number:Int): Boolean{
    if (number <= 1) return false
    for (i in 2..number){
        if (number % i == 0) return false
    }
    return true
}
//Task6
fun fibonacci(n:Int): Int{
    var previous1 = 1
    var previous2 = 1
    var current = 0
    for (i in 3..n){
        current = previous1 + previous2
        previous1 = previous2
        previous2 = current
    }
    return current
}