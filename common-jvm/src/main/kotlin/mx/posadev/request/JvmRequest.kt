package mx.posadev.request

import mx.posadev.parse.parse
import mx.posadev.response.Response

actual class Request(val resource: Resource) {
    actual fun call(): Response {
        val responseStr = Client.get(resource.toString())
        return parse(responseStr)
    }
}

actual fun createRequest(resource: Resource): Request = Request(resource)