package com.daviddefco.codelabs.kotlin

fun main(args: Array<String>) {
    // We can't assign null to a variable that is not nullable
    // val str: String = null

    // In order to make a variable nullable we add ?
    val str : String? = null

    // Once a variable is nullable a lot of methods can't be used because its value could be null
    // str.toUpperCase()
    // we have to check and similar to smart casting the code in brackets knows its value is not null
    val notNullString: String? = "Not null string"
    if (notNullString != null) {
        assert(notNullString.isNotEmpty())
    }

    // However Kotlin provides a safe type operator to be concise (that makes the null check):
    notNullString?.isNotEmpty()

    // if it is null and try to use the variable we get 'null' variable, not a NullPointer
    val nullString : String? = null
    assert(nullString == "null")

    // Safety operators can be piped together
    assert(notNullString?.capitalize()?.toUpperCase() != null)

    // We have the Elvis operator
    val elvisString = notNullString ?: "Default value (if string is null)"
    assert(elvisString == notNullString)

    // We also have a safe cast operator. It tries to cast the variable, but if it fails (not subtypes) it
    // assigns a null. If we use the safe cast operator we have a nullable type in return, so we need to
    // use the safe access operator
    val array:Array<Any> = arrayOf(1,2,3,4)
    val fakeString = array as? String
    assert(fakeString == null)

    // If we are sure a variable is not null and we want to stop using the safe access operator
    // If the var is null after all that's when we get a NullPointerException. That's the only
    // way of having a NullPointerException from Kotlin (it is a Kotlin exception)
    assert(notNullString!!.toUpperCase().isNotEmpty())

    // When we are calling functions that we are expecting non null arguments and we have a nullable
    // variable the correct approach is not calling the function if it has a null variable. We do that with
    // the let function shorthand
    notNullString?.let { printNonNullText(it) }

    // When we use comparisons the safe check is done under the covers, we don't need ==?
    assert(nullString != notNullString)
}

fun printNonNullText(nonNullVvalue: String) {
    println(nonNullVvalue)
}