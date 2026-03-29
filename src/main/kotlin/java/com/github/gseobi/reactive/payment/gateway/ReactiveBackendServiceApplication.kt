package java.com.github.gseobi.reactive.payment.gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ReactiveBackendServiceApplication

fun main(args: Array<String>) {
    runApplication<ReactiveBackendServiceApplication>(*args)
}
