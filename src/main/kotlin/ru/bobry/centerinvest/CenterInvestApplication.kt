package ru.bobry.centerinvest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CenterInvestApplication

fun main(args: Array<String>) {
    runApplication<CenterInvestApplication>(*args)
}
