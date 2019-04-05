package com.allen

class Person(name: String) {

    constructor (name: String, age: Int) : this(name) {
        // 初始化...
        print("age = $age")
    }

    init {
        print(name)
    }
}