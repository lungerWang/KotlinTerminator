package com.allen

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Printer

class MainActivity : AppCompatActivity() {

    val a: Int = 1
    val b = 2
    val c: Int = 3


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        println("sum of 1 and 2 is ${sum(1, 2)}")
        printSum(100, 200)
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
}
