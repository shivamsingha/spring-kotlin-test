package dev.shvm.springkotlintest.hello

class Hello(var message: String?) {
    override fun toString(): String {
        return "Hello{message='$message'}"
    }
}