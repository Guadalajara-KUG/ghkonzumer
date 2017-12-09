package mx.posadev.request

import mx.posadev.response.Response
import mx.posadev.version

val HTTP_HEADERS = mapOf(
        "User-Agent" to "GithubKonzumer-${version}",
        "Accept" to "application/vnd.github.v3+json",
        "Content-Type" to "application/json"
)

expect class Request {
    fun call(): Response
}
