package io.github.mathisguillet.kotlin.starter

import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

private val logger = KotlinLogging.logger {}

@RestController
@RequestMapping("/demo")
class DemoController {

    @GetMapping
    fun demo(@RequestParam foo: String): String {
        logger.info { "Calling demo endpoint with request parameter foo: $foo" }
        return "Hello world"
    }
}
