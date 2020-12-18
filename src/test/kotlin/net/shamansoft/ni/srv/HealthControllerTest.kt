package net.shamansoft.ni.srv

import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isNotNull
import io.micronaut.http.HttpRequest
import io.micronaut.http.client.RxHttpClient
import io.micronaut.http.client.annotation.Client
import io.micronaut.test.extensions.junit5.annotation.MicronautTest
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
        assertThat(client.toBlocking().retrieve(request))
                .isNotNull()
                .isEqualTo("Hello World from net.shamansoft.ni.srv.HealthController")
    }

    @Test
    fun testHealth() {
        val request: HttpRequest<Any> = HttpRequest.GET("/health")
        assertThat(client.toBlocking().retrieve(request))
                .isNotNull()
                .isEqualTo("Cucumber")
    }
}