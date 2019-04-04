package com.allen

//泛型
class Box<T>(t: T) {
    var value = t

    object DeskTop{
        val url = "www.baidu.com"
        //var ownValue = value; 错误，不能访问到外部类的成员
        //outerFun()
    }

    fun outerFun(){

    }
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
    //Box(1).DeskTop.url 错误，不能通过外部类实例对象去访问内部对象
    val url = Box.DeskTop.url //正确
}

fun <T> boxIn(value: T) = Box(value)

fun <T> doPrint(content: T) {
    when (content) {
        is String -> print("str")
        is Int -> print("int")
        else -> print("unkonwn")
    }
}