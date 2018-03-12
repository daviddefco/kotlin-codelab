package com.daviddefco.codelabs.kotlin

fun main(args: Array<String>) {
    // Kotlin has not primitive types. Everything in Kotlin is a class
    // Numbers are Int by default, if not we need to declare type
    val oneInteger = 33
    assert(oneInteger is Int)
    val oneShort: Short = 12
    assert(oneShort is Short)
    // For longs we can use the L notation
    var oneLong = 34L
    assert(oneLong is Long)

    // In Kotlin we don't get widened numbers. I can fit an Int into a Long
    // this does not apply to numeric literals
    // oneLong = oneInteger
    oneLong = oneInteger.toLong()

    // For float values default is double
    val myDouble = 65.432
    assert(myDouble is Double)

    val myFloat = 176.233f
    assert(myFloat is Float)

    // Chars can be used as chars, but not as number. You have to convert them
    val myCharInt = 65
    assert(myCharInt.toChar() == 'A')

    // Due to interoperability we can call Java methods from Kotlin. Instead of using
    // primitive types we use the equivalent Kotlin data types (it uses boxing/unboxing)

    // Any is the root class of all Kotlin classes
    // Nothing is a new Kotlin class that marks a function won't return (you have an infinite
    // loop so you don't expect the function to end)
}