package com.daviddefco.codelabs.kotlin

import com.daviddefco.codelabs.kotlin.java.CallingClass

fun main(args: Array<String>) {

    // 1. Declare a non-nullable float in two different ways
    val firstFloat:Float = -65.98f
    val secondFloat = -65.98f

    // 2. Now change both of these variables to nullable variables
    val nullableFirst: Float? = firstFloat
    val nullableSecond: Float? = secondFloat

    // 3. Create an array of non-nullable shorts from 1 to 5
    val shortArray = shortArrayOf(1,2,3,4,5)

    // 4. Declare an array of nullable Ints and initialize with values 5, 10... up to 200
    val intArray = Array<Int?>(40) { i -> (i+1) * 5 }

    // 5. Call the Java method public void charArrayMethod(char[] charArray) using the array ['a', 'b', 'c']
    val callingArray = charArrayOf('a', 'b', 'c')
    CallingClass().callFromCharArray(callingArray)

    // 6. Given the following code:
    val x: String? = "I AM IN UPPERCASE"
    // Using one line declare another var and assign it x in lowercase if it is not null or "I give up"
    // otherwise
    val anotherString = x?.toLowerCase() ?: "I give up"

    // 7. Use let function to a) lowercase the string and b) replace "am" with "am not"
    x?.let { it.toLowerCase().replace("am", "am not") }

    // 8. You are really confident that myNonNullVariable is not null. Change this code to assert it
}