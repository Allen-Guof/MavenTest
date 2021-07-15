package com.guof.dog

class DogFactory {
    companion object {
        fun create(name: String, age: String): Dog {
            return Dog(name, age)
        }
    }
}