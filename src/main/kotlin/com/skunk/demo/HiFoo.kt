package com.skunk.demo

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

@RestController
class HiFooController {

    @RequestMapping("/")
    fun index(): String {
        return "Oh Kotlin is Hi-Tech"
    }

}
