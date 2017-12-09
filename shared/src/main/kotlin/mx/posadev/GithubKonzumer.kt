package mx.posadev

import mx.posadev.request.Resource
import mx.posadev.response.Response

val version = "0.0.1"

expect object GithubKonzumer {
    fun api(endpoint: Resource): Response
}