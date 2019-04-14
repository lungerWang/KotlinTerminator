package com.allen

fun main(args: Array<String>) {
    println("Hello Kotlin")

    var i = {x:Int, y:Long -> x+y }
    println(i(1,2))
    var j : (Int, Int)->Int = {x, y -> x+y}
}