package com.allen

class Animal {

    fun Animal.print() {
        println("this is a expand method")
    }

    fun MutableList<Int>.swap(index1: Int, index2: Int) {
        val tmp = this[index1]
        this[index1] = this[index2]
        this[index2] = tmp
    }

    fun main(args: Array<String>?) {
        val list = mutableListOf(1, 2, 3)
        list.swap(0, 2)
        println(list.toString())
    }

    class C {
        fun foo() {
            println("成员函数")
        }
    }

    fun C.foo() {
        println("拓展函数")
    }

    fun test() {
        val c = C()
        c.foo()
    }
}