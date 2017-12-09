package mx.posadev

import mx.posadev.request.Resource
import mx.posadev.response.Response

actual object GithubKonzumer {
    actual fun api(endpoint: Resource): Response {
        return object : Response {}
    }
}