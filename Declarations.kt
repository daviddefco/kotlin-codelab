package com.daviddefco.codelabs.kotlin

// Aliases for data types can be declares. This is renaming data types, not creating new
// data types. Useful when dealing with generics
typealias Employees = Set<Employee>

fun main(args: Array<String>) {

    // val definitions mean the value can't be exchanged, they are final (immutable)
    // Kotlin recommends using val whenever it is possible
    // without type definition Kotlin infers the type. For a number it is an Int
    val number = 7

    // We don't have a value to infer from but we declare the type
    val anotherNumber: Int

    // If we don't want the default type we have to include the type and value
    val shortNumber: Short = 25

    anotherNumber = 33
    // Can't change the value of a val
    // anotherNumber = 34

    // With var you can change the value
    var variableNumber = 33
    variableNumber = 34

    // However, you can't change a type of a var once it inferred the type
    // variableNumber = "a String"

    // Having a immutable object does not mean you can't change its mutable properties
    // Here I can't assign employee1 to a different object, but I can change its properties
    // Note we don't need a new to instantiate a class
    val employee1 = Employee("john Doe", 500)
    employee1.name = "John J. Doe"

    // With vals you can have conditional assignments as long as the compiler can verify
    // that only one assignment is made
    val employee2: Employee
    val testCondition = 100

    if (testCondition > number) {
        employee2 = Employee("David Watson", 333)
    } else {
        employee2 = Employee("May Higgins", 444)
    }

    // Using type aliases
    val employees: Employees

    // Structural equality. In Kotlin the equals operator checks structural equality, not
    //  reference equality, so using == != is the same of equals
    val employeeOne = Employee("Mary", 1)
    val employeeTwo = Employee("John", 2)
    val employeeThree = Employee("John", 2)
    assert(employeeOne != employeeTwo)
    assert(employeeTwo == employeeThree)
    assert(employeeOne.equals(employeeTwo))
    assert(employeeTwo.equals(employeeThree))

    // If we want to check for reference equality we use ===
    assert(employeeTwo===employeeTwo)
    assert(employeeTwo!==employeeThree)
    val employeeFour = employeeTwo
    assert(employeeTwo===employeeFour)

    // To check if an object is instance of a given class the operator is 'is' and not
    // 'instance of'. If we use that 'is' operator the variable is automatically casted
    // to the comparing type
    assert(employeeOne is Employee)

    // Casting is done with 'as' keyword
    val something: Any = employeeOne
    val newEmployee = something as Employee

    // Bit operators: they are spelled with words:
    val aBinaryNumber = 0x110111001
    val anotherBinaryNumber = 0x00110100110
    aBinaryNumber or anotherBinaryNumber
    aBinaryNumber and anotherBinaryNumber
    aBinaryNumber xor anotherBinaryNumber

}


class Employee(var name: String, val id: Int) {
    override fun equals(other: Any?): Boolean {
        if(other is Employee) {
            return name == other.name && id == other.id
        }
        return false
    }
}