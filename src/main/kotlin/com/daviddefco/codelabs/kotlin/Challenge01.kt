package com.daviddefco.codelabs.kotlin

fun main(args: Array<String>) {
    // Declare two immutable String variables called hello1 and hello2 and assign
    // "Hello" to both variables
    val hello1 = "Hello"
    val hello2 = "Hello"

    // Using one line of code test whether these variables are referentially equals
    // and print the result: it is because the JVM use the same instance for the
    // same literal in order to optimize
    println("Are the variables referentially equals? ${hello1 === hello2}")

    // Now test if they are structurally equals
    println("Are the variables structurally equals? ${hello1 == hello2}")

    // Declare a mutable variable of type Int and assign it the value of 2968
    var number = 2968

    // Declare an immutable variable of type Any and assign it the string "The Any
    // type is root of the Kotlin class hierarchy". Then using the smart cast print
    // out the uppercased string
    val anything: Any = "The Any type is root of the Kotlin class hierarchy"
    if(anything is String) {
        println(anything.toUpperCase())
    }

    // Using one line of code print out the following. Make sure your code is
    // nicely indented:
    //    1
    //   11
    //  111
    // 1111
    println("""   1
            |  11
            | 111
            |1111""".trimMargin())
}