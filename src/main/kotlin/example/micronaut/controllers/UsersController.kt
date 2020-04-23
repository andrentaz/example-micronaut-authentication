package example.micronaut.controllers

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/api/users")
class UsersController {

    @Get("/ping")
    @Produces(MediaType.TEXT_PLAIN)
    fun ping() = "pong"
}