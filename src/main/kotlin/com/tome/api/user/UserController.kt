package com.tome.api.user

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController(private val repository: UserRepository)  {
    @GetMapping("/users")
    fun findAll() = repository.findAll()
}