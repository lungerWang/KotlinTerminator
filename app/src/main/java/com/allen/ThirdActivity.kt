package com.allen

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ThirdActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        Animal().test()
        val x = null
        println(x.toString())
        objectTest()
    }

    fun Any?.toString():String{
        if(this == null){
            return "null"
        }
        return toString()
    }

    private fun objectTest() {
        val obj = object{
            var name = "kangkang"
            var age = 18
        }

        println(obj.name)
        println(obj.age)
    }
}
