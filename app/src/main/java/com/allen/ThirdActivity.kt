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
    }

    fun Any?.toString():String{
        if(this == null){
            return "null"
        }
        return toString()
    }
}
