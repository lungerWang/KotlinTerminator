package com.allen

enum class Direction constructor(direction: Int){
    NORTH(1),
    SOUTH(2),
    EAST(3),
    WEST(4);

    var direction: Int = 0
        private set

    init {
        this.direction = direction
    }
}