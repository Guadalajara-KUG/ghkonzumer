package mx.posadev

import mx.posadev.response.Response

val version = "0.0.1"

expect object GithubKonzumer {
    fun api(): Response
}