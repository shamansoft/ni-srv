package net.shamansoft.ni.srv

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/")
class HealthController {

    @Get("hello/")
    @Produces(MediaType.TEXT_PLAIN)
    fun index(): String {
        return "Hello World from ${this.javaClass.canonicalName}"
    }

    @Get("health/")
    @Produces(MediaType.APPLICATION_JSON)
    fun health(): String {
        return "OK"
    }
}