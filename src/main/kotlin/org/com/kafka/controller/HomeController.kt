package org.com.kafka.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/a")
class HomeController (

) {

  @GetMapping("")
  fun home(): String {
    return "Hello World"
  }
}