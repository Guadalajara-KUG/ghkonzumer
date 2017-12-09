package mx.posadev

import mx.posadev.request.Resource
import mx.posadev.request.createRequest
import mx.posadev.response.Response

actual object GithubKonzumer {
    actual fun api(resource: Resource): Response {
        val request = createRequest(resource)
        val response = request.call()

        return object : Response {}
    }
}