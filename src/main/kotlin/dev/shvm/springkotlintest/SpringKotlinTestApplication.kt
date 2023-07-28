package dev.shvm.springkotlintest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringKotlinTestApplication

fun main(args: Array<String>) {
    runApplication<SpringKotlinTestApplication>(*args)
}
