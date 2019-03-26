package com.allen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Printer

/*
 包导入名字冲突 使用重命名
 import foo.Bar
 import bar.Bar as bBar*/
class MainActivity : AppCompatActivity() {

    val a: Int = 1
    val b = 2
    val c: Int = 3
    val items = listOf("apple", "banana")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("sum of 1 and 2 is ${sum(1, 2)}")
        printSum(100, 200)

        exerciseFormate()

        printList()

        println(describe(1))
        println(describe2(2))
        iter()
        lambdaTest()
        startActivity(Intent(this, SecondActivity::class.java))
    }

    fun sum(a: Int, b: Int): Int {
        return a + b
    }

    fun div(a: Int, b: Int): Int {
        return a / b
    }

    fun multi(a: Int, b: Int): Int {
        return a * b
    }

    fun sub(a: Int, b: Int) = a - b

    fun printSum(a: Int, b: Int) {
        println("sum of $a and $b is ${sum(a, b)}")
    }

    fun difineVar() {
        val a: Int = 4
        val b = 2
        val c: Int = 3
        var x = 5

    }

    fun exerciseFormate() {
        var a = 1
        val s1 = "a is $a"
        a = 33
        println("${s1.replace("is", "was")},but now is $a")
    }

    fun parseInt(str: String): Int? {
        return str.toInt()
    }

    fun printProduct(arg1: String, arg2: String) {
        val parseInt = parseInt(arg1)
        val parseInt2 = parseInt(arg2)
        if (parseInt != null && parseInt2 != null) {
            print(parseInt * parseInt2)
        } else {
            print("有null")
        }


    }

    fun printList() {
        for (item in items) {
            println(item)
        }
    }

    fun printList2() {
        for (index in items.indices) {
            print("${items[index]}")
        }
    }

    fun describe(o: Any): String =
        when (o) {
            1 -> "One"
            2 -> "two"
            else -> "unknown"
        }

    fun describe2(o: Any): String {
        when (o) {
            1 -> return "One"
            2 -> return "Two"
            else -> return "Unknown"
        }
    }

    fun range() {
        val a = 4
        if (a in 1..100) {

        }
    }

    fun iter() {
        for (x in 1..10) {
            println(x)
        }

        for (x in 1..10 step 2) {
            println(x)
        }

        for (x in 10 downTo 0) {
            println(x)
        }
    }

    fun lambdaTest() {
        val fruits = listOf("banana", "avocado", "apple", "aaa", "aab", "kiwifruit")
        fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
    }

    fun test() {
        var otherName: String?
        otherName = null
        //非空取长度
        val length = otherName?.length

    }

}
