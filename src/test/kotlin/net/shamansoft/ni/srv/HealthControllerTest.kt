package net.shamansoft.ni.srv

import io.micronaut.http.HttpRequest
import io.micronaut.http.client.RxHttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertNotNull
import org.junit.jupiter.api.Test
import javax.inject.Inject

@MicronautTest
class HealthControllerTest {
    @Inject
    @field:Client("/")
    lateinit var client : RxHttpClient

    @Test
    fun testHello() {
        val request: HttpRequest<Any> = HttpRequest.GET("/hello") // <3>
        val body = client.toBlocking().retrieve(request)
        assertNotNull(body)
        assertEquals("Hello World from net.shamansoft.ni.srv.HealthController", body)
    }

    @Test
    fun testHealth() {
        val request: HttpRequest<Any> = HttpRequest.GET("/health")
        val actual = client.toBlocking().retrieve(request)
        assertNotNull(actual)
        assertEquals("OK", actual)
    }
}