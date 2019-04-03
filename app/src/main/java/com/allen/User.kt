package com.allen

data class User constructor(val name: String, var age: Int)

fun main(){
    val user = User("Jarry", 17)
    val copyUser = user.copy(age = 20)
    println(user)
    println(copyUser)
}