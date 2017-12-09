package mx.posadev.request

import mx.posadev.response.Response

actual class Request(val resource: Resource) {
    actual fun call(): Response {
        createClient(resource)
        return object : Response {}
    }
}

actual fun createRequest(resource: Resource): Request {
    return Request(resource)
}