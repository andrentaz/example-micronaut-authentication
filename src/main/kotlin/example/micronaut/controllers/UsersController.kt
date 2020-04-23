package example.micronaut.controllers

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import io.micronaut.security.annotation.Secured
import io.micronaut.security.rules.SecurityRule
import io.micronaut.security.token.jwt.validator.AuthenticationJWTClaimsSetAdapter
import java.security.Principal

@Controller("/api/users")
class UsersController {

    @Get("/ping")
    @Secured(SecurityRule.IS_ANONYMOUS)
    @Produces(MediaType.TEXT_PLAIN)
    fun ping() = "pong"

    @Get("/me")
    @Secured(SecurityRule.IS_AUTHENTICATED)
    fun userMe(principal: Principal) = (principal as AuthenticationJWTClaimsSetAdapter).attributes
}
