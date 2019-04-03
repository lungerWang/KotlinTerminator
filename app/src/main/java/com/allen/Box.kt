package com.allen

//泛型
class Box<T>(t: T) {
    var value = t
}

fun main() {
    //实例化
    val box: Box<Int> = Box<Int>(1)
    val box2 = Box(1)

    var boxInt = Box<Int>(10)
    var boxString = Box<String>("Runoob")

    println(boxInt.value)
    println(boxString.value)

    val box3 = boxIn(5)
}

fun <T> boxIn(value: T) = Box(value)

fun <T> doPrint(content: T) {
    when (content) {
        is String -> print("str")
        is Int -> print("int")
        else -> print("unkonwn")
    }
}