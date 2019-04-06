package com.allen

import java.text.SimpleDateFormat
import java.util.*

object DataUtil{
    val nowDateTime:String
    get(){
        val sdf = SimpleDateFormat("yyyy-MM-dd")
        return sdf.format(Date())
    }

    fun getFormatTime(format: String=""):String{
        val ft:String = format
        val sdf = if(!ft.isEmpty()) SimpleDateFormat(ft)
        else SimpleDateFormat("yyyMMddHHmmss")
        return sdf.format(Date())
    }
}