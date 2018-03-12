package com.daviddefco.codelabs.kotlin

fun main(args: Array<String>) {
    val valladolid = City("Valladolid", 330000)

    // String template is mcuh easier, without String.format
    println("The name of the city is ${valladolid.name}")

    // If we need to escape the dollar sign to use it
    val change  = 4.95
    println("Escaping the \$change")

    // String template can be used in expressions
    val numerator = 10
    val denominator = 2
    println("The value of $numerator divided by $denominator is ${numerator/denominator}")

    // Raw string or triple quoted: you can use multi lines and chars are not escaped
    // but string templates apply as well
    val filePath = "c:\\somedir\\another"
    val withTripleQuotes = """c:\dir\another"""
    val multiline = """this is
        a multiline
        string in ${valladolid.name}"""

    // We can remove indentation multiline strings with indentMargin to the lines marked
    // with the char we specify there (default is '|' char)
    val strageString = """This is a strange String with
            some indentation in that line
            *no indentation in this other line
                and finishing with extra indentation now""".trimMargin("*")
    println(strageString)


}

class City(var name: String, val population: Long) {
    override fun toString(): String {
        return "City(name=$name, population=$population)"
    }
}
