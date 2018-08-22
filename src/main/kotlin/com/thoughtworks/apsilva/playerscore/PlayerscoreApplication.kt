package com.thoughtworks.apsilva.playerscore

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class PlayerscoreApplication

fun main(args: Array<String>) {
    runApplication<PlayerscoreApplication>(*args)
}
