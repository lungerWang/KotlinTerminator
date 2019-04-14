package com.allen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_new_mile_stone.*
import java.text.SimpleDateFormat
import java.util.*

class NewMileStoneActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_mile_stone)
        arrayApplication()
        testFormatter()
        testSet()
        testMap()
        testSwitch()
        println(getFourBigGeneral())
        printVararg("中国四大美女", "xishi", "diaochan", "xiaoqiao", "yangyuhuan")
        val customMaxValue = customMaxValue(arrayOf(2, 93, 12, 39, 33, 6), { a, b -> if (b == null) true else a >= b })
        println(customMaxValue)
        val customMaxValue2 = customMaxValue(arrayOf("fa", "son", "w", "linkeyou", "and"), this::max)
        println(customMaxValue2)
        println(Date().getNowDate())
        println(DataUtil.nowDateTime)
        println(DataUtil.getFormatTime("yyy,MM,dd"))
        //startActivity(Intent(this, Main2Activity::class.java))
        checkbox.setOnCheckedChangeListener{buttonView, isChecked ->
            if (isChecked) {
                //Do Whatever you want in isChecked
            }
        }
    }

    fun Date.getNowDate(): String {
        val sdf = SimpleDateFormat("yyyy-MM-dd")
        return sdf.format(Date())
    }

    fun max(t1: String, t2: String?): Boolean {
        return if (t2 == null) true else t1.length >= t2.length
    }

    fun getFourBigGeneral(
        first: String = "造纸术",
        second: String = "活字印刷术",
        third: String = "火药",
        five: String = "指南针"
    ): String {
        return "$first, $second, $third, $five"
    }

    fun <T> printVararg(tag: String, vararg otherInfo: T) {
        var strTmp = "$tag:"
        for (item in otherInfo) {
            strTmp = "$strTmp ${item.toString()},"
        }
        println(strTmp)
    }

    fun <V> customMaxValue(array: Array<V>, greater: (V, V?) -> Boolean): V? {
        var tmp: V? = null
        array.forEach {
            if (greater(it, tmp)) {
                tmp = it
            }
        }
        return tmp

    }


    private fun arrayApplication() {
        var intArr: IntArray = intArrayOf(1, 2, 3, 4, 5)
        var intArr2: Array<Int> = arrayOf(1, 2, 3, 4, 5)
        var longArr: LongArray = longArrayOf(1, 2, 3, 4, 5)
        var floatArr: FloatArray = floatArrayOf(1.0f, 2.0f)
        var strArr: Array<String> = arrayOf("How ", "are ", "you")
        println("the size of strArr is ${strArr.size}")

        operateArr(strArr)
    }

    private fun operateArr(strArr: Array<String>?) {
        btn.setOnClickListener {
            var str: String = ""
            var i: Int = 0
            while (i < strArr!!.size) {
                str += strArr[i]
                i++
            }
            tv_test.text = str

        }

    }

    private fun testFormatter() {
        val str = "so do you like me"
        val price = 19.4
        println("the length of str = ${'$'}${str.length}")
        println("the price of apple is \$$price")
    }

    private fun testSet() {
        val set: MutableSet<String> = mutableSetOf("We", "are", "the", "champion!")
        btn.setOnLongClickListener {
            var str = ""
            set.forEach {
                str = "$str $it"
            }
            tv_test.text = str
            true
        }
    }

    private fun testMap() {
        var goodsMap: Map<String, String> =
            mapOf(
                "iphone" to "苹果",
                "benz" to "奔驰",
                "android" to "安卓"
            )
        var goodsMutMap: MutableMap<String, String> =
            mutableMapOf(
                Pair("1", "2"),
                Pair("2", "3"),
                Pair("3", "4"),
                Pair("4", "5")
            )
        var strAppend = ""
        for (item in goodsMutMap) {
            strAppend = "$strAppend $item"

        }
        tv_test.text = strAppend

    }

    private fun testSwitch() {
        var tmp: Number? = 100000000000
        var str = when (tmp) {
            is Int -> "我tm是Int？"
            is Double -> "我靠是Double！"
            else -> "Who am I？"
        }
        tv_test.text = str
    }

}
