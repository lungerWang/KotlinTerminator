package com.allen

class InitOrderDemo (name:String) {
    val initValue1 = "this is the first init property $name".also (::println)

    init {
        println("this is first init method $name")
    }

    val secondProperty = "this is the second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}