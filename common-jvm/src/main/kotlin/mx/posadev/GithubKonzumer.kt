package mx.posadev

import mx.posadev.response.Response

actual object GithubKonzumer {
    actual fun api(): Response {
        return object : Response {}
    }
}