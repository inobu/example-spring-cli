package example.spring.cli

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringCliApplication

fun main(args: Array<String>) {
    runApplication<SpringCliApplication>(*args)
}