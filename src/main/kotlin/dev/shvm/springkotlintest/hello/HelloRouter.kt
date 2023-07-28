package dev.shvm.springkotlintest.hello

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.awaitBody
import org.springframework.web.reactive.function.server.bodyValueAndAwait
import org.springframework.web.reactive.function.server.coRouter

@Configuration
class HelloRouter {
    @Bean
    fun router() = coRouter {
        GET("/hello") { _ ->
            ServerResponse.ok().bodyValueAndAwait(Hello("test"))
        }
        GET("/hello/{id}") { request ->
            ServerResponse.ok().bodyValueAndAwait(Hello(request.pathVariable("id") + " 13123"))
        }
        accept(MediaType.APPLICATION_JSON).nest {
            POST("/hello") { serverRequest ->
                ServerResponse.ok().bodyValueAndAwait(serverRequest.awaitBody())
            }
        }
    }
}