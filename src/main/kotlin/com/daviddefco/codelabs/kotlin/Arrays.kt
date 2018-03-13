package com.daviddefco.codelabs.kotlin

import com.daviddefco.codelabs.kotlin.java.CallingClass

fun main(args: Array<String>) {

    // Arrays can be created using the arrayOf without specifying types if we use defaults
    val names = arrayOf("John", "Lonzo", "Julius")
    val longs = arrayOf<Long>(1,2,3)
    val ints = arrayOf(1,2,3)
    assert(names is Array<String>)
    assert(longs is Array<Long>)
    assert(ints is Array<Int>)

    // We can use indexing to reach elements in array without using get method (starting index is 0)
    assert(names[2] == "Julius")

    // Arrays can be created using constructors stating their capacity and can be populated using a lambda
    val evenNumbers = Array(16) { i -> i * 2 }
    assert(evenNumbers[15] == 30)

    // If we don't populate an array at declaration time we have to specify type
    var someArray: Array<Int>
    someArray = arrayOf(1,2,3,4)

    // But we can't declare with size without populating. The constructor needs two args: size and data
    // val wrongArray = Array<Int>(5)

    // If we want an array of nulls we get an array of nullable types and we have to use a special function
    // We can remove the ? because the compile knows they are nulls
    val nullableInts = arrayOfNulls<Int?>(5)
    assert(nullableInts[0] == null)

    // We can traverse the array with the for - in loop
    for(number in someArray) {
        assert(number > 0)
    }

    // We can use the lambda population at a later stage
    someArray = Array(5) { i-> (i+1)*3 }
    assert(someArray[4] == 15)

    // Arrays can have mixed types in Kotlin whe you populate at declaring type (thus an array of Any)
    val mixedArray = arrayOf(1, "string", 'a')
    assert(mixedArray is Array<Any>)

    // When we need to call Java code with primitive array arguments we can't use the Kotlin Array class
    // We need primitive Kotlin array classes
    val intArray = intArrayOf(1,2,3)
    assert(CallingClass().printIntArray(intArray))

    // With primitive arrays you can declare with size and not populate it because Kotlin uses the default
    // values for the primitive type
    val arrayOfZeros = IntArray(5)
    assert(arrayOfZeros[4] == 0)

    // We can use methods to convert general arrays to primitive arrays
    assert(evenNumbers.toIntArray() is IntArray)

    // and the other way around as well
    assert(intArray.toTypedArray() is Array<Int>)
}