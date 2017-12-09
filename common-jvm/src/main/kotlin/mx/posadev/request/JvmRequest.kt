package mx.posadev.request

import mx.posadev.parse.parseResource
import mx.posadev.response.Response

actual class Request(val resource: Resource) {
    actual fun call(): Response {
        val responseStr = Client.get(resource.toString())
        return parseResource(resource, responseStr)
    }
}

actual fun createRequest(resource: Resource): Request = Request(resource)